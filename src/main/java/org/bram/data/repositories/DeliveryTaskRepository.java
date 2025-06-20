package org.bram.data.repositories;

import org.bram.data.models.DeliveryTask;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeliveryTaskRepository extends MongoRepository<DeliveryTask, String> {
}
