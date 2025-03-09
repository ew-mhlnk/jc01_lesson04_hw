package edu.training.jc.hw;

public class Task08 {

	public static void main(String[] args) {
		double a = 4;
		double h = 8;
		double P = 6*a;
		double S = (3 * Math.sqrt(3) / 2) * Math.pow(a, 2);
		double V = S * h;
		
		System.out.println("Периметр: " + P);
		System.out.println("Площадь: " + S);
		System.out.println("Объем: " + V);
	}

}
