package org.bram.data.repositories;

import org.bram.data.models.DispatchManager;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DispatchManagerRepository extends MongoRepository<DispatchManager, String> {
}
