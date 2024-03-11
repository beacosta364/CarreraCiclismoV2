class Escalador extends Ciclista {
    private float aceleracionPromedio;
    private float gradoRampa;

    public Escalador(int identificador, String nombre, int tiempoAcumulado, float aceleracionPromedio, float gradoRampa) {
        super(identificador, nombre, tiempoAcumulado);
        this.aceleracionPromedio = aceleracionPromedio;
        this.gradoRampa = gradoRampa;
    }

    protected float getAceleracionPromedioSubida() {
        return aceleracionPromedio;
    }

    protected void setAceleracionPromedioSubida(float aceleracionPromedio) {
        this.aceleracionPromedio = aceleracionPromedio;
    }

    protected float getGradoRampaSoportada() {
        return gradoRampa;
    }

    protected void setGradoRampaSoportada(float gradoRampa) {
        this.gradoRampa = gradoRampa;
    }

    @Override
    protected String imprimirTipo() {
        return "Es un Escalador";
    }
}
