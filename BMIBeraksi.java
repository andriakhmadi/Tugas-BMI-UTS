/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bmi;

import java.util.Scanner;

/**
 *
 * @author Andri
 */
public class BMIBeraksi {

    public static void main(String[] args) {
        Scanner inputansaya = new Scanner(System.in);

        System.out.print("Masukan Berat Badan Anda (kg) : ");
        double weight = inputansaya.nextDouble();
        System.out.print("Masukan Tinggi Badan Anda (cm) : ");
        double height = inputansaya.nextDouble();
        
        BMI bmi = new BMI(weight, height);
        bmi.getBMICatagory();
    }
}
