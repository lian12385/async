package com.whq.usecase.domain;

import com.fc.async.annotation.AsyncExec;
import com.fc.async.enums.AsyncTypeEnum;
import org.springframework.stereotype.Service;

@Service
public class serviceImpl implements service {
    @Override
    @AsyncExec(type = AsyncTypeEnum.ASYNC_SAVE, remark = "测试")
    public String  test(){
        int a = 0;
        int total = 10;
        System.out.println("i am fine");
        return "test";
    }

    @Override
    @AsyncExec(type = AsyncTypeEnum.ASYNC_SAVE, remark = "测试")
    public String test1(){
        System.out.println("1111111111");
        int a = 0;
        int total = 10;
        int average = total / a;
        return "test1";
    }
}
