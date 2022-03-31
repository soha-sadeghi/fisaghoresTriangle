package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if((a * a) + (b * b) == (c * c)){
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }
    }
}
