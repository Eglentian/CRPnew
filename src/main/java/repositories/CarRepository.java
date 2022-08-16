package repositories;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

import entities.CarEntity;
import entities.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;



@Repository
@Transactional
public class CarRepository {
    @Autowired
    private EntityManager entityManager;

    public List<CarEntity> getAllCars() {
        TypedQuery<CarEntity> carQuery = entityManager.createNamedQuery("Car.findAll", CarEntity.class);
        return carQuery.getResultList();
    }
    public CarEntity getCarById(Integer id) {
        TypedQuery<CarEntity> query=entityManager.createQuery("SELECT car from CarEntity car where car.id=?1", CarEntity.class).setParameter(1, id);
        try {
            return query.getSingleResult();

        } catch (NoResultException e) {
            return null;
        }
    }

    //to add soft delete
    public void hardDeleteUser(UserEntity user) {
        entityManager.remove(user);
    }

    public void addCar(CarEntity car) {
        entityManager.persist(car);


    }
}
