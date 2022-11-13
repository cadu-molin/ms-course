package com.carlosmolin.hruser.resources;

import com.carlosmolin.hruser.entities.User;
import com.carlosmolin.hruser.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @Autowired
    private UserRepository repository;

    @GetMapping(value = "/{id}")
    public ResponseEntity<User> findById(@PathVariable Long id) {
        return ResponseEntity.ok(repository.findById(id).get());
    }

    @GetMapping(value = "/serch")
    public ResponseEntity<User> findByEmail(@RequestParam String email) {
        return ResponseEntity.ok(repository.findByEmail(email));
    }
}
