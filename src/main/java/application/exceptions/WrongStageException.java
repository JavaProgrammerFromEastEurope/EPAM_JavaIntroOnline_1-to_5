package application.exceptions;

import static java.lang.String.format;

public class WrongStageException extends Exception {

    private final int length;

    public WrongStageException(int length) {
        this.length = length;
    }

    @Override
    public String getMessage() {
        int character = 122891;
        return format("Don't be a stranger, world is beautiful %c  ! %d - is Wrong!", (char) character, length);
    }
}