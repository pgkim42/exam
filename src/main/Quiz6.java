package main;

public class Quiz6 {

	public static void main(String[] args) {

		Pen ballPen = new BallPen(2, 1, "파랑색");
		Pen fountainPen = new FountainPen(3, 0.8, "몽블랑");

		System.out.println(ballPen.toString());
		System.out.println(fountainPen.toString());
	}
}

class Pen {
	int weight;
	double volume;

	public Pen(int weight, double volume) {
		super();
		this.weight = weight;
		this.volume = volume;
	}

	@Override
	public String toString() {
		return "Pen [펜의 굵기=" + weight + ", 남은 양=" + (volume * 100) + "%]";
	}

}

class BallPen extends Pen {
	String Color;

	public BallPen(int weight, double volume, String color) {
		super(weight, volume);
		Color = color;
	}

	@Override
	public String toString() {
		return "BallPen [볼펜의 색=" + Color + ", 펜의 굵기=" + weight + ", 남은 양=" + (volume * 100) + "%]";
	}

}

class FountainPen extends Pen {
	String brand;

	public FountainPen(int weight, double volume, String brand) {
		super(weight, volume);
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "FountainPen [브랜드=" + brand + ", 펜의 굵기=" + weight + ", 남은 양=" + (volume * 100)+ "%]";
	}

}