package ru.mirea.ikbo2019.Samsonov.pr10.ConcreteFactory;

import ru.mirea.ikbo2019.Samsonov.pr10.Complex.Complex;
import ru.mirea.ikbo2019.Samsonov.pr10.ComplexAbstractFactory.ComplexAbstractFactory;

public class ConcreteFactory implements ComplexAbstractFactory {
    @Override
    public Complex createComplex() {
        return new Complex(0, 0);
    }

    @Override
    public Complex createComplex(int real, int image) {
        return new Complex(real, image);
    }
}