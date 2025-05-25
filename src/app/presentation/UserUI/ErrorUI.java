package app.presentation.UserUI;

public class ErrorUI {

    public static final String ERROR_INVALID_NAME = """
        ╔════════════════════════════════════════════════════════╗
        ║                         ¡ERROR!                        ║
        ╠════════════════════════════════════════════════════════╣
        ║ El nombre no puede estar vacío y debe contener         ║
        ║ al menos 4 letras sin números ni símbolos.             ║
        ╚════════════════════════════════════════════════════════╝
        """;

    public static final String ERROR_USERNAME_ALREADY_EXISTS = """
    ╔════════════════════════════════════════════════════════╗
    ║                        ¡ERROR!                         ║
    ╠════════════════════════════════════════════════════════╣
    ║   El nombre de usuario que intenta registrar ya existe.║
    ║   Por favor, elija un nombre de usuario diferente.     ║
    ╚════════════════════════════════════════════════════════╝
    """;


    public static final String ERROR_OPTION_OUT_OF_RANGE = """
    ╔════════════════════════════════════════════════════════╗
    ║                        ¡ERROR!                         ║
    ╠════════════════════════════════════════════════════════╣
    ║   Opción inválida. El número ingresado está fuera       ║
    ║   del rango de opciones permitidas. Por favor, elija   ║
    ║   una de las opciones mostradas en el menú.            ║
    ╚════════════════════════════════════════════════════════╝
    """;

    public static final String ERROR_INVALID_AGE = """
        ╔════════════════════════════════════════════════════════╗
        ║                         ¡ERROR!                        ║
        ╠════════════════════════════════════════════════════════╣
        ║ La edad debe ser un número entero entre 15 y 90.       ║
        ║ No se permiten letras, decimales ni campos vacíos.     ║
        ╚════════════════════════════════════════════════════════╝
        """;

    public static final String ERROR_INVALID_CYCLING_TYPE = """
        ╔════════════════════════════════════════════════════════╗
        ║                        ¡ERROR!                         ║
        ╠════════════════════════════════════════════════════════╣
        ║ Ingrese un número válido entre 1 y 4.                  ║
        ║ Solo se permiten valores numéricos enteros.            ║
        ╚════════════════════════════════════════════════════════╝
        """;

    public static final String ERROR_INVALID_LOCATION = """
        ╔════════════════════════════════════════════════════════╗
        ║                         ¡ERROR!                        ║
        ╠════════════════════════════════════════════════════════╣
        ║ La ubicación no puede quedar vacía ni contener solo    ║
        ║ espacios. Ingrese un texto válido.                     ║
        ╚════════════════════════════════════════════════════════╝
        """;

    public static final String ERROR_CREATING_USER = """
        ╔════════════════════════════════════════════════════════╗
        ║                       ¡ERROR!                          ║
        ╠════════════════════════════════════════════════════════╣
        ║ Ocurrió un problema al intentar crear el usuario.      ║
        ║ Verifique los datos e intente nuevamente.              ║
        ╚════════════════════════════════════════════════════════╝
        """;

    public static final String ERROR_UPDATING_USER = """
        ╔════════════════════════════════════════════════════════╗
        ║                        ¡ERROR!                         ║
        ╠════════════════════════════════════════════════════════╣
        ║ Ocurrió un problema al intentar actualizar el usuario. ║
        ║ Verifique los cambios e intente nuevamente.            ║
        ╚════════════════════════════════════════════════════════╝
        """;

        //ERRORES DE RUTAS

        public static final String ERROR_CREATING_ROUTE = """
        ╔════════════════════════════════════════════════════════╗
        ║                        ¡ERROR!                         ║
        ╠════════════════════════════════════════════════════════╣
        ║   Ocurrió un problema al intentar crear la nueva ruta. ║
        ║   Verifique los datos ingresados e intente nuevamente. ║
        ╚════════════════════════════════════════════════════════╝
        """;

    public static final String ERROR_UPDATING_ROUTE = """
        ╔════════════════════════════════════════════════════════╗
        ║                        ¡ERROR!                         ║
        ╠════════════════════════════════════════════════════════╣
        ║   Ocurrió un problema al intentar actualizar la ruta.  ║
        ║   Verifique los cambios e intente nuevamente.          ║
        ╚════════════════════════════════════════════════════════╝
        """;

    public static final String ERROR_DELETING_ROUTE = """
        ╔════════════════════════════════════════════════════════╗
        ║                        ¡ERROR!                         ║
        ╠════════════════════════════════════════════════════════╣
        ║   Ocurrió un problema al intentar eliminar la ruta.    ║
        ║   Intente nuevamente o contacte al administrador.      ║
        ╚════════════════════════════════════════════════════════╝
        """;

    public static final String ERROR_ROUTE_NOT_FOUND = """
        ╔════════════════════════════════════════════════════════╗
        ║                        ¡ERROR!                         ║
        ╠════════════════════════════════════════════════════════╣
        ║   La ruta especificada no pudo ser encontrada.         ║
        ║   Verifique el identificador e intente de nuevo.       ║
        ╚════════════════════════════════════════════════════════╝
        """;

