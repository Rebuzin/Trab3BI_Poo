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
public class Calculate {
    
    
        private double coffeFlavorValue;
	private double coffeSizeValue;	
        private double coffeAddictionValue;
		
	public double calculate(Order order) {
		validateOrder(order);
		double totalValue;
		if (validateBordAdditional(order) == 1) {
			totalValue = coffeFlavorValue + coffeSizeValue + coffeAddictionValue;
		} else
			totalValue = coffeSizeValue + coffeFlavorValue;
		return totalValue;
	}
	
	public void validateOrder(Order order) {
		validateBordAdditional(order);
		validateCoffeFlavorValue(order);
		validateCoffeSizeValue(order);
               
	}
	
	public int validateBordAdditional(Order order) {
		if (order.getOrderCoffeWithAddictionYesNo().equals("S")) {
			if (order.getOrderCoffeAddictionFlavor().contains("Raspas de Limão")) {coffeAddictionValue = 0.50;}
			if (order.getOrderCoffeAddictionFlavor().contains("Canela em Pó")) {coffeAddictionValue = 0.75;}
			if (order.getOrderCoffeAddictionFlavor().contains("Leite ninho (colher)")) {coffeAddictionValue = 1.40;}
			if (order.getOrderCoffeAddictionFlavor().contains("Gelo de creme de leite (Cubo)")) {coffeAddictionValue = 1.75;}
			if (order.getOrderCoffeAddictionFlavor().contains("Leite condensado (colher)")) {coffeAddictionValue = 1.85;}
			if (order.getOrderCoffeAddictionFlavor().contains("Chocolate em pó(Colher)")) {coffeAddictionValue = 1.50;}
			if (order.getOrderCoffeAddictionFlavor().contains("Cookie (Unidade)")) {coffeAddictionValue = 0.90;}

                        return 1;
		} else return 0;
	}
	
	public void validateCoffeSizeValue(Order order) {
                        if(order.getOrderCoffeFlavors().contains("Pequena")) {coffeSizeValue = 0.00;}
			if(order.getOrderCoffeFlavors().contains("Média")) {coffeSizeValue = 0.20;}
			if(order.getOrderCoffeFlavors().contains("Grande")) {coffeSizeValue = 0.35;}
        
	}
	public void validateCoffeFlavorValue(Order order) {
		if(order.getOrderCoffeFlavors().contains("Café")) {coffeFlavorValue = 1.50;}
		if(order.getOrderCoffeFlavors().contains("Café com Leite")) {coffeFlavorValue = 1.75;}
		if(order.getOrderCoffeFlavors().contains("Leite com Chocolate")) {coffeFlavorValue = 2.50;}
		if(order.getOrderCoffeFlavors().contains("Mocha")) {coffeFlavorValue = 4.00;}
		if(order.getOrderCoffeFlavors().contains("Espresso Panna")) {coffeFlavorValue = 4.50;}
		}
	
    
    
}
