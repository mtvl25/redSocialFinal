package app.presentation.UserUI;

public final class FriendUI {
  private FriendUI(){};

  public static final String PROMPT_FRIENDS_CONNECTED_SUCCESSFULLY_FORMAT = """
╔════════════════════════════════════════════════════════╗
║                      ¡CONEXIÓN EXITOSA!                  ║
╠════════════════════════════════════════════════════════╣
║   %s y %s ahora son amigos ciclistas.                  ║
╚════════════════════════════════════════════════════════╝
""";


public static final String PROMPT_ALREADY_FRIENDS_FORMAT = """
╔════════════════════════════════════════════════════════╗
║                      INFORMACIÓN                         ║
╠════════════════════════════════════════════════════════╣
║   %s y %s ya son amigos ciclistas.                     ║
╚════════════════════════════════════════════════════════╝
""";

}
