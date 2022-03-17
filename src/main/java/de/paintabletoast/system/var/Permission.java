package de.paintabletoast.system.var;

public enum Permission {
    ;
    public final String getPermission() {
        return ConfigFile.PERMISSION.getConfig().getString(PathFile.PERMISSION.getPath() + this.name());
    }
}
