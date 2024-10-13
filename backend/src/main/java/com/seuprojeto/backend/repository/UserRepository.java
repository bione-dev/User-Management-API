package com.seuprojeto.backend.repository;

import com.seuprojeto.backend.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
}
