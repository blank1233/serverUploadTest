package com.zhang.springbootProxy;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

//通知

public class MyAdvice {

    private static Logger logger = LogManager.getLogger(MyAdvice.class);

    public static void main(String[] args) {
        logger.info("日志测试:info");
        logger.debug("debug");
        logger.error("error");

    }
}
