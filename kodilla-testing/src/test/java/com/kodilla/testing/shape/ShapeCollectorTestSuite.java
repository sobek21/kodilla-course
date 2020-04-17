package com.kodilla.testing.shape;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;


public class ShapeCollectorTestSuite {

    @Test
    public void testAddFigure(){


        ShapeCollector shapeCollector = new ShapeCollector();

        Shape shape = new Triangle(4,5);

        shapeCollector.addFigure(shape);





        assertEquals(1, shapeCollector.getShapeCollection().size());
    }

    @Test
    public void testRemoveFigure(){


        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shape = new Triangle(4,5);
        shapeCollector.addFigure(shape);

        boolean result = shapeCollector.removeFigure(shape);

        assertTrue(result);
        assertEquals(0, shapeCollector.getShapeCollection().size());
    }


    @Test
    public void testShowFigures(){


        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shape = new Square(4);
        shapeCollector.addFigure(shape);
        ArrayList<Shape> shapeList= new ArrayList<>();
        shapeList.add(shape);

        List<Shape> shapeResultList = shapeCollector.getShapeCollection();

        assertEquals(shapeList.toString(), shapeResultList.toString());
    }
    @Test
    public void testGetFigureNumber(){


        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shape = new Square(4);
        shapeCollector.addFigure(shape);

        Shape shapeResult = shapeCollector.getFigure(0);

        assertEquals(shape, shapeResult);
    }
}
