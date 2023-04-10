# Resolução Desafio 01
## Model
3 Características (além do nome) do modelo de dados "Animal", atributos:
```java
public class Animal {
    private String nome;
    private String alimentacao;
    private String classe;
    private Integer peso;
    ...
}
```

## Implementação de métodos com StreamAPI
Foram implementados 3 cenários de uso com Stream API:

* Método 1: Seleciona herbíboros que pesam mais que "peso" especificado
* Método 2: Retorna não-reptilianos onívoros; 
* Método 3: Retorna mamíferos carnivoros.

```java
public class AnimalStream {
    public List<Animal> selecionarHerbivoroQuePesaMaisQueX(List<Animal> animais, Integer peso){
        // Seleciona Herbíboros que pesam mais que "peso" especificado
        ...
    }

    public List<Animal> selecionarNaoRepitilianosOnivoros(List<Animal> animals){
        // Retorna Não  reptilianos onívoros
        ...
    }
    public List<Animal> selecionarMamiferosCarnivoros(List<Animal> animals){
        // Retorna mamíferos carnivoros
        ...
    }
}
```

## Testes unitários implementados
Utilizou-se o JUnit para testes unitários dos métodos implementados com StreamAPI,
sendo implementado 3 testes unitários (1 para cada método do objeto Stream criado).

```java
public class AnimalStreamTeste {
    private List<Animal> animais;
    private AnimalStream animalStream = new AnimalStream();

    @BeforeEach
    public void prepararParaTestes(){
        animais = new ArrayList<>();

        animais.add(new Animal("Humano", "Onívoro", "Mamífero", 70));
        ...
    }

    @Test
    public void testeSelecionarHerbivoroQuePesaMaisQueX(){
        ...
    }

    @Test
    public void testeSelecionarNaoRepitilianosOnivoros(){
        ...
    }

    @Test
    public void testeSelecionarMamiferosCarnivoros(){
        ...
    }
}
```