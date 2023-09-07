package com.clp.CLPValidation.Task.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor(staticName = "biuld")
@NoArgsConstructor
public class UserDTO {
	@NotBlank(message = "Name should not be null or empty")
	private String name;
	@Email(message = "email should be mandatory")
	private String email;
	@NotBlank
	@Pattern(regexp = "^\\d{10}$",message="Invallid contact number")
	private String contact;
}
