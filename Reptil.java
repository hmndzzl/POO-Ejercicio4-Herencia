public class Reptil extends Animal {
	protected double temperaturaCorporal;
	protected int cantidadHuevos;
	protected double peso;
	protected boolean enPeligroExtincion;
	protected String dieta;

	// Constructor
	public Reptil(String nombreCientifico, String descripcionHabitat, int esperanzaVida, double temperaturaCorporal,
			int cantidadHuevos, double peso, boolean enPeligroExtincion, String dieta) {
		super(nombreCientifico, descripcionHabitat, esperanzaVida);
		this.temperaturaCorporal = temperaturaCorporal;
		this.cantidadHuevos = cantidadHuevos;
		this.peso = peso;
		this.enPeligroExtincion = enPeligroExtincion;
		this.dieta = dieta;
	}

	// Setters & getters
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

	// Methods
	public double comidaDiaria() {
		// Dependerá si es serpiente o Reptil Acuático
		if (this instanceof Serpiente) {
			Serpiente serpiente = (Serpiente) this; // Transformo el objeto actual a Serpiente
			if (serpiente.getLongitud() < 1) { // Si la longitud es menor a 1
				return serpiente.getPeso() * (0.02 + Math.random() * (0.05 - 0.02)); // Número random entre 0.02 y 0.05
			} else if (serpiente.getLongitud() >= 1 && serpiente.getLongitud() <= 2) { // si la longitud está entre 1 y
																						// 2
				return serpiente.getPeso() * (0.03 + Math.random() * (0.06 - 0.03)); // Consume entre 3 a 6% de su peso
			} else {
				return serpiente.getPeso() * (0.04 + Math.random() * (0.08 - 0.04)); // Consume entre 4 a 8% de su peso
			}
		} else if (this instanceof ReptilAcuatico) {
			ReptilAcuatico reptilacuatico = (ReptilAcuatico) this;

			if (reptilacuatico.getLongitud() < 0.2) {
				return reptilacuatico.getPeso() * (0.05 + (Math.random() * (0.10 - 0.05))); // 5-10%
			} else if (reptilacuatico.getLongitud() >= 0.2 && reptilacuatico.getLongitud() <= 0.4) {
				return reptilacuatico.getPeso() * (0.08 + (Math.random() * (0.15 - 0.08))); // 8-15%
			} else {
				return reptilacuatico.getPeso() * (0.10 + (Math.random() * (0.20 - 0.10))); // 10-20%
			}

		}
		return 0;
	}

	public double costoMantenimiento() {
		double costoRecintoDiario = 0;

		// Según el tamaño del reptil, se asigna el costo de mantenimiento diario
		if (this instanceof Serpiente) {
			Serpiente serpiente = (Serpiente) this;
			if (serpiente.getLongitud() < 1) {
				costoRecintoDiario = 50; // Pequeña
			} else if (serpiente.getLongitud() >= 1 && serpiente.getLongitud() <= 2) {
				costoRecintoDiario = 200; // Mediana
			} else {
				costoRecintoDiario = 500; // Grande
			}
		} else if (this instanceof ReptilAcuatico) {
			ReptilAcuatico reptilAcuatico = (ReptilAcuatico) this;

			if (reptilAcuatico.getLongitud() < 0.2) {
				costoRecintoDiario = 50; // Pequeña
			} else if (reptilAcuatico.getLongitud() >= 0.2 && reptilAcuatico.getLongitud() <= 0.4) {
				costoRecintoDiario = 200; // Mediana
			} else {
				costoRecintoDiario = 500; // Grande
			}
		}

		// Calcula el costo total mensual (30 días)
		double costoMensualRecinto = costoRecintoDiario * 30;
		double costoMensualComida = comidaDiaria() * 30; // Comida diaria por 30 días

		return costoMensualRecinto + costoMensualComida;
	}

	public String getInfo() {
		return "Reptil: " + super.getNombreCientifico() + ", Esperanza de vida: " + super.getEsperanzaVida()
				+ ", Temperatura corporal: " + this.temperaturaCorporal + ", Cantidad de huevos: " + this.cantidadHuevos
				+ ", Peso: " + this.peso + ", En peligro de extinción: " + this.enPeligroExtincion + ", Dieta: "
				+ this.dieta;
	}

}
