import javax.swing.JOptionPane;
public class TesteCalculadora {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        int opcao;
        String menu = "1-Soma\n2-Subtracao\n3-Multiplicacao\n4-Divisao\n";
        opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));
        int operando1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro operando"));
        int operando2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo operando"));
        int resultado = 0;
        //fall-through: lógica em queda
        switch(opcao){
            case 1:
                //isso é uma chamada ao método somar
                //aqui estou colocando ele em execução
                resultado = calc.somar(operando1, operando2);
                break;
            case 2:
                resultado = calc.subtrair(operando1, operando2);
                break;
            case 3:
                resultado = calc.multiplicar(operando1, operando2);
                break;
            case 4:
                resultado = calc.dividir(operando1, operando2);
            

        }
        JOptionPane.showMessageDialog(null, "O resultado é: " + resultado);
    }
}
