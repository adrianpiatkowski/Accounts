package com.Microservice.Accounts.Dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AccountsDto {
    private long id;
    private String nrb;
    private String currency;
    private BigDecimal availableFunds;
}