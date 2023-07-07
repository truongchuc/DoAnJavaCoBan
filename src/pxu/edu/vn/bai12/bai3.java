package pxu.edu.vn.bai12;

import java.util.Scanner;

public class bai3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Nhập vào số phần tử của mảng: ");
			n = sc.nextInt();
		} while (n < 0);
		double a[] = new double[n];
		System.out.println("Nhập các phần tử cho mảng: ");
		for (int i = 0; i < n; i++) {
			System.out.print("Nhập phần tử thứ " + i + ": ");
			a[i] = sc.nextDouble();
		}
		System.out.println("Giá trị của mảng: ");
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + "\t");
		}
	}

}
