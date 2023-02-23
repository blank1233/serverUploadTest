package com.zhang.service.serviceImpl;

import com.zhang.service.ImplChangeTestService;
import org.springframework.stereotype.Service;

@Service
public class ImplChangeTestServiceImpl implements ImplChangeTestService {

    @Override
    public void changeFlag() {
        System.out.println("1111");
    }
}
