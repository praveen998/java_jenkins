package com.example.docker_project;

public class UserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository)
    {
        this.userRepository=userRepository;
    }
    
    public void saveUser(User user)
    {
        userRepository.save(user);

    }
    
    public User getUserByUsername(String username)
    {
        return userRepository.FindById(username);

    }
}
