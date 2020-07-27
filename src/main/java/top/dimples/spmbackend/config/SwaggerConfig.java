package top.dimples.spmbackend.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.env.Profiles;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket docket(Environment environment) {
        Profiles profiles = Profiles.of("dev","test");

        // 通过environment.acceptsProfiles判定是否处于当前监听的环境中
        boolean flag = environment.acceptsProfiles(profiles);

        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                // 是否启用swagger
                .enable(flag)
                .select()
                // 配置要扫描的方式
                .apis(RequestHandlerSelectors.basePackage("top.dimples.spmbackend.controller"))
                .build()
                .groupName("v1")
                ;
    }

    // 配置swagger信息
    private ApiInfo apiInfo() {
        Contact CONTACT = new Contact("dimplesYj", "https://www.dimples.top/", "2890841438@qq.com");

        return new ApiInfo(
                "运动场管理系统的接口文档",
                "Api Documentation",
                "v1.0",
                "https://www.dimples.top/",
                CONTACT,
                "Apache 2.0",
                "http://www.apache.org/licenses/LICENSE-2.0",
                new ArrayList()
        );

    }

}
