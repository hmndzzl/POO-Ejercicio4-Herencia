public class ReptilAcuatico extends Reptil {
    private String tipoAgua;
    private double velocidadNado;
    private int duracionBuceo;
    private double longitud; // En centímetros (cm)

    // Constructor
    public ReptilAcuatico(String nombreCientifico, String descripcionHabitat, int esperanzaVida,
            double temperaturaCorporal, int cantidadHuevos, double peso, boolean enPeligroExtincion, String dieta,
            double longitud, String tipoAgua, double velocidadNado, int duracionBuceo) {
        super(nombreCientifico, descripcionHabitat, esperanzaVida, temperaturaCorporal, cantidadHuevos, peso,
                enPeligroExtincion, dieta);
        this.tipoAgua = tipoAgua;
        this.longitud = longitud;
        this.velocidadNado = velocidadNado;
        this.duracionBuceo = duracionBuceo;
    }

    // Setters & Getters
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

    public double getLongitud() {
        return this.longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    // Methods
    public double tamañoRecinto() {
        return 0;
    }

    public String getInfo() {
        return "Reptil Acuatico: " + super.getInfo() + ", Tipo Agua: " + this.tipoAgua + ", Velocidad Nado: "
                + this.velocidadNado + ", Duracion Buceo: " + this.duracionBuceo + ", Longitud (cm): " + this.longitud;
    }
}