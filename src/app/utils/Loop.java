package app.utils;
import java.util.Scanner;
import java.util.function.Predicate;



public final class Loop {

    public static String askString(String message,Predicate<String> condition,String errorMesagge) {

            Scanner teclado= new Scanner(System.in);
            String respuesta;
            do{
                System.out.println(message);
                respuesta=teclado.nextLine();

                if(!condition.test(respuesta)){
                    System.out.println(errorMesagge);
                }


            }while(!condition.test(respuesta));

            return respuesta;
    }


    public static int askInt(String message,Predicate<Integer> condition,String errorMesagge) {
            //Inicializamos el scanner
            Scanner teclado= new Scanner(System.in);

            //declaracion de variables
            int respuesta;
            boolean valid;

            //Bucle que pregunta por el dato en cuestion
            do{
                respuesta=0;
                //Mensaje personlaizado pasado por parametro que pregunta por el dato deseado
                System.out.println(message);
                try{

                    respuesta=teclado.nextInt();
                }catch(Exception e){
                  //Limpiamos el buffer del teclado para que no almacene datos previos.
                    teclado.nextLine();
                    respuesta=-1;
                }
                //Ponemos aprueba la condicion y almacenamos el booleano en valid
                valid=condition.test(respuesta);
                //Si no cumple la condicion retorna el mensaje personalizado obtenido del parametro
                if(!valid){
                        System.out.println(errorMesagge);
                }

                //Vuelve a preguntar mientras la condicion sea invalida
            }while(!valid);

            return respuesta;
    }



    public static double askDouble(String message,Predicate<Double> condition,String errorMesagge) {
            //Inicializamos el scanner
            Scanner teclado= new Scanner(System.in);

            //declaracion de variables
            double respuesta;
            boolean valid;

            //Bucle que pregunta por el dato en cuestion
            do{
                respuesta=0;
                //Mensaje personlaizado pasado por parametro que pregunta por el dato deseado
                System.out.println(message);
                try{

                    respuesta=teclado.nextDouble();
                }catch(Exception e){
                  //Limpiamos el buffer del teclado para que no almacene datos previos.
                    teclado.nextLine();
                    respuesta=-1;
                }
                //Ponemos aprueba la condicion y almacenamos el booleano en valid
                valid=condition.test(respuesta);
                //Si no cumple la condicion retorna el mensaje personalizado obtenido del parametro
                if(!valid){
                        System.out.println(errorMesagge);
                }

                //Vuelve a preguntar mientras la condicion sea invalida
            }while(!valid);

            return respuesta;
    }
}
