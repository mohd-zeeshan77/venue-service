package com.venue_service.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.venue_service.model.Venue;

public interface VenueRepository  extends JpaRepository<Venue, Long>{
	List<Venue> findByCityIdAndAvailable(Long cityId, Boolean available);
	

}
