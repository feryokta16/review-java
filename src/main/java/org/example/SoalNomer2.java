package org.example;

public class SoalNomer2 {
    public static void main(String[] args) {

    }
    static void  perulangan(int start, int end) {
        while (start <= end) {
            for (int i = start; i <= end; i++) {
                if (i % 2 == 0) {
                    System.out.print("_");
                } else {
                    System.out.print(i);
                }
            }
            System.out.println();
            start++;
            end--;
        }
    }

}
