package com.kodilla.testing.shape;

public class Circle implements Shape {

    private final double r;

    public Circle (double r){
        this.r=r;
    }

   public String getShapeName(){

       return "Circle";

   }

    public double getField() {
       return Math.PI* Math.pow(r,r);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Circle circle = (Circle) o;

        return Double.compare(circle.r, r) == 0;
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(r);
        return (int) (temp ^ (temp >>> 32));
    }

    public double getR() {
        return r;
    }
}
