package dao;

import domain.Cliente;
import lombok.RequiredArgsConstructor;
import persistence.JPAUtil;

@RequiredArgsConstructor
public class ClienteDAO {

    private final JPAUtil jpaUtil;

    public void save(Cliente cliente){
        jpaUtil.getEntityManager().getTransaction().begin();
        jpaUtil.getEntityManager().persist(cliente);
        jpaUtil.getEntityManager().getTransaction().commit();
        jpaUtil.getEntityManager().close();
    }

    public Cliente findById(Long id){
        jpaUtil.getEntityManager().getTransaction().begin();
        return jpaUtil.getEntityManager().find(Cliente.class, id);
    }

    public void closeEntityManager(){
        jpaUtil.getEntityManager().close();
    }

}
