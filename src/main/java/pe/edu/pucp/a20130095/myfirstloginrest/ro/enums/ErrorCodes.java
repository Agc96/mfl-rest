package pe.edu.pucp.a20130095.myfirstloginrest.ro.enums;

public enum ErrorCodes {
    NO_ERROR(0, null),
    ERROR_UNKNOWN(9000, "Error inesperado en el servicio REST."),
    NO_RESULTS(9001, "No se encontraron resultados."),
    MISSING_DATA(9002, "Datos requeridos."),
    INVALID_DATA(9005, "Datos no válidos."),
    MISSING_APP_NAME(9003, "Nombre de aplicación requerido."),
    INVALID_APP_NAME(9004, "Nombre de aplicación inválido.");

    int code;
    String message;

    ErrorCodes (int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }
}
