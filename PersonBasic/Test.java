package personBasic;
public class Test {
	public static void main(String[] args) {
		Person p1 = new Person();
		//gan gia tri
		p1.setName("Hoang");
		p1.setDob("15/03/2005");
		p1.setPob("ND");
		p1.setGender('M');
		p1.setEmail("aaaaa@gmail.com");
		p1.setPhone("0123456789");
		//goi gia tri
		System.out.println("name:" + p1.getName());
		System.out.println("day of birth: " + p1.getDob());
		System.out.println("place of birth: " + p1.getPob());
		System.out.println("gender: " + p1.getGender());
		System.out.println("email: "+ p1.getEmail());
		System.out.println("phone: " + p1.getPhone());
		//xuat du lieu
		System.out.println(p1.toString());
	}
}
