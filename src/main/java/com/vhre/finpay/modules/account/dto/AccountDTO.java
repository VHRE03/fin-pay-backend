package com.vhre.finpay.modules.account.dto;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.vhre.base.core.base.dto.BaseDTO;
import com.vhre.base.core.base.dto.RelationId;
import com.vhre.finpay.modules.customer.entity.Customer;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.UUID;

@Getter
@Setter
@Schema(description = "Data Transfer Object representing an Account (bank account of a Customer)")
@JsonPropertyOrder({"id", "accountNumber", "customerId", "balance", "currency", "createdAt", "updatedAt", "deleted"})
public class AccountDTO extends BaseDTO {

    @Schema(description = "Numero de cuenta (unico en el sistema).", example = "ACC-0001-987654")
    @NotBlank
    @Size(max = 20)
    private String accountNumber;

    @Schema(description = "Identificador (UUID) del cliente propietario de la cuenta.", example = "123e4567-e89b-12d3-a456-426614174000")
    @NotNull
    @RelationId(target = Customer.class)
    private UUID customerId;

    @Schema(description = "Saldo actual de la cuenta.", example = "1500.00")
    @NotNull
    @DecimalMin(value = "0.0")
    @Digits(integer = 19, fraction = 2)
    private BigDecimal balance;

    @Schema(description = "Codigo ISO 4217 de la moneda de la cuenta (3 letras mayusculas).", example = "MXN")
    @NotBlank
    @Pattern(regexp = "^[A-Z]{3}$", message = "must be a valid ISO 4217 currency code (3 uppercase letters)")
    @Size(max = 3)
    private String currency;
}
