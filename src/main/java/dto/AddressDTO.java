package dto;

import java.time.LocalDateTime;
import java.util.UUID;

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
