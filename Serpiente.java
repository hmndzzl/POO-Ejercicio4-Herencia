public class Serpiente extends Reptil {
    private double longitud;
    private String especie;
    private String colorPiel;
    private boolean venenosa;
    private String tipoVeneno;

    //Constructor
    public Serpiente(String nombreCientifico, String descripcionHabitat, int esperanzaVida, double temperaturaCorporal,int cantidadHuevos, double peso, boolean enPeligroExtincion, String dieta, double longitud,String especie, String colorPiel, boolean venenosa, String tipoVeneno) {
        super(nombreCientifico, descripcionHabitat, esperanzaVida, temperaturaCorporal, cantidadHuevos, peso, enPeligroExtincion, dieta);
        this.longitud = longitud;
        this.especie = especie;
        this.colorPiel = colorPiel;
        this.venenosa = venenosa;
        this.tipoVeneno = tipoVeneno;
    }

    //Setters & getters
    public double getLongitud() {
		return this.longitud;
	}

	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}

	public String getEspecie() {
		return this.especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getColorPiel() {
		return this.colorPiel;
	}

	public void setColorPiel(String colorPiel) {
		this.colorPiel = colorPiel;
	}

	public boolean getVenenosa() {
		return this.venenosa;
	}

	public void setVenenosa(boolean venenosa) {
		this.venenosa = venenosa;
	}

	public String getTipoVeneno() {
		return this.tipoVeneno;
	}

	public void setTipoVeneno(String tipoVeneno) {
		this.tipoVeneno = tipoVeneno;
	}

    //Methods
    public double tamañoRecinto() {
        return 0.0;
    }

    public double comidaDiaria() {
        return 0.0;
    }

    public double costoMantenimiento() {
        return 0.0;
    }

    public String getInfo(){
        return "Serpiente: " + super.getInfo() + ", longitdud: " + this.longitud +  ", especie: " + this.especie + ", color de piel: " + this.venenosa + "tipo de veneno: " + this.tipoVeneno ;
    }
}