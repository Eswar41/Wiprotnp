package Java_Fundamentals.languagebasics;

import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first word: ");
        String first = sc.next();

        System.out.print("Enter second word: ");
        String second = sc.next();

        System.out.println(first + " Technologies " + second);

        sc.close();
    }
}