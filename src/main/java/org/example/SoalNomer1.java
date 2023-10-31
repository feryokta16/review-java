package org.example;

public class SoalNomer1 {
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
}
