package org.dimigo.basic;

public class Condition {
	static final int BUS = 850;
	static final int CAR = 300;
	static final int ETC = 600;
	
	public static void main(String[] args) {
		printRate(0, 10);
		printRate(1, 10);
		printRate(2, 10);
		printRate(0, 25);
		printRate(1, 25);
		printRate(2, 25);
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
