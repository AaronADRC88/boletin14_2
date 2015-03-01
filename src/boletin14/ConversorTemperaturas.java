package boletin14;

import javax.swing.JOptionPane;

public class ConversorTemperaturas {

    public ConversorTemperaturas() {
    }
    static final int tmin = 80;
    private float centigrados;
    static float reamur = 0;
    public float getCentigrados() {
        return centigrados;
    }

    public ConversorTemperaturas(float centigrados) {
        this.centigrados = centigrados;
    }

    public float introduceTa() {
        float ta;
        ta = Float.parseFloat(JOptionPane.showInputDialog("Introduce tª en ºC"));
        return ta;
    }

    public float centigradosAFharenheit(float centigrados) throws TemperaturaErradaExcepcion {
        if (centigrados < tmin) {
            throw new TemperaturaErradaExcepcion("tª ten que ser >=80º");
        }
        float fharenheit;
        fharenheit = (float) ((9.0 / 5.0) * (centigrados + 32.4));
        JOptionPane.showMessageDialog(null, "fharenheit=" + fharenheit);
        return fharenheit;
    }

    public float centígradosAReamur(float centigrados) {
        
     
        if (centigrados >= tmin) {
            reamur = (float) ((4.0 / 5.0) * (centigrados));
            JOptionPane.showMessageDialog(null,"reamur: "+ reamur);
            return reamur;
        } else {
            JOptionPane.showMessageDialog(null, "tª ten que ser >=80º", "", JOptionPane.WARNING_MESSAGE);
            return reamur;
        }
       
    }

}
