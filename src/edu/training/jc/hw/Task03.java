package edu.training.jc.hw;

public class Task03 {

	public static void main(String[] args) {

		double x1 = 0, y1 = 0;
        double x2 = 3, y2 = 0;
        double x3 = 0, y3 = 4;

        double side1 = Math.abs(x2 - x1) + Math.abs(y2 - y1);
        double side2 = Math.abs(x3 - x1) + Math.abs(y3 - y1);
        double hypotenuse = Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));

        System.out.println("Катет 1: " + side1);
        System.out.println("Катет 2: " + side2);
        System.out.println("Гипотенуза: " + hypotenuse);

	}

}
