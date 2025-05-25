package app;


import java.util.ArrayList;
import java.util.Scanner;

import app.domain.repository.RouteRepository;
import app.domain.repository.UserRepository;
import app.presentation.UserUI.ErrorUI;
import app.presentation.UserUI.MenuUI;
import app.presentation.UserUI.RouteInputUI;
import app.presentation.UserUI.UserInputUI;
import app.utils.Loop;
import app.utils.Validations;
import app.domain.model.FavoriteRoute;
import app.domain.model.User;
import app.utils.Format;
import app.utils.Search;
import app.utils.SortUtils;





public class Menu{
    //Libreria scanner




public static void main(String[] args) {

    //UI en forma de String


    //Declaracion de variables temporales

    //USUARIO
    String name;
    int age;
    int typeOfCycling;
    String location;
    String search_username;
    User newuser;
    FavoriteRoute newFavoriteRoute;
    Boolean userFound;
    Boolean userToConnectExists;
    Boolean userToBeConnectedExists;
    String wantedUser;

    //RUTA
    String typeOfLand;
    double distance;
    int routeDifficulty;

    //User to connect
    String userToConnect1;
    String userToConnect2;




    ArrayList<User> users = new ArrayList<>();
    boolean running=true;

    //Crea el escanner que nos permite leer datos por pantalla.
    Scanner teclado= new Scanner(System.in);


    while (running){

      //RESET DE VARIABLES
      newuser=null;
      name=null;
      search_username="";
      age=-1;
      typeOfCycling=-1;
      location=null;
      userFound=false;
      userToConnectExists=false;
      userToBeConnectedExists=false;
      wantedUser="";

      //Route
      newFavoriteRoute=null;
      typeOfLand=null;
      distance=-1;
      routeDifficulty=-1;




        System.out.println(MenuUI.MENU_PRINCIPAL);
        int option=teclado.nextInt();
        //this.typeOfCycling=typeOfCycling;

        switch(option){
            case 1:
                name=Loop.askString(UserInputUI.PROMPT_NAME,Validations::validateUserName,ErrorUI.ERROR_INVALID_NAME);
                if(Search.existUser(users,name)){
                  System.out.println(ErrorUI.ERROR_USERNAME_ALREADY_EXISTS);
                  break;
                };
                age=Loop.askInt(UserInputUI.PROMPT_AGE,Validations::validateAge,ErrorUI.ERROR_INVALID_AGE);
                typeOfCycling=Loop.askInt(UserInputUI.PROMPT_CYCLING_TYPE,Validations::validateTypeOfCycling,ErrorUI.ERROR_INVALID_CYCLING_TYPE);
                location=Loop.askString(UserInputUI.PROMPT_LOCATION,Validations::validateUserName,ErrorUI.ERROR_INVALID_LOCATION);
                newuser=UserRepository.createUser( name, age,  typeOfCycling,location);
                users.add(newuser);
                System.out.println(
                  Format.formatUserData(
                  name,
                  age,
                  Format.getCyclingTypeDescription(typeOfCycling),
                  location
                  )
                  );
                System.out.println(MenuUI.USUARIO_CREADO_EXITOSAMENTE);
                break;
            case 2:
              System.out.println(Search.showUsersName(users,ErrorUI.ERROR_NO_REGISTERED_USERS,UserInputUI.HEADER_USERS_NAMES));
              if(Validations.isListEmpty(users)){break;}


              //Ciclo que ahorra el proceso de tener que entrar otra vez desde el menu principal
              while(true){
                //Validamos el dato por entrada
                search_username=Loop.askString(UserInputUI.PROMPT_SELECT_USER_FOR_FAVORITE_ROUTE,Validations::validateUserName,ErrorUI.ERROR_INVALID_NAME);

               //Buscamos si existe un user.name == el dato ingresado
                userFound=Search.existUser(users,search_username);
                //si lo encontramos rompemos el ciclo
                if(userFound){ break;}
                //si no volvemos a preguntar mostrando el error por pantalla y volviendo a imprimir la lista de usuarios disponibles
                else{
                  System.out.println(ErrorUI.ERROR_USER_NOT_FOUND);
                  System.out.println(Search.showUsersName(users,ErrorUI.ERROR_NO_REGISTERED_USERS,UserInputUI.HEADER_USERS_NAMES));
                }
                }


              //String typeOfLand, double distance, String difficulty2
              typeOfLand=Loop.askString(RouteInputUI.PROMPT_TYPE_OF_LAND,Validations::validateRouteTypeOfLand,ErrorUI.ERROR_INVALID_TYPE_OF_LAND);
              distance=Loop.askDouble(RouteInputUI.PROMPT_DISTANCE,Validations::validateRouteDistance,ErrorUI.ERROR_INVALID_DISTANCE);
              routeDifficulty=Loop.askInt(RouteInputUI.PROMPT_DIFFICULTY,Validations::validateRouteDifficultyOption,ErrorUI.ERROR_INPUT_DIFFICULTY_INVALID_SELECTION);
              newFavoriteRoute=RouteRepository.createFavoriteRoute(typeOfLand, distance, routeDifficulty);
              System.out.println(UserRepository.addFavoriteRoute(users, search_username, newFavoriteRoute));

              for(User u: users){
                 System.out.println(u.getUserDetailsAsString());
              }
              break;


            case 3:
              System.out.println(Search.showUsersName(users,ErrorUI.ERROR_NO_REGISTERED_USERS,UserInputUI.HEADER_USERS_NAMES));
              if(Validations.isListEmpty(users)){break;}
              while(true){
                userToConnect1=Loop.askString(UserInputUI.PROMPT_SELECT_USER_TO_CONNECT,Validations::validateUserName,ErrorUI.ERROR_INVALID_NAME);
                userToConnectExists=Search.existUser(users,userToConnect1);

                if(userToConnectExists){ break;}
                //si no volvemos a preguntar mostrando el error por pantalla y volviendo a imprimir la lista de usuarios disponibles
                else{
                  System.out.println(ErrorUI.ERROR_USER_NOT_FOUND);
                  System.out.println(Search.showUsersName(users,ErrorUI.ERROR_NO_REGISTERED_USERS,UserInputUI.HEADER_USERS_NAMES));
                }
              }

            while (true) {
              userToConnect2=Loop.askString(UserInputUI.PROMPT_SELECT_USER_TO_BE_CONNECTED,Validations::validateUserName,ErrorUI.ERROR_INVALID_NAME);
              userToBeConnectedExists=Search.existUser(users,userToConnect2);
              if(userToBeConnectedExists){break;}
              else{
                System.out.println(ErrorUI.ERROR_USER_NOT_FOUND);
                System.out.println(Search.showUsersName(users,ErrorUI.ERROR_NO_REGISTERED_USERS,UserInputUI.HEADER_USERS_NAMES));
              }
            }
            //if(!userToConnect1.equals(userToConnect2)){
              System.out.println(UserRepository.connectCyclists(users, userToConnect1, userToConnect2));
            //1}


             break;
        case 4:

        if(users.size()>=1){
          for(User u: users){
                 System.out.println(u.getUserDetailsAsString());
            }
        }else{
          System.out.println(ErrorUI.ERROR_NO_REGISTERED_USERS);
        }
         break;


        case 5:
        if(users.size()>=1){
          wantedUser=Loop.askString(UserInputUI.PROMPT_SEARCH_USER_BY_NAME,Validations::validateUserName,ErrorUI.ERROR_INVALID_NAME);
          userFound=Search.existUser(users,wantedUser);
          if(userFound){
            for(User u: users){
               if(u.getName().equalsIgnoreCase(wantedUser)){
                  System.out.println(u.getUserDetailsAsString());
                }
            }

          }else{
            System.out.println(ErrorUI.ERROR_USER_NOT_FOUND);
          }

        }else{
          System.out.println(ErrorUI.ERROR_NO_REGISTERED_USERS);
        }
         break;


        case 6: // Ordenar ciclistas
          if (users.isEmpty()) {
              System.out.println(UserInputUI.MESSAGE_NO_USERS_TO_SORT);
              break;
          }

          int sortChoice =Loop.askInt(UserInputUI.PROMPT_SORT_OPTIONS,Validations::validateSortDecision, ErrorUI.ERROR_OPTION_OUT_OF_RANGE);
          ArrayList<User> sortedUsersList = null; // Para almacenar la lista ordenada

        switch (sortChoice) {
            case 1: // Ordenar por Nombre (Z-A)
                // Usando Bubble Sort como ejemplo de la implementación manual
                sortedUsersList = SortUtils.bubbleSortUsersByNameDescending(users);
                System.out.println(UserInputUI.MESSAGE_USERS_SORTED_BY_NAME_DESC);
                break;
            case 2: // Ordenar por Edad (Menor a Mayor)
                // Usando Selection Sort como ejemplo de la implementación manual
                sortedUsersList = SortUtils.selectionSortUsersByAgeAscending(users);
                System.out.println(UserInputUI.MESSAGE_USERS_SORTED_BY_AGE_ASC);
                break;
            case 0: // Volver
                System.out.println("Volviendo al menú principal...");
                break;

        }

        if(sortChoice==2 || sortChoice==1){
          for (User user : sortedUsersList) {
          // System.out.println(user.toString()); // Si toString() es simple
          System.out.println(user.getUserDetailsAsString()); // Si quieres el formato completo
          System.out.println("------------------------------------------------------");
          }
        }
        break;

        case 7:
          System.out.println(MenuUI.MESSAGE_FAREWELL_PERSONAL_HEART_CHAR);
          System.out.println("\nFinalizando programa...");
          running=false;
        }
    }
}
}
  