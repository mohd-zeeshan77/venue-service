package com.venue_service.dto;

import jakarta.validation.constraints.*;
import lombok.*;

@Getter
@Setter
public class VenueRequest {
	@NotBlank
	private String name;
	@NotNull
	private Long cityId;
	@NotBlank
	private String address;
	@Min(50)
	private Integer capacity;
	@Positive
	private Double pricePerDay;
	
	
	
}
