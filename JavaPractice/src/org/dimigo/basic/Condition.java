package org.dimigo.basic;

public class Condition {
	static final int BUS = 850;
	static final int CAR = 300;
	static final int ETC = 600;
	
	/* Const
	 * - int BUS : 버스 기본요금
	 * - int CAR : 경차 기본요금
	 * - int ETC : 그 외 기본요금
	 */

	/* Variables.
	 * - int type : 차종
	 * - int dis : 거리
	 */
	
	/* Functions.
	 * - printRate(int type, int dis) : 차종과 거리에 따른 요금 출력
	 */
	
	public static void main(String[] args) {
		printRate(0, 10);
	}
	
	static void printRate(int type, int dis) {
		String type_name;
		
		if(type == 0) {
			type_name = "고속버스";
		} else if(type == 1) {
			type_name = "경차";
		} else {
			type_name = "그 외";
		}
		
		System.out.println("<< 고속도로 요금 계산 >>");
		System.out.println("거리 : "+dis+"km");
		System.out.println("차종 : "+type_name);
		System.out.println("통행료 : "+getRate(type, dis)+"원");
		System.out.println();
	}
	
	static int getRate(int type, int dis) {		
		/*
		 * int fee : 최종 요금
		 * int addfee : 할증 요금
		 * int mul : 할증 배수
		 */
		
		int fee = 0;

		if(type == 0) {
			fee = BUS;
		} else if(type == 1) {
			fee = CAR;
		} else {
			fee = ETC;
		}
		
		if(dis <= 10) return fee;
		else {
			int addfee = 200;
			if(type == 0) {
				addfee = 300;
			}
			int mul = (dis-1) / 10;
			fee += (mul * addfee);
		}
		
		return fee;
	}
}
