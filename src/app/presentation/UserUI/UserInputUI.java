package app.presentation.UserUI;
public final class UserInputUI {
    private UserInputUI() { /* no instancias */ }

    public static final String PROMPT_NAME = """
        ╔══════════════════════════════════╗
        ║   Ingrese el nombre del usuario: ║
        ╚══════════════════════════════════╝
        > """;

    public static final String PROMPT_AGE = """
        ╔════════════════════════════════╗
        ║   Ingrese la edad del usuario: ║
        ╚════════════════════════════════╝
        > """;

    public static final String PROMPT_CYCLING_TYPE = """
        ╔══════════════════════════════════════════╗
        ║ Seleccione el tipo de ciclismo preferido:║
        ╠══════════════════════════════════════════╣
        ║ 1. Ruta                                  ║
        ║ 2. MTB                                   ║
        ║ 3. Gravel                                ║
        ║ 4. Urbano                                ║
        ╚══════════════════════════════════════════╝
        > """;

    public static final String PROMPT_LOCATION = """
        ╔════════════════════════════════╗
        ║   Ingrese la ubicación:         ║
        ╚════════════════════════════════╝
        > """;

    public static final String PLANTILLA_DATOS_USUARIO = """
        ╔══════════════════════════════════════════════════════╗
        ║  Nombre:                    %-20.10s    ║
        ║  Edad:                        %-20.10s  ║
        ║  Tipo de ciclismo preferido: %-20.10s   ║
        ║  Ubicacion:                 %-20.10s    ║
        ╚══════════════════════════════════════════════════════╝
        """;


    public static final String HEADER_USERS_NAMES = """
            ╔════════════════════════════════════════════════════════╗
            ║                  LISTA DE USUARIOS                     ║
            ╠════════════════════════════════════════════════════════╣
            """;
    public static final String PROMPT_SELECT_USER_FOR_FAVORITE_ROUTE = """
        ╔════════════════════════════════════════════════════════╗
        ║ ¿A qué usuario desea añadirle una ruta favorita?       ║
        ╚════════════════════════════════════════════════════════╝
        """;

    public static final String PROMPT_ROUTE_ADDED_SUCCESSFULLY = """
        ╔════════════════════════════════════════════════════════╗
        ║                        ¡ÉXITO!                         ║
        ╠════════════════════════════════════════════════════════╣
        ║               Ruta añadida exitosamente.              ║
        ╚════════════════════════════════════════════════════════╝
        """;



     public static final String PROMPT_SELECT_USER_TO_CONNECT = """
        ╔════════════════════════════════════════════════════════╗
        ║             ¿A qué usuario desea conectar?             ║
        ╚════════════════════════════════════════════════════════╝
        """;

    public static final String PROMPT_SELECT_USER_TO_BE_CONNECTED = """
        ╔════════════════════════════════════════════════════════╗
        ║             ¿Con quien desea conectarlo?               ║
        ╚════════════════════════════════════════════════════════╝
        """;

    public static final String PROMPT_SEARCH_USER_BY_NAME = """
      ╔════════════════════════════════════════════════════════╗
      ║   Ingrese el nombre del usuario que desea buscar:      ║
      ╚════════════════════════════════════════════════════════╝
      """;


      public static final String PROMPT_SORT_OPTIONS = """
      ╔════════════════════════════════════════════════════════╗
      ║                 OPCIONES DE ORDENAMIENTO                 ║
      ╠════════════════════════════════════════════════════════╣
      ║ 1. Ordenar por Nombre (Z-A)                            ║
      ║ 2. Ordenar por Edad (Menor a Mayor)                    ║
      ║ 0. Volver al menú principal                            ║
      ╚════════════════════════════════════════════════════════╝
      """;
      public static final String MESSAGE_USERS_SORTED_BY_NAME_DESC = """
      ╔════════════════════════════════════════════════════════╗
      ║      Usuarios ordenados por Nombre (Descendente)       ║
      ╚════════════════════════════════════════════════════════╝
      """;

      public static final String MESSAGE_USERS_SORTED_BY_AGE_ASC = """
      ╔════════════════════════════════════════════════════════╗
      ║        Usuarios ordenados por Edad (Ascendente)        ║
      ╚════════════════════════════════════════════════════════╝
      """;

      public static final String MESSAGE_NO_USERS_TO_SORT = """
      ╔════════════════════════════════════════════════════════╗
      ║          No hay usuarios registrados para ordenar.         ║
      ╚════════════════════════════════════════════════════════╝
      """;

}









