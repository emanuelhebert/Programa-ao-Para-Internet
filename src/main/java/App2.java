import dao.EstoqueDAO;
import dao.ProdutoDAO;
import domain.Estoque;

public class App2 {

    public static void main(String[] args) {
        var produtoDAO = new ProdutoDAO();
        var estoqueDAO = new EstoqueDAO();

        var produtoEstoque = produtoDAO.produtoById(4L);

        var estoque = Estoque.builder()
                .produto(produtoEstoque)
                .quantidade(2)
                .build();

        var estoqueDAO =
    }
}
