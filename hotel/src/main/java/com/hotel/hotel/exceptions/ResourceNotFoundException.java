package com.hotel.hotel.exceptions;

public class ResourceNotFoundException extends RuntimeException{

    public ResourceNotFoundException(){
        super("hotel not found");
    }

    public ResourceNotFoundException(String s){
        super(s);
    }

}
