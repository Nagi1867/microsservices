package com.example.microsservices.math;

public class SimpleMath {
    public Double sum(Double numberOne, Double numberTwo) {
        return numberOne + numberTwo;
    }

    public Double minus(Double numberOne, Double numberTwo) {
        return numberOne - numberTwo;
    }

    public Double multiplication(Double numberOne, Double numberTwo) {
        return numberOne * numberTwo;
    }

    public Double division(Double numberOne, Double numberTwo) {
        return numberOne / numberTwo;
    }

    public Double media(Double numberOne, Double numberTwo) {
        return (numberOne + numberTwo) / 2;
    }

    public Double raiz(Double numberOne) {
        return Math.sqrt(numberOne);
    }
}
