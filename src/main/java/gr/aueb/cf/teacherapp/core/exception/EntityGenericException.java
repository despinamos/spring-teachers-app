package gr.aueb.cf.teacherapp.core.exception;

public class EntityGenericException extends Exception{
    private final String code;

    public EntityGenericException(String code, String message) {
        super(message);
        this.code = code;
    }
}
