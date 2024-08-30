package org.example.debeziumapp3.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@RequiredArgsConstructor
public class ChangeNativeRepository {

    @PersistenceContext
    private final EntityManager entityManager;

    @Transactional
    public void executeNativeSql(String sql) {
        entityManager.createNativeQuery(sql).executeUpdate();
    }

    @Transactional
    public int getAmountStudentByNative(String sql) {
        return entityManager.createNativeQuery(sql).getResultList().size();
    }
}
