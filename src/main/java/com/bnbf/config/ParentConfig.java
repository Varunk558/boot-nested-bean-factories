package com.bnbf.config;

import com.bnbf.beans.Sensor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ParentConfig {
    @Bean
    public Sensor sensor(@Value("${sensor.type}") String type, @Value("${sensor.sensitivity}") String sensitivity){
        Sensor sensor = new Sensor();
        sensor.setType(type);
        sensor.setSensitivity(sensitivity);
        return sensor;
    }
}
