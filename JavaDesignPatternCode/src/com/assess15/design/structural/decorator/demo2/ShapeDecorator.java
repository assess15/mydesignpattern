package com.assess15.design.structural.decorator.demo2;

/**
 * 装饰器,对Shape进行包装
 */
public abstract class ShapeDecorator implements Shape {

    protected Shape shapeDecorator;

    public ShapeDecorator(Shape shape) {
        this.shapeDecorator = shape;
    }

    @Override
    public void draw() {
        shapeDecorator.draw();
    }
}
