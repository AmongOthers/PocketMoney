package org.zww.pocketmoney;

public class HighSchoolStudent extends Student {
	private int mScore;

	public HighSchoolStudent(int score) {
		mScore = score;
	}
	
	public int getScore() {
		return mScore;
	}
	
	@Override
	public int getPocketMoney(Bank bank) {
		return bank.getPocketMoney(this);
	}
}
