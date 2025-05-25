package app.utils;

import app.presentation.UserUI.UserInputUI;

public final class Format {

  public static String getCyclingTypeDescription(int typeOfCycling) {
    return switch (typeOfCycling) { // Requiere Java 14+ para switch expressions
      case 1 -> "ruta";
      case 2 -> "mtb";
      case 3 -> "gravel";
      case 4 -> "urbano";
      // Agrega más casos según tus necesidades
      default -> "Desconocido (" + typeOfCycling + ")";
    };

  }

  public static String formatUserData(String name, int age, String typeOfCycling, String location) {
    String datosFormateados = String.format(UserInputUI.PLANTILLA_DATOS_USUARIO, name, age, typeOfCycling, location);

    return datosFormateados;
  }



   public static String getRouteDifficultyDescription(int difficultyOption) {
        return switch (difficultyOption) { 
            case 1 -> "Fácil";
            case 2 -> "Moderada";
            case 3 -> "Difícil";
            case 4 -> "Experto";
            default -> "Dificultad Desconocida (" + difficultyOption + ")";
        };
    }
}
