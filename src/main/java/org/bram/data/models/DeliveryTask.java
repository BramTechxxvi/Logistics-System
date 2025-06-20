package org.bram.data.models;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class DeliveryTask {

    @Id
    private String id;
}
