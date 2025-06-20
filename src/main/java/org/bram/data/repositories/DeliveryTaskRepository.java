package org.bram.data.repositories;

import org.bram.data.models.DeliveryTask;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DeliveryTaskRepository extends MongoRepository<DeliveryTask, String> {
}
