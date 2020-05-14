/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.sp.validate;

import br.senac.sp.entidade.Venda;

/**
 *
 * @author lucas
 */
public class VendaValidate {
    public static String validaCarrinho(int quantidade, int id){
        
        if(quantidade < 1){
            return "Quantidade não pode ser menor que 1.";
        }
        
        if(id < 1){
            return "Id não pode ser menor que 1.";
        }
        
        return "";
    }
    
}
