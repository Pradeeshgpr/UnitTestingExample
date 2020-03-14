package com.test.unit.service;

import com.test.unit.idao.IBaseScoreDAO;
import com.test.unit.iservice.IBaseScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BaseScoreService implements IBaseScoreService {

    @Autowired
    private IBaseScoreDAO baseScoreDAO;

}
