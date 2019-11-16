package xiao.springboottourofheroes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;
import java.sql.SQLException;

@RestController
public class HeroController {

    @Autowired
    DataSource dataSource;

    @RequestMapping("/hero")
    public String sayHello() throws SQLException {
        System.out.println(dataSource.getConnection());
        return "hello";
    }
}
