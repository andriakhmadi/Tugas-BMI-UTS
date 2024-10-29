/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bmi;

/**
 *
 * @author Andri
 */
public class BMI {
    private double weight;
    private double height;
    
    public BMI(double weight, double height){
        this.weight = weight;
        this.height = height / 100;
    }
    
    public double calculateBMI(){
        return weight / (height*height);
    }
    
    public void getBMICatagory(){
        double bmi = calculateBMI ();
        
        if (bmi < 18.5){
            System.out.println("Kurus");
        }
        else if (bmi < 24.9){
            System.out.println("Normal");
        }
        else if (bmi <30){
            System.out.println("Overweight");
        }
        else {
            System.out.println("Obesitas");
        }
        System.out.printf("BMI Anda : %.2f", bmi);
        System.out.println("");
    }
}

