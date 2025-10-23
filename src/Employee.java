import java.util.Scanner;

public class Employee {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so luong nhan vien:");
		int n = sc.nextInt();
		sc.nextLine();
		String[] nhanVien = new String[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Nhap thong tin nhan vien thu: " + (i + 1));
			 nhanVien[i] = sc.nextLine();
		}
		System.out.println("\nDanh sách nhân viên:");
		for (String ten : nhanVien) {
			System.out.println("- " + ten);
		}
	}
}
