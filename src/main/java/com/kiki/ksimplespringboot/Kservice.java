/*
 * @Title: Service.java
 */
package com.kiki.ksimplespringboot;


/**
 * 定义service类，根据在StarterAutoConfigure类中读取配置文件的数据，通过实例化构造函数的方式注入数据，
 * 完成service应有的业务逻辑； 在应用中就对这个service进行实例化，拿到这个类对象进行具体的业务数据操作。
 *
 * @ClassName: Service
 * @author kiki
 * @date 2019年6月14日
 * @version: V1.0
 */
public class Kservice {
    private String config;
    public Kservice(String config) {
        this.config = config;
    }
    public String[] split(String separatorChar) {
        if (this.config == null || this.config.trim().length() == 0
                || separatorChar == null || separatorChar.trim().length() == 0) {
            return null;
        }
        return this.config.split(separatorChar);
    }
}
