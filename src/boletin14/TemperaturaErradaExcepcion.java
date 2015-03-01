package boletin14;

public class TemperaturaErradaExcepcion extends Exception {

    public TemperaturaErradaExcepcion() {
        super("tª ten que ser >=80º");
    }

    public TemperaturaErradaExcepcion(String mensaxe) {
        super(mensaxe);
    }

}
