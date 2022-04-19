public class TesteSobrecargaSoma {
    public static void main(String[] args) {
        int x = 1, y = 2, z = 3;
        String s1 = "50", s2 = "60";
        float f1 = 56.7f, f2 = 0.3f;

        Calculadora c = new Calculadora();

        float resFloat = c.somar(f1, f2);

        int resInt = c.somar(x, y);

        int resIntString = c.somar(x, s1);

        int resStringInt = c.somar(s1, x);

        int resStringString = c.somar(s1, s2);

        int resIntIntInt = c.somar(x, y, z);

       int resSubtracao = c.subtrair(3, 2);

       c.subtrair(5, 3);

        
        
        
    }
}
