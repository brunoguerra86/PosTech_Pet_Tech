package br.com.fiap.pettech.PosTech_Pet_Tech.dto;

import java.util.UUID;

public record ProdutoDTO(
        UUID id,
        String nome,
        String descricao,
        double preco,
        String urlDaImagem
) {


}
