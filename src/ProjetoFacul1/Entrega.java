package ProjetoFacul1;

public class Entrega {

    private final int TotalMaximoDeEntregas = 5;

    private Pacote[] pacote = new Pacote[TotalMaximoDeEntregas];

    public void inserirPacote(Pacote item){
        for(int i = 0; i < TotalMaximoDeEntregas;i++){
            if (pacote[i] == null) {
                pacote[i] = item;
                System.out.println("Pacote inserido no sistema!!!");
                break;
            }
        }
    }

    public void removerPacote(Pacote item){
        for(int i = 0; i < TotalMaximoDeEntregas;i++){
            if (pacote[i] == item) {
                pacote[i] = null;
                System.out.println("Pacote removido do sistema!!!");
                break;
            }
        }
    }
}
