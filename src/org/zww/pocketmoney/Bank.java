package org.zww.pocketmoney;
public class Bank {
	public int getPocketMoney(Student student) {
		if(student instanceof HighSchoolStudent) {
			return 100;
		} else if(student instanceof UniversityStudent) {
			return 500;
		} else {
			return 0;
		}
	}
}
