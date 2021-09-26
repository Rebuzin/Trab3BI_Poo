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
public class SystemInCoffe {
    
	SystemIn systemInCoffe = new SystemIn();
	
	public void coffeSizeValueSystemIn(Coffe coffe) {//SELEÇÃO E ENTRADA DE DADOS PARA TAMANHO DO CAFÉ
    	System.out.println("Qual o tamanho do café?  \n"
				 + "[1] Pequeno      \n"
				 + "[2] Normal + 25% \n"
				 + "[3] Grande + 35% \n");
    	coffe.setCoffeSize(systemInCoffe.throwAnswer());//SETA O TAMANHO DA XICARA
    }
    
    
    public void coffeFlavorSystemIn(Coffe coffe) {
    		int count = 1;
    		System.out.println("Qual café você deseja escolher? (Lembrando que o preço aumentará 20% se a xicara for média e 35% se for grande) \n"
					 + "Tipos                      Valor\n"
					 + "[1] Café                        1.50        \n"
					 + "[2] Café com Leite              1.75        \n"
					 + "[3] Leite com Chocolate         2.50        \n"
					 + "[4] Mocha                       4.00        \n"
					 + "[5] Expresso Panna              4.50        \n"
					 );
    		do {  
    			System.out.println("Informe o sabor" + " (Informe apenas números)");
    			coffe.setCoffeFlavors(systemInCoffe.throwAnswer());
    			count++;
    		} while (count <= Integer.parseInt(coffe.getCoffeAddictionQuantityChoosen()));
    }
    
    public void coffeWithAddictionYesNo(Coffe coffe) {

    		System.out.println("Você deseja um adicional no café? (o valor não mudara intependente do tamanho da xicara)");
    		coffe.setCoffeWithAddictionYesNo(systemInCoffe.throwAnswer());
    	if (coffe.getcoffeWithAddictionYesNo().equals("S")) {coffeBordFlavorChoice(coffe); return;} else {return;}
    	} 

    
    public void coffeBordFlavorChoice(Coffe coffe) {
    	if (coffe.getcoffeWithAddictionYesNo().equals("N"))  {return;} else 
    	{System.out.println("Sabores para o adicional                                 Valores  \n"
    					   + "[1] Raspas de limão                      R$ 0,50 \n"
    					   + "[2] Canela em pó                         R$ 0,75 \n"
    					   + "[3] Leite ninho (colher)                 R$ 1,40 \n"
    					   + "[4] Gelo de creme de leite (Cubo)        R$ 1,75 \n" 
                                           + "[5] Leite condensado (colher)            R$ 1,85 \n"
                                           + "[6] Chocolate em pó(Colher)              R$ 1,50 \n"
                                           + "[7] Cookie (Unidade)                     R$ 0,90 \n"
    					   + "Escolha um sabor: (Informe somente números, mas cuidado com os valores adicionais)");
    	coffe.setCoffeAddictionFlavor(systemInCoffe.throwAnswer()); 
    	}
    }

       
}
