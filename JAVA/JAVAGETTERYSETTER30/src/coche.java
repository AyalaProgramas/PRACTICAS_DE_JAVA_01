
public class coche {
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
		private int peso;
		
		//esto es un ejemplo de incungruencia:le damos un dato inicial al constructor esta mal no tiene sentido
		public coche()
		{
			this.rueda=4;
			this.largo=200;
			this.ancho=300;
			this.motor=1600;
			this.peso=500;
		}

}
