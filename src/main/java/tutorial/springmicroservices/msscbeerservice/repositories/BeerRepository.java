package tutorial.springmicroservices.msscbeerservice.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import tutorial.springmicroservices.msscbeerservice.domain.Beer;

import java.util.UUID;

/**
 * created by Joseph Yacoub  on 07 Apr 2022
 */

public interface BeerRepository extends PagingAndSortingRepository<Beer, UUID> {
}