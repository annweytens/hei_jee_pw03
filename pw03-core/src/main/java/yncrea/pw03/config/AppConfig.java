package yncrea.pw03.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Properties;

@Configuration
@ComponentScan(basePackages = {"yncrea.pw03.service"})
public class AppConfig {

    @Bean
    public java.util.Properties dbProperties() {
        Properties properties = new Properties();
        properties.setProperty("driverClass", "com.mysql.jdbc.Driver");
        properties.setProperty("jdbcUrl", "jdbc:mysql://localhost:3306/yncrea_pw03");
        properties.setProperty("username", "root");
        properties.setProperty("password", "0000");

        return properties;
    }

}
