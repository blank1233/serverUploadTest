package com.zhang.service.serviceImpl;

import com.zhang.service.ImplChangeTestService;
import org.springframework.stereotype.Service;

@Service
public class ImplChangeTestServiceTwoImpl  implements ImplChangeTestService {
    @Override
    public void changeFlag() {
        System.out.println("222");
    }
}
