package kr.co.fastcampus.eatgo.application;

import kr.co.fastcampus.eatgo.domain.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class RestaurantServiceTest {
    private RestaurantService restaurantService;
    private RestaurantRepository restaurantRepository;
    private MenuItemRepository menuItemRepository;

    @BeforeEach
    public void set() {
        restaurantRepository = new RestaurantRepositoryImpl();
        menuItemRepository = new MenuItemRepositoryImpl();
        restaurantService = new RestaurantService(restaurantRepository, menuItemRepository);
    }

    @Test
    public void getRestaurants() {
        // when
        List<Restaurant> restaurants = restaurantService.getRestaurants();
        Restaurant restaurant = restaurants.get(0);

        // then
        assertThat(restaurant.getId()).isEqualTo(1004L);
    }

    @Test
    public void getRestaurant() {
        // when
        Restaurant restaurant = restaurantService.getRestaurant(1004L);
        Long id = restaurant.getId();
        MenuItem menuItem = restaurant.getMenuItems().get(0);

        // then
        assertThat(id).isEqualTo(1004L);
        assertThat(menuItem.getName()).isEqualTo("Kimchi");
    }
}
