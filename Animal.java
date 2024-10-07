public abstract class Animal {
	protected String nombreCientifico;
	protected String descripcionHabitat;
	protected int esperanzaVida;

	// Constructor
	public Animal(String nombreCientifico, String descripcionHabitat, int esperanzaVida) {
		this.nombreCientifico = nombreCientifico;
		this.descripcionHabitat = descripcionHabitat;
		this.esperanzaVida = esperanzaVida;
	}

	// Setters & Getters
	public String getNombreCientifico() {
		return this.nombreCientifico;
	}

	public void setNombreCientifico(String nombreCientifico) {
		this.nombreCientifico = nombreCientifico;
	}

	public String getDescripcionHabitat() {
		return this.descripcionHabitat;
	}

	public void setDescripcionHabitat(String descripcionHabitat) {
		this.descripcionHabitat = descripcionHabitat;
	}

	public int getEsperanzaVida() {
		return this.esperanzaVida;
	}

	public void setEsperanzaVida(int esperanzaVida) {
		this.esperanzaVida = esperanzaVida;
	}

	// Método abstracto para información del animal
	public abstract String getInfo();

}