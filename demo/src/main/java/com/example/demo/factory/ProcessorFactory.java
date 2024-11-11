package com.example.demo.factory;

import com.example.demo.enums.ProcessorIdentityEnum;
import com.example.demo.processor.Strategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class ProcessorFactory {

    @Autowired
    private Map<String, Strategy> strategyMap;

    public Strategy getProcessor(ProcessorIdentityEnum processorIdentityEnum) {

        Strategy strategy = strategyMap.get(processorIdentityEnum.getClassName());
        if (strategy == null) {
            System.out.println("Strategy not found:" + processorIdentityEnum);
            return null;
        }

        return strategyMap.get(processorIdentityEnum.getClassName());
    }
}
