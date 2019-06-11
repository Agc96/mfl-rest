package pe.edu.pucp.a20130095.myfirstloginrest.utils;

public class Utilities {

    public static boolean isEmptyString(String str) {
        return (str == null) || (str.isEmpty());
    }

    public static boolean checkApplicationName(String applicationName) {
        if (applicationName.equals("MFL_MOBILE")) return true;
        if (applicationName.equals("MY_FIRST_LOGIN")) return true;
        return false;
    }
}