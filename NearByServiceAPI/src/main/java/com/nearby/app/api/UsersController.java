package com.nearby.app.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.nearby.app.models.User;
import com.nearby.app.services.UserService;

@RestController
@RequestMapping(value = "api/user")
public class UsersController {

	@Autowired
    private UserService userService;

	@RequestMapping(value="/list", method=RequestMethod.GET)
	@ResponseBody
	public String listUsers(){
		return "Users";
	}

	@RequestMapping(value = "/echo/{in}", method = RequestMethod.GET)
    public String echo(@PathVariable(value = "in") final String in) {
        return "You said: " + in;
    }

	@RequestMapping(value="/users", method=RequestMethod.GET)
	public ResponseEntity<?> getUsers(){

		List<User> users = userService.findAllUser();

		if(users == null ){
			return(new ResponseEntity<>(HttpStatus.NOT_FOUND));
		}
		return(new ResponseEntity<>(users, HttpStatus.OK));
	}

	@RequestMapping(value="/add", method=RequestMethod.POST)
	public ResponseEntity<?> addUser(@RequestBody User model){

		User user = userService.save(model);

		if(user == null ){
			return(new ResponseEntity<>(HttpStatus.NOT_FOUND));
		}
		return(new ResponseEntity<>(user, HttpStatus.OK));
	}

}
