
public class TesteSistema {

	public static void main(String[] args) {
		Gerente g = new Gerente();
		g.setSenha(2222);
			
		Administrador ad = new Administrador();
		ad.setSenha(2232);
		
		Cliente c = new  Cliente();
		c.setSenha(2222);
		
		SistemaInterno s = new SistemaInterno();
		s.autentica(g);
		s.autentica(ad);
		s.autentica(c);
		
		
	}

}
