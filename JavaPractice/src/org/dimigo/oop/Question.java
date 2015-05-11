package org.dimigo.oop;

import java.util.Scanner;

public class Question {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String answer = null;
		
		System.out.println("가장 좋아하는 가수는?");
		answer = sc.nextLine();
		
		if("아이유".equals(answer)) {
			System.out.println("맞았네요 !!");
		} else {
			System.out.println("틀렸습니다 ㅜㅜ");
		}
		
		System.out.println();
		
		System.out.println("가장 싫어하는 음식은?");
		answer = sc.nextLine();
		
		if("번데기".equals(answer)) {
			System.out.println("맞았네요 !!");
		} else {
			System.out.println("틀렸습니다 ㅜㅜ");
		}
		
		System.out.println();
		
		System.out.println("가장 좋아하는 날은?");
		answer = sc.nextLine();
		
		if("귀가일".equals(answer)) {
			System.out.println("맞았네요 !!");
		} else {
			System.out.println("틀렸습니다 ㅜㅜ");
		}
		
		System.out.println();
		
		sc.close();
	}
}
