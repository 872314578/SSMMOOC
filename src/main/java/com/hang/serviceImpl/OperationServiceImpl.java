package com.hang.serviceImpl;


import com.hang.domain.UserInfo;
import com.hang.mapper.OperationDao;
import com.hang.service.OperationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OperationServiceImpl implements OperationService {


    @Autowired
    private OperationDao operationDao;


    @Override
    public UserInfo getUserInfoByUsername(String username) throws Exception{
        return operationDao.selectOperationsByUsername(username);
    }
}
