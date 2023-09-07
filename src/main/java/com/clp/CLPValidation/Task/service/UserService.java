package com.clp.CLPValidation.Task.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.clp.CLPValidation.Task.dao.UserDAO;
import com.clp.CLPValidation.Task.dto.UserDTO;
import com.clp.CLPValidation.Task.entity.UserEntity;
import com.clp.CLPValidation.Task.exception.UserNotFoundException;

@Service
public class UserService {

	@Autowired
	private UserDAO userRepository;

	public UserEntity createUser(UserDTO userDto) {
		UserEntity user = UserEntity.biuld(0, userDto.getName(), userDto.getEmail(), userDto.getContact());
		return userRepository.save(user);
	}

	public List<UserEntity> getAllUsers() {
		return userRepository.findAll();
	}

	public UserEntity getUser(long id) throws UserNotFoundException {
		UserEntity user= userRepository.findById(id).get();
		
		if(user!=null) {
			return user;
		}
		else {
			throw new UserNotFoundException("User not found with Id"+id);
		}
	}
	
	public UserEntity updateUser(UserEntity user, long id) throws UserNotFoundException{
		UserEntity updateUser=userRepository.findById(id).orElse(null);
		if(updateUser!=null) {
			updateUser.setName(user.getName());
			updateUser.setEmail(user.getEmail());
			updateUser.setContact(user.getContact());
			
			return userRepository.save(updateUser);
		}
		else {
			throw new UserNotFoundException("User Not exixt with id"+id);
		}
	}

	public long getCount() {
		
		return userRepository.count();
	}

	public UserEntity getEame(String email) {
		Optional<UserEntity> data=userRepository.findByEmail(email);
		if(data.isEmpty()) {
			UserEntity da=data.get();
		}
		
		return null;
		
	}
	
	

}
