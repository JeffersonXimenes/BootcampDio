package one.innovation.digital.imc;

import one.innovation.digital.pessoa.Pessoa;

public class CalculadorDeImc {

    /**
     * MENOR QUE 18,5       MAGREZA         0
     * ENTRE 18,5 E 24,9    NORMAL          0
     * ENTRE 25,0 E 29,9    SOBREPESO       I
     * ENTRE 30,0 E 39,9    OBESIDADE       II
     * MAIOR QUE 40,0       OBESIDADE GRAVE III
     */
    public Double calcula(final Pessoa pessoa) {
        final var altura = pessoa.getAltura();
        final var imc = pessoa.getPeso() / (altura * altura);

        if(imc <= 18.5) {
        	System.out.println("MAGREZA: " + imc);
        } else if (imc >= 18.5 && imc <= 24.9 ) {
        	System.out.println("NORMAL: " + imc);
        } else if (imc >= 25.0 && imc <= 29.9) {
        	System.out.println("SOBREPESO I: " + imc);
        } else if (imc >= 30.0 && imc <= 39.9) {
        	System.out.println("OBESIDADE II: " + imc);
        } else if (imc >= 40.0) {
        	System.out.println("OBESIDADE GRAVE III: " + imc);
        }
        return imc;
    }
}
