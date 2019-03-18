package com.antelop.configuration;

import com.antelop.service.MD5Service;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by zhanls on 2019/3/18.
 */
@Configuration
public class MD5AutoConfiguration {

    @Bean
    public MD5Service getMD5Service() {
        return new MD5Service();
    }
}
