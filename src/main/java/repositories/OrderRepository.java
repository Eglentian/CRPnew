package repositories;

import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

import entities.OrderEntity;
import entities.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.data.repository.CrudRepository;



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
        TypedQuery<OrderEntity> query = entityManager.createQuery("SELECT order from OrderEntity order where order.id=?1", OrderEntity.class).setParameter(1, id);
        try {
            return query.getSingleResult();

        } catch (NoResultException e) {
            return null;
        }
    }
        public void deleteOrderById (Integer id) {

            entityManager.remove(id);
        }

    public void save(OrderEntity order) {

        entityManager.persist(order);


    }

}