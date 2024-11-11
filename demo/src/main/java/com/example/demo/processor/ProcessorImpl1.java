package com.example.demo.processor;

import com.example.demo.enums.ProcessorIdentityEnum;
import org.springframework.stereotype.Component;

@Component("processorImpl1")
public class ProcessorImpl1 implements Strategy<ProcessorIdentityEnum, ProcessorIdentityEnum> {

    @Override
    public ProcessorIdentityEnum process(ProcessorIdentityEnum processorEnum) {
        System.out.println("execute ProcessorImpl1 class");
        return processorEnum;
    }
}
