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


public class Coffe {
    

	SystemIn systemInCoffeMethod = new SystemIn();
	
	private String coffeSize; //TAMANHO DA XICARA
	private ArrayList <String> coffeFlavors = new ArrayList(); //LISTA DE TIPOS DE CAFÉ
	private String coffeAddictionQuantityChoosen;//VARIÁVEL AUXILIAR - QUANTIDADE DE ADICIONAIS ESCOLHIDOS
	private String coffeAddictionFlavor;
        private String coffeAddictionMaxQuantity;//VARIÁVEL AUXILIAR - QUANTIDADE MÁXIMA DE ADICIONAIS
	private String coffeFlavor;//SABOR DA BORDA
	private String coffeWithAddictionYesNo;//CAFE COM OU SEM ADICIONAL
	private String CoffeAddictionMaxQuantity;
	public void coffeMethod(Coffe coffe) {
		systemInCoffeMethod.coffeSystemIn(coffe);
	}
	
	//GETTERS AND SETTERS DO CAFE
	public ArrayList getCoffeFlavors() {
		return coffeFlavors;
	}
	public void setCoffeFlavors(String coffeFlavors) {
		this.coffeFlavors.add(coffeFlavors);
	}
	public String getCoffeSize() {
		return coffeSize;
	}
	public void setCoffeSize(String coffeSize) {
		this.coffeSize = coffeSize;
	}

    /**
     *
     * @param coffeAddictionMaxQuantity
     */
    public void setCoffeAddictionMaxQuantity(String coffeAddictionMaxQuantity) {
		this.coffeAddictionMaxQuantity = coffeAddictionMaxQuantity;
	}
	public String getCoffeAddictionQuantityChoosen() {
		return coffeAddictionQuantityChoosen;
	}
	public void setCoffeAddictionQuantityChoosen(String coffeAddictionQuantityChoosen) {
		this.coffeAddictionQuantityChoosen = coffeAddictionQuantityChoosen;
	}

        public void setCoffeAddictionFlavor(String coffeAddictionFlavor) {
		this.coffeAddictionFlavor = coffeAddictionFlavor;
	}
        public String getCoffeAddictionFlavor() {
		return coffeAddictionFlavor;
	}
        
        public String getcoffeWithAddictionYesNo() {
		return coffeWithAddictionYesNo;
	}
        
        public void setCoffeWithAddictionYesNo(String coffeWithAddictionYesNo) {
		this.coffeWithAddictionYesNo = coffeWithAddictionYesNo;
	}
        
        public String getCoffeAddictionMaxQuantity() {
		return coffeAddictionMaxQuantity;
	}
        
        
                    
}

