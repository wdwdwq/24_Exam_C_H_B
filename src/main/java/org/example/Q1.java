package org.example;

import java.util.Scanner;
//1. 가로길이, 세로길이를 입력받아 사각형 넓이 만큼 별을 찍어내는 프로그램을 구현합니다(30점)
public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("가로 길이: ");
        int width = scanner.nextInt();

        System.out.print("세로 길이: ");
        int height = scanner.nextInt();


        Square(width, height);
    }

    public static void
    Square(int width, int height) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
