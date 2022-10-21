package DesignPatterns.S3H.ArrayFigure;

import DesignPatterns.S3H.FigureModels.Figure;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayFigure<F extends Figure> implements Iterable<F> {
    private List<F> array;

    public ArrayFigure() {
        this.array = new ArrayList<>();
    }

    public void addNewShape(F figure) {
        this.array.add(figure);
    }

    public Iterator iterator() {
        Iterator<F> iter = new Iterator<>() {

        private int index = 0;

            @Override
            public boolean hasNext() {
                return index < array.size();
            }

            @Override
            public F next() {
                return array.get(index++);
            }
        };
        return iter;
    }
}