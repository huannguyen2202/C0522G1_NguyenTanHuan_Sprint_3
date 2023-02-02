package test;

import java.util.Scanner;

public class KiemTraSoChanLe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1;
        System.out.print("Nhap vao so can kiem tra: ");
        num1 = scanner.nextInt();
        if (num1 % 2 == 0){
            System.out.printf("So %d la so chan!", num1);
        } else {
            System.out.printf("So %d la so le!", num1);
        }
    }
}
