package test;

import java.util.Scanner;

public class DaoNguocMangSoNguyen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, sum = 0, tempsort;
        boolean test = false;
        do {
            System.out.print("Nhap vao so phan tu cua mang: ");
            n = scanner.nextInt();
        } while (n < 0);
        int array[] = new int[n];
        System.out.println("Nhap vao phan tu cua mang");
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap vao phan tu thu " + i + ":");
            array[i] = scanner.nextInt();
        }
        System.out.print("Hien thi mang vua nhap:");
        for (int i = 0; i < n; i++) {
            System.out.println(array[i]);
        }

        for (int i = 0; i < n; i++) {
            sum = sum + array[i];
        }
        System.out.println("Tong cua mang la:"+sum);

//        for (int i = 0; i < n - 1; i++) {
//            for (int j = i+1; j < n; j++){
//                if (array[i]<array[j]){
//                    tempsort = array[i];
//                    array[i] = array[j];
//                    array[j] = tempsort;
//                }
//            }
//            System.out.println(array[i]);
//        }
//        System.out.println("Mang sau khi sap xep giam dan:");
//        for (int i=0; i<n; i++){
//            System.out.println(array[i]);
//        }

//        for (int i = 0; i<n-1; i++){
//            for (int j = i+1; j<n; j++){
//                if (array[i]>array[j]){
//                    tempsort = array[i];
//                    array[i]= array[j];
//                    array[j]=tempsort;
//                }
//            }
//        }
//
//        System.out.println("Mang sau khi duoc sap xep tang dan:");
//        for (int i=0; i<n;i++){
//            System.out.println(array[i]);
//        }

        for (int i=0; i<n/2;i++){
            if (array[i]==array[n-1-i]){
                test = true;
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
