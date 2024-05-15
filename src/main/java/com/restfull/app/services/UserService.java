package com.restfull.app.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restfull.app.models.User;
import com.restfull.app.repository.UserRepository;

@Service
public class UserService {
  @Autowired
  private UserRepository userRepository;

  public List<User> getAllUsers() {
    return userRepository.findAll();
  }

  public Optional<User> getUserById(Long id) {
    return userRepository.findById(id);
  }

  public User createUser(User user) {
    return userRepository.save(user);
  }

  public User updateUser(Long id, User newUser) {
    return userRepository.findById(id)
        .map(user -> {
          user.setName(newUser.getName());
          user.setCpf(newUser.getCpf());
          user.setPassword(newUser.getPassword());
          return userRepository.save(user);
        })
        .orElseThrow(() -> new RuntimeException(String.format("Usuario com id:%d não existe ", id)));
  }

  public void deleteUser(Long id) {
    userRepository.deleteById(id);
  }

}
