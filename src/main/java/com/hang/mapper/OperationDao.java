package com.hang.mapper;


import com.hang.domain.UserInfo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OperationDao {
    public UserInfo selectOperationsByUsername(String username) throws Exception;
}
