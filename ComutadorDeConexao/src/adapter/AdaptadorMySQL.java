package adapter;
import interfaces.ConexaoBD;
import modelos.MySQL;

public class AdaptadorMySQL implements ConexaoBD{

	private MySQL mysql;
	
	public AdaptadorMySQL(MySQL mysql) {
		this.mysql = mysql;
	}
	
	@Override
	public void insert() {
		this.mysql.insertMySQL();		
	}

	@Override
	public void update() {
		this.mysql.updateMySQL();
	}

	@Override
	public void delete() {
		this.mysql.deleteMySQL();
	}

}
