package com.sls.repository;

import com.sls.domain.Custom;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * @author sls
 **/
@Repository
public interface CustomRepository extends MongoRepository<Custom, Integer> {

}
