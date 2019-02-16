package com.netcracker.edu.tms;

import com.netcracker.edu.tms.dao.TaskDaoJpaImpl;
import com.netcracker.edu.tms.model.Priority;
import com.netcracker.edu.tms.model.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigInteger;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;


@SpringBootApplication
public class App {


    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

}
