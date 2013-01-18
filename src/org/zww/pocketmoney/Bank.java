package org.zww.pocketmoney;
public class Bank {
	public int getPocketMoney(final Student student) {
		if(student instanceof HighSchoolStudent) {
			return getPocketMoneyForHighSchoolStudent();
		} else if(student instanceof UniversityStudent) {
			return getPocketMoneyForUniversityStudent();
		} else {
			return 0;
		}
	}
	
	private int getPocketMoneyForHighSchoolStudent() {
		return 100;
	}
	
	private int getPocketMoneyForUniversityStudent() {
		return 500;
	}
}