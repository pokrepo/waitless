package com.waitless.entity.cafe;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Cafe {

    @Id
    private CafeId id;
}
