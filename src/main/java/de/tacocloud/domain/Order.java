package de.tacocloud.domain;

import lombok.Data;

import java.util.Date;

@Data
public class Order {
    private Long id;
    private Date placedAt;
}
