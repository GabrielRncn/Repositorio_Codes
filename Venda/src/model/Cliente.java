package model;

public class Cliente {
private int idCliente;
private char nome;
private char email;

//Constructor
public Cliente(int idCliente, char nome, char email) {
	this.idCliente = idCliente;
	this.nome = nome;
	this.email = email;
}

//Getters and Setters
public int getidCliente() {
	return idCliente;
}

public char getNome() {
	return nome;
}

public char getEmail() {
	return email;
}

public void setIdCliente(int idCliente) {
	this.idCliente = idCliente;
}

public void setNome(char nome) {
	this.nome = nome;
}

public void setEmail(char email) {
	this.email = email;
}

@Override
public String toString() {
	return "Cliente [idCliente=" + idCliente + ", nome=" + nome + ", email=" + email + "]"; 
}
}
