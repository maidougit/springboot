package com.wisely.highlight_spring4.ch2.el;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;


/**
 * Created by maido on 2017/2/2.
 */
@Configuration
@ComponentScan("com.wisely.highlight_spring4.ch2.el")
@PropertySource("classpath:com\\wisely\\highlight_spring4\\ch2\\el\\test.properties")
public class ElConfig {
    @Value("I love you!")
    private String normal;

    @Value("#{systemProperties['os.name']}")
    private String osname;

    @Value("#{ T(java.lang.Math).random() * 100.0}")
    private double randomNumber;

    @Value("#{demoService.another}")
    private String fromAnother;

    @Value("classpath:com/wisely/highlight_spring4/ch2/el/test.txt")
    private Resource testFile;

    @Value("${book.name}")
    private String bookName;

    @Value("http://www.baidu.com")
    private Resource testUrl;

    @Autowired
    private Environment environment;

    @Bean
    public  static PropertySourcesPlaceholderConfigurer placeholderConfigurer() {return new PropertySourcesPlaceholderConfigurer();}

    public void outPutResource() {
        try{
            System.out.println(normal);
            System.out.println(osname);
            System.out.println(randomNumber);
            System.out.println(fromAnother);
            System.out.println(IOUtils.toString(testFile.getInputStream()));
            System.out.println(IOUtils.toString(testUrl.getInputStream()));
            System.out.println(bookName);
            System.out.println(environment.getProperty("book.age"));
        } catch (Exception e){
            e.printStackTrace();
        }
    }

}
