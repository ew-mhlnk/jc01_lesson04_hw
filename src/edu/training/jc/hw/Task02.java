package edu.training.jc.hw;

public class Task02 {

	public static void main(String[] args) {
		double x1 = 1;
        double y1 = 2;
        double x2 = 3;
        double y2 = 5;

        double deltaX = x2 - x1; // Разница по оси X
        double deltaY = y2 - y1; // Разница по оси Y

        double distance = Math.sqrt(deltaX * deltaX + deltaY * deltaY);

        System.out.println("Расстояние между центрами окружностей: " + distance);

	}

}
