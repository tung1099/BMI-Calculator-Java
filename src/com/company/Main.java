package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        double weight,height,bmi;
        System.out.print("Nhập số cân nặng của bạn (Kg): ");
        weight= scanner.nextDouble();
        System.out.print("Nhập chiều cao của bạn (m): ");
        height= scanner.nextDouble();
        bmi = weight / Math.pow(height,2);
        if (bmi < 18){
            System.out.printf("Chỉ số BMI của bạn là : %s - Thiếu cân", bmi );
        } else if (bmi < 25.0){
            System.out.printf("Chỉ số BMI của bạn là : %s - Bình thường", bmi);
        } else if (bmi < 30.0){
            System.out.printf("Chỉ số BMI của bạn là : %s - Thừa cân", bmi);
        } else {
            System.out.printf("Chỉ số BMI của bạn là : %s - Béo phì", bmi);
        }
    }
}