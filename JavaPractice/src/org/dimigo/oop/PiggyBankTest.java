package org.dimigo.oop;

public class PiggyBankTest {
	public static void main(String[] args) {
		FamilyMember fm1 = new FamilyMember("아빠");
		FamilyMember fm2 = new FamilyMember("엄마");
		FamilyMember fm3 = new FamilyMember("나");
		FamilyMember fm4 = new FamilyMember("남동생");
		
		FamilyMember.printMemberCnt();
		
		PiggyBank pb = new PiggyBank();
		
		pb.putMoney(fm1, 10000);
		pb.putMoney(fm2, 5000);
		pb.putMoney(fm3, 2000);
		pb.putMoney(fm4, 1000);
		
		pb.printBalance();
		
		pb.putMoney(fm3, 1000);
		
		pb.printBalance();
	}
}
