package desafio01;


import desafio01.model.Animal;

// JUnit Modules
import desafio01.service.AnimalStream;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

import java.util.ArrayList;
import java.util.List;

public class AnimalStreamTeste {
    private List<Animal> animais;
    private AnimalStream animalStream = new AnimalStream();

    @BeforeEach
    public void prepararParaTestes(){
        animais = new ArrayList<>();

        animais.add(new Animal("Humano", "Onívoro", "Mamífero", 70));
        animais.add(new Animal("Lobo", "Carnívoro", "Mamífero", 50));
        animais.add(new Animal("Gazela", "Herbívoro", "Mamífero", 60));
        animais.add(new Animal("Jacaré", "Carnívoro", "Réptil",230));
        animais.add(new Animal("Águia", "Carnívoro", "Ave", 12));
        animais.add(new Animal("Tartaruga", "Herbívoro", "Réptil", 135));
        animais.add(new Animal("Tartaruga", "Herbívoro", "Réptil", 134));
        animais.add(new Animal("Jabuti", "Onívoro", "Réptil", 12));

    }

    @Test
    public void testeSelecionarHerbivoroQuePesaMaisQueX(){
        List<Animal> esperado = new ArrayList<>();

        esperado.add(new Animal("Tartaruga", "Herbívoro", "Réptil", 135));

        List<Animal> resultado = animalStream.selecionarHerbivoroQuePesaMaisQueX(animais, 134);

        Assertions.assertEquals(esperado, resultado);

    }

    @Test
    public void testeSelecionarNaoRepitilianosOnivoros(){
        List<Animal> esperado = new ArrayList<>();

        esperado.add(new Animal("Humano", "Onívoro", "Mamífero", 70));

        List<Animal> resultado = animalStream.selecionarNaoRepitilianosOnivoros(animais);

        Assertions.assertEquals(esperado, resultado);

    }

    @Test
    public void testeSelecionarMamiferosCarnivoros(){
        List<Animal> esperado = new ArrayList<>();

        esperado.add(new Animal("Lobo", "Carnívoro", "Mamífero", 50));

        List<Animal> resultado = animalStream.selecionarMamiferosCarnivoros(animais);

        Assertions.assertEquals(esperado, resultado);

    }
}

