package Fila;

import java.util.ArrayList;

public class Fila<T> {
    ArrayList<T> _fila = new ArrayList<T>();

    private boolean hasElements() {
        return !_fila.isEmpty();
    }

    public T OlhaPrimeiro(){
        T result = null;
        if(this.hasElements()){
            result = _fila.get(0); }
        return result;
    }

    public boolean add(T element) {
        return _fila.add(element);
    }

    public T pop() {
        T result = null;
        if(this.hasElements()){
            result = _fila.remove(0); }
        return result;
    }

}//classe
