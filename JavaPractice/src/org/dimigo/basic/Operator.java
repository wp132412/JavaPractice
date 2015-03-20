package org.dimigo.basic;

public class Operator {
	public static void main(String[] args) {
		int a = 9;
		int b = 10;
		
		double h = 5.8;
		double h2 = 5.4;
		
		double ext_Trape = (a + b) * h / 2.0;
		double ext_Paral = (double) a * h2;
		
		System.out.println("<< 도형 넓이 비교 >>");
		System.out.println("사다리꼴 넓이 : " + ext_Trape);
		System.out.println("평행사변형 넓이 : " + ext_Paral);
		
		System.out.println();
		
		if(ext_Trape > ext_Paral) System.out.println("사다리꼴이 평행사변형보다 "+(ext_Trape - ext_Paral)+" 더 큽니다");
		else if(ext_Trape < ext_Paral) System.out.println("평행사변형이 사다리꼴보다 "+(ext_Paral - ext_Trape)+" 더 큽니다");
		else System.out.println("사다리꼴과 평행사변형의 넓이가 같습니다");
	}
}
