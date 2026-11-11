package com.codewithphil.store.users;


import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;
import java.util.Map;

@RestController
@AllArgsConstructor
@RequestMapping("/users")
public class UserController {
    private final UserService userService;




    @GetMapping
    public Iterable<UserDto> getAllUsers(
           @RequestParam(required = false, defaultValue = "", name = "sort"
            ) String sortBy) {
                return userService.getAllUsers(sortBy);
    }


    @GetMapping("/{id}")
    public UserDto getUser(@PathVariable Long id){
        return userService.getUser(id);
    }

    @PostMapping
    public ResponseEntity<?> registerUser(
            @Valid @RequestBody RegisterUserRequest request,
            UriComponentsBuilder uriBuilder
    ){
        var userDto = userService.registerUser(request);
        var uri = uriBuilder.path("/users/{id}").buildAndExpand(userDto.getId()).toUri();

        return ResponseEntity.created(uri).body(userDto);
    }

    @PutMapping("/{id}")
    public UserDto updateUser(@PathVariable(name = "id") Long id,
                                              @RequestBody UpdateUserRequest request){
       return userService.updateUser(id, request);
    }

    @DeleteMapping("/{id}")
    public  void deleteUser(@PathVariable(name = "id") Long id){
        userService.deleteUser(id);
    }

    @PostMapping("/{id}/change-password")
    public void changePassword(@PathVariable Long id,
                                                  @RequestBody ChangePasswordRequest request){
        userService.changePassword(id, request);
    }


    @ExceptionHandler(UserNotFoundException.class)
    public ResponseEntity<?> handleUserNotFound() {
        return  ResponseEntity.notFound().build();
    }
    @ExceptionHandler(DuplicateUserException.class)
    public ResponseEntity<Map<String, String>> handleDuplicateUser() {
        return ResponseEntity.badRequest().body(
                Map.of("email", "Email is already registered.")
        );
    }
    @ExceptionHandler(AccessDeniedException.class)
    public ResponseEntity<?> handleAccessDenied() {
        return  ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
    }


}
