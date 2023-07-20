package org.studySpring;

import java.util.Scanner;

public class Usage {

	public static void main(String[] args) {
		 System.out.println("whats your age");
		 Scanner sc = new Scanner(System.in);
		 int age = sc.nextInt();
		 System.out.println(" hi I am "+ age + "years old");
		 sc.close();

	}

}
