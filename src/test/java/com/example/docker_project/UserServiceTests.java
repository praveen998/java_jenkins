package com.example.docker_project;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.Mockito;

public class UserServiceTests {

 
         
    @Mock
    UserRepository userRepository;

    @Test
    void testSaveUser() {
   

    
        
        UserService userservice=new UserService(userRepository);
        User user=new User("praveen");

        //Act
        userservice.saveUser(user);

        //verify that userrepository.save() was called with the expected user
        ArgumentCaptor<User> usercaptor=ArgumentCaptor.forClass(User.class);
      //  Mockito.verify(userRepository).save(usercaptor.capture());

        //assert
        User capturedUser = usercaptor.getValue();
        assertEquals("praveen",capturedUser.getname());



    }

    @Test
    void testGetUserByUsername() {



    }

 
}
