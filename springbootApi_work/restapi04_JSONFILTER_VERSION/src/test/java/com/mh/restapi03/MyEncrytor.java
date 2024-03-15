package com.mh.restapi03;

import org.jasypt.encryption.pbe.PooledPBEStringEncryptor;
import org.jasypt.encryption.pbe.config.SimpleStringPBEConfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;

public class MyEncrytor {
    @Value("${jasypt.encryptor.password")
    private String password = "passw@rdpassw@rdpassw@rdpassw@rdpassw@rdpassw@rdpassw@rdpassw@rdpassw@rdpassw@rdpassw@rdpassw@rdpassw@rd";

    @Test
    void name() {
        //System.out.println("password = " + password);
        PooledPBEStringEncryptor encryptor = new PooledPBEStringEncryptor();
        SimpleStringPBEConfig config = new SimpleStringPBEConfig();
        config.setPassword(password);
        config.setAlgorithm("PBEWithMD5AndDES");
        config.setKeyObtentionIterations("1000");
        config.setPoolSize("1");
        config.setProviderName("SunJCE");
        config.setSaltGeneratorClassName("org.jasypt.salt.RandomSaltGenerator");
        config.setStringOutputType("base64");
        encryptor.setConfig(config);

        String content = "jdbc:mysql://127.0.0.1:3306/jea?useSSL=false&allowPublicKeyRetrieval=true&characterEncoding=UTF-8&serverTimezone=UTC";
        String encString = encryptor.encrypt(content);
        String decString = encryptor.decrypt(encString);

        System.out.println(String.format("encString = %s, decString = %s", encString, decString));
    }
}
