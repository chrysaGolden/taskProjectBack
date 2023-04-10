package com.chrysa.rest.basic.auth;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//controller
@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class BasicAuthenticationController {

    //hello-world-bean
    @GetMapping(path = "/basicauth")
    public AuthenticationBean helloWorlBean() {
        //throw new RuntimeException("Some error has Happened! Contact Support at***");
        return new AuthenticationBean("You are authenticated");

    }


}

//what services do we want for todo?
//
//1. Retieve all todos for a user
//GET /users/{user_name}/todos
//
//2. Delete a todo for a user
//DELETE /users/{user_name}/todos/{todo_id}
//
//3. Edit/Update a todo
//PUT /users/{user_name}/todos/{todo_id}
//
//4. Create a new todo
//POST /users/{user_name}/todo/
