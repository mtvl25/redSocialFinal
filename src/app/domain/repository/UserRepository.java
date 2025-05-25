package app.domain.repository;
import app.domain.model.FavoriteRoute;
import app.domain.model.User;
import app.presentation.UserUI.ErrorUI;
import app.presentation.UserUI.FriendUI;
import app.presentation.UserUI.UserInputUI;
import app.utils.Search;
import java.util.ArrayList;


/*
    private String name;
    private int age;
    private String typeOfCycling;
    private String location;
 */
public final class  UserRepository{



    //Se encarga de CREAR un nuevo usuario
    public static User createUser(String name,int age, int typeOfCycling, String location){



        try{
            // Create a new user object
            User newUser= new User(name,age,typeOfCycling,location);
            return newUser;
        }catch(Exception e){

            System.out.println(ErrorUI.ERROR_CREATING_USER);
            return null;

        }
    }


     public static void printAllUsers(ArrayList<User> users) {
        if (users.isEmpty()) {
            System.out.println("No hay usuarios registrados.");
            return;
        }
        System.out.println("=== Lista de Usuarios ===");
        for (User u : users) {
            // asume que User.toString() está bien implementado
            System.out.println(u);
        }
    }

    public static String addFavoriteRoute(ArrayList<User> users,String search_username,FavoriteRoute newFavoriteRoute){

      try{
        for (User u : users) {
            if(u.getName().equalsIgnoreCase(search_username)){
              u.addRutaPreferida(newFavoriteRoute);
              return UserInputUI.PROMPT_ROUTE_ADDED_SUCCESSFULLY ;
            }

        }
        return ErrorUI.ERROR_UPDATING_USER;
    }catch(Exception e){
      return ErrorUI.ERROR_UPDATING_USER;
    }
    }


     public static String connectCyclists(ArrayList<User> users, String username1, String username2) {
        // 1. Validar entradas básicas
        if (username1 == null || username1.trim().isEmpty() || username2 == null || username2.trim().isEmpty()) {
            return ErrorUI.ERROR_INVALID_USERNAME_INPUT;
        }

        if (username1.equalsIgnoreCase(username2)) {
            return ErrorUI.ERROR_CANNOT_BEFRIEND_SELF;
        }

        User userOne = null;
        User userTwo = null;

        // 2. Encontrar ambos usuarios en la lista
        for (User u : users) {
            if (u.getName().equalsIgnoreCase(username1)) {
                userOne = u;
            }
            if (u.getName().equalsIgnoreCase(username2)) {
                userTwo = u;
            }
            // Optimización: si ambos ya fueron encontrados, salir del bucle
            if (userOne != null && userTwo != null) {
                break;
            }
        }

        // 3. Verificar si los usuarios fueron encontrados
        if (userOne == null) {
            return String.format(ErrorUI.ERROR_USER_NOT_FOUND_FORMAT, username1);
        }
        if (userTwo == null) {
            return String.format(ErrorUI.ERROR_USER_NOT_FOUND_FORMAT, username2);
        }

        final User foundUserOne = userOne;
        final User foundUserTwo = userTwo;
        try {
            // 4. Verificar si ya son amigos
            // Asumimos que User.getFriends() devuelve una lista de nombres de amigos
            // y User.addFriend(String friendName) se encarga de no duplicar.
            boolean userOneKnowsUserTwo = false;
            userOneKnowsUserTwo = userOne.getFriends().stream()
                                         .anyMatch(friendName -> friendName.equalsIgnoreCase(foundUserTwo.getName()));


            boolean userTwoKnowsUserOne = false;
            if (userTwo.getFriends() != null) {
                 userTwoKnowsUserOne = userTwo.getFriends().stream()
                                          .anyMatch(friendName -> friendName.equalsIgnoreCase(foundUserOne.getName()));
            }


            if (userOneKnowsUserTwo && userTwoKnowsUserOne) {
                return String.format(FriendUI.PROMPT_ALREADY_FRIENDS_FORMAT, userOne.getName(), userTwo.getName());
            }

            // 5. Añadir la amistad mutuamente
            // El método addFriend en User ya debería manejar la no duplicación.
            userOne.addFriend(userTwo.getName()); // User A añade a User B
            userTwo.addFriend(userOne.getName()); // User B añade a User A

            // Se podría añadir una confirmación extra aquí si addFriend devolviera un booleano
            // indicando si la lista cambió. Por ahora, confiamos en que funciona.

            return String.format(FriendUI.PROMPT_FRIENDS_CONNECTED_SUCCESSFULLY_FORMAT, userOne.getName(), userTwo.getName());

        } catch (Exception e) {
            // Aquí podrías loggear la excepción e.printStackTrace() para depuración
            System.err.println("Error inesperado en connectCyclists: " + e.getMessage());
            e.printStackTrace();
            return ErrorUI.ERROR_CONNECTING_FRIENDS_GENERAL;
        }
    }




}
