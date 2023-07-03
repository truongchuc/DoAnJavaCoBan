package pxu.edu.vn.bai11;

import java.util.Scanner;

public class vidu5 {
	static double x;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		nhap();
		tinhbieuthuc();
	}

	public static double tinhbieuthuc() {
		double f = 0;
		f = Math.log10(x) + 1 / (Math.sqrt(Math.abs(Math.pow(x, 3) - 8)));
		System.out.println("f = " + f);
		return f;
	}

	public static void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap x: ");
		x = sc.nextDouble();
	}
}
