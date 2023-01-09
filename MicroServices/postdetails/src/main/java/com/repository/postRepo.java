package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.postdetails.postDetails;
@Repository
public interface postRepo extends JpaRepository<postDetails, Long> {

}
