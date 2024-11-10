package diachinhanvien;

public class Test {

	public static void main(String[] args) {
		DiaChi dc1 = new DiaChi("DD","yenhong","yyen","namdinh");
		NhanVien nv1 = new NhanVien("Hoang",dc1,"15/03/2005",'M');
		System.out.println(nv1.toString());
	}

}
