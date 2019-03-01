package com.lzy.myjdbctemplate.dao;

import com.lzy.myjdbctemplate.entity.PrintTemplate;
import com.lzy.myjdbctemplate.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @ Author     ：lzy
 * @ Date       ：Created in 16:19 2019/2/26
 * @ Description：
 */
@Repository
public class PrintTemplateRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public PrintTemplate getPrintTemplate(){
        RowMapper rowMapper= BeanPropertyRowMapper.newInstance(PrintTemplate.class);
        List<PrintTemplate> list=jdbcTemplate.query(" select * from t_print_template limit 1", rowMapper);
        return  list.get(0);
    }

    public int setTemplate(PrintTemplate printTemplate){
        int num=jdbcTemplate.update("INSERT INTO t_print_template VALUES(?,?,?);",printTemplate.getT_id(),printTemplate.getT_print_content(),printTemplate.getT_print_content_filed());
        return num;
    }
}
