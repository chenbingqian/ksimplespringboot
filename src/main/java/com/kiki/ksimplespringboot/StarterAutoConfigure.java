
package com.kiki.ksimplespringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * AutoConfigure类编写；很关键的一个类；
 *
 *
 * @ClassName: StarterAutoConfigure
 * @author kiki
 * @date 2019年6月14日
 * @version: V1.0
 */
@Configuration
@ConditionalOnClass(Kservice.class)
@EnableConfigurationProperties(StarterServiceProperties.class)
public class StarterAutoConfigure {

    @Autowired
    private StarterServiceProperties properties;

    // 通过@ConditionalOnProperty来控制Configuration是否生效
    // prefix:名称的前缀，可有可无
    // value:数组，获取对应property名称的值，与name不可同时使用
    // havingValue:可与name组合使用，比较获取到的属性值与havingValue给定的值是否相同，相同才加载配置
    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(prefix = "example.service", value = "enable", havingValue = "true")
    Kservice kservice() {
        return new Kservice(properties.getConfig());
    }
}
