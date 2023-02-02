package test;

import java.util.Scanner;

public class KiemTraNamNhuan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;
        boolean test = false;
        System.out.print("Nhap vao nam can kiem tra: ");
        year = scanner.nextInt();
        if (year % 4 == 0){
            if (year % 100 == 0){
                if (year % 400 == 0){
                    test = true;
                } else {
                    test = false;
                }
                test = false;
            } else {
                test = true;
            }
        } else {
            test = false;
        }
        if (test == true){
            System.out.printf("Nam %d la nam nhuan!", year);
        } else {
            System.out.printf("Nam %d khong la nam nhuan!", year);
        }
    }
}
