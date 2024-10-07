package med.voll.api.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;


@RestController
@RequestMapping("/produtos")

public class ProdutoController {


    @GetMapping
    public String produtosEmEstoque() {
        return "Produtos em estoque...";
    }
}