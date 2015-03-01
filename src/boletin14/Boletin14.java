package boletin14;

public class Boletin14 {

    public static void main(String[] args) throws TemperaturaErradaExcepcion {
        ConversorTemperaturas obx = new ConversorTemperaturas();
        obx.centigradosAFharenheit(obx.introduceTa());
        do {
            obx.centígradosAReamur(obx.introduceTa());
        } while (ConversorTemperaturas.reamur == 0);
    }
}
