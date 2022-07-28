package com.company;

import java.util.Scanner;

import static java.lang.System.in;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner scanner = new Scanner(in);
        System.out.print("ko`paytruvchi raqamni kriting");
        int q = scanner. nextInt();
        int a = 1;
        for (int i = 1; i <=10 ; i++) {
            a =q * i;
            System.out.println(q + " * " +i+ " = " +a);

        }

    }
}
