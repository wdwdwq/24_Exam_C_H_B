package org.example;

import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("양의 정수 n: ");
        int n = scanner.nextInt();

        Pyramid(n);
    }
     public static void Pyramid(int n) {
        for(int i = 0; i < n; i++){
            for(int j = 0; j < i; j++){
                System.out.print(" ");
            }
            for(int j = n - i; j > 0; j--){
                System.out.print(j + " ");
            }
            System.out.println();
        }
     }
}




