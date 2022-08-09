
public class EditorVideo extends Funcionario {

	

	public double getBonificacao() {
		System.out.println("chamando método de bonificacao do Editor de video");
		return super.getBonificacao() + 100;
	}
	
}
