package com.adsdetails;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface adsRepo extends JpaRepository<adsDetails, Long> {

}
