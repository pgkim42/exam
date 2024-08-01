package main;

public class Quiz2 {

	public static void main(String[] args) {

		int month = 3;

		switch (month) {
		case 3, 4, 5:
			System.out.println(month + "월은 봄입니다.");
			break;
		case 6, 7, 8:
			System.out.println(month + "월은 여름입니다.");
			break;
		case 9, 10, 11:
			System.out.println(month + "월은 가을입니다.");
			break;
		case 1, 2, 12:
			System.out.println(month + "월은 겨울입니다.");
			break;
		default:
			System.out.println(month + "월은 잘못된 값입니다.");
			break;
		}

	}
}
