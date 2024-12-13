package com.julian.commerceshared.repository;
/**
 * Factory interface for creating factories.
 * @param <I> input
 * @param <O> output
 */
public interface Factory<I, O> {
    O create(I input);
}
