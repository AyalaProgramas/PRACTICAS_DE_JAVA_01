package poo;

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
	}

}
