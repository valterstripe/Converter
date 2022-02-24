package com.example.monitor;

import java.util.Scanner;

public class ConsoleMonitor {
    private Scanner scanner;

    public ConsoleMonitor() {
        this.scanner = new Scanner(System.in);
    }

    public String askString() {
        return scanner.next();
    }

    public double askDouble() {
        return scanner.nextDouble();
    }

    public void print (String text){
        System.out.println(text);
    }
}
