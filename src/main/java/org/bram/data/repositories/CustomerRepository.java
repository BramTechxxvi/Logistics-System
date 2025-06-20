package org.bram.data.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

public class CustomerRepository extends MongoRepository<Customer, String> {
}
