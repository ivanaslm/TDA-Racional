package CYL;

public class Racional {

    private int numerador = 0;
    private int denominador = 0;

    public Racional(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }//constructor

    public Racional() {
        setNumerador(0);
        setDenominador(1);

    }

    public Racional suma(Racional r1, Racional r2) {
        int a = r1.getNumerador();
        int b = r1.getDenominador();
        int c = r2.getNumerador();
        int d = r2.getDenominador();
//Generar el racional a deolver a través de la sumatoria de r1 y r2
        this.setNumerador((a * d) + (b * c));
        this.setDenominador((b * d));

        return this;
    }//suma

    public Racional resta(Racional r1, Racional r2) {
        int a = r1.getNumerador();
        int b = r1.getDenominador();
        int c = r2.getNumerador();
        int d = r2.getDenominador();
//Generar el racional a deolver a través de la sumatoria de r1 y r2
        this.setNumerador((a * d) - (b * c));
        this.setDenominador((b * d));

        return this;
    }//resta

    public Racional simplificar(Racional r1, Racional r2) {
        int i = 2;
        while ((i < 100) && i <= getNumerador() && i <= getDenominador()) {
            if ((getNumerador() % i == 0) && (getDenominador() % i == 0)) {
                setNumerador(getNumerador() / i);
                setDenominador(getDenominador() / i);
                i = 2;
            } else {
                i++;
            }
        }
        return this;
    }//simplificar

    public int getNumerador() {
        return numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    /**
     * @param numerador the numerador to set
     */
    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    /**
     * @param denominador the denominador to set
     */
    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    @Override
    public String toString() {
        return this.numerador + "/" + this.denominador;
    }

}//clase

