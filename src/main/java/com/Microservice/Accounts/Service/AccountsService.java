package com.Microservice.Accounts.Service;

import com.Microservice.Accounts.Dto.AccountsDto;
import com.Microservice.Accounts.Entity.Account;
import com.Microservice.Accounts.Mapper.AccountMapper;
import com.Microservice.Accounts.Repository.AccountsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AccountsService {

    private final AccountsRepository accountRepository;
    private final AccountMapper mapper;

    public List<AccountsDto> getAccounts(Long customerId) {
        List<Account> accounts = accountRepository.findAllByCustomerId(customerId);
        return mapper.mapToAccountsDto(accounts);
    }

    public AccountsDto getAccountForNrb(String nrb) {
        return (AccountsDto) mapper.mapToAccountsDto((List<Account>) accountRepository.findByNrb(nrb));
    }

    public AccountsDto saveAccount(AccountsDto accountDTO) {
        return (AccountsDto) mapper.mapToAccountsDto((List<Account>) accountRepository.save(mapper.mapToAccount(accountDTO)));
    }
}