package kr.co.fastcampus.eatgo.domain;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ReviewRepository extends CrudRepository<Review, Long> {

    public Review save(Review any);

    public List<Review> findAllByRestaurantId(Long id);
}
