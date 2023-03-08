package io.start.homeassignment.controller;

import io.start.homeassignment.persistent.entity.Listing;
import io.start.homeassignment.persistent.repo.ListingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ListingController {


    @Autowired// i know its bad
    ListingRepository listingRepository;

    @GetMapping("/listings")
    public List<Listing> getListings(@RequestParam("min_price") Double minPrice,
                                     @RequestParam("max_price") Double maxPrice,
                                     @RequestParam("min_min_cpm")  Double minMinCpm,
                                     @RequestParam("max_min_cpm") Double maxMinCpm) {

        return listingRepository.findByPriceBetweenAndMinCpmBetween(minPrice,maxPrice,minMinCpm,maxMinCpm);
    }


}
