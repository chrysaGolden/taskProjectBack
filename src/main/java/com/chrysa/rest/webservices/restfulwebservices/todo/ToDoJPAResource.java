package com.chrysa.rest.webservices.restfulwebservices.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.Calendar;
import java.util.List;

@CrossOrigin(origins="http://localhost:4200")
@RestController
public class ToDoJPAResource {

    @Autowired
    private TodoJpaRepository todoJpaRepository;

    @Autowired
    private CalendarJpaRepository calendarJpaRepository;

    @Autowired
    private ToDoHardcodedService todoService;

    @GetMapping("/jpa/users/{username}/todos")
    public List<Todo> getAllTodos(@PathVariable String username){
        return todoJpaRepository.findByUsername(username);
    }

    @GetMapping("/jpa/users/{username}/todos/{id}")
    public Todo getTodo(@PathVariable String username, @PathVariable long id){
        return todoJpaRepository.findById(id).get();
    }

    //2. Delete atodo for a user
    //DELETE /users/{user_name}/todos/{todo_id}

    @DeleteMapping ("/jpa/users/{username}/todos/{id}")
    public ResponseEntity<Void> deleteTodo(@PathVariable String username, @PathVariable long id){

        //Todo todo=todoService.deleteById(id);
        todoJpaRepository.deleteById(id);
        return ResponseEntity.noContent().build();


    }

    //update
    @PutMapping("/jpa/users/{username}/todos/{id}")
    public ResponseEntity<Todo> updateTodo(@PathVariable String username, @PathVariable long id, @RequestBody Todo todo){
        todo.setUsername(username);
        Todo todoUpdated=todoJpaRepository.save(todo);
        return new ResponseEntity<Todo>(todo, HttpStatus.OK);
    }

    @PostMapping("/jpa/users/{username}/todos")
    public ResponseEntity<Void> createTodo(@PathVariable String username, @RequestBody Todo todo){
        todo.setUsername(username);
        Todo createdTodo = todoJpaRepository.save(todo);
        URI uri= ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}").buildAndExpand(createdTodo.getId()).toUri();
        return ResponseEntity.created(uri).build();
    }


    @Autowired
    private GuestsHardcodedService guestsService;

    @GetMapping("/jpa/users/{username}/calendar")
    public List<GuestsCalendar> getAllGuests(@PathVariable String username){
        return calendarJpaRepository.findByUsername(username);
    }

    @GetMapping("/jpa/users/{username}/calendar/{id}")
    public GuestsCalendar getGuests(@PathVariable String username, @PathVariable long id){
        return calendarJpaRepository.findById(id).get();
    }

//    @DeleteMapping ("/jpa/users/{username}/calendar/{id}")
//    public ResponseEntity<Void> deleteGuest(@PathVariable String username, @PathVariable long id){
//
//        //Todo todo=todoService.deleteById(id);
//        calendarJpaRepository.deleteById(id);
//        return ResponseEntity.noContent().build();
//    }
//
//    @PutMapping("/jpa/users/{username}/calendar/{id}")
//    public ResponseEntity<GuestsCalendar> updateCalendar(@PathVariable String username, @PathVariable long id, @RequestBody GuestsCalendar calendar){
//        calendar.setUsername(username);
//        GuestsCalendar guestUpdated=calendarJpaRepository.save(calendar);
//        return new ResponseEntity<GuestsCalendar>(calendar, HttpStatus.OK);
//    }
//
//    @PostMapping("/jpa/users/{username}/calendar")
//    public ResponseEntity<GuestsCalendar> createGuest(@PathVariable String username, @RequestBody GuestsCalendar calendar){
//        calendar.setUsername(username);
//        GuestsCalendar createdGuest = calendarJpaRepository.save(calendar);
//        URI uri= ServletUriComponentsBuilder.fromCurrentRequest()
//                .path("/{id}").buildAndExpand(createdGuest.getId()).toUri();
//        return ResponseEntity.created(uri).body(createdGuest);
//    }



}
