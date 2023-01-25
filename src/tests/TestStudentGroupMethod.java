package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.Student;
import model.StudentGroup;

/**
 * @Viktoriia Denys - vdenys
 * CIS175 - Spring 2023
 * Jan 24, 2023
 */
public class TestStudentGroupMethod {
	StudentGroup stGroup = new StudentGroup();
	Student student = new Student("Viktoria");
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testCreateGroupGpaBelow3() {
		student.setGpa(2.45);
		String group = stGroup.createGroup(student);
		assertEquals("B", group);
		}
	@Test
	public void testCreateGroupGpaAbove3() {
		student.setGpa(4.00);
		String group = stGroup.createGroup(student);
		assertEquals("A", group);
		}
	@Test
	public void testCreateGroupGpaEqual3() {
		student.setGpa(3.00);
		String group = stGroup.createGroup(student);
		assertEquals("B", group);
		}

}
