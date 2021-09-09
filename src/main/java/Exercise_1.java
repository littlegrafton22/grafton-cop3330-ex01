/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Daniel Grafton
 */

import java.util.Scanner;

public class Exercise_1 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("What is your name? ");
        String name = input.nextLine();
        System.out.println("Hello, " + name + ", nice to meet you!");
    }
}
