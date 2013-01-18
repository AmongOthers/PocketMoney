package org.zww.pocketmoney;

public class UniversityStudent extends Student {

	@Override
	public int getPocketMoney(Bank bank) {
		return bank.getPocketMoneyForUniversityStudent();
	}

}
