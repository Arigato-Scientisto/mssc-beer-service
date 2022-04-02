package tutorial.springmicroservices.msscbeerservice.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

/**
 * created by Joseph Yacoub  on 02 Apr 2022
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeerDto {

    private UUID id;
    private Integer version;
    private String beerName;
    private BeerStyleEnum beerStyle;
    private BigDecimal price;

    private Integer quantityOnHand;
    private Long upc;

    private OffsetDateTime createdDate;
    private OffsetDateTime lastModifiedDate;

}
