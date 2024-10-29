package buoi3;

public class baitapbuoi3 {
  public static String gioiTinh(boolean gt) {
    if (gt) {
        return "Nam";
    } else {
        return "Nu";
    }
}

  @SuppressWarnings("unused")
  public static void main(String[] args) {

    String maSV = "107896", hoVaTen = "Vo Ho Tan Loc", ngaySinh = "05/12/2006", lop = "IT24A",
        khoa = "Cong nghe thong tin", diaChi = "Da Nang";
    int tuoi = 18;
    boolean isMale = true , isFemale = false;

System.out.println("-----THONG TIN SINH VIEN-----");
System.out.println("Ma sinh vien: " + maSV );
System.out.println("Ho va ten: " + hoVaTen );
System.out.println("Ngay sinh: " + ngaySinh );
System.out.println("Tuoi: " + tuoi );
System.out.println("Gioi tinh: " + gioiTinh(isMale) );
System.out.println("Lop: " + lop );
System.out.println("Khoa: " + khoa );
System.out.println("Dia chi: " + diaChi );
System.out.println("---HET---" );
  }
}