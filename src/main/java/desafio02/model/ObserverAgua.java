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
