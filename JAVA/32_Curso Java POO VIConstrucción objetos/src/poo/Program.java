package poo;
import javax.swing.*;

//pauqete java lan
public class Program {

	public static void main(String[] args) {//ak es donde se inicia todo programa java
		
       //solo es visible y modificable desde la propia clase
		coche renault=new coche();//instancia un aclase
		
		///renault.rueda=3;//no se puede modificar desde ak xq esta encapsulado//esta mal hacer esto
		
		///System.out.println(renault.rueda);//no se puede modificar xq esta encapsulado
		
		
		
		//COMO PODEMOS ADCEDER O MODIFICAR A LAS VARIABLES
		
		//System.out.println(renault.dime_largo());
		
		//renault.establece_color();
		System.out.println(renault.dime_color());
		
		
		
		//31
		//paso de parametro
		renault.establece_color("amarillo");
		
		
		//problema de encapsulacion en este programa
		//
		System.out.println(renault.dime_datos_generales());
		
		renault.configura_asiento("no");
		System.out.println(renault.dime_asiento());
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		//32
		//hacmos el programa para que salga de una ventana emergente esto lo hacemos de forma elegante
		//
		renault.establece_color(JOptionPane.showInputDialog("introduce color"));
		System.out.println(renault.dime_color());
		renault.configura_asiento(JOptionPane.showInputDialog("tiene asiento de cuero?"));
		System.out.println(renault.dime_asiento());
		renault.configura_climatisador(JOptionPane.showInputDialog("tiene climatisador?"));
		System.out.println(renault.dime_clima());
	//uso de equals
	}

}
