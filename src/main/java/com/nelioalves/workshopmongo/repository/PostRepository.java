package com.nelioalves.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.nelioalves.workshopmongo.damain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String>{

}
