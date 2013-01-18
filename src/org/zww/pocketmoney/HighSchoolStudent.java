package org.zww.pocketmoney;

public class HighSchoolStudent extends Student {

	@Override
	public int getPocketMoney(Bank bank) {
		return bank.getPocketMoney(this);
	}
}
