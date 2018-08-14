/**
 * 
 */
package com.satya.daanee.dbservices.resource;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.satya.daanee.dbservices.entity.User;
import com.satya.daanee.dbservices.repository.UserRepository;

/**
 * @author satyaveer.yadav
 *
 */

@RestController
@RequestMapping("/db")
public class UserDBResource {

	private UserRepository userRepository;

	public UserDBResource(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@GetMapping("/{username}")
	//@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
	public List<User> getUserDetails(@PathVariable("username") final String username) {

		return userRepository.findByUsername(username);
	}

	@PostMapping("/user")
	//@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public List<User> addUserDetails(@RequestBody User user) {
		userRepository.save(user);
		return userRepository.findByUsername(user.getUsername());
	}
	
	@DeleteMapping("/user/delete")
	//@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public List<User> deleteUserDetails(@RequestBody User user) {
		userRepository.delete(user);
		return userRepository.findByUsername(user.getUsername());
	}
	
	@GetMapping("/getuserID/{username}")
	//@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
	public Long getUserId(@PathVariable("username") final String username) {

		return userRepository.findByUsername(username).get(0).getUserid();
	}

}
