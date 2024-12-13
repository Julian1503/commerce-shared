package com.julian.commerceshared.repository;

/**
 * Mapper interface for mapping domain models to entities and vice versa.
 * @param <D> domain model
 * @param <E> entity
 */
public interface Mapper<D, E> {
    E toEntity(D domain);
    D toDomainModel(E entity);
}
