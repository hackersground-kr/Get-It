package kr.hackerground.getit.deps.global.common;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.UrlResource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.net.MalformedURLException;
import java.nio.file.Paths;

@Configuration
@EnableWebMvc
public class MvcConfig implements WebMvcConfigurer {
    @Value("${path.images}")
    String STORE_PATH;

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        try {
            registry
                    .addResourceHandler(STORE_PATH + "/**")
                    .addResourceLocations(new UrlResource("file://" + STORE_PATH + "/"));
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }
}
