package net.klu2.spring.boot.swagger;

import com.mangofactory.swagger.configuration.SpringSwaggerConfig;
import com.mangofactory.swagger.plugin.EnableSwagger;
import com.mangofactory.swagger.plugin.SwaggerSpringMvcPlugin;
import com.wordnik.swagger.model.ApiInfo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author Klaus Lehner, Catalysts GmbH
 */
@ComponentScan
@EnableAutoConfiguration
@EnableSwagger
@Configuration
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public SwaggerSpringMvcPlugin swagger(SpringSwaggerConfig config) {
        SwaggerSpringMvcPlugin swagger = new SwaggerSpringMvcPlugin(config);
        swagger.apiInfo(new ApiInfo(
                "Greeting App",
                "Sample App using Spring Boot and Swagger",
                "https://github.com/klu2/spring-boot-swagger",
                "klaus.lehner@catalysts.cc",
                "Apache License 2.0",
                "http://www.apache.org/licenses/LICENSE-2.0.html"));
        return swagger;
    }

}
