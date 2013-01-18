package org.zww.pocketmoney.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.zww.pocketmoney.Bank;
import org.zww.pocketmoney.HighSchoolStudent;
import org.zww.pocketmoney.Student;

public class HighSchoolStudentTest {
	private Bank mBank;
	private Student mStudent;
	
	@Before
	public void setup() throws Exception {
		mBank = new Bank();
		mStudent = new HighSchoolStudent();
	}

	@Test
	public void testGetPocketMoney() {
		assertEquals(100, mStudent.getPocketMoney(mBank));
	}

}
