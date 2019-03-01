package com.lzy.myjdbctemplate.iservice.impl;

import com.lzy.myjdbctemplate.dao.PrintTemplateRepository;
import com.lzy.myjdbctemplate.dao.UserRepository;
import com.lzy.myjdbctemplate.entity.PrintTemplate;
import com.lzy.myjdbctemplate.iservice.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ Author     ：lzy
 * @ Date       ：Created in 15:50 2019/2/26
 * @ Description：
 */
@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PrintTemplateRepository printTemplateRepository;

    @Override
    public String getUser() {
       PrintTemplate printTemplate = printTemplateRepository.getPrintTemplate();

      // System.out.println(printTemplate.toString());
        //return userRepository.getUser();
        return printTemplate.getT_print_content().toString();
    }

    @Override
    public int setTemplate(PrintTemplate printTemplate) {
        return this.printTemplateRepository.setTemplate(printTemplate);
    }


}
