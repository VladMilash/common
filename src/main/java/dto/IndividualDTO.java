package dto;

import dto.status.Status;

import java.time.LocalDateTime;
import java.util.UUID;

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