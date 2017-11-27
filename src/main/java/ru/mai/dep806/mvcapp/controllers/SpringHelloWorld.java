package ru.mai.dep806.mvcapp.controllers;

public class SpringHelloWorld {
    private String message;

    public String getMessage() {
        return  "Hello Message: " + message;
    }

    public void setMessage(String helloMessage) {
        this.message = helloMessage;
    }
    public void beanInit(){
        System.out.println("Bean is pasing init stage");
    }
    public void destroyBean(){
        System.out.println("Bean is passing destroy stage");
    }

}
