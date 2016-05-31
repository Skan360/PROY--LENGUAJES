public class Persona
{
	private  String nombre, primer_apellido, segundo_apellido;
	private  String CURP, RFC, CLVEE;
	private  String fecha_nac,sexo, estado_nac, homonimia;
	private  int    d_verif;

	public void CapturaDatos()
	{
		nombre=Teclado.LeeCadena("Ingrese su nombre: ");
		primer_apellido = Teclado.LeeCadena("Ingrese su primer apellido: ");
		segundo_apellido = Teclado.LeeCadena("Ingrese su segundo apellido: ");
		fecha_nac= Teclado.LeeCadena("Ingrese su fecha de naciemiento: ");
		sexo = Teclado.LeeCadena("Ingrese su sexo  M / F: ");
		estado_nac = Teclado.LeeCadena("Ingrese el estado de procedencia: ");
	}

	public void CalculaCURP()
	{

	}

	public void CalculaRFC(String CP)
	{

	}

	public boolean ValidaCadena(String cadena)
	{

	}
}