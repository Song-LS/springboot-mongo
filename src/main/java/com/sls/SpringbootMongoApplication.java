package com.sls;

import cn.gjing.EnableSwagger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableSwagger
public class SpringbootMongoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootMongoApplication.class, args);
    }

}
