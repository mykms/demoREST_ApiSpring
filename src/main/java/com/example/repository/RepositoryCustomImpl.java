package com.example.repository;

import com.example.entity.BaseEntity;
import com.querydsl.core.types.dsl.EntityPathBase;
import org.springframework.data.jpa.repository.support.JpaEntityInformation;
import org.springframework.data.jpa.repository.support.QuerydslJpaRepository;
import org.springframework.data.querydsl.EntityPathResolver;
import javax.persistence.EntityManager;

public class RepositoryCustomImpl {//<T extends BaseEntity, P extends EntityPathBase<T>>
        //extends QuerydslJpaRepository<T, Long> {
        //implements RepositoryCustom<T, P, Long> {

    public RepositoryCustomImpl() {
    }
    //private final EntityManager em;

//    public RepositoryCustomImpl(JpaEntityInformation<T, Long> entityInformation, EntityManager entityManager) {
//        super(entityInformation, entityManager);
//        this.em = entityManager;
//    }
//
//    public RepositoryCustomImpl(JpaEntityInformation<T, Long> entityInformation, EntityManager entityManager, EntityPathResolver resolver) {
//        super(entityInformation, entityManager, resolver);
//        this.em = entityManager;
//    }

}
