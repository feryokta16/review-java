package org.example;




public class SoalNomer2 {
    public static String[] kataKe = new String[5];
    public static int huruf;

    public static String susunanKata;



    public static void main(String[] args) {
        DataAnalist dataAnalist = new DataAnalist();

//        System.out.println("Jawaban nomer 1");
//        pembahgian(100);
//        System.out.println("Jawaban Nomer 2");
//        Perulangan(1,9);
//        System.out.println("Jawaban Nomer 3");
//        reArrage(dataAnalist.T1_1, dataAnalist.T2_1);
//        System.out.println("--------------");
//        reArrage(dataAnalist.T1_2, dataAnalist.T2_2);
//        System.out.println("--------------");
//        reArrage(dataAnalist.T1_3, dataAnalist.T2_3);
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
