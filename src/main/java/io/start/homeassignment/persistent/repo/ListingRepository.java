package io.start.homeassignment.persistent.repo;

import io.start.homeassignment.persistent.entity.Listing;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ListingRepository extends CrudRepository<Listing, Long> {
    List<Listing> findByPriceBetweenAndMinCpmBetween(Double minPrice,Double maxPrice,Double minMinCpm,Double maxMinCpm);
}
