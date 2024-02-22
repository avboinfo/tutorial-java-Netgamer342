package E_esercizi;

import java.util.*;

public class Pila<T>{
    ArrayList<T> lista;
    
    public Pila(){
        lista = new ArrayList<T>();
    }

    public void push(T newElement){
        lista.add(newElement);
    }

    public T pop(){
        int size= lista.size();
        T x = lista.get(size-1);
        lista.remove(size-1);

        if (size==0){return null;}

        else{return x;}
    }

    public int size(){
        return lista.size();
    }

    public String toString(){
        String s = "";
        for(int i=0; i<lista.size(); i++){
            s+= lista.get(i)+"\n";
        }
        return s;
    } 
}