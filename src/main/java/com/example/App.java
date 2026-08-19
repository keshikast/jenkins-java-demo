package com.example;

public class App {
    public static String getGreeting() {
        return "Hello, Jenkins Java CI/CD Pipeline!\npoll scm trigger jenkins";
    }

    public static void main(String[] args) {
        System.out.println(getGreeting());
    }
}
