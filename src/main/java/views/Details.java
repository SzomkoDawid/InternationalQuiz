package views;

import java.util.Scanner;

public class Details {
    public void rules() throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("##################################");
        System.out.println("Rules : \n1. If you know answer, enter the letter " +
                "[a,b,c or d] \n2. Case is important! " +
                "\n3. You get a point for every correct answer");
        System.out.println("Are you ready? Press something, click enter, and let's go!");
        scanner.next();
            System.out.println("Prepared questions, wait a second");
            Thread.sleep(2000);
        }
    }

