package com.senai.ecomerce.dto;

import java.time.Instant;

public record PedidoDTO(Long id, Instant momento, String status) {

}
