package com.ibs.ibstestprojectjunit;

import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

public class FileMainTest {
    List<String> arr = new ArrayList<>();
    
    @Before
    public void setUp() throws Exception {
        arr.clear();
        File file = new File("/home/anton/Загрузки/NetBeansProject/IBSTestProjectJUnit/TestData");
        FileReader fr = new FileReader(file);
        Scanner scan = new Scanner(fr);
            
        String number;
        do {
            number = scan.nextLine();
            arr.add(number);
        } while (scan.hasNextLine());
    }
    
    @Test
    public void dividingANumberByThree() throws Exception {
        int testNumber = Integer.parseInt(arr.get(2));
        if (testNumber % 3 == 0) {
            arr.set(2, "Fizz");
        }
        Assert.assertEquals("Fizz", arr.get(2));
    }
    
    @Test
    public void dividingANumberByFive() throws Exception {
        int testNumber = Integer.parseInt(arr.get(5));
        if (testNumber % 5 == 0) {
            arr.set(5, "Buzz");
        }
        Assert.assertEquals("Buzz", arr.get(5));
    }
    
    @Test
    public void dividingANumberByFiveAndThree() throws Exception {
        int testNumber = Integer.parseInt(arr.get(4));
        if (testNumber % 3 == 0 && testNumber % 5 == 0) {
            arr.set(4, "FizzBuzz");
        }
        Assert.assertEquals("FizzBuzz", arr.get(4));
    }
}
