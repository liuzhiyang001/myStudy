package com.lzy.myjdbctemplate.dao;

import com.lzy.myjdbctemplate.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;


import java.util.List;

/**
 * @ Author     ：lzy
 * @ Date       ：Created in 16:52 2019/2/25
 * @ Description：
 */

@Repository
public class UserRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public String getUser(){
        RowMapper rowMapper= BeanPropertyRowMapper.newInstance(User.class);

        //List list=jdbcTemplate.queryForList("SELECT * FROM t_user");

        List<User> list=jdbcTemplate.query("SELECT * FROM t_user", rowMapper);

       //jdbcTemplate.queryForObject("SELECT * FROM t_user", User.class);

        //jdbcTemplate.execute("SELECT * FROM t_user");

        return list.get(0).toString()+"";
    }
}
