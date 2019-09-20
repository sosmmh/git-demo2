package com.zhss.service;

import com.zhss.dao.IndexDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @description:
 * @author: lixiahan
 * @create: 2019/09/19 17:54
 */
@Component
public class IndexServiceImpl {

    @Autowired
    private IndexDao dao;

    public void service() {
        System.out.println( dao.selectAll());
    }

    public void query() {
        System.out.println("query");
    }
}
