package org.zww.pocketmoney;
public class Bank {
	private int mOutstandingScore = 90;
	
	public void setOutstandingScore(int score) {
		mOutstandingScore = score;
	}
	
	public int getPocketMoney(final Student student) {
		if(student instanceof HighSchoolStudent) {
			HighSchoolStudent hsStudent = (HighSchoolStudent)student;
			if(hsStudent.getScore() < mOutstandingScore) {
				return getPocketMoneyForHighSchoolStudent();
			} else {
				return getPocketMoneyForOutstandingHighSchoolStudent();
			}
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
	
	private int getPocketMoneyForOutstandingHighSchoolStudent() {
		return 200;
	}
}