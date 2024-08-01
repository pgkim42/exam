package main;

import java.util.ArrayList;

public class Quiz5 {

	public static void main(String[] args) {
		
		ArrayList<Student> list = new ArrayList<>();
		
		list.add(new Student(1001, "둘리"));
		list.add(new Student(1002, "또치"));
		list.add(new Student(1003, "도우너"));
		
		for(Student e : list) {
			System.out.println(e.toString());
		}

	}
}

class Student {
	int studentID;
	String name;

	public Student(int studentID, String name) {
		super();
		this.studentID = studentID;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [studentID=" + studentID + ", name=" + name + "]";
	}

}