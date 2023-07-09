package com.learn.graphql.resolver;

import com.learn.graphql.domain.bank.BankAccount;
import graphql.kickstart.tools.GraphQLQueryResolver;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.UUID;

import static com.learn.graphql.domain.bank.Currency.USD;

@Slf4j
@Component
@RequiredArgsConstructor
public class BankAccountResolver implements GraphQLQueryResolver {
    public BankAccount bankAccount(UUID id)
    {
        log.info("Bank account");
        return BankAccount.builder().id(id).currency(USD).name("Nika").build();

    }
}
