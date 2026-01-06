package com.venue_service.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;
@FeignClient(name = "master-data-service")
public interface MasterDataClient {
	@GetMapping("/master/cities/{id}/exists")
	Boolean isCityValid(@PathVariable("id") Long cityId);
}
