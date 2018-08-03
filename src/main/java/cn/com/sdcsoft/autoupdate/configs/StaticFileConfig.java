package cn.com.sdcsoft.autoupdate.configs;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.AntPathMatcher;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@Configuration
public class StaticFileConfig extends WebMvcConfigurationSupport {

    @Value("${web.static-files}")
    private String staticFilesPath;

    /**
     * 配置URL大小写不敏感
     * @param configurer
     */
    @Override
    protected void configurePathMatch(PathMatchConfigurer configurer) {
        AntPathMatcher matcher = new AntPathMatcher();
        matcher.setCaseSensitive(false);
        configurer.setPathMatcher(matcher);
    }

    /**
     * 配置升级文件的物理路径
     * @param registry
     */
    @Override
    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
        super.addResourceHandlers(registry);
        super.addResourceHandlers(registry);
        registry.addResourceHandler("/BoilerManagement/**").addResourceLocations(
                "file:"+staticFilesPath);
    }
}
