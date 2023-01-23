package com.postdetails;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface favouritesRepo extends JpaRepository<favouritesDetails, Long> {

}
