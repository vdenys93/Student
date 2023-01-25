package model;

/**
 * @Viktoriia Denys - vdenys
 * CIS175 - Spring 2023
 * Jan 24, 2023
 */
public class StudentGroup {
	
	public String createGroup(Student student) {
		String sGroup="";
		if (student.getGpa()>3.00) {
			sGroup="A";
		}
		else {
			sGroup="B";
		}  	
		return sGroup;
		}
	public boolean isDiscountAge(Student student) {
		if (student.getAge()< 45) {
			return false;
		}
		else {
			return true;
		}
	}

}
