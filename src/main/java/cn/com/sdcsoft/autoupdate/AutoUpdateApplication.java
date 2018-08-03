package cn.com.sdcsoft.autoupdate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;

@SpringBootApplication
public class AutoUpdateApplication {
    public static void main(String[] args) {
        SpringApplication.run(AutoUpdateApplication.class, args);
    }
}
