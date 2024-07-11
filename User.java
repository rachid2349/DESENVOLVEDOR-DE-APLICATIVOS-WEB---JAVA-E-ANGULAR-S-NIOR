package com.example.userregistration.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

@Entity
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty(message = "Nome é obrigatório")
    private String name;

    @NotEmpty(message = "Email é obrigatório")
    @Email(message = "Email deve ser válido")
    private String email;

    @NotEmpty(message = "Senha é obrigatória")
    private String password;
}
