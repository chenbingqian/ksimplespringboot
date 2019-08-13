
package com.kiki.ksimplespringboot;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 编写配置文件
 *
 * @ClassName: StarterServiceProperties
 * @author kiki
 * @date 2019年6月14日
 * @version: V1.0
 */
@ConfigurationProperties("example.service")
public class StarterServiceProperties {
    private String config;
    public String getConfig() {
        return config;
    }
    public void setConfig(String config) {
        this.config = config;
    }

}
