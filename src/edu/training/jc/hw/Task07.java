package edu.training.jc.hw;

public class Task07 {

	public static void main(String[] args) {
        double a = 4;
        double b = 9;

        double squareA = a * a;
        double squareB = b * b;
        double arithmeticMean = (squareA + squareB) / 2;

        double absA = Math.abs(a);
        double absB = Math.abs(b);

        double geometricMean = Math.sqrt(absA * absB);

        System.out.println("Среднее арифметическое квадратов: " + arithmeticMean);
        System.out.println("Среднее геометрическое модулей: " + geometricMean);
    }

}
