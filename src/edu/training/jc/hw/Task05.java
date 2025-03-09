package edu.training.jc.hw;

public class Task05 {
	public static void main(String[] args) {
        // Переменная для хранения результата
        double box = 0;

        // Цикл для вычисления и вывода первых четырёх степеней числа e
        for (int i = 1; i <= 4; i++) {
            box = Math.pow(Math.E, i); // Вычисляем степень числа e
            System.out.println(i + " степень числа e: " + box);
        }
    }
}