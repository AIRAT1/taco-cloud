package de.tacocloud.data;

import lombok.Data;

import java.util.Date;

@Data
public class Taco {
    private Long id;
    private Date createdAt;
}
