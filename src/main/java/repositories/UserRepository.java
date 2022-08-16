package repositories;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

import entities.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;



@Repository
@Transactional
public class UserRepository {
    @Autowired
    private EntityManager entityManager;

    public List<UserEntity> getAllUsers() {
        TypedQuery<UserEntity> userQuery = entityManager.createNamedQuery("User.findAll", UserEntity.class);
        return userQuery.getResultList();
    }
    public UserEntity getUserById(Long id) {
        TypedQuery<UserEntity> query=entityManager.createQuery("SELECT user from UserEntity user where user.id=?1", UserEntity.class).setParameter(1, id);
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
