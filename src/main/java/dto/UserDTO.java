package dto;

import dto.status.Status;

import java.time.LocalDateTime;
import java.util.UUID;

public record UserDTO(
        UUID id,
        String secretKey,
        LocalDateTime created,
        LocalDateTime updated,
        String firstName,
        String lastName,
        LocalDateTime verifiedAt,
        LocalDateTime archivedAt,
        Status status,
        Boolean filled,
        UUID addressId
) {}
