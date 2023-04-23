package Repository;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
@Repository
public class RestaurantRepository {
    List<Reastaurant> list = new ArrayList<>();

    public static void getList() {
    }

    public  boolean add(Restaurant restaurant){
        list.add(restaurant);
        return true;
    }

    public boolean remove(Restaurant rest){
        list.remove(rest);
        return true;
    }

}
