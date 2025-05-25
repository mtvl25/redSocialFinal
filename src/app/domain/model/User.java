package app.domain.model;
import java.util.ArrayList;
public class User{

    //Atributos
    private String name;
    private int age;
    private int typeOfCycling;
    private String location;
    private ArrayList<FavoriteRoute> favoriteRoutes;
    private ArrayList<String> friends;



    //Constructor

    public User(String name,int age,int typeOfCycling,String location){
        this.name=name;
        this.age=age;
        this.typeOfCycling=typeOfCycling;
        this.location=location;
        this.favoriteRoutes=new ArrayList<>();
        this.friends=new ArrayList<>();
    }


    //SETTERS



    //Cambiar nombre
    public void setName(String name){
        this.name=name;
    }


    //Cambiar Edad
    public void setAge(int age){
        this.age=age;
    }

    //Cambiar tipo de ciclismo
    public void setTypeOfCycling(int typeOfCycling){
        this.typeOfCycling=typeOfCycling;
    }


    //Cambiar ubicacion
    public void setLocation(String location){
        this.location=location;
    }

    //Añadir ruta a usuario
    public void addRutaPreferida(FavoriteRoute ruta) {
        if (ruta != null && !this.favoriteRoutes.contains(ruta)) {
            this.favoriteRoutes.add(ruta);
        }else{

        }
    }


    public void addFriend(String newFriend){
      String normalizedFriend = newFriend.toLowerCase();
      if(newFriend!=null && !this.friends.contains(normalizedFriend) ){
        this.friends.add(newFriend);
      }
    }






     public boolean removeRutaPreferida(FavoriteRoute ruta) {
        return this.favoriteRoutes.remove(ruta); // remover ruta preferida
    }

    //GETTERS



    //Obtener nombre
    public String getName(){
        return this.name;
    }

    //Obtener edad
    public int getAge(){
        return this.age;
    }

    //Obtener tipo de ciclismo

    public int getTypeOfCycling(){
        return this.typeOfCycling;
    }

    //Obtener Ubicacion
    public String getLocation(){
        return this.location;
    }




    public String getFavoriteRoutes() {
        if (this.favoriteRoutes == null || this.favoriteRoutes.isEmpty()) {
            return ""; // Retorna un string vacío si no hay rutas
        }

        String concatenatedString = "";
        for (FavoriteRoute ruta : this.favoriteRoutes) {
            // Java llamará implícitamente a ruta.toString() aquí
            concatenatedString += ruta;
        }
        return concatenatedString;
    }



        /**
     * Devuelve una representación en String de todos los campos del usuario.
     * Este es el método que solicitaste.
     * Es similar a un método toString() bien implementado.
     */
       public String getUserDetailsAsString() {
        StringBuilder sb = new StringBuilder();
        int lineWidth = 60; // Ancho deseado para el bloque

        // Helper para crear líneas separadoras
        String separatorLine = "╠" + "═".repeat(lineWidth - 2) + "╣\n";
        String topBorder = "╔" + "═".repeat(lineWidth - 2) + "╗\n";
        String bottomBorder = "╚" + "═".repeat(lineWidth - 2) + "╝\n";
        String titleSeparator = "╞" + "═".repeat(lineWidth - 2) + "╡\n"; // Separador más suave para títulos internos

        // --- Encabezado del Perfil ---
        sb.append(topBorder);
        sb.append(String.format("║ %-" + (lineWidth - 4) + "s ║\n", centerText("PERFIL DEL CICLISTA", lineWidth - 4)));
        sb.append(separatorLine);

        // --- Información Básica ---
        sb.append(String.format("║ %-20s: %-" + (lineWidth - 28) + "s ║\n", "Nombre", this.name));
        sb.append(String.format("║ %-20s: %-" + (lineWidth - 28) + "s ║\n", "Edad", this.age));

        String cyclingTypeDescription;
        switch (this.typeOfCycling) {
            case 1: cyclingTypeDescription = "Ruta"; break;
            case 2: cyclingTypeDescription = "MTB"; break;
            case 3: cyclingTypeDescription = "Gravel"; break;
            case 4: cyclingTypeDescription = "Urbano"; break;
            default: cyclingTypeDescription = "Desconocido (ID: " + this.typeOfCycling + ")";
        }
        sb.append(String.format("║ %-20s: %-" + (lineWidth - 28) + "s ║\n", "Tipo de Ciclismo", cyclingTypeDescription));
        sb.append(String.format("║ %-20s: %-" + (lineWidth - 28) + "s ║\n", "Ubicación", (this.location != null ? this.location : "No especificada")));

        // --- Rutas Favoritas ---
        sb.append(titleSeparator); // Separador para la sección de rutas
        sb.append(String.format("║ %-" + (lineWidth - 4) + "s ║\n", centerText("RUTAS FAVORITAS", lineWidth - 4)));
        sb.append(titleSeparator);

        if (this.favoriteRoutes == null || this.favoriteRoutes.isEmpty()) {
            sb.append(String.format("║ %-" + (lineWidth - 4) + "s ║\n", "  Ninguna ruta favorita registrada."));
        } else {
            for (FavoriteRoute ruta : this.favoriteRoutes) {
                // Vamos a integrar el formato de FavoriteRoute.getFormattedDetails() aquí
                // o uno similar si toString() ya es suficientemente bueno.
                // Por ahora, usaré el toString() y lo indentaré.
                // Si el toString de FavoriteRoute es multilínea, esto se complicará.
                // Asumamos que FavoriteRoute.toString() es una sola línea concisa.
                // Para el formato que me mostraste, necesitamos más control.
                String[] routeLines = ruta.toString().split("\n"); // Usamos el getFormattedDetails
                for (String line : routeLines) {
                    sb.append(String.format("║ %-" + (lineWidth - 4) + "s ║\n", line.trim())); // trim() para quitar espacios extra de getFormattedDetails
                }
                sb.append(titleSeparator); // Separador entre rutas si hay varias
            }
            // Eliminar el último separador si se añadió innecesariamente
            if (!this.favoriteRoutes.isEmpty() && sb.toString().endsWith(titleSeparator)) {
                sb.setLength(sb.length() - titleSeparator.length());
            }
        }

        // --- Amigos ---
        sb.append(separatorLine); // Separador más fuerte para la sección de amigos
        sb.append(String.format("║ %-" + (lineWidth - 4) + "s ║\n", centerText("AMIGOS CICLISTAS", lineWidth - 4)));
        sb.append(titleSeparator);

        if (this.friends == null || this.friends.isEmpty()) {
            sb.append(String.format("║ %-" + (lineWidth - 4) + "s ║\n", "  No tienes amigos registrados."));
        } else {
            for (String amigo : this.friends) {
                sb.append(String.format("║    %-" + (lineWidth - 9) + "s ║\n", amigo));
            }
        }

        // --- Pie del Perfil ---
        sb.append(bottomBorder);

        return sb.toString();
    }

    // Método helper para centrar texto (simple)
    private String centerText(String text, int width) {
        if (text == null || text.length() >= width) {
            return text != null ? text.substring(0, Math.min(text.length(), width)) : "";
        }
        int padding = width - text.length();
        int padLeft = padding / 2;
        int padRight = padding - padLeft;
        return " ".repeat(padLeft) + text + " ".repeat(padRight);
    }



    public  ArrayList<String> getFriends(){
      return this.friends;
    }
    /*
    public boolean setRoute(FavoriteRoute nuevaruta){
      return true;
    }

    */
    //Metodos


}
