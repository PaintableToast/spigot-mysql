package de.paintabletoast.system.var;

public enum Message {
    PREFIX(PathFile.GENERAL),
    CONSOLE_PREFIX(PathFile.GENERAL),
    INFORMATION_TAG(PathFile.GENERAL),

    NO_PERMISSION(PathFile.USER),
    WRONG_COMMAND_ARGUMENTATION(PathFile.USER),
    PLAYER_NOT_ONLINE(PathFile.USER),

    NO_CONSOLE(PathFile.CONSOLE),
    ERROR(PathFile.CONSOLE),
    PLUGIN_LOAD(PathFile.CONSOLE),
    PLUGIN_SUCCESS_LOAD(PathFile.CONSOLE),
    PLUGIN_ERROR_LOAD(PathFile.CONSOLE),
    PLUGIN_STOP(PathFile.CONSOLE),
    FILE_LOAD_CONFIG(PathFile.CONSOLE),
    COMMAND_SUCCESS(PathFile.CONSOLE),
    COMMAND_ERROR(PathFile.CONSOLE),
    LISTENER_SUCCESS(PathFile.CONSOLE),
    LISTENER_ERROR(PathFile.CONSOLE),

    MYSQL_CONNECT(PathFile.MYSQL),
    MYSQL_DISCONNECT(PathFile.MYSQL),
    MYSQL_CONNECT_ERROR(PathFile.MYSQL),
    MYSQL_ERROR(PathFile.MYSQL)
    ;
    private PathFile pathFile;
    Message(final PathFile pathFile) {
       this.pathFile = pathFile;
    }
    public final String getMessage() {
        if(pathFile == PathFile.MYSQL) return ConfigFile.MESSAGE.getConfig().getMySQLString(PathFile.MESSAGE.getPath() + pathFile.getPath() +  this.name());
        if(pathFile == PathFile.GENERAL) return ConfigFile.MESSAGE.getConfig().getPreString(PathFile.MESSAGE.getPath() + pathFile.getPath() +  this.name());
        return ConfigFile.MESSAGE.getConfig().getString(PathFile.MESSAGE.getPath() + pathFile.getPath() +  this.name());
    }

}

