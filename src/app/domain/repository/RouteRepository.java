package app.domain.repository;
import app.domain.model.FavoriteRoute;
import app.presentation.UserUI.ErrorUI;
public class RouteRepository {


  public static FavoriteRoute createFavoriteRoute(String typeOfLand, double distance, int difficulty){



        try{
            // Create a new user object
            FavoriteRoute newFavoriteRoute= new FavoriteRoute(typeOfLand,distance,difficulty);
            return newFavoriteRoute;
        }catch(Exception e){

            System.out.println(ErrorUI.ERROR_CREATING_ROUTE);
            return null;

        }
    }
  
}
