
public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int valor = 250;
		
		boolean retorno;
		
		Conta contaNova = new Conta();
		
		contaNova.agencia = "6554";
		
		contaNova.saldo = 1000;
		
		retorno = contaNova.Saca(valor);
		
		if(retorno)
			System.out.println("O valor de " + valor + " foi sacado com sucesso!");
		else	
			System.out.println("Saldo Insulficiente!");
		
		
		System.out.println(contaNova.saldo);
			

	}

}
