package com.it.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.it.entity.UserRecord;

@Repository
public interface UserRepository extends CrudRepository<UserRecord,String>{

}
