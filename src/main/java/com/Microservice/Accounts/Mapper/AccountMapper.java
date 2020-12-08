package com.Microservice.Accounts.Mapper;

import com.Microservice.Accounts.Dto.AccountsDto;
import com.Microservice.Accounts.Entity.Account;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AccountMapper {

    public List<AccountsDto> mapToAccountsDto(List<Account> accounts) {
        return accounts.stream().map(account -> AccountsDto.builder()
                .id(account.getId())
                .nrb(account.getNrb())
                .currency(account.getCurrency())
                .availableFunds(account.getAvailablefunds())
                .build()).collect(Collectors.toList());
    }

    public Account mapToAccount(final AccountsDto accountDTO) {
        return new Account(accountDTO.getId(), accountDTO.getCustomerId(), accountDTO.getNrb(), accountDTO.getCurrency(),
                accountDTO.getAvailableFunds());
    }
}