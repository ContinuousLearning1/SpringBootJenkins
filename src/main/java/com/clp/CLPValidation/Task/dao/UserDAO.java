package com.clp.CLPValidation.Task.dao;

import java.lang.StackWalker.Option;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.clp.CLPValidation.Task.dto.UserDTO;
import com.clp.CLPValidation.Task.entity.UserEntity;
@Repository
public interface UserDAO extends JpaRepository<UserEntity, Long> {

   Optional<UserEntity> findByEmail(String email);

}
