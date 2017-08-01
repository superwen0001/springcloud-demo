package com.github.superwen0001;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by wenshiliang on 2017/5/31.
 */
@SpringBootApplication
@ComponentScan(basePackages = {"com.github.superwen0001"})
//@MapperScan(basePackages = "com.github.superwen0001.**.mapper")
public class Main  {
    private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Main.class, args);
    }
}
