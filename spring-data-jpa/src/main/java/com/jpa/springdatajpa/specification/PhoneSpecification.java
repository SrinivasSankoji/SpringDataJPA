package com.jpa.springdatajpa.specification;

import com.jpa.springdatajpa.entity.Phone;
import jakarta.persistence.criteria.Predicate;
import org.springframework.data.jpa.domain.Specification;


public class PhoneSpecification {
    private Specification<Phone> phoneBrand(String phoneBrand){
        return ((root, query, criteriaBuilder) -> criteriaBuilder.like(root.get("phoneBrand"),"%"+phoneBrand+"%"));
    }
    private Specification<Phone> phoneName(String phoneName){
        return (root, query, criteriaBuilder) -> criteriaBuilder.like(root.get(phoneName),"%"+phoneName+"%");
    }
    private Specification<Phone> phoneNameAndBrand(String phoneBrand, String phoneName) {
        return (root, query, criteriaBuilder) -> {
            Predicate phoneBrandPredicate = criteriaBuilder.like(root.get("phoneBrand"), "%" + phoneBrand + "%");
            Predicate phoneNamePredicate = criteriaBuilder.like(root.get(phoneName), "%" + phoneName + "%");
            return criteriaBuilder.and(phoneBrandPredicate, phoneNamePredicate);
        };
    }
}
