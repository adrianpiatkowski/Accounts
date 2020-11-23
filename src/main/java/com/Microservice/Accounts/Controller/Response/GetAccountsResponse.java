package com.Microservice.Accounts.Controller.Response;

import com.Microservice.Accounts.Dto.AccountsDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor(staticName = "of")
@NoArgsConstructor
public class GetAccountsResponse {
    private List<AccountsDto> accounts;
}
