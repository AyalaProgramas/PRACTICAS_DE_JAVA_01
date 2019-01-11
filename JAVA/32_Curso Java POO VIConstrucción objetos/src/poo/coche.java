package poo;

//incongruencia
//modificadores de adcesos
//plataforma
//metodos :los metodos nos permiten q nuestran clases interactuen entre si formando una unidad
public class coche {
	//el tema en este caso es que la vari se modifique desde la propia clase
	private int rueda;//si ponemos private encapsulamos la variable el dato
	private int largo;
	private int ancho;
	private int motor;
	private int peso_plataforma;
	//variables que pueden cambiar segun el objeto
	//problema futuro
	private String color;
	private int peso_total;
	private boolean asiento_decuero,climatisador;
	//esto es un ejemplo de incungruencia:le damos un dato inicial al constructor esta mal no tiene sentido
	public coche()
	{
		this.rueda=4;
		this.largo=2000;
		this.ancho=300;
		this.motor=1600;
		this.peso_plataforma=500;
	}
	
	//COMO PODEMOS ADCEDER O MODIFICAR A LAS VARIABLES SI ESTAN EMCAPSULADOS
	//NO PODEMOS MODIFICAR LAS PROPIEDADES DE UN OBJETO A MENOS Q......
	//LAS FORMAS DE UNA CLASE SE COMUNIQUEN ENTRE SI ES A TRAVES DE UN METODO
	
	//METODOS SETER Y GETER:OBTENEMOS SU VALOR 
	//public hace que este metodo se pueda usar en cualquier otra clase
	public String dime_largo()
	{
		return "el largo del coche es "+this.largo;
	}
	public String dime_datos_generales()
	{
		return "\n"+this.ancho+"\n"+this.color+"\n"+this.largo+"\n"+this.motor+"\n"+this.peso_plataforma+"\n"+this.peso_total+"\n"+this.rueda;
	}
	public void establece_color(String color)
	{
		this.color=color;
	}
	
	public String dime_color()
	{
		return "el color es "+this.color;
	}
	//this: hace referencia a la propia clase que estamos en la variable de la clase
	
	public void configura_asiento(String asiento_cuero)//seter
	{
		if(asiento_cuero.equals("si"))//usar equals
		{
			this.asiento_decuero=true;
		}else
		{
			this.asiento_decuero=false;
		}
		
	}
	
	public String dime_asiento()//geter
	{
		String retorno="";
		if(this.asiento_decuero==true)
		{
			retorno="tiene asiento de cuero";
		}else
		{
			retorno="no tiene asiento";
		}
		
		return retorno;
	}
	
	
	public void configura_climatisador(String climatisador)//seter
	{
		if(climatisador.equals("si"))
		{
			this.climatisador=true;
			
		}else
		{
			this.climatisador=false;
			
		}
	}
	
	public String dime_clima()//geter
	{
		String retorno="";
		if(this.climatisador==true)
		{
			retorno="el coche tiene climatisado";
		}
		else
		{
			retorno="el coche no tiene climatisador";
		}
		return retorno;
	}
	
	//no reconmendado haqcer seter y geter juntos
	
	public String peso_coche()
	{
		int peso_carroceria=500;
		
		this.peso_total=this.peso_plataforma+peso_carroceria;
		if(this.asiento_decuero==true)
		{
			this.peso_total=this.peso_total+50;
		}
		if(this.climatisador==true)
		{
			this.peso_total=this.peso_total+20;
		}
		
		return "el peso del coche es"+ this.peso_total;
	}
	
	//11:32
	
	
	public int precio_coche()//geter
	{
		int precio_final=10000;
		if(this.asiento_decuero==true)
			precio_final+=2000;
		if(this.climatisador==true)
		{
			precio_final+=1500;
		}
		return precio_final;
	}
	
	
	
	
}