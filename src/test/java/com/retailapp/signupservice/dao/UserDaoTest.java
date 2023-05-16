package com.retailapp.signupservice.dao;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.retailapp.signupservice.POJO.User;

@ExtendWith(MockitoExtension.class)
public class UserDaoTest {

    @Mock
    private UserDao userDao;
    
    @Test
    public void testFindByEmailId() {
        String email = "test@test.com";
        User expectedUser = new User();
        expectedUser.setId(1);
        expectedUser.setEmail(email);
        expectedUser.setContactNumber("8905674321");
        expectedUser.setName("John");
        expectedUser.setName("Doe");
        expectedUser.setPassword("john");

        when(userDao.findByEmailId(anyString())).thenReturn(expectedUser);
        
        User actualUser = userDao.findByEmailId(email);
        
        assertThat(actualUser.getEmail()).isEqualTo(expectedUser.getEmail());
    }
}
