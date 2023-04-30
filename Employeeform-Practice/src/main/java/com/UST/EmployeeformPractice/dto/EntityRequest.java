package com.UST.EmployeeformPractice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EntityRequest {

    @NotNull(message = "id should not be null")
    private Long id;
    @NotBlank(message = "name required")
    private String name;
    @Min(24)
    @Max(42)
    private int age;
    @Pattern(regexp = "^\\d{10}", message = "invalid")
    private String designation;

}
