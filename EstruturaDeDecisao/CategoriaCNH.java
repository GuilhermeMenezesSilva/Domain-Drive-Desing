import javax.swing.JOptionPane;

public class CategoriaCNH{
    public static void main(String[] args) {

        String categoria = JOptionPane.showInputDialog("Digite a categoria da sua carta");
        char charCategoria = categoria.toUpperCase().charAt(0);

        switch (charCategoria) {
            case 'A':
                JOptionPane.showMessageDialog(null, "Moto");
                break;
            case 'B':
                JOptionPane.showMessageDialog(null, "Carro");
                break;
            case 'C':
                JOptionPane.showMessageDialog(null, "Caminhão");
                break;
            case 'D':
                JOptionPane.showMessageDialog(null, "Onibus");
                break;
            case 'E':
                JOptionPane.showMessageDialog(null, "Transportador");
            default:
                JOptionPane.showMessageDialog(null, "Opção inválida");
                break;
        }
    }
}