package com.example.calculator;

import com.example.calculator.add.Add;
import com.example.calculator.sub.Sub;
import com.example.calculator.mul.Mul;
import com.example.calculator.div.Div;

public class Calculator {
    public static void main(String[] args) {
        Add add = new Add();
        Sub subtract = new Sub();
        Mul multiply = new Mul();
        Div divide = new Div();

        int a = 10;
        int b = 5;

        System.out.println("Addition: " + add.add(a, b));
        System.out.println("Subtraction: " + subtract.sub(a, b));
        System.out.println("Multiplication: " + multiply.mul(a, b));
        System.out.println("Division: " + divide.div(a, b));
    }
}
