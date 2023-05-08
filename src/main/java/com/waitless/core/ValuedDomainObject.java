package com.waitless.core;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

public interface ValuedDomainObject<T> extends Serializable {

    T getValue();

    default T nullEquivalentValue() {
        if (String.class.equals(getValue().getClass())) return (T) "";
        if (BigDecimal.class.equals(getValue().getClass())) return (T) BigDecimal.ZERO;
        if (Character.class.equals(getValue().getClass())) return (T) Character.valueOf(' ');
        return null;
    }

    default boolean containsNullEquivalentValue() {
        return isNullEquivalentValue(getValue());
    }

    default boolean isNullEquivalentValue(T value) {
        return Objects.equals(value, nullEquivalentValue());
    }

    static <T> boolean isEmpty(ValuedDomainObject<T> vdo) {
        return vdo == null || vdo.containsNullEquivalentValue();
    }

    static <T> boolean isSet(ValuedDomainObject<T> vdo) {
        return !isEmpty(vdo);
    }
}
