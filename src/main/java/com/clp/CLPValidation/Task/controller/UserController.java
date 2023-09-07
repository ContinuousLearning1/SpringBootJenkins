package com.clp.CLPValidation.Task.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.clp.CLPValidation.Task.dto.UserDTO;
import com.clp.CLPValidation.Task.entity.UserEntity;
import com.clp.CLPValidation.Task.exception.UserNotFoundException;
import com.clp.CLPValidation.Task.service.UserService;

import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping("/addUser")
	public ResponseEntity<UserEntity> createUser(@RequestBody @Valid UserDTO userDto) {
		log.info("UseController::cerateUser is started");
		return new ResponseEntity<UserEntity>(userService.createUser(userDto), HttpStatus.CREATED);

	}

	@GetMapping("/fetchAll")
	public ResponseEntity<List<UserEntity>> getAllUsers() {
		log.info("UserController::GetAllUser data");
		return new ResponseEntity<List<UserEntity>>(userService.getAllUsers(), HttpStatus.OK);
	}

	@GetMapping("user/{id}")
	public ResponseEntity<UserEntity> getUser(@PathVariable long id) throws UserNotFoundException {
		log.info("UserController::getUser data");
		return new ResponseEntity<UserEntity>(userService.getUser(id), HttpStatus.OK);
	}
	
	@PutMapping("/update/{}")
	public ResponseEntity<UserEntity> updateUser(@PathVariable long id, @RequestBody UserEntity user) throws UserNotFoundException{
		log.info("UserController::updateUser data");
		return new ResponseEntity<UserEntity>(userService.updateUser(user, id),HttpStatus.CREATED);
	}
	
	@GetMapping("/count")
	public long getCount() {
		log.info("UserController::getCount data");
		return userService.getCount();
	}
	
	@GetMapping("email/{email}")
	public ResponseEntity<UserEntity>getEame(@PathVariable String email) {
		log.info("UserController::getEmail data");
		return new ResponseEntity<UserEntity>(userService.getEame(email), HttpStatus.OK);
	}
}
