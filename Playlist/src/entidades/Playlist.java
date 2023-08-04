package entidades;

import java.util.LinkedList;

public class Playlist {
	private LinkedList<Musica> Musicas;
	
	
	public Playlist() {
		Musicas = new LinkedList<Musica>();
	}
	
	public void adicionarMusica(Musica musica) {
		Musicas.add(musica);
	}
	
	public boolean removerMusica(Musica musica){
		for (Musica m : Musicas) {
			if (m.getTitulo().equals(musica)) {
				System.out.println("removida");
				Musicas.remove(m);
				return true;
			}
		}
		return false;
		
	}
	
	public Musica buscarMusica(Musica musica) {
		for (Musica m : Musicas) {
			if ( musica.getTitulo().equals(m)){
				m.exibirMusica();
			}
		}
		return null;
	}
	
	public void listarMusicas (Musica musica) {
		for (Musica m : Musicas) {
			//System.out.println("--------Musicas:-------");
			System.out.println("Titulo:" + m.getTitulo());
			System.out.println("Artista:" + m.getArtista());
			System.out.println("Duracao:" + m.getDuracao());
		}
	}
	 public void exibirMusica(Musica musica) {
		        for (Musica m : Musicas) {
		        	if(m.equals(musica)) {
		        		m.exibirMusica();
			 
		        	}
		            
		        }
		    }

	
		
	}
		
	

