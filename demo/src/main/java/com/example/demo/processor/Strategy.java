package com.example.demo.processor;

public interface Strategy<T, R> {

    R process(T t);

}
