package desafio01;

import desafio01.model.Animal;
import desafio01.service.AnimalStream;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> animais = new ArrayList<>();
        AnimalStream animalStream = new AnimalStream();

        animais.add(new Animal("Humano", "Onívoro", "Mamífero", 70));
        animais.add(new Animal("Lobo", "Carnívoro", "Mamífero", 50));
        animais.add(new Animal("Gazela", "Herbívoro", "Mamífero", 60));
        animais.add(new Animal("Jacaré", "Carnívoro", "Réptil",230));
        animais.add(new Animal("Águia", "Carnívoro", "Ave", 12));
        animais.add(new Animal("Tartaruga", "Herbívoro", "Réptil", 135));
        animais.add(new Animal("Tartaruga", "Herbívoro", "Réptil", 134));
        animais.add(new Animal("Jabuti", "Onívoro", "Réptil", 12));

        Integer peso = 10;

        System.out.printf("Herbívoros que pesam mais que %d kilos: %s", peso, animalStream.selecionarHerbivoroQuePesaMaisQueX(animais, 10));

    }
}
