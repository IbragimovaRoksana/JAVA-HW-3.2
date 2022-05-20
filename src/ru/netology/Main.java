package ru.netology;

public class Main {

    public static void main(String[] args) {
        BmiService service = new BmiService();
        float height = 1.63F; //рост в метрах
        float weight = 66.5F; //вес в кг
        float bmi = service.calculate(weight, height);
        System.out.println(bmi);
    }
}
