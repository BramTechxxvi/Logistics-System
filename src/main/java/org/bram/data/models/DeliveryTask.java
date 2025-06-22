package org.bram.data.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection="DeliveryTasks")
public class DeliveryTask {

    @Id
    private String id;
}
