package com.webflux.demo.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Data
@Component
@PropertySource("classpath:/application.properties")
public class ApplicationProperties {

    public static String PUSH_URL;

    @Value("push.url")
    public void setPushUrl(String pushUrl) {
        this.PUSH_URL = pushUrl;
    }
}
