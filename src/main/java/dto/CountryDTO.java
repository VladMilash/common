package dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import dto.status.Status;

import java.time.LocalDateTime;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public record CountryDTO(
        Integer id,
        LocalDateTime created,
        LocalDateTime updated,
        String name,
        String alpha2,
        String alpha3,
        Status status
) {}
