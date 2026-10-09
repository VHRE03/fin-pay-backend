package com.vhre.finpay.modules.customer.dto;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.vhre.base.core.base.dto.BaseDTO;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Schema(description = "Data Transfer Object representing a Customer of Fin Pay")
@JsonPropertyOrder({"id", "fullName", "email", "createdAt", "updatedAt", "deleted"})
public class CustomerDTO extends BaseDTO {

    @Schema(description = "Nombre completo del cliente.", example = "Maria Fernanda Lopez")
    @NotBlank
    @Size(max = 255)
    private String fullName;

    @Schema(description = "Correo electronico del cliente (unico en el sistema).", example = "maria.lopez@example.com")
    @NotBlank
    @Email
    @Size(max = 255)
    private String email;
}
