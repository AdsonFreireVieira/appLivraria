package model;

public class Livro {
	
	private Integer id_livro;
	private String nome_livro;
	private String editora;
	private double preco;
	private String genero;
	private String status;
    private String fotouser;
    private String extensaofoto;
   
    
    
	public Integer getId_livro() {
		return id_livro;
	}
	public void setId_livro(Integer id_livro) {
		this.id_livro = id_livro;
	}
	public String getNome_livro() {
		return nome_livro;
	}
	public void setNome_livro(String nome_livro) {
		this.nome_livro = nome_livro;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getFotouser() {
		return fotouser;
	}
	public void setFotouser(String fotouser) {
		this.fotouser = fotouser;
	}
	public String getExtensaofoto() {
		return extensaofoto;
	}
	public void setExtensaofoto(String extensaofoto) {
		this.extensaofoto = extensaofoto;
	}
	
}
