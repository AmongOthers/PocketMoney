package org.zww.pocketmoney;

public class HighSchoolStudent extends Student {
	private int mScore;

	public HighSchoolStudent(int score) {
		mScore = score;
	}
	
	@Override
	public int getPocketMoney(Bank bank) {
		if(mScore < 90) {
			return bank.getPocketMoney(this);
		} else {
			return bank.getPocketMoney(this);
		}
	}
}
