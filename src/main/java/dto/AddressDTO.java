package dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import java.time.LocalDateTime;
import java.util.UUID;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public record AddressDTO(
        UUID id,
        LocalDateTime created,
        LocalDateTime updated,
        Integer countryId,
        String address,
        String zipCode,
        LocalDateTime archived,
        String city,
        String state
) {}
