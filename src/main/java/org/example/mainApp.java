package org.example;

public class mainApp {
    public static void main(String[] args) {
        SoalNomer1 soalNomer1 = new SoalNomer1();
        SoalNomer2 soalNomer2 = new SoalNomer2();
        SoalNomer3 soalNomer3 = new SoalNomer3();
        DataAnalist dataAnalist = new DataAnalist();


        soalNomer1.pembahgian(100);
        soalNomer2.perulangan(1,9);
        soalNomer3.reArrage(dataAnalist.T1_1, dataAnalist.T2_1);
        System.out.println("--------------");
        soalNomer3.reArrage(dataAnalist.T1_2, dataAnalist.T2_2);
        System.out.println("--------------");
        soalNomer3.reArrage(dataAnalist.T1_3, dataAnalist.T2_3);
    }
}
