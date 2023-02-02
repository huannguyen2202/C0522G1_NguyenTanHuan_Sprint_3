package test;

import java.util.Scanner;

public class DaoNguocMotMangSoNguyen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        boolean test = false;
        do {
            System.out.print("Nhap vao so phan tu cua mang: ");
            n = scanner.nextInt();
        } while (n<0);
        int array[] = new int[n];
        for (int i = 0; i<n; i++){
            System.out.println("Nhap vao phan tu thu "+i+":");
            array[i]= scanner.nextInt();
        }

        System.out.println("Hien thi mang vao nhap: ");
        for (int i = 0; i<n; i++){
            System.out.print(array[i]);
        }

        for (int i=0; i<n; i++){
            if (array[i]==array[n-1-i]){
                test=true;
            } else {
                test = false;
            }
        }

        if (test==true){
            System.out.println("La mang doi xung!");
        } else {
            System.out.println("Khong la mang doi xung!");
        }
    }
}
