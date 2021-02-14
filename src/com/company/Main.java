package com.company;

public class Main {

    public static void main(String[] args) {
        printSquareStar(3);
        printSquareStar(5);
        printSquareStar(8);
        printSquareStar(10);
    }

    public static void printSquareStar(int number) {
//        char star = '*';
//        int rowNumber = 1;
//        int columnNumber = 1;

        if(number < 5) {
            System.out.println("Invalid Value");
        } else {
            // printing diagonal star

            // row for loop
            for(int i = 0; i < number; i++) {

                // column for loop
                for(int j = 0; j < number; j++) {

                    // conditions
                    if(i == 0 || j == 0 ||
                        i == number - 1 || j == number - 1 ||
                        i == j ||
                        j == number - (i + 1)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
        
    }
}

/*
If number is less than 5, print Invalid Value
If the number is 5 or greater:
    Set rowNumber equal to number
    Set columnNumber equal to number
    Loop through both rowNumber and columnNumber
    for(int i = 1; i <= rowNumber; i++) {
        for(int i = 1; i <= columnNumber; i++) {
            if(rowNumber == 1 || rowNumber == columnNumber) {
                System.out.println(number * star);
            } else if(columnNumber == 1 || columnNumber == number) {
                System.out.println(*);
            } else if(
        }
    }
 */
