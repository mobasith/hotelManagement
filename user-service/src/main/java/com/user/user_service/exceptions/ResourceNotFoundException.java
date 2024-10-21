package com.user.user_service.exceptions;

public class ResourceNotFoundException extends RuntimeException{
    public ResourceNotFoundException(){
        super("resource not found exception");
    }

    public ResourceNotFoundException(String msg){
        super(msg);
    }
}
