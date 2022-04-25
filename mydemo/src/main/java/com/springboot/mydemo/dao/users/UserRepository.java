package com.springboot.mydemo.dao.users;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.springboot.mydemo.model.users.Users;
@Repository
public interface UserRepository extends JpaRepository<Users, Integer>  {

	public Users findByUserNameIgnoreCase(String userName);
	
	@Modifying
    @Transactional
	@Query("update Users u set u.isDeleted=true where u.userName=:userName")
	public void deleteUser(@Param("userName") String userName);
	
	public Users findByUserNameAndPassword(String userName,String password);
}