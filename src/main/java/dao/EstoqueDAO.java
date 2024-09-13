package dao;

import domain.Estoque;
import persistence.JPAUtil;

public class EstoqueDAO {

    private final JPAUtil jpaUtil;

    public EstoqueDAO(){
        this.jpaUtil = new JPAUtil();
    }

    public void save(Estoque estoque){
        jpaUtil.getEntityManager().getTransaction().begin();
        jpaUtil.getEntityManager().persist(estoque);
        jpaUtil.getEntityManager().getTransaction().commit();
        jpaUtil.getEntityManager().close();
    }

}
