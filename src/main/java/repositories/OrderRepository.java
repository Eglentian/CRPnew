package repositories;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

import entities.OrderEntity;
import entities.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;



@Repository
@Transactional
public class OrderRepository {
    @Autowired
    private EntityManager entityManager;

    public List<OrderEntity> getAllOrders() {
        TypedQuery<OrderEntity> orderQuery = entityManager.createNamedQuery("Order.findAll", OrderEntity.class);
        return orderQuery.getResultList();
    }
    public OrderEntity getOrderById(Integer id) {
        TypedQuery<OrderEntity> query=entityManager.createQuery("SELECT order from OrderEntity order where order.id=?1", OrderEntity.class).setParameter(1, id);
        try {
            return query.getSingleResult();

        } catch (NoResultException e) {
            return null;
        }
    }

    public void hardDeleteUser(UserEntity user) {
        entityManager.remove(user);
    }

    public void addUser(UserEntity user) {
        entityManager.persist(user);
    }
}
