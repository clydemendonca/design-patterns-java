package com.experimental.designpatterns.structural.bridge.shape.right;

public abstract class Shape {

    protected Color color;

    public Shape(Color color) {
        this.color = color;
    }

    public abstract void applyColor();

}