package service;


import domain.Cardapio;
import domain.ItemCardapio;
import domain.Cliente;
import lombok.Data;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

@Data
public class PedidoService {

    private Cliente cliente;

    private List<ItemCardapio> itens;

    public BigDecimal subtotal(ItemCardapio i){
        var subTotal = new BigDecimal(BigInteger.ZERO);
        subTotal = subTotal.add(
                i.getProduto().getPreco()
                        .multiply(new BigDecimal(i.getQuantidade())));
        return subTotal;
    }

    public void controlePedido(Cardapio cardapio){

    }

}
