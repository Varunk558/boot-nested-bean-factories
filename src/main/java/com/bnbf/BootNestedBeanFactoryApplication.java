package com.bnbf;

import com.bnbf.beans.Robot;
import com.bnbf.beans.Sensor;
import com.bnbf.config.ParentConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

/**
 * Hello world!
 */
@SpringBootApplication
public class BootNestedBeanFactoryApplication {
    @Bean
    public Robot robot(Sensor sensor){
        return new Robot(sensor);
    }
    public static void main(String[] args) {
        SpringApplicationBuilder springApplicationBuilder = new SpringApplicationBuilder(BootNestedBeanFactoryApplication.class);
        springApplicationBuilder.parent(ParentConfig.class);
        SpringApplication springApplication = springApplicationBuilder.build();

        ApplicationContext applicationContext = springApplication.run(args);
        Robot robot = applicationContext.getBean(Robot.class);
        System.out.println(robot);



    }
}
