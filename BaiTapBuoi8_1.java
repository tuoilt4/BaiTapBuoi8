import java.util.Scanner;

public class BaiTapBuoi8_1 {
    public static void baitap9() {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Nhập chiều cao của tam giác: ");
            n = sc.nextInt();
        }
        while (n <= 0);
        for (int i = 1; i<=n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print(" *" );
            }
            System.out.println();
        }
    }
    public static void baitap10() {
        Scanner sc = new Scanner(System.in);
        int n;
        int m;
        do {
            System.out.print("Nhập chiều rộng và dài của hình chữ nhật: ");
            n = sc.nextInt();
            m=sc.nextInt();
        }
        while (n <= 0 && m<=0);
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                    System.out.print("*");
                    System.out.print(" ");
                }
            System.out.println("\n");
        }
    }
}
