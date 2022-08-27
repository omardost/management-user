package com.user.management;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
public class DatabaseInitializer {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Bean
    CommandLineRunner initDatabase() {
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
                jdbcTemplate.execute("DROP TABLE T_USER IF EXISTS");
                jdbcTemplate.execute("Create table T_USER (id int primary key auto_increment, name varchar(30), " +
                        "email varchar(30))");
            }
        };
    }
}
