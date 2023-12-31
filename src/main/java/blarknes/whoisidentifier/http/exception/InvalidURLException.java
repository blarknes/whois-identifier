package blarknes.whoisidentifier.http.exception;

/**
 * {@code InvalidURLException} Is the exception thrown when the url built
 * to be requested is not valid.
 */
public class InvalidURLException extends RuntimeException {

    public InvalidURLException(final String url) {
        super("The URL " + url + " is invalid");
    }

}
