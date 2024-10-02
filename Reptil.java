public class Reptil extends Animal {
    protected double temperaturaCorporal;
    protected int cantidadHuevos;
    protected double peso;
    protected boolean enPeligroExtincion;
    protected String dieta;

    //Constructor
    public Reptil(String nombreCientifico, String descripcionHabitat, int esperanzaVida, double temperaturaCorporal, int cantidadHuevos, double peso, boolean enPeligroExtincion, String dieta) {
        super(nombreCientifico, descripcionHabitat, esperanzaVida);
        this.temperaturaCorporal = temperaturaCorporal;
        this.cantidadHuevos = cantidadHuevos;
        this.peso = peso;
        this.enPeligroExtincion = enPeligroExtincion;
        this.dieta = dieta;
    }

    //Setters & getters
    public double getTemperaturaCorporal() {
		return this.temperaturaCorporal;
	}

	public void setTemperaturaCorporal(double temperaturaCorporal) {
		this.temperaturaCorporal = temperaturaCorporal;
	}

	public int getCantidadHuevos() {
		return this.cantidadHuevos;
	}

	public void setCantidadHuevos(int cantidadHuevos) {
		this.cantidadHuevos = cantidadHuevos;
	}

	public double getPeso() {
		return this.peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public boolean isEnPeligroExtincion() {
		return this.enPeligroExtincion;
	}

	public void setEnPeligroExtincion(boolean enPeligroExtincion) {
		this.enPeligroExtincion = enPeligroExtincion;
	}

	public String getDieta() {
		return this.dieta;
	}

	public void setDieta(String dieta) {
		this.dieta = dieta;
	}

    //Methods 
    public double comidaDiaria() {
        return 0;
    }

    public double costoMantenimiento() {
        return 0;
    }

    public String getInfo(){
        return super.getNombreCientifico() + ", Esperanza de vida: " + super.getEsperanzaVida() + ", Temperatura corporal: " + this.temperaturaCorporal + ", Cantidad de huevos: " + this.cantidadHuevos + ", Peso: " + this.peso + ", En peligro de extinción: " + this.enPeligroExtincion + ", Dieta: " + this.dieta;
    }
}
