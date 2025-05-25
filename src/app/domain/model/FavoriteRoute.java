package app.domain.model;
public class FavoriteRoute{

    //Atributos tipo de terreno,distancia y dificultad;
    private String  typeOfLand;
    private double  distance;
    private int  difficulty;




    public FavoriteRoute(String typeOfLand, double distance, int difficulty) {
        this.typeOfLand=typeOfLand;
        this.distance=distance;
        this.difficulty=difficulty;
    }

    //Setters
    public void SetTypeofLand(String typeOfLand){
        this.typeOfLand=typeOfLand;
    }

    public void SetDistance(double distance){
        this.distance=distance;
    }

    public void SetDifficulty(int difficulty){
        this.difficulty=difficulty;
    }



    //Getters

    public String GettypeOfLand(){
        return this.typeOfLand;
    }



    public double Getdistance(){
        return this.distance;
    }

    public int Getdifficulty(){
        return this.difficulty;
    }
// 

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("  ----------------------------\n");
        sb.append("  Detalles de la Ruta Favorita:\n");
        sb.append(String.format("    %-18s: %s\n", "Tipo de Terreno", this.typeOfLand));
        sb.append(String.format("    %-18s: %.1f km\n", "Distancia", this.distance));
        sb.append(String.format("    %-18s: %d\n", "Dificultad", this.difficulty));
        sb.append("  ----------------------------");
        return sb.toString();
    }




}
