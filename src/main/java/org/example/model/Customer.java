package org.example.model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Customer {
    private String id ;
    private String name;
    private String address;
    private int tel;
    private String status;

}
