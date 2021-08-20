package com.gzq.nacos;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "order")
public class OrderProperties {

    private Integer payTimeoutSeconds;
    private Integer createFrequencySeconds;

}
