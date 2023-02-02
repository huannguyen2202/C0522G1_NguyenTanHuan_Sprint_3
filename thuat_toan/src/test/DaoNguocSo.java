package test;

import java.util.Scanner;

public class DaoNguocSo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, res=0, num2;
        System.out.print("Nhap so can dao nguoc: ");
        num1 = scanner.nextInt();
        num2 =num1;
        while (num1 != 0){
            int digit = num1 % 10;
            res = res * 10 + digit;
            num1 = num1 /10;
        }
        System.out.printf("So %d sau khi dao nguoc la: %d", num2, res);
    }
}
