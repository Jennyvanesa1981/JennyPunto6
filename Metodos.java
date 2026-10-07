import java.util.Queue;
import java.util.Scanner;


public class Metodos {

    public Queue<ObjCliente> RegistrarCliente(Queue<ObjCliente> Llamada, Scanner sc) {

        ObjCliente cliente = new ObjCliente();

        System.out.println("Ingrese el ID de la llamada");
        cliente.setIdLlamada(sc.nextInt());
        sc.nextLine();

        System.out.println("Ingrese el ID del Cliente");
        cliente.setIdCliente(sc.nextInt());

        System.out.println("Ingrese el Nombre del cliente");
        cliente.setNombreCliente(sc.next());

        System.out.println("Ingrese Motivo de la Llamada");
        cliente.setMotivoLlamada(sc.next());

        System.out.println("Horario de atención llamada");
        cliente.setHoraLlamada(sc.next());

        System.out.println("indique la prioridad");
        cliente.setPrioridad(sc.next());


        System.out.println("Estado de llamada");
        cliente.setEstado(sc.nextInt());

        Llamada.offer(cliente);

        System.out.println("Llamada registrada exitosamente.");


         return Llamada;
       
    }

    public Queue<ObjCliente> Mostrar(Queue<ObjCliente> cola) { 
        
        for (ObjCliente cliente : cola) 
            System.out.println(cliente.getIdLlamada()+" "+ cliente.getIdCliente()+" "+ cliente.getMotivoLlamada() 
                    +" "+ cliente.getHoraLlamada()+" P:"+ cliente.getPrioridad()+" "+ cliente.getEstado());
        return cola; 

    } 
 
    public String Estado(int e) { 
        if (e == 1) return "Pendiente"; 
        if (e == 2) return "En llamada"; 
        if (e == 3) return "Transferida"; 
        if (e == 4) return "Cancelada"; 
        return "Finalizada"; 
    } 
 
    public  Queue<ObjCliente> Atender(Queue<ObjCliente> cola) { 
        if (!cola.isEmpty()) cola.peek().setEstado(2); 

        return cola;
    } 
 
    public Queue<ObjCliente> Transferir(Queue<ObjCliente> cola) { 

        for(ObjCliente cliente : cola) {

             if (!cola.isEmpty() && cola.peek().getEstado() == 2); 
            cola.peek().setEstado(3); 

        return cola;


        }
        return cola;
       
    } 
 
    public Queue<ObjCliente> Cancelar(Queue<ObjCliente> cola, Scanner sc) { 
        System.out.println("ID:"); 
        int id = sc.nextInt(); 
        for (ObjCliente cliente : cola) 
            if (cliente.getIdLlamada() == id) { 
                cliente.setEstado(4); cola.remove(cliente); 
                
            } 
            return cola;
    } 
 
    public Queue<ObjCliente> Actualizar(Queue<ObjCliente> cola, Scanner sc) { 
        System.out.println("ID:"); 
        int id = sc.nextInt(); 
        for (ObjCliente cliente : cola) 
            if (cliente.getIdLlamada() == id && cliente.getEstado() == 1) { 
                System.out.println("Nuevo motivo:"); 
                cliente.setMotivoLlamada(sc.next()); 
            } 
            return cola;
    } 
 
    public Queue<ObjCliente> Finalizar(Queue<ObjCliente> cola) { 
        if (!cola.isEmpty() && cola.peek().getEstado() == 2) { 
            cola.peek().setEstado(5); cola.poll(); 
        } 

        return cola;
    } 







   
    
}
    

   
    
    
   
    