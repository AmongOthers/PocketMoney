package org.zww.pocketmoney.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.zww.pocketmoney.Bank;
import org.zww.pocketmoney.Student;
import org.zww.pocketmoney.UniversityStudent;

public class UniversityStudentTest {
	private Bank mBank;
	private Student mStudent;

	@Before
	public void setUp() throws Exception {
		mBank = new Bank();
		mStudent = new UniversityStudent();
	}

	@Test
	public void testGetPocketMoney() {
		assertEquals(500, mStudent.getPocketMoney(mBank));
	}

}
