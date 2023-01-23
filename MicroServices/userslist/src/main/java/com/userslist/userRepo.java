
package com.userslist;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.userslist.userDetails;


@Repository
public interface userRepo extends JpaRepository<userDetails, Long> {

	

}
