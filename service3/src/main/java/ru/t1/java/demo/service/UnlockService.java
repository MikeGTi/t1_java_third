package ru.t1.java.demo.service;

import ru.t1.java.demo.model.dto.AccountDto;
import ru.t1.java.demo.model.dto.ClientDto;
import ru.t1.java.demo.model.dto.UnblockDto;

public interface UnlockService {
    UnblockDto unlockClient(ClientDto clientDto);

    UnblockDto unlockAccount(AccountDto accountDto);
}
