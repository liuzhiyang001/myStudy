package com.lzy.myjdbctemplate.iservice;

import com.lzy.myjdbctemplate.entity.PrintTemplate;

/**
 * @ Author     ：lzy
 * @ Date       ：Created in 15:49 2019/2/26
 * @ Description：
 */
public interface IUserService {

    String getUser();

    int setTemplate(PrintTemplate printTemplate);

}
