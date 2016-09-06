package io.execube.giflib;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by Prateek Phoenix on 9/6/2016.
 */
@EnableAutoConfiguration
@ComponentScan
public class AppConfig {

    public static void main(String[] args) {

        SpringApplication.run(AppConfig.class,args);
    }
}
