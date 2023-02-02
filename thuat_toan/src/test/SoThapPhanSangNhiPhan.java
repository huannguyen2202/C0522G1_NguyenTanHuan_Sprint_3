package test;

import java.util.Scanner;

public class SoThapPhanSangNhiPhan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, a, b = 0, c = 1, m;
        System.out.print("Nhập số thập phân cần đổi sang nhị phân: ");
        n = scanner.nextInt();
        m = n;
        while (n > 0) {
            a = n % 2;
            n = n / 2;
            b = b + (a * c);
            c = c * 10;
        }
        System.out.printf("Số %d sau khi chuyển đổi sang hệ nhị phân là: %d", m, b);
    }
}
