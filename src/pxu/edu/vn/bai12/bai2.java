package pxu.edu.vn.bai12;

import java.util.Scanner;

public class bai2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Nhập vào số phần tử của mảng: ");
			n = sc.nextInt();
		} while (n < 0);
		int a[] = new int[n];
		System.out.println("Nhập các phần tử cho mảng: ");
		for (int i = 0; i < n; i++) {
			System.out.print("Nhập phần tử thứ " + i + ": ");
			a[i] = sc.nextInt();
		}
		System.out.println("Mảng ban đầu: ");
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + "\t");
		}
	}

}
