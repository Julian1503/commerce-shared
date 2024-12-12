package com.julian.commerceshared.repository;

public interface Mapper<D, E> {
    E toEntity(D domain);
    D toDomainModel(E entity);
}
