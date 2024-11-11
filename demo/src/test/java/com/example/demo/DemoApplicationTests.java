package com.example.demo;

import com.example.demo.enums.ProcessorIdentityEnum;
import com.example.demo.factory.ProcessorFactory;
import com.example.demo.processor.Strategy;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

    @Autowired
    ProcessorFactory processorFactory;

    @Test
    void strategyMatchFailed() {
        assert processorFactory.getProcessor(ProcessorIdentityEnum.IMPL4) == null;
    }

    @Test
    void strategyMatchImp1() {

        Strategy processor = processorFactory.getProcessor(ProcessorIdentityEnum.IMPL1);
        ProcessorIdentityEnum processorIdentityEnum = (ProcessorIdentityEnum) processor.process(ProcessorIdentityEnum.IMPL1);
        assert processorIdentityEnum == ProcessorIdentityEnum.IMPL1;
    }

    @Test
    void strategyMatchImp2() {

        Strategy processor = processorFactory.getProcessor(ProcessorIdentityEnum.IMPL2);
        ProcessorIdentityEnum processorIdentityEnum = (ProcessorIdentityEnum) processor.process(ProcessorIdentityEnum.IMPL2);
        assert processorIdentityEnum == ProcessorIdentityEnum.IMPL2;
    }


}
