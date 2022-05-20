package ru.netology;

public class BmiService {
    public float calculate(float weight, float height) {
        float imt = weight / (height * height);
        return imt;
    }
}
