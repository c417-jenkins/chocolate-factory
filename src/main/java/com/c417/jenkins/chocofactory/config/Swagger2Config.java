package com.c417.jenkins.chocofactory.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;

@Configuration
@EnableSwagger2 // swagger(v2)を有効にする
public class Swagger2Config {

    @Bean
    public Docket swaggerSpringMvcPlugin() {
        return new Docket(DocumentationType.SWAGGER_2)
                        .select()
                        .paths(paths())
                        .build()
                        .apiInfo(apiInfo());
    }

    private Predicate<String> paths() {

        // select the target showed in swagger-UI
        return Predicates.and(
                Predicates.containsPattern("/chocolate/*"));
    }

    private ApiInfo apiInfo() {
        ApiInfo apiInfo = new ApiInfo(
                "Chocolate Factory API",              // title
                "Specification of choco APIs",    // description
                "0.0.1",                                // version
                "",                                     // terms of service url
                "417",                             // created by
                "",                     // license
                "");                                    // license url
        return apiInfo;
    }
}