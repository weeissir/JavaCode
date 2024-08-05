package com.weei.d3_exception;

//必须要让该类继承RuntimeException，才能成为一个运行时异常
public class AgeIllegalRuntimeException extends RuntimeException{
    public AgeIllegalRuntimeException() {
    }

    public AgeIllegalRuntimeException(String message) {
        super(message);
    }
}
