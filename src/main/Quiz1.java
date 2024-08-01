package main;

public class Quiz1 {

	public static void main(String[] args) {

		int math = 90;
		int eng = 70;
		int kor = 100;
		
		int total = math + eng + kor;
		double avg = total / 3.0d;
		
		System.out.println("총점: " + total);
		System.out.println("평균: " + avg);
		

	}
}
