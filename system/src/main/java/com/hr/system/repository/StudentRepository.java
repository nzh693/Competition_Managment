package com.hr.system.repository;

import com.hr.system.po.StudentPo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends MongoRepository<StudentPo,String> {
}
