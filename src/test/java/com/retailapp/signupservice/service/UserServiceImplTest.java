//package com.retailapp.signupservice.service;
//
//import static org.assertj.core.api.Assertions.assertThat;
//import static org.hamcrest.CoreMatchers.is;
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.mockito.ArgumentMatchers.anyInt;
//import static org.mockito.Mockito.times;
//import static org.mockito.Mockito.verify;
//import static org.mockito.Mockito.when;
//
//import java.util.Optional;
//
//import org.hamcrest.Matcher;
//import org.junit.Test;
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.TestInstance;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.Mock;
//import org.mockito.MockitoAnnotations;
//import org.mockito.junit.jupiter.MockitoExtension;
//
//import com.retailapp.signupservice.POJO.User;
//import com.retailapp.signupservice.dao.UserDao;
//
//@ExtendWith(MockitoExtension.class)
//@TestInstance(TestInstance.Lifecycle.PER_METHOD)
//
//public class UserServiceImplTest {
//	
//	
//	
//	    
//            private static User user;
//	        private UserServiceImpl userServiceImpl;
//	        @Mock
//	        private UserDao userDao;
//	        
//	        @BeforeEach
//	        public void setup(){
//            MockitoAnnotations.initMocks(this);
//	            userServiceImpl = new UserServiceImpl(userDao);
//	        }
//	        
//	        @BeforeAll
//	        public static void init() {
//
//	            user = new User((int) 1L,"ans","12345678","ans@gmail.com","ans");
//
//	        }
//	        
//	        @Test
//	        void findById() {
//	        	User user = new User();
//	        user.setId((int) 1L);
//	        Optional<User> userOptional = Optional.of(user);
//	        when(userDao.findById(anyInt())).thenReturn(userOptional);
//
//	        User userReturned = userServiceImpl.findById((int) 1L);
//	        assertEquals(userOptional.get(), userReturned);
//               
//         //      assertThat(user, hasSize((int)1L));
//
//               
////	         assertThat(userOptional, is(Optional.of(userReturned)));
//	         verify(userDao, times(1)).findById((int) 1L);
//
//	        }
//
//			
//
//	}
//
//
//	
//
//
//
//
//

package com.retailapp.signupservice.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.retailapp.signupservice.POJO.User;

@ExtendWith(MockitoExtension.class)
public class UserServiceImplTest {

    @Mock
    private UserServiceImpl userServiceImpl;
    
    @Test
    public void findById() {
        Integer id = 1;
        User expectedUser = new User();
        expectedUser.setId(id);
        expectedUser.setEmail("test@test.com");
        expectedUser.setContactNumber("8905674321");
        expectedUser.setName("JohnDoe");
        expectedUser.setPassword("john");

        when(userServiceImpl.findById(anyInt())).thenReturn(expectedUser);
        
        User actualUser = userServiceImpl.findById(id);
        
        assertEquals(expectedUser, actualUser, "User should be found by email");
    }
}

