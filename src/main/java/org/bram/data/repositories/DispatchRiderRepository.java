package org.bram.data.repositories;

import org.bram.data.models.DispatchRider;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DispatchRiderRepository extends MongoRepository<DispatchRider, String> {
}
