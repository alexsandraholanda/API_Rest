package com.cursoteste.api;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/clientes")

public class MeuResorce {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Cliente Salvar(@RequestBody Cliente cliente){
        //service.save(cliente);
        return cliente;
    }

    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id){
        //service.buscarPorId(id);
        //service.delete(cliente);
    }

    @PutMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void atualizar(@PathVariable Long id, @RequestBody Cliente cliente){
        //service.buscarPorId(id);
        //service.atualizar(cliente);
    }

    @GetMapping("{id}")
    public Cliente obterDadosCliente( @PathVariable Long id){
        System.out.println(String.format("id recebido via url: %d", id));
        Cliente cliente = new Cliente("teste", "123456");
        return cliente;
    }
}
