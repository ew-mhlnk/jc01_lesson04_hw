package edu.training.jc.hw;

public class Task06 {
	
    public static void main(String[] args) {
        int number = 4567;
        int sum = 0;

        for (int temp = number; temp > 0; temp = temp / 10) {
            int digit = temp % 10; // Извлекаем последнюю цифру
            sum = sum + digit;    // Добавляем цифру к сумме
        }

        System.out.println("Сумма цифр числа " + number + " равна: " + sum);
    }
}