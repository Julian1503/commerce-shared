package com.julian.commerceshared.valueobject;

import java.util.Objects;

public abstract class AbstractValueObject<T,R> implements ValueObject<T> {
    protected AbstractValueObject(R value) {
        this.value = value;
    }

    private final R value;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbstractValueObject<?, ?> that = (AbstractValueObject<?, ?>) o;
        return Objects.equals(getValue(), that.getValue());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getValue());
    }

    @Override
    public boolean sameValueAs(T other) {
        return other != null && getValue().equals(other);
    }

    public R getValue() {
        return value;
    }
}
