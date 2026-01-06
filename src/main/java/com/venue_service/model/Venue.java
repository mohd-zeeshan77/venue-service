package com.venue_service.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "venues")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Venue {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	private String name;
	private Long cityId;
	private String address;
	private Integer capacity;
	private Double pricePerday;
	@Column(nullable = false)
	private Boolean available;
	@PrePersist
    public void setDefaultAvailability() {
        if (available == null) {
            available = true;
        }
    }
	
}
