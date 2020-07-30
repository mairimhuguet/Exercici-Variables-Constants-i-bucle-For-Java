
public class FASE3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i;
		int naixement=1993;
		boolean bisiesto;
		for(i=1948;i<naixement;i+=4) 
			System.out.println(i);
			
	if(naixement%4==0)
	{
		bisiesto=true;
	}
	else
	{
		bisiesto=false;
	}
	


	String frase1 = "El meu any de naixement " + naixement +" és de traspàs:" + bisiesto;
	
	
	System.out.println(frase1);

	}
}
