package principal;

import entidades.Musica;
import entidades.Playlist;

public class Principal {
	public static void main(String[] args) {
		Playlist playlist = new Playlist();
		
		Musica musica1 = new Musica("Sunflower", "Post Malone", 2);
		Musica musica2 = new Musica("Astrothunder", "Travis Scott", 3);
		
		//AdicionarMusica
		System.out.println("Adicionadas:");
		playlist.adicionarMusica(musica1);
		playlist.adicionarMusica(musica2);
		
		//listarMusicas
		playlist.listarMusicas(musica1);
		playlist.listarMusicas(musica2);
		
		//exibirMusica
		System.out.println("------Exibicao:-----");
		playlist.exibirMusica(musica1);
		
		
		//removerMusica
		System.out.println("-------Musica Removida:-----");
		playlist.exibirMusica(musica2);
		playlist.removerMusica(musica1);
		
		//buscarMusicas
		//System.out.println("------Buscando....------");
		//playlist.buscarMusica(musica2);
	}
}
