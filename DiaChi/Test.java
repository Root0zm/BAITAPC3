package addressBasic;

public class Test {
public static void main(String[] args) {
	Address a1 = new Address();
	
	//gan gia tri 
	a1.setThon("Dang Dong");
	a1.setXa("Yen Hong");
	a1.setHuyen("Y Yen");
	a1.setTinh("Nam Dinh");
	
	//xuat du lieu
	System.out.println("Thon: " + a1.getThon());
	System.out.println("Phuong/Xa: " + a1.getXa());
	System.out.println("Quan/Huyen: " + a1.getHuyen());
	System.out.println("Tinh/Thanh Pho: " + a1.getTinh());
	//xuat du lieu 
	System.out.println(a1.toString());
}
}
