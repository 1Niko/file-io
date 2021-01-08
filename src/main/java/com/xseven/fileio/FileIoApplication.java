package com.xseven.fileio;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@MapperScan("com.xseven.system.mapper")
@EnableSwagger2
public class FileIoApplication {

    public static void main(String[] args) {
        SpringApplication.run(FileIoApplication.class, args);
    }

}
