public final class Temperatura {

    private double temperaturaMedia;
    private String mes;

    public Temperatura() {
    }

    public Temperatura(int mes, double temperaturaMedia) {
        setTemperaturaMedia(temperaturaMedia);

        switch (mes) {
            case 1:
                setMes("Janeiro");
                break;
            case 2:
                setMes("Fevereiro");
                break;
            case 3:
                setMes("Março");
                break;
            case 4:
                setMes("Abril");
                break;
            case 5:
                setMes("Maio");
                break;
            case 6:
                setMes("Julho");
                break;
            case 7:
                setMes("Junho");
                break;
            case 8:
                setMes("Agosto");
                break;
            case 9:
                setMes("Setembro");
                break;
            case 10:
                setMes("Outubro");
                break;
            case 11:
                setMes("Novembro");
                break;
            case 12:
                setMes("Dezembro");
            default:
                throw new AssertionError();
        }
    }

    public String getMes() {
        return mes;
    }

    public double getTemperaturaMedia() {
        return temperaturaMedia;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public void setTemperaturaMedia(double temperaturaMedia) {
        this.temperaturaMedia = temperaturaMedia;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Temperatura{");
        sb.append("temperaturaMedia=").append(temperaturaMedia);
        sb.append(", mes=").append(mes);
        sb.append('}');
        return sb.toString();
    }
    
}
