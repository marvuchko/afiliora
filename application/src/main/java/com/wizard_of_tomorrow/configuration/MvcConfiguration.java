package com.wizard_of_tomorrow.configuration;

import lombok.Data;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.CacheControl;
import org.springframework.lang.NonNull;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.concurrent.TimeUnit;

@Data
@EnableWebMvc
@Configuration
@ConditionalOnProperty("affiliora.mvc.enabled")
@ConfigurationProperties(prefix = "affiliora.mvc")
public class MvcConfiguration implements WebMvcConfigurer {

    private long cacheMaxMinutes;

    @Override
    public void addResourceHandlers(@NonNull ResourceHandlerRegistry registry) {
        registerStaticContentHandlers(registry);
    }

    private void registerStaticContentHandlers(ResourceHandlerRegistry registry) {
        var resourcePatterns = new String[] {"/js/**", "/css/**", "/images/**"};
        var resourceLocations = new String[] {"classpath:js/", "classpath:css/", "classpath:images/"};

        registry.addResourceHandler(resourcePatterns)
                .addResourceLocations(resourceLocations)
                .setCacheControl(CacheControl.maxAge(cacheMaxMinutes, TimeUnit.MINUTES));
    }

}
