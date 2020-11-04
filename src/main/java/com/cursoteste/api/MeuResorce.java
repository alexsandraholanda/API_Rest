package com.cursoteste.api;

import org.springframework.web.bind.annotation.*;

@RestController
public class MeuResorce {

    @GetMapping("/api/clientes/{id}")
    public Cliente obterDadosCliente(@PathVariable Long id){
        Cliente cliente = new Cliente(nome= "Alexsandra", cpf= "000.111.222.33");
        return cliente;

    }
}
