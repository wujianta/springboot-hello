package org.newit.springboot.starter;

public class HelloService {

    private String message;

    public String sayHello(){
        return "Hello," + message;
    }
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
