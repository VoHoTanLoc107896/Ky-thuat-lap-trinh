package buoi6;
import java.util.Scanner;
public class baitap2buoi6 {
public static void main(String[] args) {
    String hoTen;
    String ngaySinh;
    Float diemTongKet;
    int tuoi;
    Scanner sc = new Scanner(System.in);
    System.out.print("\nNhap ho va ten : ");
    hoTen = sc.nextLine();
    System.out.print("Nhap ngay sinh");
    ngaySinh = sc.nextLine();
    System.out.print("Nhap diem : ");
    diemTongKet = sc.nextFloat();
    System.out.print("Nhap tuoi : ");
    tuoi = sc.nextInt();
    System.out.println("---THONG TIN SINH VIEN---");
    System.out.println("Ho va ten : "+ hoTen);
    System.out.println("Ngay sinh : "+ ngaySinh);
    System.out.println("Diem tong ket : "+ diemTongKet);
    System.out.println("Tuoi : "+ tuoi);
    System.out.println("---HET--- ");
}
}
