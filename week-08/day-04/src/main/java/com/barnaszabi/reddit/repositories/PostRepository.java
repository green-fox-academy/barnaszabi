package com.barnaszabi.reddit.repositories;

import com.barnaszabi.reddit.models.Post;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends CrudRepository<Post, Long> {
  @Query(value = "select * from posts order by points desc limit ?1 , ?2", nativeQuery = true)
  List<Post> findAllOrderByPoints(int from, int to);
}
