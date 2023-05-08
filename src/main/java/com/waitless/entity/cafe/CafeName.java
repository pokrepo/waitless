package com.waitless.entity.cafe;

import com.waitless.core.ValuedDomainObject;
import jakarta.persistence.Embeddable;

@Embeddable
public class CafeName implements ValuedDomainObject<String> {

    private String name;

    @Override
    public String getValue() {
        return name;
    }
}
