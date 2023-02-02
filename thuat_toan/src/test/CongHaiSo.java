package test;

import java.util.Scanner;

public class CongHaiSo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2;
        System.out.print("Nhap vao so thu nhat: ");
        num1 = scanner.nextInt();
        System.out.print("Nhap vao so thu hai: ");
        num2 = scanner.nextInt();
        System.out.printf("Tong hai so la: %d + %d = %d", num1,num2, num1+num2);
    }
}
