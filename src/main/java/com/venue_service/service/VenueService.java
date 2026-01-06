package com.venue_service.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.venue_service.client.MasterDataClient;
import com.venue_service.dto.VenueRequest;
import com.venue_service.model.Venue;
import com.venue_service.repository.VenueRepository;

@Service
public class VenueService {
	private final VenueRepository venueRepository;
    private final MasterDataClient masterDataClient;
    
    public VenueService(VenueRepository venueRepository, MasterDataClient masterDataClient) {
    	this.venueRepository = venueRepository;
    	this.masterDataClient = masterDataClient;
    }
    public Venue createVenue(VenueRequest request) {
    	if(!masterDataClient.isCityValid(request.getCityId())) {
    		throw new RuntimeException("Inavlid City ID");
    	}
    	Venue venue = Venue.builder()
    			.name(request.getName())
    			.cityId(request.getCityId())
                .address(request.getAddress())
                .capacity(request.getCapacity())
                .pricePerday(request.getPricePerDay())
                .available(true)
                .build();
    	return venueRepository.save(venue);
    }
    public List<Venue> getAvailableVenues(Long cityId) {
    	return venueRepository.findByCityIdAndAvailable(cityId, Boolean.TRUE);
    }

}
