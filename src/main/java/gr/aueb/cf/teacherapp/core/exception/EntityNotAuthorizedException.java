package gr.aueb.cf.teacherapp.core.exception;

public class EntityNotAuthorizedException extends EntityGenericException {
    public static final String DEFAULT_CODE = "NotAuthorized";

    public EntityNotAuthorizedException(String code, String message) {
        super(code + DEFAULT_CODE, message);
    }
}
