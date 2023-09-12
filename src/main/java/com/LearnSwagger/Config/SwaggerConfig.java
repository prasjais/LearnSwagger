package com.LearnSwagger.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static springfox.documentation.builders.PathSelectors.regex;

@Configuration
@EnableWebMvc
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket postsAPI()
    {
        return new Docket(DocumentationType.SWAGGER_2).groupName("LearnSwagger").apiInfo(apiInfo()).select().paths(regex("/home.*")).build();
    }

    public ApiInfo apiInfo()
    {
        return new ApiInfoBuilder().title("UserAPI")
                .description("User api information")
                .build();
    }

}
