import javax.swing.JOptionPane;

public class IMC{
    public static void main(String[] args) {
        
        double peso = Double.valueOf(JOptionPane.showInputDialog(null, "Digite seu peso: "));
        double altura = Double.valueOf(JOptionPane.showInputDialog(null, "Digite sua altura: "));

        double imc = peso / Math.pow(altura, 2);
        String classificacao  = "";

        if (imc < 18.5)                     classificacao = "Abaixo do peso";
        if (imc >= 18.5 && imc <= 25)       classificacao = "Peso Normal";
        if (imc > 25 && imc <= 29)          classificacao = "Sobrepreso";
        if (imc > 30 && imc <= 34.9)        classificacao = "Obesidade grau I";
        if (imc >= 35 && imc <= 39.9)       classificacao = "Obesidade grau II";
        if (imc > 40)                       classificacao = "Obesidade grau III";

        JOptionPane.showMessageDialog(null, classificacao);
        
    }
}