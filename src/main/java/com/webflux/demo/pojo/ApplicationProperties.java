package com.webflux.demo.pojo;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class ApplicationProperties {

    public static String PUSH_URL;

    @Value("push.url")
    public void setPushUrl(String pushUrl) {
        this.PUSH_URL = pushUrl;
    }
}
