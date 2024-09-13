package dao;

import domain.Produto;
import persistence.JPAUtil;

import java.math.BigDecimal;
import java.util.List;

public class ProdutoDAO {

    private JPAUtil jpaUtil;

    public ProdutoDAO(){
        jpaUtil = new JPAUtil();
    }


    public void save(Produto produto){
        jpaUtil.getEntityManager().getTransaction().begin();
        jpaUtil.getEntityManager().persist(produto);
        jpaUtil.getEntityManager().getTransaction().commit();
        jpaUtil.getEntityManager().flush();
    }

    public Produto produtoById(Long id){
        jpaUtil.getEntityManager().getTransaction().begin();
        jpaUtil.getEntityManager().find(ProdutoDAO.class, id);
        var produto = jpaUtil.getEntityManager()
                .find(Produto.class, id);
                return produto;
    }

    public Produto findById(Long id){
        jpaUtil.getEntityManager().getTransaction().begin();

    }

    public List<Produto> getAllProdutos(){
        jpaUtil.getEntityManager().getTransaction().begin();
        //String jpql = "select p from Produto p";
        String jpql = "select p from Produto p";
        var query = jpaUtil.getEntityManager().createNamedQuery("produto.getAll");
        return query.getResultList();
    }

    public List<Produto> findAllProdutos(){
        jpaUtil.getEntityManager().getTransaction().begin();
        String jpql = "select p from Produto p";
        var query = jpaUtil.getEntityManager().createNamedQuery("produto.getAll");
        return query.getResultList();
    }

}
