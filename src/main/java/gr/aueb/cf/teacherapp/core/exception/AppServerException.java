package gr.aueb.cf.teacherapp.core.exception;

public class AppServerException extends EntityGenericException {
  public AppServerException(String code, String message) {
    super(code, message);
  }
}
