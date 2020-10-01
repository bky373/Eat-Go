package kr.co.fastcampus.eatgo.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RestaurantRepositoryImplTest {

    @Test
    public void save() {
        RestaurantRepository repository = new RestaurantRepositoryImpl();

        int oldCount = repository.findAll().size();

        Restaurant restaurant = new Restaurant("BeRyoung", "Seoul");
        repository.save(restaurant);

        assertThat(restaurant.getId()).isEqualTo(1234L);

        int newCount = repository.findAll().size();

        assertThat(newCount - oldCount).isEqualTo(1);
    }
}
