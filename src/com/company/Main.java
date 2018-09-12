package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        int a=0, b=0;
	int result;
        Scanner in = new Scanner (System.in);
        System.out.println("a-b");
        System.out.println("Input a:  ");
        a = in.nextInt();
        System.out.println("Input b:   ");
        b = in.nextInt();

        if (a>b){

            result = (a - b);
            System.out.println(result);
        }else {
                    System.out.println("Error!");
        }
        System.out.println("a+b");
        System.out.println("Input a:  ");
        a = in.nextInt();
        System.out.println("Input b:   ");
        b = in.nextInt();
        result = (a + b);
        System.out.println(result);
        System.out.println("a*b");
        System.out.println("Input a:  ");
        a = in.nextInt();
        System.out.println("Input b:   ");
        b = in.nextInt();
        result = (a * b);
        System.out.println(result);

    }
}
