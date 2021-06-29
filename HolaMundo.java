// inicia siempre con una clase
class HolaMundo{
    // metodo principal 
    public static void main(String[] args) {
        //impresion en consola
        System.out.println("hola Mundo");
        // Tipos de Dato primitivos enteros, byte, short , int, long
        // long	8	–9,223,372,036,854,775,808 a 9,223,372,036,854,775,807
        // int	4	–2,147,483,648 a 2,147,483,647
        // short	2	–32,768 to 32,767
        // byte	1	–128 to 127
        byte diasMes = 31;
        short diasLustros =(12*31)*5;//por 5 años
        int velocidadLuz=299792458;
        long yearsLuz=velocidadLuz *365;

        System.out.println("esto es un byte");
        System.out.println(diasMes);
        System.out.println("esto es un short");
        System.out.println(diasLustros);
        System.out.println("esto es un int");
        System.out.println(velocidadLuz);
        System.out.println("esto es un long");
        System.out.println(yearsLuz);

        // Tipos de Dato primitivos flotantes float double
        // double	8	4.9e–324 to 1.8e+308
        // float	4	1.4e–045 to 3.4e+038
        float pi = 3.1415926535f;
        double e = 2.718281828459045235360;
            System.out.println("esto es un float ");
            System.out.println(pi);
            System.out.println("esto es un double ");
            System.out.println(e);

        // Tipos de Dato primitivos Textos char String
        // char letraA = 'a';
        // char letraANumerico = 61;
        // String letraA = 'a';
        char Simbolo = '#';
        String texto = "Esto es un texto string";
            System.out.println("esto es un char ");
            System.out.println(Simbolo);
            System.out.println("esto es un String ");
            System.out.println(texto);

        // Tipos de Dato primitivos Boleanos 
        boolean verdadero = true;
        boolean falso = false;
            System.out.println("boolean almacena un boleanos ");
            System.out.println(verdadero);
            System.out.println(falso);

        System.out.println("Multiples variables ");
        // Multiples variables
            int num1=10,num2=20,num3=101;
            System.out.println(num1);
            System.out.println(num2);
            System.out.println(num3);

            
    }
}
