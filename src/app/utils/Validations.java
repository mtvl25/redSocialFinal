package app.utils;

import java.util.ArrayList;

public  class Validations {

    public static boolean validateUserName(String name){

        //Comprobamos que el texto sea mayor a 4 caracteres que no este vacio y que ademas contenga letras validas
        if(name.length()>=4 && !name.isBlank() && name.matches("[a-zA-Z ]+") ){
            return true;
        }else{
            return false;
        }


    }


    public static boolean validateAge(int age){

        //Comprobamos que el texto sea mayor a 4 caracteres que no este vacio y que ademas contenga letras validas
        if(age>=15 && age<90){
            return true;
        }else{
            return false;
        }


    }


    public static boolean validateTypeOfCycling(int type){
      if(type>=1 && type<=4){
        return true;
      }else{
        return false;
      }
    }


      public static boolean isListEmpty(ArrayList<?> list) {
        return list == null || list.isEmpty();
    }


    public static boolean validateRouteTypeOfLand(String typeOfLand) {
        return typeOfLand != null && !typeOfLand.isBlank() && typeOfLand.length() >= 3 && typeOfLand.matches("^[a-zA-Z ]+$");
    }

    public static boolean validateRouteDistance(double distance) {
        return distance > 0.0 && !Double.isNaN(distance) && !Double.isInfinite(distance);
    }

    public static boolean validateRouteDifficultyOption(int difficultyOption) {
        return difficultyOption >= 1 && difficultyOption <= 4;
    }


    public static boolean validateSortDecision(int type){
      if(type>=0 && type<=2){
        return true;
      }else{
        return false;
      }
    }
}
