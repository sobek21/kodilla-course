package com.kodilla.testing.shape;

import sun.security.provider.SHA;

public class Triangle implements Shape{

    private final double h;
    private final double a;

    public Triangle(double a, double h){
        this.a=a;
        this.h=h;

    }

    public String getShapeName(){

        return "Triangle";
    }

    public double getField() {
return a*h/2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Triangle triangle = (Triangle) o;

        if (Double.compare(triangle.h, h) != 0) return false;
        return Double.compare(triangle.a, a) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(h);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(a);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    public double getA() {
        return a;
    }

    public double getH() {
        return h;
    }
}
