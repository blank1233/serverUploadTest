package com.zhang.controller;

import com.zhang.service.ImplChangeTestService;
import com.zhang.service.serviceImpl.ImplChangeTestServiceImpl;
import com.zhang.service.serviceImpl.ImplChangeTestServiceTwoImpl;
import org.springframework.stereotype.Controller;

@Controller
public class ImplChangeTestController {
    //private ImplChangeTestService implChangeTestService;

    public void changeTest(ImplChangeTestService implChangeTestService){

        implChangeTestService.changeFlag();
    }

    public static void main(String[] args) {
        ImplChangeTestController implChangeTestController = new ImplChangeTestController();
        implChangeTestController.changeTest(new ImplChangeTestServiceImpl());
        implChangeTestController.changeTest(new ImplChangeTestServiceTwoImpl());
    }
}
