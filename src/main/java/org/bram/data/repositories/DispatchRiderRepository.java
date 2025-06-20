package org.bram.data.repositories;

import org.bram.data.models.DispatchRider;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DispatchRiderRepository extends MongoRepository<DispatchRider, String> {
}
