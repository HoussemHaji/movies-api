package dev.houssem.movies;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewReopsitory extends MongoRepository<Review, ObjectId> {

}
