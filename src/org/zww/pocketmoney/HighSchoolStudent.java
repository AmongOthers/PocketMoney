package org.zww.pocketmoney;

public class HighSchoolStudent extends Student {
	private int mScore;

	public HighSchoolStudent(int score) {
		mScore = score;
	}
	
	@Override
	public int getPocketMoney(Bank bank) {
		if(mScore < 90) {
			return bank.getPocketMoney(StudentType.HIGHSCHOOL);
		} else {
			return bank.getPocketMoney(StudentType.OUTSTANDING_HIGHSCHOOL);
		}
	}
}
