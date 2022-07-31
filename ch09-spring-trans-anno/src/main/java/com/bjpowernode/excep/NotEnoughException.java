package com.bjpowernode.excep;

/**
 * @Author 临渊
 * @Date 2022-07-31 15:32
 */
public class NotEnoughException extends RuntimeException {

    public NotEnoughException() {
        super();
    }

    public NotEnoughException(String message) {
        super(message);
    }

}
