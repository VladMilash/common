package dto;

import java.time.LocalDateTime;
import java.util.UUID;

public record UserHistoryDTO(
        UUID id,
        LocalDateTime created,
        UUID userId,
        String userType,
        String reason,
        String comment,
        String changedValues
) {}