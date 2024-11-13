package Buoi8;

public class BT7Buoi8 {
    public static void main(String[] args) {
        System.out.println("\nHinh tam giac cua ban day.");
        int n = 4;
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
    

