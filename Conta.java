
public class Conta {
	
	int numero;
	
	String titular;
	
	String agencia;
	
	double saldo;
	
	String data_Abertura;
	
	
	
	boolean Saca(int valor){
		if(valor <= saldo) {
			double novoSaldo = this.saldo - valor;
			this.saldo = novoSaldo;
			
			return true;
			
		} 
		
		else{					
			
			return false;
		
		}
		
	}
	
	//int Deposita()
	
	//calculaRendimento()
	
}	
