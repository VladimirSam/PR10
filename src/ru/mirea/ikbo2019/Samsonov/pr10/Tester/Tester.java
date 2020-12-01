package ru.mirea.ikbo2019.Samsonov.pr10.Tester;

import ru.mirea.ikbo2019.Samsonov.pr10.Complex.Complex;
import ru.mirea.ikbo2019.Samsonov.pr10.ComplexAbstractFactory.ComplexAbstractFactory;
import ru.mirea.ikbo2019.Samsonov.pr10.ConcreteFactory.ConcreteFactory;

public class Tester {
    public static void main(String[] args) {
        Complex a = new Complex(42, 10);
        System.out.println(a);

        ComplexAbstractFactory b = new ConcreteFactory();
        Complex c = b.createComplex(555, 461);
        System.out.println(c);

        ConcreteFactory d = new ConcreteFactory();
        Complex f = d.createComplex(0, 1);
        System.out.println(f);
    }
}