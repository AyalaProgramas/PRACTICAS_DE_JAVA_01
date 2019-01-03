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
	String color;
	int peso_total;
	boolean asiento_decuero,climatisador;
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
	
	public void establece_color()
	{
		this.color="azul";
	}
	
	public String dime_color()
	{
		return "el color es "+this.color;
	}
	
}
