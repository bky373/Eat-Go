package kr.co.fastcampus.eatgo.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RestaurantTests {
    Restaurant restaurant;

    @BeforeEach
    void setUp() {
        restaurant = Restaurant.builder()
                .id(1004L)
                .name("Bob zip")
                .address("Seoul")
                .build();
    }

    @Test
    public void creation() {
        //when
        Long id = restaurant.getId();
        String name = restaurant.getName();
        String address = restaurant.getAddress();

        // then
        assertThat(id).isEqualTo(1004);
        assertThat(name).isEqualTo("Bob zip");
        assertThat(address).isEqualTo("Seoul");
    }

    @Test
    public void information() {
        // when
        String info = restaurant.getInformation();

        assertThat(info).isEqualTo("Bob zip in Seoul");
    }
}
