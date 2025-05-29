package gr.aueb.cf.teacherapp.core.exception;

public class EntityNotFoundException extends EntityGenericException {
  public static final String DEFAULT_CODE = "NotFound";

  public EntityNotFoundException(String code, String message) {
    super(code + DEFAULT_CODE, message);
  }
}
