package mate.academy.hibernate.relations.dao.impl;

public class DataProcessingException extends RuntimeException {
    public DataProcessingException(String message, Exception e) {
        super(message);
    }
}