package com.test.unit.dao;

import com.test.unit.idao.IBaseScoreDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;

@Repository
public class BaseScoreDAO implements IBaseScoreDAO {

    @Autowired
    private DataSource dataSource;

}
