package pxu.edu.vn.bai11;

import java.util.Scanner;

public class vidu4 {

	static double a, b, c;
	static int x;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		nhap();
		tinhbieuthucf1();
	}

	public static double tinhbieuthucf1() {
		double f = a * x * x + b * x + c;
		System.out.print("f = " + f);
		return f;
	}

	public static void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap a: ");
		a = sc.nextDouble();
		System.out.println("Nhap b: ");
		b = sc.nextDouble();
		System.out.println("Nhap c: ");
		c = sc.nextDouble();
		System.out.println("Nhap x: ");
		x = sc.nextInt();
	}

}
