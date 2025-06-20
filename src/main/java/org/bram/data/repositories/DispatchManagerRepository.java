package org.bram.data.repositories;

import org.bram.data.models.DispatchManager;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DispatchManagerRepository extends MongoRepository<DispatchManager, String> {
}
