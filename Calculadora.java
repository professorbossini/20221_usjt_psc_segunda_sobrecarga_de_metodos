public class Calculadora{
    //tipo de retorno
    //nome
    //lista de parâmetros
    //corpo
    //essa é a definição do método somar
    //aqui eu disse que ele existe
    public int somar(int a, int b){
        return a + b;
    }

    public float somar (float a, float b){
        return a + b;
    }

    public int somar (String a, String b){
        return Integer.parseInt(a) + Integer.parseInt(b);
    }

    public int somar (int a, int b, int c){
        return a + b + c;
    }

    public int somar (String a, int b){
        return Integer.parseInt(a) + b;    
    }

    public int somar (int a, String b){
        return a + Integer.parseInt(b);
    }

    public int subtrair(int a, int b){
        return a - b;    
    }

    public float subtrair (int x, int y){
        return x - y;
    }

    public int multiplicar(int a, int b){
        return a * b;
    }

    public int dividir (int a, int b){
        //divisão inteira
        return a / b;
    }

}