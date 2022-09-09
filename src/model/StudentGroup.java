package model;

/**
 * @Viktoriia Denys - vdenys
 * CIS175 - Fall 2022
 * Sep 8, 2022
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
