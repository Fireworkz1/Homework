package com.springboot.springboot.module.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2WebMvc;

@Configuration
@EnableSwagger2WebMvc
public class SwaggerConfiguration {
    @Bean(value = "dockerBean")
    public Docket dockerBean() {
        //指定使用Swagger2规范
        Docket docket = new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(new ApiInfoBuilder()
                        //描述字段支持Markdown语法
                        .description("# SPM Project API Docs")
                        .termsOfServiceUrl("-----------")
                        .contact("smart030518@126.com")
                        .version("1.0")
                        .build())
                //分组名称
                .groupName("default")
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.springboot.springboot.controller"))
                .paths(PathSelectors.any())
                .build();
        return docket;
    }
}
