package Buoi8;

public class BT3Buoi8 {
    public static void main(String[] args) {
        System.out.println("\nHinh tam giac cua ban day.");
        int n =5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" "+j+" ");
            }
            System.out.println();
        }
}
}
