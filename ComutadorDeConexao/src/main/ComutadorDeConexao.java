package main;
import adapter.AdaptadorMySQL;
import interfaces.ConexaoBD;
import modelos.MySQL;
import modelos.Oracle;

public class ComutadorDeConexao {

	public static void main(String[] args) {
		
		//Conexão compatível com bd oracle
		ConexaoBD conexao1 = new Oracle();
		conexao1.insert();
		
		//Conexão incompatível com bd MySQL
//		ConexaoBD conexao2 = new MySQL();
//		conexao2.insert();
		
		//Conexão adaptada para MySQL
		ConexaoBD conexao3 = new AdaptadorMySQL(new MySQL());
		conexao3.insert();
		
	}

}
