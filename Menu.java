import java.util.LinkedList; 
import java.util.Queue; 
import java.util.Scanner; 
 
public class Menu { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        Queue<ObjCliente> cola = new LinkedList<>(); 
        Metodos m = new Metodos(); 
        int opt = 0; 
 
        while (opt != 7) { 
            System.out.println("\n--- CALL CENTER ---"); 
            System.out.println("1) Registrar llamada"); 
            System.out.println("2) Mostrar llamadas"); 
            System.out.println("3) Atender"); 
            System.out.println("4) Transferir"); 
            System.out.println("5) Cancelar"); 
            System.out.println("6) Actualizar / finalizar"); 
            System.out.println("7) Salir"); 
            opt = sc.nextInt(); 
 
            switch (opt) { 
                case 1: cola = m.RegistrarCliente(cola, sc); break; 
                case 2: m.Mostrar(cola); break; 
                case 3: m.Atender(cola); break; 
                case 4: m.Transferir(cola); break; 
                case 5: m.Cancelar(cola, sc); break; 
                case 6: 
                
                    System.out.println("1) Actualizar 2) Finalizar"); 
                    int x = sc.nextInt(); 
                    if (x == 1) m.Actualizar(cola, sc); 
                    else m.Finalizar(cola); 
                    break; 
            } 
        } 
        sc.close(); 
    } 
} 

 