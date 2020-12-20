package com.hr.system.repository;

import com.hr.system.po.CommentPo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends MongoRepository<CommentPo,String> {
}
