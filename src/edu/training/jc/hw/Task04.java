package edu.training.jc.hw;

public class Task04 {

	public static void main(String[] args) {
	      double R = 4;  // Радиус
	      double L = 45; // Центральный угол в градусах

	      double S = (Math.PI * Math.pow(R, 2) * L) / 360; // Площадь сектора
	      double l = (2 * Math.PI * R * L) / 360; // Длина дуги

	      System.out.println("Площадь сектора: " + S);
	      System.out.println("Длина дуги: " + l);

	}

}
