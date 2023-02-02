package test;

import java.util.Scanner;

public class SoDoiXung {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2, res=0;
        System.out.print("Nhap so kiem tra doi xung: ");
        num1 = scanner.nextInt();
        num2 = num1;
        while (num1 != 0){
            int digit = num1 % 10;
            res = res * 10 + digit;
            num1 = num1 / 10;
        }
        if (num2 == res){
            System.out.println(num2 + ": la so doi xung!");
        } else {
            System.out.println(num2 + ": khong la so doi xung!");
        }
    }
}
