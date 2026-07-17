package Java_Fundamentals.flowcontrolstatements;

import java.util.Scanner;

public class Q13 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter starting number: ");
        int start = sc.nextInt();

        System.out.print("Enter ending number: ");
        int end = sc.nextInt();

        for (int n = start; n <= end; n++) {

            boolean prime = true;

            if (n <= 1) {
                prime = false;
            } else {
                for (int i = 2; i < n; i++) {
                    if (n % i == 0) {
                        prime = false;
                        break;
                    }
                }
            }

            if (prime) {
                System.out.println(n);
            }
        }

        sc.close();
    }
}