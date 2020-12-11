package model.exception;

import org.w3c.dom.DOMImplementation;

public class DomainException extends RuntimeException {
    private static final long serialVersionUID = 1L;
    public DomainException(String msg){
        super(msg);
    }
}
