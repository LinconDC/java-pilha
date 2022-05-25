
public class Conexao implements AutoCloseable {

	public Conexao() {
		System.out.println("abrindo conexao");
		//Athrow new IllegalStateException();

	}

	public void leDados() {
		System.out.println("recebendo dados");
		throw new IllegalStateException();
	}

	@Override
	public void close() {
		System.out.println("fechando conexao");
	}
}
