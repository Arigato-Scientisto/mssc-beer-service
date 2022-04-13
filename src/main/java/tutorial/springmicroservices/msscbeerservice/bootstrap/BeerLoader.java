package tutorial.springmicroservices.msscbeerservice.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import tutorial.springmicroservices.msscbeerservice.domain.Beer;
import tutorial.springmicroservices.msscbeerservice.repositories.BeerRepository;

import java.math.BigDecimal;

/**
 * created by Joseph Yacoub  on 07 Apr 2022
 */
@Component
public class BeerLoader implements CommandLineRunner {

    private final BeerRepository beerRepository;

    public BeerLoader(BeerRepository beerRepository){
        this.beerRepository = beerRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        loadBeerObjects();
    }

    private void loadBeerObjects() {
        if(beerRepository.count()==0){
            beerRepository.save(Beer.builder()
                    .beerName("Rothaus")
                    .beerStyle("pils")
                            .minOnHand(30)
                    .quantityToBrew(400)
                    .upc(72527273070L)
                    .price(new BigDecimal("1.59"))
                    .build());

            beerRepository.save(Beer.builder()
                    .beerName("Eichbaum")
                    .beerStyle("pils")
                    .minOnHand(30)
                    .quantityToBrew(400)
                    .upc(72527273090L)
                    .price(new BigDecimal("0.59"))
                    .build());

            beerRepository.save(Beer.builder()
                    .beerName("Pilsner")
                    .beerStyle("pils")
                    .minOnHand(30)
                    .quantityToBrew(400)
                    .upc(72527273230L)
                    .price(new BigDecimal("1.2"))
                    .build());
        }
    }
}
