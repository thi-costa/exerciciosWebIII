package desafio01.service;

import desafio01.model.Animal;

import java.util.List;
import java.util.stream.Collectors;

public class AnimalStream {
    public List<Animal> selecionarHerbivoroQuePesaMaisQueX(List<Animal> animais, Integer peso){
        // Seleciona Herbíboros que pesam mais que "peso" especificado
        return animais.stream()
                .filter(a -> a.getAlimentacao().equals("Herbívoro")
                    && a.getPeso() > peso
                ).collect(Collectors.toList());
    }

    public List<Animal> selecionarNaoRepitilianosOnivoros(List<Animal> animals){
        // Retorna Não  reptilianos onívoros
        return animals.stream()
                .filter(a -> !a.getClasse().equals("Réptil") && a.getAlimentacao().equals("Onívoro"))
                .collect(Collectors.toList());
    }
    public List<Animal> selecionarMamiferosCarnivoros(List<Animal> animals){
        // Retorna mamíferos carnivoros
        return animals.stream()
                .filter(a -> a.getClasse().equals("Mamífero") && a.getAlimentacao().equals("Carnívoro"))
                .collect(Collectors.toList());
    }
}
