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
