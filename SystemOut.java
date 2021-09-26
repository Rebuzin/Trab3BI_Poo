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
public class SystemOut {
	
	public void outPrintCoffeOrder(Order order, Calculate calculate) {
		System.out.println(
				"Tamanho da xicara: " + order.getOrderCoffeSize() + "\n"
			  + "Sabores: " + order.getOrderCoffeFlavors() + "\n"
			  + "Sabor dos adicionais: "   + order.getOrderCoffeAddictionFlavor() + "\n"
			  + "Valor Total: R$" + calculate.calculate(order)
		);
	}
	
	public void outPrintAll(Order order, Calculate calculate) {
		outPrintCoffeOrder(order, calculate);
		System.out.println("Valor Total: R$" + calculate.calculate(order));
	}
}
