package br.com.aps.ondedescartoresiduos.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ResiduosException extends Exception{
    private String mensagem;
}
