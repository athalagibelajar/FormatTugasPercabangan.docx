/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listrik;

import java.util.Scanner;

public class java {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Besar Pemakaian: ");
        double pemakaian = input.nextDouble();
        
        double tarif = 0;
        
        if (pemakaian <=50){
            tarif = 100;
        }else if (pemakaian  <=150){
            tarif = 150;    
        }else if (pemakaian <=250) {
            tarif = 250;
        }else {
            tarif = 300;
        }
        double biaya = pemakaian*tarif;
        double tambahan = biaya * 20/100;
        double total = tambahan + 20/100;
        
        System.out.println("Toatal Biaya: " + total);
        
        
    }
}
