package com.app.trackcar1.trackkar1;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;


@Configuration
@ComponentScan("com.app.trackcar1.trackkar1")
public class Config extends AbstractAnnotationConfigDispatcherServletInitializer {

    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    } 

    protected Class<?>[] getServletConfigClasses() {
        return new Class[] {Config.class};
    }

    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
