package hr.xmjosic.studentdemoapp.dto;

import javax.validation.constraints.NotBlank;

public record NewStudent(
        @NotBlank(message = "First name must not be null.") String firstName,
        @NotBlank(message = "Last name must not be null.") String lastName,
        String gender
) {}
