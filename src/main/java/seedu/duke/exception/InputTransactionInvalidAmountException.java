package seedu.duke.exception;

import seedu.duke.common.ErrorMessages;

//@@author chinhan99
public class InputTransactionInvalidAmountException extends MoolahException {
    /**
     * Returns the error message of the exception to alert user of the exception.
     *
     * @return A string containing the error message
     */
    @Override
    public String getMessage() {
        return ErrorMessages.ERROR_INPUT_INVALID_AMOUNT.toString();
    }

}
//@@author