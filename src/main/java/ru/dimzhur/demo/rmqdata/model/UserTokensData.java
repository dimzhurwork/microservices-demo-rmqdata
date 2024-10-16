package ru.dimzhur.demo.rmqdata.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * Модель для передачи токенов
 */
@Data
@NoArgsConstructor
public class UserTokensData implements Serializable {

    /**
     * Токен доступа
     */
    private String access;
    /**
     * Токен обновления
     */
    private String refresh;
}
