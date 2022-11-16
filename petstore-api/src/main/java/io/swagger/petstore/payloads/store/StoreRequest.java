package io.swagger.petstore.payloads.store;

import lombok.Data;

@Data
public class StoreRequest {
    private int id;
    private int petId;
    private int quantity;
    private String shipDate;
    private String status;
    private boolean complete;

}