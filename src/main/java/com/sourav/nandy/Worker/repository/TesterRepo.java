package com.sourav.nandy.Worker.repository;

import com.sourav.nandy.Worker.model.Tester;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TesterRepo extends MongoRepository<Tester,String> {
}
