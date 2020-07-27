package top.dimples.spmbackend;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpmBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpmBackendApplication.class, args);
    }

}
