package s2u2msdk.spring.core.exception;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * The type Mind fly exception.
 * @author Amos Xia
 */
@Getter
@Setter
public abstract class AbS2u2mSpringException extends RuntimeException {
    private int errCode;
    private String errMsg;
}
