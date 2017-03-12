package org.app.repository;

import org.app.model.PartEntity;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;
import java.util.List;

@Repository
@Transactional(readOnly = true)
public class PartRepositoryImpl implements PartRepository{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional
    public PartEntity save(PartEntity part) {
        if(part.getId() != null){
            return entityManager.merge(part);
        }else {
            entityManager.persist(part);
            return part;
        }
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<PartEntity> getAll() {
        CriteriaQuery<PartEntity> criteria = entityManager.getCriteriaBuilder().createQuery(PartEntity.class);
        criteria.select(criteria.from(PartEntity.class));

        return entityManager.createQuery(criteria).getResultList();
    }

    @Override
    public PartEntity getById(long id) {
        return entityManager.find(PartEntity.class, id);
    }

    @Override
    @Transactional
    public void remove(long id) {
        PartEntity part = getById(id);
        if(part != null) {
            entityManager.remove(part);
        }
    }
}
