package com.example.demo.processor;

import com.example.demo.enums.ProcessorIdentityEnum;
import org.springframework.stereotype.Component;

@Component("processorImpl3")
public class ProcessorImpl3 implements Strategy<ProcessorIdentityEnum, ProcessorIdentityEnum> {

    @Override
    public ProcessorIdentityEnum process(ProcessorIdentityEnum processorEnum) {
        System.out.println("execute ProcessorImpl3 class");
        return processorEnum;
    }
}
