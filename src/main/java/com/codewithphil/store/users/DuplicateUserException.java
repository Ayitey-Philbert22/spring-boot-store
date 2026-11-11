package com.codewithphil.store.users;

public class DuplicateUserException extends RuntimeException {
    public DuplicateUserException() {
        super("Email already exists");
    }
}
