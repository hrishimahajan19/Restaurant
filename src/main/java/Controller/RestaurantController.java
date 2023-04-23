package Controller;

import Service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/restaurant")
public class RestaurantController<speciality> {
    @Autowired
    private RestaurantService restaurantService;

    @GetMapping
    public <Restaurant> getAllRestaurant(){
        return restaurantService.getAllList();
    }
    List
    @GetMapping("/{id}")
    public Restaurant getRestaurantById(@PathVariable int id){
        Restaurant restaurant = restaurantService.getRestaurantById(id);
        return restaurant;
    }

    @PostMapping("/{id}/{speciality}")
    public String addRestaurant(@RequestBody Restaurant restaurant){
        return restaurantService.addRestaurant(restaurant);
    }
    @DeleteMapping("/{id}/{speciality}")
    public <speciality> String updateSpeciality(@PathVariable int id .@PathVariable String speciality){
        String speciality;
        return restaurantService.updateSpecialityById(id ,speciality);

    }
    @DeleteMapping("/{id}")
    public String deleteRestaurantById(@PathVariable int id){
        return restaurantService.deleteRestaurantById(id);
    }









}
