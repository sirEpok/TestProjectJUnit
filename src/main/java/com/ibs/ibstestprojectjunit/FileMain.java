package com.ibs.ibstestprojectjunit;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class FileMain {
    public static void main(String[] args) {
        try {
            File file = new File("/home/anton/Загрузки/NetBeansProject/IBSTestProjectJUnit/TestData");
            FileReader fr = new FileReader(file);
            Scanner scan = new Scanner(fr);
            
            int number;
            do {
                number = Integer.parseInt(scan.nextLine());
                if (number % 3 == 0 && number % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else if (number % 3 == 0) {
                    System.out.println("Fizz");
                } else if (number % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(number);
                }         
            } while (scan.hasNextLine());
        } catch (FileNotFoundException | NumberFormatException ex) {
            System.err.println(ex.getMessage());
        }
    }
}
