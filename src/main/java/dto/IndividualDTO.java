package dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import dto.status.Status;

import java.time.LocalDateTime;
import java.util.UUID;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public record IndividualDTO(
        UUID id,
        UUID userId,
        LocalDateTime created,
        LocalDateTime updated,
        String passportNumber,
        String phoneNumber,
        String email,
        LocalDateTime verifiedAt,
        LocalDateTime archivedAt,
        Status status
) {}