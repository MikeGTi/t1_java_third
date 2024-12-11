package ru.t1.java.demo.service.impl;

import ru.t1.java.demo.model.dto.AccountDto;
import ru.t1.java.demo.model.dto.ClientDto;
import ru.t1.java.demo.model.dto.UnblockDto;
import ru.t1.java.demo.service.UnlockService;
import org.springframework.stereotype.Service;

@Service
public class UnlockServiceImpl implements UnlockService {
    @Override
    public UnblockDto unlockClient(ClientDto clientDto) {
        return UnblockDto.builder()
                .uuid(clientDto.getClientUuid())
                .isUnblocked(Math.random() < 0.5)
                .build();
    }

    @Override
    public UnblockDto unlockAccount(AccountDto accountDto) {
        return UnblockDto.builder()
                .uuid(accountDto.getAccountUuid())
                .isUnblocked(Math.random() < 0.5)
                .build();
    }
}
