package service;

import dao.EstoqueDAO;
import dao.ProdutoDAO;
import domain.Estoque;
import domain.Produto;

public class EstoqueService {

    private EstoqueDAO estoqueDAO;

    public void save(Estoque estoque){
        estoqueDAO = new EstoqueDAO();
        estoqueDAO.save(estoque);
    }

    public void save(Estoque estoque, Long ipProduto){
        estoqueDAO = new EstoqueDAO();
        produtoDAO = new ProdutoDAO();
    }

}
