package diemsv;

public class Entry{
public static void main(String[] args) {
	SVCDN n1 = new SVCDN();
	System.out.println("Nhap vao thong tin SVCDN");
	n1.nhapThongTin();
	System.out.println("Nhap vao thong tin SVCDCQ");
	SVCDCQ n2 = new SVCDCQ();
	n2.nhapThongTin();
	n1.inThongTin();
	n2.inThongTin();
}
}