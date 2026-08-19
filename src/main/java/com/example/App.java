package com.example;

public class App {
    public static String getGreeting() {
        return "Hello, Jenkins Java CI/CD Pipeline!\nJenkins Poll SCM trigger";
    }

    public static void main(String[] args) {
        System.out.println(getGreeting());
    }
}
