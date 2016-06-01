public class Persona
{
	private  String nombre, primer_apellido, segundo_apellido;
	private  String CURP, RFC, CLVEE;
	private  String fecha_nac,sexo, estado_nac, homonimia;
	private  int    d_verif;

	public void CapturaDatos()
	{
		do
		{
			nombre=Teclado.LeeCadena("Ingrese su nombre(s): ");
			nombre=nombre.replace(" ","").toUpperCase();
			
		}while(ValidaCadena(nombre));
		do
		{
			primer_apellido =Teclado.LeeCadena("Ingrese su primer apellido: ");
			primer_apellido=primer_apellido.replace(" ","").toUpperCase();
			
		}while(ValidaCadena(primer_apellido));
		do
		{
			segundo_apellido =Teclado.LeeCadena("Ingrese su segundo apellido: ");
			segundo_apellido=segundo_apellido.replace(" ","").toUpperCase();
			
		}while(ValidaCadena(segundo_apellido));
		do
		{
			fecha_nac=Teclado.LeeCadena("Ingrese su fecha de naciemiento  ejemplo 13/08/1999 : ");
			fecha_nac=fecha_nac.replace(" ","");
			System.out.println(fecha_nac);
		}while(ValidaFecha(fecha_nac));
		do
		{
			sexo =Teclado.LeeCadena("Ingrese su sexo  M / F: ");
			sexo=sexo.replace(" ","").toUpperCase();
			
		}while(ValidaSexo(sexo));
		do
		{
			estado_nac=Teclado.LeeCadena("Ingrese el estado de procedencia: ");
			estado_nac=estado_nac.replace(" ","").toUpperCase();
			
		}while(ValidaCadena(estado_nac));
		
	}

	public void CalculaCURP()
	{	
		
		CURP= CalculaPozitionEins() + CalculaPozitionZwei() + "";
		System.out.println(CURP);
	}

	public void CalculaRFC()
	{

	}
//Métodos de validaciones para  el texto ingresado
	public boolean ValidaSexo(String texto)
	{
		for(int i=0;i<texto.length();i++)
        if(!(texto.charAt(i) =='M' || texto.charAt(i) <='H') )
         {
            System.out.println("EL TEXTO NO ES VALIDO  =/ ingresa H o M segun sea el caso");
            return true;
         }
        return false;
	}

	public boolean ValidaCadena(String texto)
	{
		boolean aux=false;
		for(int i=0;i<texto.length();i++)
        if(!(texto.charAt(i) >='A' && texto.charAt(i) <='Z'|| texto.charAt(i)==165) )
         {
            System.out.println("EL TEXTO NO ES VALIDO  =/ ");
            aux=true;
         }  

         return aux;    		
	}
	public boolean ValidaFecha(String texto)
	{
		for (int i=0;i<texto.length();i++ ) 
			if(!(texto.charAt(i) >= '0' && texto.charAt(i) <= '9'|| texto.charAt(i)==47) )
         		{
            		System.out.println("EL TEXTO NO ES VALIDO  =/ ");
            		i=texto.length();
            		return true;
         		}  
		

		return false;
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
		String dia, mes, jahre;
		String fecha;
		String []aux =fecha_nac.split("/");
		dia = aux[0];
		mes = aux[1];
		jahre = aux[2].charAt(2)+""+aux[2].charAt(3);

		return (jahre + mes + "" + dia);
	}

	public String CalculaPozitionDrei()
	{
		return "";
	}

}