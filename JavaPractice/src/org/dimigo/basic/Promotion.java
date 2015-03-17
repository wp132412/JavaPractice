package org.dimigo.basic;

public class Promotion {
	public static void main(String[] args) {
		int salary = 1700000;
		int jikwon = 3;
		int jumpo = 1500;
		
		double all = salary * 12F;
		all *= jikwon;
		all *= jumpo;
		
		System.out.println("<< 디미베네 연간 인건비 >>");
		System.out.println("월 평균 급여 : "+String.format("%,d", salary) + "원");
		System.out.println("점포 내 직원 수 : "+jikwon+"명");
		System.out.println("점포 수 : "+String.format("%,d", jumpo) + "개");
		
		System.out.println("연간 인건비 : "+String.format("%,d", Math.round(all))+" 원");
	}
}
