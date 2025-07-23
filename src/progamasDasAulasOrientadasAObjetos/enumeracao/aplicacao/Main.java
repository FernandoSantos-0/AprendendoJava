package progamasDasAulasOrientadasAObjetos.enumeracao.aplicacao;

import progamasDasAulasOrientadasAObjetos.enumeracao.entities.Pedido;
import progamasDasAulasOrientadasAObjetos.enumeracao.entitities.enums.StatusDoPedido;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Pedido order = new Pedido(1009,new Date(), StatusDoPedido.AGUARDANDOPAGAMENTO);

        System.out.println(order);

    }
}
