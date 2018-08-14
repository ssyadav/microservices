/**
 * 
 */
package com.satya.daanee.admin.adminservices.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author satyaveer.yadav
 *
 */

@RestController
@RequestMapping("/admin")
public class AdminResource {
	
	@Autowired
    RestTemplate restTemplate;

    @GetMapping("/{username}")
    public String getUser(@PathVariable("username") final String userName) {

        Long userResponse =  restTemplate.getForObject("http://db-services/db/getuserID/" + userName, Long.class);
        return userResponse.toString();
    }

}
