package com.orderbrains.repository;

import com.orderbrains.entity.BaseEntity;
import com.querydsl.core.types.dsl.EntityPathBase;
import org.springframework.data.jpa.repository.support.JpaEntityInformation;
import org.springframework.data.jpa.repository.support.QuerydslJpaRepository;
import org.springframework.data.querydsl.EntityPathResolver;
import javax.persistence.EntityManager;

public class RepositoryCustomImpl <T extends BaseEntity, P extends EntityPathBase<T>>
        extends QuerydslJpaRepository<T, Long> implements RepositoryCustom<T, P, Long> {

    //private final EntityManager em;

    public RepositoryCustomImpl(JpaEntityInformation<T, Long> entityInformation, EntityManager entityManager) {
        super(entityInformation, entityManager);
    }

    public RepositoryCustomImpl(JpaEntityInformation<T, Long> entityInformation, EntityManager entityManager, EntityPathResolver resolver) {
        super(entityInformation, entityManager, resolver);
    }
}