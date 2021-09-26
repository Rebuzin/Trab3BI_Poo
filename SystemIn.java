/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cafe;

/**
 *
 * @author renan
 */

import java.util.Scanner;

public class SystemIn {
	
	private String ans;
    Scanner answer = new Scanner(System.in);
	
    public String throwAnswer() {//EXECUTOR E ARMAZENAMENTO DE ENTRADAS DE DADOS, QUALQUER QUE SEJA
    	ans = answer.nextLine();
    	return ans;
    }
    
    public void coffeSystemIn(Coffe coffe) { //EXECUTOR DE ENTRADAS PARA O CAFE
    	SystemInCoffe systemInCoffe = new SystemInCoffe();
    	
    	systemInCoffe.coffeSizeValueSystemIn(coffe); //ENCAMINHA PARA A ENTRADA DE TAMANHO
    	if (coffe.getCoffeSize().equals("3")) {
    	    	systemInCoffe.coffeFlavorSystemIn(coffe); //ENCAMINHA PARA ENTRADA DE SABORES
    	return;
    	} 
    	systemInCoffe.coffeFlavorSystemIn(coffe); //ENCAMINHA PARA ENTRADA DE SABORES
    	systemInCoffe.coffeWithAddictionYesNo(coffe); //ENCAMINHA PARA ENTRADA DE "SE" DESEJA ADICIONAL
    
    	
    }
    
       
    
    
    public String getAns() {
    	return ans; 
    }
}
