/**
 * 
 */
package com.satya.daanee.dbservices.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.satya.daanee.dbservices.entity.User;

/**
 * @author satyaveer.yadav
 *
 */
public interface UserRepository extends JpaRepository<User, Long>{

	List<User> findByUsername(String username);

}
