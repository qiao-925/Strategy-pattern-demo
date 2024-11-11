package com.example.demo.processor;

import com.example.demo.enums.ProcessorIdentityEnum;
import org.springframework.stereotype.Component;

@Component("processorImpl2")
public class ProcessorImpl2 implements Strategy<ProcessorIdentityEnum, ProcessorIdentityEnum> {

    @Override
    public ProcessorIdentityEnum process(ProcessorIdentityEnum processorEnum) {
        System.out.println("execute ProcessorImpl2 class");
        return processorEnum;
    }
}
