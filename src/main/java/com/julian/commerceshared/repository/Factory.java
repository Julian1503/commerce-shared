package com.julian.commerceshared.repository;

public interface Factory<I, O> {
    O create(I input);
}
