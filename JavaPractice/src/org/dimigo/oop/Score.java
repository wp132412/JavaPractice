package org.dimigo.oop;

import java.util.Scanner;

public class Score {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 점수 입력 => ");
		int kor = sc.nextInt();
		
		System.out.print("영어 점수 입력 => ");
		int mat = sc.nextInt();
		
		System.out.print("수학 점수 입력 => ");
		int eng = sc.nextInt();
		
		System.out.println("<< 점수 출력 >>");
		String result = new StringBuilder().append("국어 점수 : ").append(kor + "점\n").append("수학 점수 : ").append(mat + "점\n").append("영어 점수 : ").append(eng + "점\n").append("총점 : ").append(kor+eng+mat + "점\n").append("평균 : ").append(String.format("%.1f", (kor+eng+mat)/3.0) + "점\n").toString();
		
		System.out.println(result);
		sc.close();
	}
}
