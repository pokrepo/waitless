package com.waitless.entity.cafe;

import com.google.common.base.Preconditions;
import com.waitless.core.ValuedDomainObject;
import jakarta.persistence.Embeddable;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Id;
@Embeddable
public class CafeId implements ValuedDomainObject<Long> {
    private Long id;

    protected CafeId() {
        // JPA constructor
    }
    public CafeId (Long id) {
        this.id = Preconditions.checkNotNull(id);
    }

    public Long getValue() {
        return id;
    }

    public void setValue(Long id) {
        this.id = Preconditions.checkNotNull(id);
    }
}
