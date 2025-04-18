package pro.baeshilbaeshil.application.common.exception;

import lombok.Getter;
import pro.baeshilbaeshil.application.common.exception_type.BaseExceptionType;

@Getter
public class NotFoundException extends RuntimeException {

    private final BaseExceptionType exceptionType;

    public NotFoundException(BaseExceptionType exceptionType) {
        super(exceptionType.getErrorMessage());
        this.exceptionType = exceptionType;
    }
}
