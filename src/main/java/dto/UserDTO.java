package dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import dto.status.Status;
import dto.status.UserStatus;

import java.time.LocalDateTime;
import java.util.UUID;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public record UserDTO(
        UUID id,
        String secretKey,
        LocalDateTime created,
        LocalDateTime updated,
        String firstName,
        String lastName,
        LocalDateTime verifiedAt,
        LocalDateTime archivedAt,
        UserStatus status,
        Boolean filled,
        UUID addressId
) {}
