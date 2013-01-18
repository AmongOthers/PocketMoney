package org.zww.pocketmoney.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.zww.pocketmoney.Bank;
import org.zww.pocketmoney.HighSchoolStudent;
import org.zww.pocketmoney.Student;

public class HighSchoolStudentTest {
	private Bank mBank;
	
	@Before
	public void setup() throws Exception {
		mBank = new Bank();
	}

	@Test
	public void testGetPocketMoney() {
		Student student = new HighSchoolStudent(60);
		assertEquals(100, student.getPocketMoney(mBank));
	}
	
	@Test
	public void testGetPocketMoneyForOutstandingHighSchoolStudent() {
		Student student = new HighSchoolStudent(100);
		assertEquals(200, student.getPocketMoney(mBank));
	}

}
