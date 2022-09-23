package com.paramonga.ssff.model;

import com.paramonga.ssff.mapper.PesajeAzucarMapper;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class PesajeAzucarModel {
    public List<PesajeAzucarMapper> content;
    public Long totalElements;
    public Integer totalPages;
    public Integer numberOfElements;
    public Integer pageNumber;
}
