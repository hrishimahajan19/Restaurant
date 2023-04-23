package Service;


import Controller.Restaurant;
import Repository.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLOutput;
import java.util.Collection;
import java.util.List;

@Service
public class RestaurantService {
    @Autowired
    private RestaurantRepository restaurantRepository;

    public List<Restaurant> getAllList{
        return RestaurantRepository.getList();
    }

    public Restaurant getRestaurantById(int id){
        Restaurant restaurant = null;
        boolean found = this.getAllList().stream().anyMatch(e->e.getId() == id);
        if(found) restaurant  = this.getAllList().stream().filter(e->e.getId() == id).findFirst().get();
        else{
            System.out.println("unable to recognise restaurant..!");
            return null;
            return restaurant;

        }
    }
    public String updateSpecialityBy


    public String addRestaurant(Restaurant restaurant) {
        return restaurantRepository.add(restaurant) ? "Restaurant addes successfully" : "error in adding";
    }

    public String updateSpecialityById(int id, String speciality) {
        List<Restaurant> currList = this.getAllList();
        for(Restaurant rest : currList){
            if(rest.getId()== id){
                restaurantRepository.remove(rest);
                rest.setSpeciality(speciality);
                restaurantRepository.add(rest);
                return "Updated successfully";
            }
        }
        return "No restaurant with this id found";
    }
    public String deleteRestaurantById(int id) {
        Restaurant restaurant = null;
        boolean found = this.getAllList().stream().anyMatch(e->e.getClass() == id);
        if(found){
            restaurant = this.getAllList().stream().filter(e->e.getClass() == id).findFirst().get();
            restaurantRepository.remove(restaurant);
            return "Deleted successfully";
        }
        return "No such restaurant found to delete";
    }

    private Collection<Object> getAllList() {
        return null;
    }

}
