public class Persona
{
	private  String nombre, primer_apellido, segundo_apellido;
	private  String CURP, RFC, CLVEE;
	private  String fecha_nac,sexo, estado_nac, homonimia;
	private  int    d_verif;

	public void CapturaDatos()
	{
		nombre=ValidaCadena(Teclado.LeeCadena("Ingrese su nombre(s): "));
		primer_apellido =ValidaCadena(Teclado.LeeCadena("Ingrese su primer apellido: "));
		segundo_apellido =ValidaCadena(Teclado.LeeCadena("Ingrese su segundo apellido: "));
		/*fecha_nac=ValidaCadena(Teclado.LeeCadena("Ingrese su fecha de naciemiento: "));
		sexo =ValidaCadena(Teclado.LeeCadena("Ingrese su sexo  M / F: "));
		estado_nac=ValidaCadena(Teclado.LeeCadena("Ingrese el estado de procedencia: "));*/
	}

	public void CalculaCURP()
	{	
		

	}

	public void CalculaRFC(String CP)
	{

	}

	public String ValidaCadena(String cadena)
	{
		boolean valida= true;
		cadena=cadena.replace(" ","");
		cadena=cadena.toUpperCase();
		System.out.println(cadena);

		do
		{
			for(int i=0;i<cadena.length();i++)
        		if(!((cadena.charAt(i) >='A' && cadena.charAt(i) <= 'Z') || (cadena.charAt(i)==165)));
         		{
                    System.out.println("\nEL TEXTO NO ES VALIDO  =/ ASEGURATE DE NO USAR ACENTOS O SIMBOLOS ESPECIALES");
                    valida = false;
                 }    

		}while(valida);
		return cadena;
	}

	//Métodos para calcular el CURP

	public String CalculaPozitionEins()
	{		
		char letrainicial=primer_apellido.charAt(0);
		char primeravocal;
		String parteins;
		//Primer letra del nombre
		char plnom= nombre.charAt(0);
		//liapm = letra inicial del segundo apellido
		char liapm=segundo_apellido.charAt(0);
		int  indice=0;

		for (int i=1;i<primer_apellido.length();i++ ) {
			char aux= primer_apellido.charAt(i);
			if( aux== 'A'|| aux=='E'|| aux == 'I'|| aux== 'O'|| aux=='U'){
				indice=i;
                i=primer_apellido.length();
			}				
		}
		primeravocal=primer_apellido.charAt(indice);

		parteins= letrainicial +""+ primeravocal + liapm + plnom;
		
		return parteins;

	}

	public String CalculaPozitionZwei()
	{
		return "";
	}

	public String CalculaPozitionDrei()
	{
		return "";
	}

}