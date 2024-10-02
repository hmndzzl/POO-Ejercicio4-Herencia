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
    public double TamañoRecinto() {
        if (this.longitud < 1) {
            return 1 + (Math.random() * (2 - 1)); 
        } else if (this.longitud >= 1 && this.longitud <= 2) {
            return 2 + (Math.random() * (4 - 2)); 
        } else {
            return 4 + (Math.random() * (6 - 4)); 
        }
    }

    public double ComidaDiaria() {
        if (this.longitud < 1) {
            return this.peso * (0.02 + Math.random() * (0.05 - 0.02)); 
        } else if (this.longitud >= 1 && this.longitud <= 2) {
            return this.peso * (0.03 + Math.random() * (0.06 - 0.03)); 
        } else {
            return this.peso * (0.04 + Math.random() * (0.08 - 0.04)); 
        }
    }

    public double CostoMantenimientoMensual() {
        double costoMantenimientoDiario;
        if (this.longitud < 1) {
            costoMantenimientoDiario = 50; // para pequeñas
        } else if (this.longitud >= 1 && this.longitud <= 2) {
            costoMantenimientoDiario = 200; // para medianas
        } else {
            costoMantenimientoDiario = 500; // para grandes
        }

        // sumar el costo y multiplicarlo por 30 para sacar el costo menusal
        return (costoMantenimientoDiario + this.ComidaDiaria() * 30) * 30;
		
	}
	public String getInfo(){
        return "Serpiente: " + super.getInfo() + ", longitud: " + this.longitud +  ", especie: " + this.especie + ", color de piel: " + this.venenosa + ", tipo de veneno: " + this.tipoVeneno ;
    }
}