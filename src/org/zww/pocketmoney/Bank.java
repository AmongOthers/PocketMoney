package org.zww.pocketmoney;
public class Bank {
	public int getPocketMoney(StudentType type) {
		if(type == StudentType.HIGHSCHOOL) {
			return getPocketMoneyForHighSchoolStudent();
		} else if(type == StudentType.UNIVERSITY) {
			return getPocketMoneyForUniversityStudent();
		} else if(type == StudentType.OUTSTANDING_HIGHSCHOOL) {
			return getPocketMoneyForOutstandingHighSchool();
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
	
	private int getPocketMoneyForOutstandingHighSchool() {
		return 200;
	}
}