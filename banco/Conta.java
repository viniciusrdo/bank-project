package banco;

public class Conta {
	
	private int numero;
	
	private String titular;
	
	private String agencia;
	
	private double saldo;
			
	private String data_Abertura;

	
	
	// Construtores
	
	Conta(){}
	
	
	Conta(String titular){
		this.titular = titular;
	}
	
	// Métodos
	
	boolean saca(double valor){		// Saca
		if(valor <= saldo) {
			double novoSaldo = this.saldo - valor;
			this.saldo = novoSaldo;
			return true;
		} 
		else return false;
	}
	
	void deposita(double quantidade){		// Deposita
		this.saldo	+=	quantidade;
	}	
	
	void calculaRendimento(){		//Calcula Rendimento
		this.saldo = this.saldo * 1.1;
	}
	
	// Getters and Setters
	
	public int getNumero(){		
		return numero;
	}
	
	public void setNumero(int numero){
		this.numero = numero;
	}
	
	
	public String getTitular(){
		return titular;
	}
	
	public void setTitular(String titular){
		this.titular = titular;
	}
	
	public String getAgencia(){
		return agencia;
	}
	
	public void setAgencia(String Agencia){
		this.agencia = Agencia;
	}
	
	public String get_Data_Abertura(){
		return data_Abertura;
	}
	
	public void set_Data_Abertura(String data_Abertura){
		this.data_Abertura = data_Abertura;
	}
	
	// Método que imprime o comprovante
	
	public void printa_Dados(){
		System.out.println("\n\nNome do titular: " + titular + "\nNumero da conta: " + numero + 
		"\nNumero da Agencia: " + agencia + "\nData de Abertura: " + data_Abertura + "\n Saldo = " + saldo);
	}
	
	
	
}	
