package entities;

public class Jugador {
	
	private String nickName;
	private String estado;
	private String contraseņa;
	
	public Jugador(String nick, String clave) {
		this.nickName = nick;
		this.contraseņa = clave;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public void estadoListo() {
		this.estado = "Listo";
	}

}