package org.dimigo.inheritance;

public class SmartPhone {
	private String model;
	private String company;
	private int price;
	
	public SmartPhone() {
		// TODO Auto-generated constructor stub
	}
	
	public SmartPhone(String model, String company, int price) {
		this.model = model;
		this.company = company;
		this.price = price;
	}
	
	public void turnOn() {
		System.out.println(model + "의 전원을 켭니다");
	}
	
	public void turnOff() {
		System.out.println(model + "의 전원을 끕니다");
	}
	
	public void pay() {
		System.out.println(company + " 페이로 결제합니다.");
	}
	
	public void useSpecialFunction() {
		// if(this == null) return;
		
		if(this instanceof IPhone) {
			((IPhone) this).useAirDrop();
		} else if(this instanceof Galaxy) {
			((Galaxy) this).useWirelessCharging();
		}
	}
	
	@Override
	public String toString() {
		return "모델명 : "+model+", 제조사 : "+company+", 가격 : "+String.format("%,d", price);
	}
}
