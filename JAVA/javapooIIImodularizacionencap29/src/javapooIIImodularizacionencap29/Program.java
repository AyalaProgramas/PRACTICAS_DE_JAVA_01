package javapooIIImodularizacionencap29;
//emcapsulacion
public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //solo es visible y modificable desde la propia clase
		coche renault=new coche();
		
		///renault.rueda=3;//no se puede modificar desde ak xq esta encapsulado
		
		///System.out.println(renault.rueda);//no se puede modificar xq esta encapsulado
	}

}
