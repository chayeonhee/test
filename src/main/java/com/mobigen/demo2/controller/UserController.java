package com.mobigen.demo2.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

import com.mobigen.demo2.entity.User;

@RestController
// @RequiredArgsConstructor
@RequestMapping(value = "/users",method = RequestMethod.GET)
public class UserController {
    
    
    @Autowired
    private   UserService userService;
    
    @GetMapping("/hi")
    public String getMethodName() {
        return "HELL";
    }
    @GetMapping("/list")
    public String getMesg() {
        return userService.getMesg();
    }
       
    @GetMapping("/list2")
	public ResponseEntity<Iterable<User>> all(){
        Iterable<User> users = userService.all();
        return ResponseEntity.ok(users);
            
	}

    @GetMapping(value = "/{id}")
	public Optional<User> findOne(@PathVariable Integer id) {
		return userService.findById(id);
	}
    
    // @PostMapping
    // public ResponseEntity<User> createUser(@RequestBody User user) {
    //     User savedUser = userService.saveUser(user);
    //     return new ResponseEntity<>(savedUser, HttpStatus.CREATED);


    // }
	

	//  @Autowired
	// public UserController(UserRepository userRepository){
	// 	this.userRepository = userRepository;
	// }
	// @GetMapping("/user")	
    // public Iterable<User> list() {
    //     return userRepository.findAll();
    // }

    // @PostMapping
    // public User createUser(@RequestBody User user) {
    //     return userRepository.save(user);
    // }
// 	private UserRepository userRep;
	
// 	@Autowired	
// 	public UserController(UserRepository boardRep) {
// 		this.userRep = userRep;
// 	}
	
//     //POST로 유저 추가
// 	@PostMapping
// 	public User put(@RequestParam String name, @RequestParam String email) {
// 		return userRep.save(new User(name, email));
// 	}
	
//     //테이블 리스트 가져오기
// 	@GetMapping
// 	public Iterable<User> list(){
// 		return userRep.findAll();
// 	}
	
//     //id로 테이블 값 가져오기
// 	@GetMapping(value = "/{id}")
// 	public Optional<User> findOne(@PathVariable Long id) {
// 		return userRep.findById(id);
// 	}
	
//     //id로 테이블 값 수정
// 	@PutMapping(value = "/{id}")
// 	public User update(@PathVariable Long id, @RequestParam String name, @RequestParam String email) {
// 		Optional<User> user = userRep.findById(id);
// 		user.get().setName(name);
// 		user.get().setEmail(email);
// 		return userRep.save(user.get());
// 	}
	
//     //id로 테이블 값 삭제
// 	@DeleteMapping
// 	public void delete(@RequestParam Long id) {
// 		userRep.deleteById(id);
// 	}
// }
// @RestController
// @RequestMapping("/users")
// public class UserController {

//     @Autowired
//     private UserRepository userRepository;

//     @PostMapping
//     public User createUser(@RequestBody User user) {
//         return userRepository.save(user);
//     }
}
