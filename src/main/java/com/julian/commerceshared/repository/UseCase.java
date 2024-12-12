package com.julian.commerceshared.repository;

public interface UseCase<T, U> {
    U execute(T command);
}
