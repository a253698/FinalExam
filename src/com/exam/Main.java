package com.exam;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	FileReader fr;
	List<Product> pr = new ArrayList<>();
	int a = 0;
	int d = 0;

	public Main() {

		readFile();
		printMenu();

		Scanner scanner = new Scanner(System.in);
		String orderNo = null;

		while (orderNo != "q") {
			System.out.println("請輸入餐點:");
			orderNo = scanner.nextLine();

			switch (orderNo) {
			default:
				System.out.println("請輸入數量:");
				int orderhowmay = scanner.nextInt();
				System.out.println("目前餐點:");
				System.out.println(pr.get(Integer.parseInt(orderNo)) + " " + orderhowmay + "份");
				return;

			case "8":
				System.out.println("q) 離開(結束程式)");
				目前餐點: 
				break;

			}

		}
	}

	public void readFile() {
		try {
			fr = new FileReader("menu.txt");
			BufferedReader in = new BufferedReader(fr);
			String line = in.readLine();
			while (line != null) {
				String tokens[] = line.split(",");
				String ProductNo = tokens[0];
				String ProductName = tokens[1];
				int price = Integer.parseInt(tokens[2]);
				int calorie = Integer.parseInt(tokens[3]);
				Product products = new Product(ProductNo, ProductName, price, calorie);
				pr.add(products);
				line = in.readLine();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void printMenu() {
		for (Product products : pr) {
			System.out.println(products.getProductNo() + ") " + products.getProductName());
		}
		System.out.println("8. 結算");
	}

	public static void main(String[] args) {
		new Main();
	}

}
