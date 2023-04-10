# Resolução Desafio 02
## Observer
Foram implementados 3 diferentes tipos de observadores, que notificam diferentes contextos sob
os olhos de observadores no céu, na água e em terra.

Utilizou uma função randômica para definir qual mensagem será notificada, e
a depender da mensagem cada observer vai entender se a mensagem está no seu
contexto (utilizou-se estruturas condicionais simples para simular isso).

## Observers implementados

### ObserverAgua

```java
package desafio02.model;

public class ObserverAgua implements Observer{
    public void atualizar(String mensagem){
        String saida = "OBS-AGUA: ";
        if (mensagem.equals("alga rara")) {
            saida = saida + "Encontramos uma alga rara!";
        } else {
            saida = saida + "Nada a revelar.";
        }
        System.out.println(saida);
    }
}
```

### ObserverCeu

```java
package desafio02.model;

public class ObserverCeu implements Observer{
    public void atualizar(String mensagem){
        String saida = "OBS-CEU: ";
        if (mensagem.equals("eclipse lunar iniciou")) {
            saida = saida + "A eclipse lunar iniciou!";
        } else if (mensagem.equals("eclipse lunar terminou")) {
            saida = saida + "A eclipse lunar terminou.";
        } else {
            saida = saida + "Nada a revelar.";
        }
        System.out.println(saida);
    }
}
```

### ObserverTerra

```java
package desafio02.model;

public class ObserverTerra implements Observer {
    public void atualizar(String mensagem){
        String saida = "OBS-TERRA: ";
        if (mensagem.equals("wally")) {
            saida = saida + "Encontramos o Wally!";
        } else {
            saida = saida + "Nada a revelar.";
        }
        System.out.println(saida);
    }
}
```