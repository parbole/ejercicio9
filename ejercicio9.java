import java.util.Scanner;

public class ejercicio9{
    public static void main(String[] args) {
        double flacos, gordos, dias, sillas_gordos, comida_gordos, comida_flacos, total_platos, valor_platos, numero_habitaciones,
        valor_habitaciones_dia, valor_habitaciones_total, resultado;
        
        System.out.print("Bienvenido" + "\n" + "Digite la cantidad de estudiantes flacos: " + "\n");
        Scanner teclado = new Scanner(System.in);
        flacos = teclado.nextDouble();
        
        System.out.print("Digite la cantidad de estudiantes gordos: " + "\n");
        gordos = teclado.nextDouble();
        
        System.out.print("Digite la cantidad de dias que durara el paseo: " + "\n");
        dias = teclado.nextDouble();
        
        //calculamos el total de sillas que ocuparan los gordos en el bus
        sillas_gordos = gordos * 2;
        resultado = Math.ceil((sillas_gordos + flacos) / 60);
        System.out.print("El numero de buses necesarios para transportar a los " +  (gordos + flacos) + " estudiantes es: " +  resultado + "\n");
        
        //sacamos la cantidad de platos de cada estudiante
        comida_gordos = gordos * 5;
        comida_flacos = flacos * 3;
        total_platos = comida_gordos + comida_flacos;
        System.out.print("La cantidad de platos de comida que se serviran durante el paseo son: " +  (total_platos * dias) + "\n");
        
        //calculamos el valor total de los platos
        valor_platos = (total_platos * 10000) * dias;
        System.out.print("El valor total de los platos es $" +  valor_platos + " por los  " + dias + " dias que dura el paseo" + "\n");
        
        //calculamos el numero de habitaciones necesarias
        numero_habitaciones = Math.ceil((gordos + flacos) / 4);
        System.out.print("Se necesitan: " +  numero_habitaciones + " habitacion para  los  " + (gordos + flacos) + " estudiantes" + "\n");
        
        //hallamos el valor de la habitacion por dia
        valor_habitaciones_dia = numero_habitaciones * 25000;
        System.out.print("El valor de las: " +  numero_habitaciones + " habitaciones por dia es   " + valor_habitaciones_dia + "\n");
        
        //hallamos el valor de la habitacion por dia
        valor_habitaciones_total = valor_habitaciones_dia * dias;
        System.out.print("El valor total de las: " +  numero_habitaciones + " habitaciones es   " + valor_habitaciones_total + " por la estadia de todos los dias "+ "\n");
        
        
    }
}