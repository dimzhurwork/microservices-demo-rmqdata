package ru.dimzhur.demo.rmqdata.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * Модель данных пользователя для передачи между сервисами
 */
@Data
@NoArgsConstructor
public class UserData implements Serializable {

    /**
     * ID пользователя
     */
    private String id;

    /**
     * Список названий ролей
     */
    private List<String> roles;
}
