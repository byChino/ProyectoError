package Errores_U1;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class serie_Taylor extends JFrame {

    private JPanel panel;

    public serie_Taylor() {
        setTitle("Estrella");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLocationRelativeTo(null);
        setResizable(false);
        setExtendedState(MAXIMIZED_BOTH);
        agregarPanel();
    }

    public void agregarPanel() {
        panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.white);

        this.add(panel);
    }

    public void Operacion() {
        double Xi, h, et, ea;
        Xi = Math.PI / 2;
        h = Math.PI / 2;
        for (int i = 0; i <= 12; i++) {
            double numerador = 0,  resultado = 0, R = 0, elevado;
            int j = 0, t = 0;
            if (i == 0) {
                resultado = Xi - 1 - (Math.sin(Xi)) / 2;
            } else if (i == 1) {
                R = (1 - (Math.cos(Xi)) / 2) * h;

            } else if (i % 2 == 0) {

                if (j % 2 == 0) {
                    j++;
                    numerador = ((Math.sin(Xi)) / 2) * Math.pow(h, i);
                } else {
                    j++;
                    numerador = (-(Math.sin(Xi)) / 2) * Math.pow(h, i);
                }

            } else {
                if (t % 2 == 0) {
                    t++;
                    numerador = ((Math.cos(Xi)) / 2) * Math.pow(h, i);
                } else {
                    t++;
                    numerador = (-(Math.cos(Xi)) / 2) * Math.pow(h, i);
                }
            }
            double denominador = factorial(i+1);
            double denomidaor;
            double R = numerador / denomidaor;
            resultado = +R;
        }
        



}
        public static double factorial(double n) {
        double resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }

public static void main(String[] args) {
        serie_Taylor s = new serie_Taylor();
        s.setVisible(true);
    }

}
