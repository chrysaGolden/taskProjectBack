package com.chrysa.rest.webservices.restfulwebservices.helloworld;


import com.chrysa.rest.webservices.restfulwebservices.todo.Todo;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

//controller
@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class HelloWorldController {

    //GET
    //URI - /hello-world
    //method - "hello world"
    @GetMapping(path = "/hello-world")
    public String helloWorld() {
        return "Hello World!";
    }

    //hello-world-bean
    @GetMapping(path = "/hello-world-bean")
    public HelloWorldBean helloWorlBean() {
        //throw new RuntimeException("Some error has Happened! Contact Support at***");
        return new HelloWorldBean("Hello World- changed");

    }

    //hello-world-bean/path-variable/Chrysa
    @GetMapping(path = "/hello-world/path-variable/{name}")
    public HelloWorldBean helloWorlPathVariable(@PathVariable String name) {
        return new HelloWorldBean(String.format("Hello World %s", name));
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
