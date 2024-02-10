package org.acme.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

public class Product {
    public Long id;

    @NotBlank(message = "Campo rótulo não pode ser vazio")
    public String label;

    @NotBlank(message = "Campo descrição não pode ser vazio")
    public String description;

    @Min(message = "Campo quantidade deve ser maior ou igual a 1", value = 1)
    public Integer quatity;

    @Min(message = "Campo preço deve ser maior ou igual a 1", value = 1)
    public Double price;
}
