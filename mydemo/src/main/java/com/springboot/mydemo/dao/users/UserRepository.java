package com.springboot.mydemo.dao.users;



import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.springboot.mydemo.model.users.Users;
@Repository
public interface UserRepository extends JpaRepository<Users, Long>  {

	public Users findByEmailIdIgnoreCase(String emailId);
	public Users findByUserNameIgnoreCase(String userName);
	public Users findById(long id);

	
	
//	@Modifying
//    @Transactional
//	@Query("update Users u set u.isDeleted=true where u.userName=:userName")
//	public void deleteUser(@Param("userName") String userName);
//	
//	public Users findByUserNameAndPassword(String userName,String password);
}