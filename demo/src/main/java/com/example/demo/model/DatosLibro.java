package com.example.demo.model;



import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DatosLibro(
        String title,

        @JsonAlias("download_count")
        Integer numeroDescargas,

        List<String> languages,

        List<DatosAutor> authors
) {}
