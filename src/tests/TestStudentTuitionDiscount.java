package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.Student;
import model.StudentGroup;

/**
 * @Viktoriia Denys - vdenys
 * CIS175 - Fall 2022
 * Sep 8, 2022
 */
public class TestStudentTuitionDiscount {
	StudentGroup stGroup = new StudentGroup();
	Student student = new Student("Valentine");


	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testDiscountEligibleAge() {
		student.setAge(46);
		assertTrue(stGroup.isDiscountAge(student));
		}
	@Test
	public void testDiscountNotEligibleAge() {
		student.setAge(21);
		assertFalse(stGroup.isDiscountAge(student));
		}
	@Test
	public void testDiscountAge45() {
		student.setAge(45);
		assertTrue(stGroup.isDiscountAge(student));
		}

}


