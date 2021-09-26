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
public class Main {
	
    
    public static void main(String[] args) {
    	SystemIn enters = new SystemIn();
        Order order = new Order();
        SystemOut systemOut = new SystemOut();
        Calculate calculate = new Calculate();
        Coffe coffe = new Coffe();
       
                
    	 
        System.out.println("Cafeteria da Marcela \n"
        		+ "Bem vindo ao nosso cardápio virtual, o que deseja hoje? (aperte ENTER)\n"
        		+ "Digite [1] somente para nossos tipos de café \n"
        		+ "Digite [2] opção indisponivel \n"
        		);
        enters.throwAnswer();
        
        switch (enters.getAns()) {
        	case "1": 
        		coffe.coffeMethod(coffe);
          		systemOut.outPrintCoffeOrder(order, calculate);
        	break;
        	
        	
        }
    }
}
