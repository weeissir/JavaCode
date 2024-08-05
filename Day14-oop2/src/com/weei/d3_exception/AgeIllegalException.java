package com.weei.d3_exception;

//编译时异常，必须继承Exception
public class AgeIllegalException extends Exception{
    public AgeIllegalException() {
    }

    public AgeIllegalException(String message) {
        super(message);
    }
}
