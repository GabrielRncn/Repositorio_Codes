package entidades;

public class Musica {
	private String titulo;
	private String artista;
	private int duracao;
	
	//Constructor
	public Musica(String titulo, String artista, int duracao) {
		this.titulo = titulo;
		this.artista = artista;
		this.duracao = duracao;
	}
	
	//Getters and Setters
	public String getTitulo() {
		return titulo;
	}
	public String getArtista() {
		return artista;
	}
	public int getDuracao() {
		return duracao;
	}

	 public void exibirMusica() {
	        System.out.println("Nome: " + this.titulo);
	        System.out.println("Artista: " + this.artista);
	        System.out.println("Duracao: " + this.duracao);
	  
	    }
	}
	

