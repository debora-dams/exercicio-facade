package sistemaTelevisao;

public class FacadeDemo {
	
	public static void main(String[] args) {
		System.out.println("--- Configuração dos subsistemas ---");
		Facade facade = new Facade();
		facade.inicializarSistemas();
		
		System.out.println("\n" + "--- Utilizando os subsistemas ---");
		facade.renderizarImagem("nada.png");
		facade.reproduzirAudio("socorro-deus.mp3");
		facade.lerInput();
	}

}
