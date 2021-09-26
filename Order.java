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
import java.util.ArrayList;

public class Order {
	//MUDAR O TIPO DE ARMAZENAMENTO DAS VARIAVEIS DE TAMANHO E SABORES DE NÚMERO PARA A DESCRIÇÃO;
	
	private String coffeSize;
	private ArrayList <String> coffeFlavors = new ArrayList();
	private String coffeWithAddictionYesNo;
	private String coffeAddictionFlavor;
        private String coffeOrder;
	//**********************
	
		
	private double totalOrderValue;
	
		
	
	//*********************************
	
	//VALIDAÇÕES DOS VALORES DOS CAFÉS
	public int coffeValidateSize(Coffe coffe) {
		if (coffe.getCoffeSize().equals("1")) {coffeSize = "Pequena"; return 1;};
		if (coffe.getCoffeSize().equals("2")) {coffeSize = "Média"; return 2;};
		if (coffe.getCoffeSize().equals("3")) {coffeSize = "Grande"  ; return 3;};
		return 0;
	}
	public void coffeValidateFlavors(Coffe coffe) {
		if (coffe.getCoffeFlavors().contains("1")) {coffeFlavors.add("Café");}
		if (coffe.getCoffeFlavors().contains("2")) {coffeFlavors.add("Café com Leite");}
		if (coffe.getCoffeFlavors().contains("3")) {coffeFlavors.add("Leite com Chocolate");}
		if (coffe.getCoffeFlavors().contains("4")) {coffeFlavors.add("Mocha");}
		if (coffe.getCoffeFlavors().contains("5")) {coffeFlavors.add("Expresso Panna");}
		
        }
	public void coffeValidateAddictionFlavors(Coffe coffe) {
		if (coffe.getcoffeWithAddictionYesNo().equals("S")) {
			coffeWithAddictionYesNo = "S";
					
                if (coffe.getCoffeAddictionFlavor().equals("1")) {coffeAddictionFlavor = "Raspas de Limão";}
                if (coffe.getCoffeAddictionFlavor().equals("2")) {coffeAddictionFlavor = "Canela em Pó";}
                if (coffe.getCoffeAddictionFlavor().equals("3")) {coffeAddictionFlavor = "Leite ninho (colher)";}
                if (coffe.getCoffeAddictionFlavor().equals("4")) {coffeAddictionFlavor = "Gelo de creme de leite (Cubo)";}
                if (coffe.getCoffeAddictionFlavor().equals("5")) {coffeAddictionFlavor = "Leite condensado (colher)";}
                if (coffe.getCoffeAddictionFlavor().equals("6")) {coffeAddictionFlavor = "Chocolate em pó(Colher)";}
                if (coffe.getCoffeAddictionFlavor().equals("7")) {coffeAddictionFlavor = "Cookie (Unidade)";}
			                
                } else
		;
                }
	//*****************************************
	
	
	//GETTERS AND SETTERS
	public double getTotalOrderValue() {
		return totalOrderValue;
	}
	public String getOrderCoffeSize() {
		return coffeSize;
	}
	public ArrayList getOrderCoffeFlavors() {
		return coffeFlavors;
	}
	public String getOrderCoffeAddictionFlavor() {
		return coffeAddictionFlavor;
	}
	
	public String getOrderCoffeWithAddictionYesNo() {
		return coffeWithAddictionYesNo;
	}

        public String getCoffeOrder() {
            return coffeOrder;
	}

    
    
 }
