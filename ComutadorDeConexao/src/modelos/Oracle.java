package modelos;
import interfaces.ConexaoBD;

public class Oracle implements ConexaoBD{

	@Override
	public void insert() {
		System.out.println("Insert no BD Oracle");
		
	}

	@Override
	public void update() {
		System.out.println("Update no BD Oracle");
		
	}

	@Override
	public void delete() {
		System.out.println("Delete no BD Oracle");
		
	}
	
}
