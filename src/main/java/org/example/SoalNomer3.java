package org.example;

public class SoalNomer3 {
    public static String[] kataKe = new String[5];
    public static int huruf;

    public static String susunanKata;
    static void reArrage(String kalimat1, String kalimat2){
        DataAnalist dataAnalist = new DataAnalist();
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
