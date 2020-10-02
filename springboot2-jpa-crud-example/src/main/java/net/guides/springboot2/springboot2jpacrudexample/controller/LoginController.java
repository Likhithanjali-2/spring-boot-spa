package net.guides.springboot2.springboot2jpacrudexample.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.guides.springboot2.springboot2jpacrudexample.model.User;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1")
public class LoginController {
	@RequestMapping("/login")
    public boolean login(@RequestBody User user) {
        return user.getEmailId().equals("user") && user.getPassword().equals("password");
    }
}
//booking:
//date
//experts dropdown
//availa slots dropdown

//booking status form:aproove or not (booking id)

//when user login successfull then link redirected to the user page
//when admin login successfull then link redirected to the admin page
//user page has options Book slot and Booking status