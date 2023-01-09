package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.adsdetails.adsDetails;

@Repository
public interface adsRepo extends JpaRepository<adsDetails, Long> {

}
