package br.com.natan.learningspringv2.services;

import br.com.natan.learningspringv2.models.UserModel;
import br.com.natan.learningspringv2.repositories.TaskRepository;
import br.com.natan.learningspringv2.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private TaskRepository taskRepository;

    public UserModel findById(Long id) {
        Optional<UserModel> user = this.userRepository.findById(id);
        return user.orElseThrow(() -> new RuntimeException());
    }

}
