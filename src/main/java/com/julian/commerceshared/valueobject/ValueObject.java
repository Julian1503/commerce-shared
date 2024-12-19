package com.julian.commerceshared.valueobject;

public interface ValueObject<T> {
    boolean sameValueAs(T other);
}
