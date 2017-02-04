package com.wisely.highlight_spring4.ch3.aware;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

/**
 * Created by maido on 2017/2/3.
 */
@Service
public class AwareService implements BeanNameAware, ResourceLoaderAware {

    private  String beanName;

    private ResourceLoader resourceLoader;

    @Override
    public void setBeanName(String beanName) {
       this.beanName = beanName;
    }

    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {
        this.resourceLoader = resourceLoader;
    }

    public void outPutResult() {
        System.out.println("Bean 的名称为 : " + beanName);
        Resource resource = resourceLoader.getResource("classpath:com\\wisely\\highlight_spring4\\ch3\\aware\\test.txt");
        try {
            String msg = IOUtils.toString(resource.getInputStream());
            System.out.println("ResourceLoader加载的文件内容 : " + msg);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
