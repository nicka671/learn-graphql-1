package com.learn.graphql.respository;

import com.learn.graphql.domain.bank.BankAccount;
import com.learn.graphql.domain.bank.Currency;
import org.springframework.stereotype.Component;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.UUID.fromString;

@Component
public class BankAccountRepository {

  private final List<BankAccount> bankAccounts = List.of(
      BankAccount.builder()
          .id(fromString("c6aa269a-812b-49d5-b178-a739a1ed74cc"))
          .currency(Currency.USD)
          .build(),
      BankAccount.builder()
          .id(fromString("410f5919-e50b-4790-aae3-65d2d4b21c77"))
          .currency(Currency.RUB)
          .build(),
      BankAccount.builder()
          .id(fromString("024bb503-5c0f-4d60-aa44-db19d87042f4"))
          .currency(Currency.RUB)
          .build(),
      BankAccount.builder()
          .id(fromString("48e4a484-af2c-4366-8cd4-25330597473f"))
          .currency(Currency.USD)
          .build()
  ).stream()
      .sorted(Comparator.comparing(BankAccount::getId))
      .collect(Collectors.toUnmodifiableList());

  public List<BankAccount> getBankAccounts() {
    return bankAccounts;
  }


}
