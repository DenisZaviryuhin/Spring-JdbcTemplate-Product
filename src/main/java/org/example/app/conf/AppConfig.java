package org.example.app.conf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;
import java.util.Objects;

@Configuration
@ComponentScan("org.example.app")
@PropertySource("classpath:app.properties")
public class AppConfig {
    @Autowired
    Environment environment;

    @Bean
    DataSource dataSource() {
        DriverManagerDataSource managerDataSource = new DriverManagerDataSource();
        managerDataSource.setUrl(environment.getProperty("dbUrl"));
        managerDataSource.setUsername(environment.getProperty("dbUser"));
        managerDataSource.setPassword(environment.getProperty("dbPass"));
        managerDataSource.setDriverClassName(Objects.requireNonNull(environment.getProperty("dbDriver")));
        return managerDataSource;

    }
}
