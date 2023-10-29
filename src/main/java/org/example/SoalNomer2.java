package org.example;




public class SoalNomer2 {
    public static String[] kataKe = new String[5];
    public static int huruf;

    public static String susunanKata;



    public static void main(String[] args) {
        DataAnalist dataAnalist = new DataAnalist();

        System.out.println("Jawaban nomer 1");
        pembahgian(100);
        System.out.println("Jawaban Nomer 2");
        Perulangan(1,9);
        System.out.println("Jawaban Nomer 3");
        reArrage(dataAnalist.T1_1, dataAnalist.T2_1);
        System.out.println("--------------");
        reArrage(dataAnalist.T1_2, dataAnalist.T2_2);
        System.out.println("--------------");
        reArrage(dataAnalist.T1_3, dataAnalist.T2_3);
    }
    static void pembahgian(int a ){
        for (int i = 1; i <=a ; i++) {
            if(i % 5 ==0 && i%3 ==0){
                System.out.println("bizzbuzz");
            }else if(i% 5 == 0){
                System.out.println("buzz");
            }else if(i%3 == 0){
                System.out.println("bizz");
            }else{
                System.out.println(i);
            }
        }
    }
    static void  Perulangan(int start, int end) {
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
    static void reArrage(String kalimat1, String kalimat2){
        for(int  i=0; i<5 ; i++){
            huruf = 0;
            kataKe[i]="";
            for (char karakter : kalimat2.toCharArray()){
                if(huruf==18){
                    kalimat2 = kalimat2.substring(huruf);
                    break;
                }
                kataKe[i] += karakter;
                huruf++;
            }
        }
        susunanKata = kataKe[2]+kataKe[3]+kataKe[4]+kataKe[0]+kataKe[1];

        System.out.println("T1" + kalimat1);
        System.out.println("T2" + susunanKata);
    }

}
