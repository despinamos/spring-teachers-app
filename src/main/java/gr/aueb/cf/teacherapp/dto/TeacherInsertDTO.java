package gr.aueb.cf.teacherapp.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class TeacherInsertDTO {

    @NotNull(message = "Name cannot be null")
    @Size(min = 2, message = "Name must contain at least 2 characters.")
    private String firstname;

    @NotNull(message = "Lastname cannot be null")
    @Size(min = 2, message = "Lastname must contain at least 2 characters.")
    private String lastname;

    @Pattern(regexp = "\\d{9,}", message = "Vat cannot be less than 9 digits.")
    private String vat;
    private Long regionId;
}