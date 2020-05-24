package banco;

public class Conta {
	
	private int numero;
	
	private String titular;
	
	private String agencia;
	
	
	private double saldo;
			
	
	private String data_Abertura;
	
	
	
	boolean saca(double valor){
		if(valor <= saldo) {
			double novoSaldo = this.saldo - valor;
			this.saldo = novoSaldo;
			return true;
		} 
		else return false;
	}
	
	void deposita(double quantidade){
		this.saldo	+=	quantidade;
	}	
	
	void calculaRendimento(){
		this.saldo = this.saldo * 1.1;
	}
	
}	
