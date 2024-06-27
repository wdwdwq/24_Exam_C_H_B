package org.example;
public class Q3 {
    public static void main(String[] args) {
        fibo(10);
    }
    public static void fibo(int n) {
        int a = 0, b = 1;

        for(int i = 0 ; i < n ; i++) {
            if(i == 9){
                System.out.print(a);
            }else{
                System.out.print(a+" ");
            }
            int next = a + b;
            a = b;
            b = next;
        }
    }
}
