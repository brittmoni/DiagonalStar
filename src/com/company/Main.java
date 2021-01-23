package com.company;

public class Main {

    public static void main(String[] args) {
        printSquareStar(3);
    }

    public static void printSquareStar(int number) {
        if(number < 5) {
            System.out.println("Invalid Value");
        }

        
    }
}

/*
If number is less than 5, print Invalid Value
If the number is 5 or greater:
    for(int i = 1; i <= number; i++){
        when i = 1, print * multiplied by number
        when i + 1, print ** space multiplied by number - 4 **
        i + 1,
        when i = number, print * multiplied by number
        
 */
