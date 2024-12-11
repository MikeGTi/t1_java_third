package ru.t1.java.demo.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.t1.java.demo.service.UnlockService;

import ru.t1.java.demo.model.dto.AccountDto;
import ru.t1.java.demo.model.dto.ClientDto;
import ru.t1.java.demo.model.dto.UnblockDto;


@RestController
@RequestMapping("/unlock")
@RequiredArgsConstructor
public class UnlockController {
    private final UnlockService unlockService;

    @PostMapping("/client")
    public ResponseEntity<UnblockDto> unlockClient(@RequestBody ClientDto clientDto) {
        UnblockDto response = unlockService.unlockClient(clientDto);
        return ResponseEntity.ok(response);
    }

    @PostMapping("/account")
    public ResponseEntity<UnblockDto> unlockAccount(@RequestBody AccountDto accountDto) {
        UnblockDto response = unlockService.unlockAccount(accountDto);
        return ResponseEntity.ok(response);
    }
}
