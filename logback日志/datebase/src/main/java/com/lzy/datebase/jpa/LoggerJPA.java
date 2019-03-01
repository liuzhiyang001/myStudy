package com.lzy.datebase.jpa;

import com.lzy.datebase.entiity.LoggerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @ Author     ：lzy
 * @ Date       ：Created in 10:29 2019/2/25
 * @ Description：
 */
public interface LoggerJPA extends
        JpaRepository<LoggerEntity,Long> {
}
