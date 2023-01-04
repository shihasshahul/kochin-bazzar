package com.userrepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.userdetails.UserDetails;

@Repository

public interface UserRepo extends JpaRepository<UserDetails , Long> {

}
