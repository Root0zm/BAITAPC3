package quanlinhanvien;
import java.util.Scanner;
public class Test {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("Nhập số lượng nhân viên: ");
		int n = input.nextInt();
		PartTimeEmployee pt[] = new PartTimeEmployee[n];
		for(int i=0; i<pt.length; i++)
			pt[i] = new PartTimeEmployee();
		for(int i=0; i<pt.length;i++) {
			System.out.println("Nhap thong tin nhan vien " + (i+1) + ": ");
			pt[i].nhapTT();
		}		
		for(int i=0; i<pt.length; i++)
			System.out.println(pt[i].toString());
	}
}
