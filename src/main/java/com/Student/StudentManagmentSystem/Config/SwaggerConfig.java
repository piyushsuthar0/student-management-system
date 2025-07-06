package com.Student.StudentManagmentSystem.Config;


import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {
    @Bean
    public OpenAPI studentAPIInfo(){
        return new OpenAPI()
                .info(new Info()
                        .title("Student Management System API")
                        .description("API documentation for managing students")
                        .version("1.0"));
    }
}
