package desafio02;

import desafio02.model.ObserverAgua;
import desafio02.model.ObserverCeu;
import desafio02.model.ObserverTerra;
import desafio02.service.Observable;

public class Main {
    public static void main(String[] args) {
        double numeroRound1 = Math.random();
        double numeroRound2 = Math.random();

        Observable observable = new Observable();

        ObserverCeu observerCeu = new ObserverCeu();
        ObserverAgua observerAgua = new ObserverAgua();
        ObserverTerra observerTerra = new ObserverTerra();

        observable.registerObserver(observerCeu);
        observable.registerObserver(observerAgua);
        observable.registerObserver(observerTerra);

        // Round 1
        System.out.println("Round1:");

        if (numeroRound1 < 0.3) {
            observable.notifyObservers("eclipse lunar iniciou");
        } else if (numeroRound1 < 0.6) {
            observable.notifyObservers("alga rara");
        } else {
            observable.notifyObservers("wally");
        }

        // Round 2
        System.out.println("Round 2:");

        if (numeroRound2 < 0.3) {
            observable.notifyObservers("eclipse lunar terminou");
        } else if (numeroRound2 < 0.6) {
            observable.notifyObservers("alga rara");
        } else {
            observable.notifyObservers("wally");
        }
    }

}
