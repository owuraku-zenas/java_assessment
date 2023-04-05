package com.vmorg.customexception;

public class UserNotEntitledException extends Exception{
    public UserNotEntitledException(String message) {
        super(message);
    }
}
