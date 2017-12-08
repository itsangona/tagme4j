/**
 * Copyright (c) 2016 Enrico Candino
 * <p>
 * Distributed under the MIT License.
 */
package it.zwl.tagme4j;

public class TagMeException extends Exception {

    public TagMeException(String message) {
        super(message);
    }

    public TagMeException(String message, Exception e) {
        super(message, e);
    }
}
