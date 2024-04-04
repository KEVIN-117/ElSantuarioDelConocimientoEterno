package org.example.N_28_POO.GuiStudents.generic;

import org.example.N_28_POO.GuiStudents.interfaces.FilterIterable;
import org.example.N_28_POO.GuiStudents.interfaces.Iterable;

import java.util.ArrayList;
import java.util.function.Predicate;

public class GenericIterator<E> extends ArrayList<E> {
    GenericIterator<E> list;
    public GenericIterator<E> map(Iterable listener){
        this.list = new GenericIterator<>();
        for (E item: this) {
            E data = (E) listener.runner(item);
            list.add(data);
        }
        return this.list;
    }

    public GenericIterator<E> filter(FilterIterable listener){
        this.list = new GenericIterator<>();
        for (E item:this) {
            if (listener.runner(this)){
                return this;
            }
        }
        return this.list;
    }

    public E find(FilterIterable listener){
        Predicate<E> predicate = listener::runner;
        for (E e : this) {
            if (predicate.test(e)){
                return e;
            }
        }
        return null;
    }
}
