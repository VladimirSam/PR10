package ru.mirea.ikbo2019.Samsonov.pr10.ComplexAbstractFactory;

import ru.mirea.ikbo2019.Samsonov.pr10.Complex.Complex;

public interface ComplexAbstractFactory {
    Complex createComplex();
    Complex createComplex(int real, int image);
}