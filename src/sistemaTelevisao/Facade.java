package sistemaTelevisao;

public class Facade {
	
	protected Audio audio;
	protected Video video;
	protected Entrada input;
	
	public void inicializarSistemas() {
		video = new Video();
		
		input = new Entrada();
		input.configurarBotoes();
		
		audio = new Audio();
		audio.configurarVolume();
	}
	
	public void reproduzirAudio(String arquivo) {
		audio.reproduzirAudio(arquivo);
	}
	
	public void renderizarImagem(String imagem) {
		video.renderizarImagem(imagem);
	}
	
	public void lerInput() {
		input.lerInput();
	}

}
