package app.presentation.UserUI;

public final class RouteInputUI {
    private RouteInputUI() { /* no instancias */ }

    public static final String PROMPT_TYPE_OF_LAND = """
        ╔════════════════════════════════════════════╗
        ║   Ingrese el tipo de terreno de la ruta:   ║
        ╚════════════════════════════════════════════╝
        > """;

    public static final String PROMPT_DISTANCE = """
        ╔═════════════════════════════════════════════════╗
        ║   Ingrese la distancia de la ruta (ej: 10.5 km):║
        ╚═════════════════════════════════════════════════╝
        > """;

    public static final String PROMPT_DIFFICULTY = """
        ╔═════════════════════════════════════════╗
        ║    Seleccione la dificultad de la ruta: ║
        ╠═════════════════════════════════════════╣
        ║ 1. Fácil                                ║
        ║ 2. Moderada                             ║
        ║ 3. Difícil                              ║
        ║ 4. Experto                              ║
        ╚═════════════════════════════════════════╝
        > """;

    // Prompt adicional si necesitas buscar una ruta para actualizarla o eliminarla
    public static final String PROMPT_ROUTE_IDENTIFIER = """
        ╔══════════════════════════════════════════════════╗
        ║ Ingrese el nombre o ID de la ruta a modificar:   ║
        ╚══════════════════════════════════════════════════╝
        > """;
}
