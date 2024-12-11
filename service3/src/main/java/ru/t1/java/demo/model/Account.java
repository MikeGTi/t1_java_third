package ru.t1.java.demo.model;

import lombok.*;
import ru.t1.java.demo.model.enums.AccountStatus;
import ru.t1.java.demo.model.enums.AccountType;

import java.math.BigDecimal;
import java.util.UUID;


@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Account {

    private UUID accountUuid;

    private UUID clientUuid;

    private AccountType accountType;

    private AccountStatus status;

    private BigDecimal balance;

    private BigDecimal frozenAmount;
}
