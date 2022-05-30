package ptl.cloud.bank.validation.exception.handler;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

@Slf4j
public class BasicExceptionValidationHandler extends ValidationExceptionHandler<Exception> {
    @Override
    public void makeHandle(Exception exception) {
        throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "There was an error " + exception.getMessage());
    }
}
