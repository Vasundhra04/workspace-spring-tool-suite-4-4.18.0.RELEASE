package com.example.demo.dao;




import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.Insta;





public interface InstaRepository extends JpaRepository<Insta,Integer> {

	List<Insta> findByUsernameStartingWith(String  prefix);
	List<Insta> findByUsernameEndingWith(String  suffix);
	List<Insta> findByBft(String bft);
	
	
	@Query("select s from Insta s where s.emailid=?1 and s.username=?2" )
	public List<Insta> getInstaByEmailid(String emailid,String username);
	
	@Query("select s from Insta s where s.username=:username")
	public List<Insta> getInstaByUsername(String username);
	
	
	@Modifying
	@Query("delete from Insta s where s.username=?1")
	public int deleteInstaByUserName(String username);
	
	@Modifying
	@Query("update Insta s set s.phno=?1 where s.username=?2")
	public int updateInstaByUsername(int phno,String username);
	
	@Query(value="select * from Insta s where s.phno=?",nativeQuery=true)
	public List<Insta> fetchInstaByPhno(int phno);

}
