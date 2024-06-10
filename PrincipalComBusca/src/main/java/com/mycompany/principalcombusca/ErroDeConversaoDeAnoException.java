/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principalcombusca;

/**
 *
 * @author Pichau
 */
public class ErroDeConversaoDeAnoException extends RuntimeException {
    
    private String mensagem;
    
    public ErroDeConversaoDeAnoException(String mensagem) {
        this.mensagem = mensagem;
    }
    
    public String getMessage(){
        
        return this.mensagem;
    }
    
}
