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
        double longitudReptil = this.getLongitud();
        if (longitudReptil < 0.2) {
            // Reptiles pequeños (menos de 20 cm de longitud)
            return 0.75; // 0.75 metros cuadrados (7.5 pies cuadrados)
        } else if (longitudReptil >= 0.2 && longitudReptil < 0.4) {
            // Reptiles medianos (20-40 cm de longitud)
            return 1.5; // 1.5 metros cuadrados (15 pies cuadrados)
        } else if (longitudReptil >= 0.4 && longitudReptil < 1) {
            // Reptiles medianos/grandes (40 cm - 1 metro de longitud)
            return 3; // 3 metros cuadrados
        } else if (longitudReptil >= 1 && longitudReptil < 2) {
            // Reptiles grandes (1-2 metros de longitud)
            return 5; // 5 metros cuadrados (50 pies cuadrados)
        } else {
            // Reptiles muy grandes (más de 2 metros de longitud)
            return 7; // 7 metros cuadrados (70 pies cuadrados)
        }
        return 0;
    }

    public String getInfo() {
        return "Reptil Acuatico: " + super.getInfo() + ", Tipo Agua: " + this.tipoAgua + ", Velocidad Nado: "
                + this.velocidadNado + ", Duracion Buceo: " + this.duracionBuceo + ", Longitud (cm): " + this.longitud;
    }
}