    public static final String ERROR_INVALID_DISTANCE = """
        ╔════════════════════════════════════════════════════════╗
        ║                        ¡ERROR!                         ║
        ╠════════════════════════════════════════════════════════╣
        ║   La distancia ingresada no es válida.                 ║
        ║   Debe ser un número positivo. Ej: 10.5                ║
        ╚════════════════════════════════════════════════════════╝
        """;

    public static final String ERROR_INVALID_TYPE_OF_LAND = """
        ╔════════════════════════════════════════════════════════╗
        ║                        ¡ERROR!                         ║
        ╠════════════════════════════════════════════════════════╣
        ║   El tipo de terreno ingresado no es válido.           ║
        ║   Por favor, ingrese un texto descriptivo.             ║
        ╚════════════════════════════════════════════════════════╝
        """;

    public static final String ERROR_INVALID_DIFFICULTY_SELECTION = """
        ╔════════════════════════════════════════════════════════╗
        ║                        ¡ERROR!                         ║
        ╠════════════════════════════════════════════════════════╣
        ║   La opción de dificultad seleccionada no es válida.   ║
        ║   Por favor, elija un número de la lista.              ║
        ╚════════════════════════════════════════════════════════╝
        """;

        // --- ERRORES DE VALIDACIÓN DE INPUTS ESPECÍFICOS ---
    public static final String ERROR_INPUT_TYPE_OF_LAND_EMPTY = """
        ╔════════════════════════════════════════════════════════╗
        ║                        ¡ERROR!                         ║
        ╠════════════════════════════════════════════════════════╣
        ║       El tipo de terreno no puede estar vacío.         ║
        ║       Por favor, ingrese un valor.                     ║
        ╚════════════════════════════════════════════════════════╝
        """;

    public static final String ERROR_INPUT_DISTANCE_INVALID_FORMAT = """
        ╔════════════════════════════════════════════════════════╗
        ║                        ¡ERROR!                         ║
        ╠════════════════════════════════════════════════════════╣
        ║   El formato de la distancia es incorrecto.            ║
        ║   Debe ingresar un número (ej: 10.5).                  ║
        ╚════════════════════════════════════════════════════════╝
        """;

    public static final String ERROR_INPUT_DISTANCE_NEGATIVE_OR_ZERO = """
        ╔════════════════════════════════════════════════════════╗
        ║                        ¡ERROR!                         ║
        ╠════════════════════════════════════════════════════════╣
        ║   La distancia debe ser un número positivo y mayor     ║
        ║   que cero.                                            ║
        ╚════════════════════════════════════════════════════════╝
        """;



    public static final String ERROR_INPUT_DIFFICULTY_INVALID_SELECTION = """
        ╔════════════════════════════════════════════════════════╗
        ║                        ¡ERROR!                         ║
        ╠════════════════════════════════════════════════════════╣
        ║   La opción de dificultad seleccionada no es válida.   ║
        ║   Por favor, elija un número de la lista.              ║
        ╚════════════════════════════════════════════════════════╝
        """;

      public static final String ERROR_NO_REGISTERED_USERS = """
        ╔════════════════════════════════════════════════════════╗
        ║                          ¡ERROR!                       ║
        ╠════════════════════════════════════════════════════════╣
        ║         No hay usuarios registrados actualmente        ║
        ╚════════════════════════════════════════════════════════╝
        """;

        public static final String ERROR_USER_NOT_FOUND = """
        ╔════════════════════════════════════════════════════════╗
        ║                          ¡ERROR!                       ║
        ╠════════════════════════════════════════════════════════╣
        ║           Usuario no encontrado en el sistema          ║
        ╚════════════════════════════════════════════════════════╝
        """;

        public static final String ERROR_USER_NOT_FOUND_FORMAT = """
╔════════════════════════════════════════════════════════╗
║                        ¡ERROR!                         ║
╠════════════════════════════════════════════════════════╣
║   Usuario '%s' no encontrado.                          ║
║   Verifique el nombre e intente nuevamente.            ║
╚════════════════════════════════════════════════════════╝
""";

public static final String ERROR_CANNOT_BEFRIEND_SELF = """
╔════════════════════════════════════════════════════════╗
║                        ¡ERROR!                         ║
╠════════════════════════════════════════════════════════╣
║   Un usuario no puede hacerse amigo de sí mismo.       ║
╚════════════════════════════════════════════════════════╝
""";

public static final String ERROR_CONNECTING_FRIENDS_GENERAL = """
╔════════════════════════════════════════════════════════╗
║                        ¡ERROR!                         ║
╠════════════════════════════════════════════════════════╣
║   Ocurrió un problema al intentar conectar los amigos. ║
║   Intente nuevamente.                                  ║
╚════════════════════════════════════════════════════════╝
""";

public static final String ERROR_INVALID_USERNAME_INPUT = """
╔════════════════════════════════════════════════════════╗
║                        ¡ERROR!                         ║
╠════════════════════════════════════════════════════════╣
║   Los nombres de usuario no pueden estar vacíos.       ║
╚════════════════════════════════════════════════════════╝
""";





}

