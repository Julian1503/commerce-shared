package com.julian.commerceshared.repository;

/**
 * UseCase interface for executing commands.
 * @param <T> command
 * @param <U> result
 */
public interface UseCase<T, U> {
    U execute(T command);
}
