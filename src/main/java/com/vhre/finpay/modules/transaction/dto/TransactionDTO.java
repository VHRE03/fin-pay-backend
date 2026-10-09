package com.vhre.finpay.modules.transaction.dto;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.vhre.base.core.base.dto.BaseDTO;
import com.vhre.base.core.base.dto.RelationId;
import com.vhre.finpay.modules.account.entity.Account;
import com.vhre.finpay.modules.transaction.entity.TransactionStatus;
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
@Schema(description = "Data Transfer Object representing a Transaction (transfer between two Accounts)")
@JsonPropertyOrder({"id", "transactionId", "sourceAccountId", "targetAccountId", "amount", "currency", "status", "description", "createdAt", "updatedAt", "deleted"})
public class TransactionDTO extends BaseDTO {

    @Schema(description = "Identificador externo/legible de la transaccion (unico en el sistema).", example = "TXN-2026-000123")
    @NotBlank
    @Size(max = 50)
    private String transactionId;

    @Schema(description = "Identificador (UUID) de la cuenta de origen.", example = "123e4567-e89b-12d3-a456-426614174000")
    @NotNull
    @RelationId(target = Account.class)
    private UUID sourceAccountId;

    @Schema(description = "Identificador (UUID) de la cuenta de destino.", example = "123e4567-e89b-12d3-a456-426614174999")
    @NotNull
    @RelationId(target = Account.class)
    private UUID targetAccountId;

    @Schema(description = "Monto de la transaccion.", example = "250.00")
    @NotNull
    @DecimalMin(value = "0.0")
    @Digits(integer = 19, fraction = 2)
    private BigDecimal amount;

    @Schema(description = "Codigo ISO 4217 de la moneda de la transaccion (3 letras mayusculas).", example = "MXN")
    @NotBlank
    @Pattern(regexp = "^[A-Z]{3}$", message = "must be a valid ISO 4217 currency code (3 uppercase letters)")
    @Size(max = 3)
    private String currency;

    @Schema(description = "Estado de la transaccion (PENDING, COMPLETED, FAILED o REVERSED).", example = "PENDING")
    @NotNull
    private TransactionStatus status;

    @Schema(description = "Descripcion opcional de la transaccion.", example = "Pago de servicios")
    @Size(max = 1000)
    private String description;
}
