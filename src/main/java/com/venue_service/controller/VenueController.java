package com.venue_service.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.venue_service.dto.VenueRequest;
import com.venue_service.model.Venue;
import com.venue_service.service.VenueService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/venues")
public class VenueController {
	
	
	private final VenueService venueService;
	public VenueController(VenueService venueService) {
		this.venueService = venueService;
	}
	
	
	@PostMapping
	public ResponseEntity<Venue> createVenue(@Valid @RequestBody VenueRequest request){
		return ResponseEntity.ok(venueService.createVenue(request));	
	}
	
	@GetMapping("/available/{cityId}")
	public ResponseEntity<List<Venue>> getAvailableVenues(
            @PathVariable Long cityId) {
        return ResponseEntity.ok(venueService.getAvailableVenues(cityId));
    }
	

}
