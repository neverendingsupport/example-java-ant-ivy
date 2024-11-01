package com.example;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class Application extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[]{};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[]{};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

    public static void main(String[] args){
        System.out.println("Start it up!");
    }
}
