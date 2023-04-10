//package com.chrysa.rest.webservices.restfulwebservices.todo;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.web.bind.annotation.*;
//import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
//
//import java.net.URI;
//import java.time.LocalDateTime;
//import java.time.format.DateTimeFormatter;
//import java.util.List;
//import java.util.Map;
//
//@CrossOrigin(origins="http://localhost:4200")
//@RestController
//public class ToDoResource {
//
//    @Autowired
//    private ToDoHardcodedService todoService;
//
//    @GetMapping("/users/{username}/todos")
//    public List<Todo> getAllTodos(@PathVariable String username){
//        return todoService.findAll();
//    }
//
//    @GetMapping("/users/{username}/todos/{id}")
//    public Todo getTodo(@PathVariable String username, @PathVariable long id){
//
//        return todoService.findById(id);
//    }
//
//    //2. Delete atodo for a user
//    //DELETE /users/{user_name}/todos/{todo_id}
//
//    @DeleteMapping ("/users/{username}/todos/{id}")
//    public ResponseEntity<Void> deleteTodo(@PathVariable String username, @PathVariable long id){
//
//        Todo todo=todoService.deleteById(id);
//        if (todo!=null){
//            return ResponseEntity.noContent().build();
//        }
//        return ResponseEntity.notFound().build();
//
//    }
//
//    //update
//    @PutMapping("/users/{username}/todos/{id}")
//    public ResponseEntity<Todo> updateTodo(@PathVariable String username, @PathVariable long id, @RequestBody Todo todo){
//        Todo todoUpdated=todoService.save(todo);
//        return new ResponseEntity<Todo>(todo, HttpStatus.OK);
//    }
//
//    @PostMapping("/users/{username}/todos")
//    public ResponseEntity<Void> updateTodo(@PathVariable String username, @RequestBody Todo todo){
//        Todo createdTodo = todoService.save(todo);
//        //Location
//        //get current resource uri
//        //{id}
//        URI uri= ServletUriComponentsBuilder.fromCurrentRequestUri()
//                .path("/{id}").buildAndExpand(createdTodo.getId()).toUri();
//        return ResponseEntity.created(uri).build();
//
//    }
//
//
//    @Autowired
//    private GuestsHardcodedService guestsService;
//
//    @GetMapping("/users/{username}/calendar")
//    public List<GuestsCalendar> getAllGuests(){
//        List<GuestsCalendar> events = guestsService.findAllGuests();
////        events.forEach(event -> {
////            event.setFirstDay(LocalDateTime.parse(event.getFirstDay().format(DateTimeFormatter.ISO_DATE_TIME)));
////            event.setLastDay(LocalDateTime.parse(event.getLastDay().format(DateTimeFormatter.ISO_DATE_TIME)));
////        });
//        return events;
//    }
//
//
//}
