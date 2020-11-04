package com.cursoteste.api;

import com.sun.javafx.binding.StringFormatter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MeuResorce {

    @GetMapping("/api/clientes/{id}")
    public Cliente obterDadosCliente( @PathVariable Long id){
        System.out.println(String.format("id recebido via url: %d", id));
        Cliente cliente = new Cliente("teste", "123456");
        return cliente;
    }
}
