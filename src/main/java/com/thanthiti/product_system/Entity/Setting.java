package com.thanthiti.product_system.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.UUID;

@Entity
@Table(name = "settings")
public class Setting {
    @Id
    @GeneratedValue
    private UUID settingId;

    private String key;
    private String value;
}
