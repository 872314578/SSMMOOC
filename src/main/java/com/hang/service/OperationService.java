package com.hang.service;

import com.hang.domain.UserInfo;
import org.springframework.stereotype.Service;

@Service
public interface OperationService {
    public UserInfo getUserInfoByUsername(String username) throws Exception;
}
