package dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public record RegistrationRequestDTO(
        String firstName,
        String lastName,
        String country,
        String address,
        String zipCode,
        String city,
        String state,
        String passportNumber,
        String phoneNumber,
        String email,
        String password,
        String confirmPassword
) {}
