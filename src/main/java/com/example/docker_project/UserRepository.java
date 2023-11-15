package com.example.docker_project;


public interface UserRepository {

        void save(User user);
        User FindById(String username);

    
}
