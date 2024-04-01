package jp.fong.demo.restapi.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import jp.fong.demo.restapi.service.UserService;

@RestController
@RequestMapping(path="/user")
public class RestapiUserController {
	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();
	
    @GetMapping("/query")
    public UserService query(@RequestParam(value = "name", defaultValue = "World") String name) {
    	String loginId = "testId";
    	String loginPw= "testPw";; 
    	String email= "test@mail.com";;
    	
    	return new UserService(counter.incrementAndGet(), String.format(template, name), loginId,loginPw,email);
    }

	@GetMapping("/register")
    public String register(@RequestParam(value = "name", defaultValue = "World") String name) {
      return String.format("reg %s!", name);
    }
    
    @GetMapping("/login")
    public String login(@RequestParam(value = "name", defaultValue = "World") String name) {
      return String.format("reg %s!", name);
    }
    
    @GetMapping("/modify")
    public String modify(@RequestParam(value = "name", defaultValue = "World") String name) {
      return String.format("reg %s!", name);
    }
    
    
}
