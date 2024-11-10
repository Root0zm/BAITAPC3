package quanlinhanvien;
import java.util.Scanner;
public class Employee extends Person{
	//thuoc tinh
	protected String employerName;
	protected String dateHired;
	//contructor	
	public Employee() {	
	}	
	public Employee(String name, int age, char gender, String employerName, String dateHired) {
		super(name,age,gender);
		this.employerName = employerName;
		this.dateHired = dateHired;
	}
	//setter()
	public void setEmployerName(String employerName) {
		this.employerName = employerName;
	}
	public void setDateHired(String dateHired) {
		this.dateHired = dateHired;
	}
	//getter
	public String getEmployerName() {
		return employerName;
	}
	public String getDateHired() {
		return dateHired;
	}	
	@Override
	public void nhapTT() {
		Scanner input =new Scanner(System.in);
		super.nhapTT();
		System.out.println("Nhap vao ten nhan vien: ");
		this.employerName=input.next();		
		System.out.println("Nhap vao ngay tuyen dung: ");
		this.dateHired=input.next();	
	}
	@Override
	public String toString() {
		String i = super.toString()
			+ ", employerName:  " +this.employerName
			+ ", dateHired: " + this.dateHired;
		return i;
	}
	
	
	
	
	
}
