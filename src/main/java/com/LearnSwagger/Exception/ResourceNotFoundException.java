package com.LearnSwagger.Exception;

public class ResourceNotFoundException extends RuntimeException{

    private int id;
    public ResourceNotFoundException(int id)
    {
        super(String.format("User with this id : %i not present in the record",id));
        this.id = id;
    }
}
