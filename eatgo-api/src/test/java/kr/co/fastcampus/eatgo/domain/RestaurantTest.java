package kr.co.fastcampus.eatgo.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RestaurantTest {
    Restaurant restaurant;

    @BeforeEach
    void setUp() {
        restaurant = new Restaurant("Bob zip", "Seoul");
    }

    @Test
    public void creation() {
        //when
        String name = restaurant.getName();
        String address = restaurant.getAddress();

        // then
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
