package desafio02.service;

import desafio02.model.Observer;

import java.util.ArrayList;
import java.util.List;

public class Observable {
    private List<Observer> observers = new ArrayList<Observer>();

    public void registerObserver(Observer observer){
        observers.add(observer);
    }
    public void removeObserver(Observer observer){
        observers.remove(observer);
    }
    public void notifyObservers(String mensagem){
        observers.stream()
                .forEach(observer -> observer.atualizar(mensagem));

    }
}
