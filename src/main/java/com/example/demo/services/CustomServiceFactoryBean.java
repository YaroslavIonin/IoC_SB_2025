package com.example.demo.services;

import lombok.Setter;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

@Setter
@Component
public class CustomServiceFactoryBean implements FactoryBean<CustomService> {

    private String serviceType = "default";

    @Override
    public CustomService getObject() throws Exception {
        CustomService service = new CustomService();
        service.setType(serviceType);
        service.setCreatedBy("FactoryBean");
        return service;
    }

    @Override
    public Class<?> getObjectType() {
        return CustomService.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }

}
