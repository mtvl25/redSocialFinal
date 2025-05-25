package app.utils;
import java.util.ArrayList;
import app.domain.model.User;
public final class Search{

  //Muestra todos los nombres de usuarios creados
  public static String showUsersName(ArrayList<User> users, String error, String message){
    StringBuilder content = new StringBuilder();

    int cont=0;
    content.append(message).append("\n");
    for(User u: users){
      cont++;

      content.append(String.format("║ %d ",cont)).append(u.getName()).append("\n");
    }

    if(users.size()>=1){
      return content.toString();
    }else{
      return error;
    }


  }


  public static boolean existUser(ArrayList<User> users,String username){
    for (User u : users) {
            if(u.getName().equalsIgnoreCase(username)){
              return true;
            }
    }
    return false;
  }
}


