package com.codewithphil.store.users;

public class AccessDeniedException extends RuntimeException {
    public AccessDeniedException() {
        super("Password is incorrect");
    }
}
