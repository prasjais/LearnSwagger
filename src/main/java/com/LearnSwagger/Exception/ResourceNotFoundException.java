package com.LearnSwagger.Exception;

public class ResourceNotFoundException extends RuntimeException{

    private int id;
    public ResourceNotFoundException(int id)
    {
        super(String.format("Resource with this id : %i not found",id));
        this.id = id;
    }
}
