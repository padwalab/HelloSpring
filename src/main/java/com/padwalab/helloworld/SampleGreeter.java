package com.padwalab.helloworld;

public class SampleGreeter implements Greeter {
    private String name;
    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String greet() {
        return "Hello World from " + this.name + "!";
    }
    
}
