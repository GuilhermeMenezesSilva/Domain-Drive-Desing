import javax.swing.JOptionPane;

public class Habilitacao{
    public static void main(String[] args) {

        int idade = Integer.valueOf(JOptionPane.showInputDialog(null, "Digite sua idade"));

        if (idade < 0){
            JOptionPane.showMessageDialog(null, "Idade inválida");
        }else{
            if (idade >= 18){
                JOptionPane.showMessageDialog(null, "Você pode tirar a CNH");
            }else{
                JOptionPane.showMessageDialog(null, "Você não pode tirar a CNH");
            }
        }
    }
}