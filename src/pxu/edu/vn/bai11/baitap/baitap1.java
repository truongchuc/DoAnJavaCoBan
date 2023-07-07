package pxu.edu.vn.bai11.baitap;

import java.util.Scanner;

public class baitap1 {

	static double a, b, c, x;
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int luachon;
		// TODO Auto-generated method stub
		do {
			System.out.println("Menu menu chuc nang: \n" + "1. Giai phuong trinh bat nhat.\n"
					+ "2. Giai phuong trinh bat hai.\n" + "0. Thoat chuong trinh.");
			luachon = sc.nextInt();
			if (luachon == 1) {
				System.out.println("Gia phuong trinh bat 1");
				System.out.println("ax + b = 0");
				nhap();
				tinhbieuthucbac1();
			} else if (luachon == 2) {
				System.out.println("Gia phuong trinh bat 2");
				System.out.println("ax2 + bx + c = 0");
				nhap();
				tinhbieuthucbac2();
			}
		} while (luachon != 0);
		System.out.println("Dang thoat chuong trinh ....");
	}

	public static double tinhbieuthucbac1() {
		if (a == 0) {
			if (b == 0) {
				System.out.println("phuong trinh vo so nghiem");
			} else {
				System.out.println("phuong trinh vo nghiem");
			}
		} else {
			double x = (Double) (-b / a);
			System.out.println("Phuong trinh co nghiem x la :" + x);
		}
		return x;
	}

	public static double tinhbieuthucbac2() {
		if(a==0) {
			tinhbieuthucbac1();
		}else {
			double delta = b*b - 4*a*c;
	        float x1;
	        float x2;
	        // tính nghiệm
	        if (delta > 0) {
	            x1 = (float) ((-b + Math.sqrt(delta)) / (2*a));
	            x2 = (float) ((-b - Math.sqrt(delta)) / (2*a));
	            System.out.println("Phương trình có 2 nghiệm là: "
	                    + "x1 = " + x1 + " và x2 = " + x2);
	        } else if (delta == 0) {
	            x1 = (float) (-b / (2 * a));
	            System.out.println("Phương trình có nghiệm kép: "
	                    + "x1 = x2 = " + x1);
	        } else {
	            System.out.println("Phương trình vô nghiệm!");
	        }	
		}
		return x;
	}

	public static void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap a: ");
		a = sc.nextDouble();
		Math.abs(a);
		System.out.println("Nhap b: ");
		b = sc.nextDouble();
		Math.abs(b);
	}

}
