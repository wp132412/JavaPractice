package org.dimigo.oop;

public class Car2Test {
	public static void main(String[] args) {
		Car2 c1 = new Car2("현대자동차", "제네시스", "검정색", 225, 50000000);
		Car2 c2 = new Car2("기아자동차", "K7", "흰색", 246, 40000000);
		Car2 c3 = new Car2("삼성자동차", "SM7", "회색", 200, 38000000);
		
		System.out.println("<< 자동차 목록 >>");
		System.out.println("제조사명 : "+c1.getCompany());
		System.out.println("모델명 : "+c1.getModel());
		System.out.println("색상 : "+c1.getColor());
		System.out.println("최대속도 : "+c1.getMaxSpeed()+"km");
		System.out.println("가격 : "+String.format("%,d", c1.getPrice())+"원");
		System.out.println();
		System.out.println("제조사명 : "+c2.getCompany());
		System.out.println("모델명 : "+c2.getModel());
		System.out.println("색상 : "+c2.getColor());
		System.out.println("최대속도 : "+c2.getMaxSpeed()+"km");
		System.out.println("가격 : "+String.format("%,d", c2.getPrice())+"원");
		System.out.println();
		System.out.println("제조사명 : "+c3.getCompany());
		System.out.println("모델명 : "+c3.getModel());
		System.out.println("색상 : "+c3.getColor());
		System.out.println("최대속도 : "+c3.getMaxSpeed()+"km");
		System.out.println("가격 : "+String.format("%,d", c3.getPrice())+"원");
		
		Car3 c_1 = new Car3("현대자동차", "제네시스", "검정색", 225, 50000000);
		Car3 c_2 = new Car3("기아자동차", "K7", "흰색", 246);
		Car3 c_3 = new Car3("삼성자동차", "SM7", "회색");
		
		System.out.println();
		System.out.println("<< 자동차 목록 >>");
		System.out.println("제조사명 : "+c_1.getCompany());
		System.out.println("모델명 : "+c_1.getModel());
		System.out.println("색상 : "+c_1.getColor());
		System.out.println("최대속도 : "+c_1.getMaxSpeed()+"km");
		System.out.println("가격 : "+String.format("%,d", c_1.getPrice())+"원");
		System.out.println();
		System.out.println("제조사명 : "+c_2.getCompany());
		System.out.println("모델명 : "+c_2.getModel());
		System.out.println("색상 : "+c_2.getColor());
		System.out.println("최대속도 : "+c_2.getMaxSpeed()+"km");
		System.out.println("가격 : "+String.format("%,d", c_2.getPrice())+"원");
		System.out.println();
		System.out.println("제조사명 : "+c_3.getCompany());
		System.out.println("모델명 : "+c_3.getModel());
		System.out.println("색상 : "+c_3.getColor());
		System.out.println("최대속도 : "+c_3.getMaxSpeed()+"km");
		System.out.println("가격 : "+String.format("%,d", c_3.getPrice())+"원");
	}
}
