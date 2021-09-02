package fp.daw.exprog20210902;

public class Automovil {
	private String marca;
	private String modelo;
	private String matricula;
	private int agno;
	private int potencia;

	enum tipo_motor {
		GASOLINA, DIESEL, ELECTRICO, HIBRIDO
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public int getAgno() {
		return agno;
	}

	public void setAgno(int agno) {
		this.agno = agno;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	

	public void setAbreviatura(String abreviatura) {

	}

	public Automovil(String marca, String modelo, String matricula, int agno, int potencia) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.matricula = matricula;
		this.agno = agno;
		this.potencia = potencia;

	}

	@Override
	public String toString() {
		return "Automovil [marca=" + marca + ", modelo=" + modelo + ", matricula=" + matricula + ", agno=" + agno
				+ ", potencia=" + potencia + "]";
	}

}


