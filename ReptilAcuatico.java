public class ReptilAcuatico extends Reptil {
    private String tipoAgua;
    private double velocidadNado;
    private int duracionBuceo;

    //Constructor
    public ReptilAcuatico(String nombreCientifico, String descripcionHabitat, int esperanzaVida, double temperaturaCorporal,int cantidadHuevos, double peso, boolean enPeligroExtincion, String dieta, String tipoAgua,double velocidadNado, int duracionBuceo) {
        super(nombreCientifico, descripcionHabitat, esperanzaVida, temperaturaCorporal, cantidadHuevos, peso, enPeligroExtincion, dieta);
        this.tipoAgua = tipoAgua;
        this.velocidadNado = velocidadNado;
        this.duracionBuceo = duracionBuceo;
    }

    //Setters & Getters
    public String getTipoAgua() {
		return this.tipoAgua;
	}

	public void setTipoAgua(String tipoAgua) {
		this.tipoAgua = tipoAgua;
	}

	public double getVelocidadNado() {
		return this.velocidadNado;
	}

	public void setVelocidadNado(double velocidadNado) {
		this.velocidadNado = velocidadNado;
	}

	public int getDuracionBuceo() {
		return this.duracionBuceo;
	}

	public void setDuracionBuceo(int duracionBuceo) {
		this.duracionBuceo = duracionBuceo;
	}

    //Methods
    public double TamañoRecinto() {
        return 0;
    }
}