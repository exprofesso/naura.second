package com.naera.second.controller;

import com.naera.second.model.User;
import com.naera.second.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

//@RestController
@Controller
public class UserController {
    //        private final UserService userService;
//
//    @Autowired
//    public UserController(UserService userService) {
//        this.userService = userService;
//    }
//
//    // добавить пользователя
//    @PostMapping(value = "/registration")
//    public ResponseEntity<?> create(@RequestBody User user) {
//        userService.create(user);
//        return new ResponseEntity<>(HttpStatus.CREATED);
//    }
//
//    // вывести всех
//    @GetMapping(value = "/users")
//    public ResponseEntity<List<User>> read() {
//        final List<User> users = userService.readAll();
//        return users != null && !users.isEmpty()
//                ? new ResponseEntity<>(users, HttpStatus.OK)
//                : new ResponseEntity<>(users, HttpStatus.NOT_FOUND);
//    }
//
//    // вывести одного
//    @GetMapping(value = "/users/{id}")
//    public ResponseEntity<User> read(@PathVariable(name = "id") int id) {
//        final User user = userService.read(id);
//        return user != null
//                ? new ResponseEntity<>(user, HttpStatus.OK)
//                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
//    }
//
//    // Update
//    @PutMapping(value = "/users/{id}")
//    public ResponseEntity<?> update(@PathVariable(name = "id") int id, @RequestBody User user) {
//        final boolean updated = userService.update(user, id);
//
//        return updated
//                ? new ResponseEntity<>(HttpStatus.OK)
//                : new ResponseEntity<>(HttpStatus.NOT_MODIFIED);
//    }
//
//    // Удаление
//    @DeleteMapping(value = "/users/{id}")
//    public ResponseEntity<?> delete(@PathVariable(name = "id") int id) {
//        final boolean deleted = userService.delete(id);
//
//        return deleted
//                ? new ResponseEntity<>(HttpStatus.OK)
//                : new ResponseEntity<>(HttpStatus.NOT_MODIFIED);
//    }
//    @Autowired
//    UserService userService;
//
//    @RequestMapping(value = "/users/{id}", method = RequestMethod.GET)
//    public @ResponseBody
//    Optional<User> getAllUsers(@PathVariable Integer id) {
//        return userService.getById(id);
//    }
//
//    @RequestMapping(value = "/users/{name}", method = RequestMethod.GET)
//    public List<User> getUserByName(@PathVariable String name) {
//        return userService.findByName(name);
//    }
//
//    @RequestMapping(value = "/users", method = RequestMethod.GET)
//    public List<User> getAll() {
//        return userService.getAllUser();
//    }
//
//    @RequestMapping(value = "/users/{id}", method = RequestMethod.DELETE)
//    public HttpStatus deleteUsers(@PathVariable Integer id) {
//        userService.deleteUser(id);
//        return HttpStatus.NO_CONTENT;
//    }
//
//    @RequestMapping(value = "/registration", method = RequestMethod.POST)
//    public HttpStatus insertUsers(@RequestBody User user) {
//        return userService.addUser(user) ? HttpStatus.CREATED : HttpStatus.BAD_REQUEST;
//    }
//
//    // пока не знаю как
//    @RequestMapping(value = "/login", method = RequestMethod.GET)
//    public String login() {
//        return "Login";
//    }
//
//
//    @RequestMapping(value = "/users", method = RequestMethod.PUT)
//    public HttpStatus updateUsers(@RequestBody User user) {
//        return userService.updateUser(user) ? HttpStatus.ACCEPTED : HttpStatus.BAD_REQUEST;
//    }
    private UserService userService;

    @RequestMapping(value = {"/", "/login"}, method = RequestMethod.GET)
    public ModelAndView login() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("login");
        return modelAndView;
    }

    @RequestMapping(value = "/registration", method = RequestMethod.GET)
    public ModelAndView registration() {
        ModelAndView modelAndView = new ModelAndView();
        User user = new User();
        modelAndView.addObject("user", user);
        modelAndView.setViewName("registration");
        return modelAndView;
    }
}
