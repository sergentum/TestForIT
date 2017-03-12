package org.app.repository;

import org.app.model.CarPartEntity;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;
import java.util.List;

@Repository
@Transactional(readOnly = true)
public class CarPartRepositoryImpl implements CarPartRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional
    public CarPartEntity save(CarPartEntity item) {
        if(item.getId() != null){
            return entityManager.merge(item);
        }else {
            entityManager.persist(item);
            return item;
        }
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<CarPartEntity> getAll() {
        CriteriaQuery<CarPartEntity> criteria = entityManager.getCriteriaBuilder().createQuery(CarPartEntity.class);
        criteria.select(criteria.from(CarPartEntity.class));
//        criteria.where( builder.equal( root.get( Person_.name ), "John Doe" ) );

        return entityManager.createQuery(criteria).getResultList();
    }

    @Override
    public CarPartEntity getById(long id) {
        return entityManager.find(CarPartEntity.class, id);
    }

    @Override
    @Transactional
    public void remove(long id) {
        CarPartEntity item = getById(id);
        if(item != null) {
            entityManager.remove(item);
        }
    }
}
