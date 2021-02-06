package lab3_karimguifarro_angelponce;

import java.util.*;

public class Lab3_KarimGuifarro_AngelPonce {

    public static Scanner KaOz = new Scanner(System.in);
    public static ArrayList<Corporaciones> corp = new ArrayList();
    public static ArrayList<Marcas> marcas = new ArrayList();
    public static ArrayList<Fabricas> fabricas = new ArrayList();
    public static ArrayList<Divisiones_Tech> tech = new ArrayList();
    public static ArrayList<Modelos> modelos = new ArrayList();

    public static void main(String[] args) {
        char k = 'c';
        while (k == 'c') {
            System.out.print("*****Menu*****\n"
                    + "1) Corporaciones\n"
                    + "2) Marcas\n"
                    + "3) Modelos\n"
                    + "4) Fábricas\n"
                    + "5) Divisiones Tecnologicas\n"
                    + "6) Informe Total\n"
                    + "7) Salir\n");
            int op = KaOz.nextInt();
            switch (op) {
                case 1: {
                    System.out.print("1) Crear\n"
                            + "2) Modificar\n"
                            + "3) Listar\n"
                            + "4) Eliminar\n"
                            + "5) Salir");
                    int p = KaOz.nextInt();
                    switch (p) {
                        case 1: {
                            System.out.println("Agregando corporacion...");
                            System.out.print("Ingrese nombre: ");
                            String nombre = KaOz.next();
                            System.out.print("Ingrese sede: ");
                            String sede = KaOz.next();
                            System.out.print("Ingrese anio de funcacion: ");
                            int yearfoundation = KaOz.nextInt();
                            System.out.print("Nombre de CEO o presidente: ");
                            String presidente = KaOz.next();
                            System.out.print("Numero total de empleados: ");
                            int empleados = KaOz.nextInt();
                            System.out.println("Cantidad de autos que se pueden fabricar: ");
                            int cantAutos = KaOz.nextInt();
                            corp.add(new Corporaciones(nombre, sede, yearfoundation, presidente, empleados, cantAutos));
                        }
                        break;
                        case 2: {
                             System.out.println("Listando corporaciones...");
                            for (Object t : corp) {
                                System.out.println(corp.indexOf(t)+":\n"+t);
                            }
                        }
                        break;
                        case 3: {
                             System.out.println("Modificando corporaciones...");
                            System.out.println("Ingrese posicion de la corporacion a modificar: ");
                            int pos=KaOz.nextInt();
                            
                            System.out.print("Ingrese nombre: ");
                            String nombre=KaOz.next();
                            corp.get(pos).setNombre(nombre);
                            System.out.print("Ingrese sede: ");
                            String sede=KaOz.next();
                            corp.get(pos).setSede(sede);
                            System.out.print("Ingrese anio de funcacion: ");
                            int yearfoundation=KaOz.nextInt();
                            corp.get(pos).setYearfoundation(yearfoundation);
                            System.out.print("Nombre de CEO o presidente: ");
                            String presidente=KaOz.next();
                            corp.get(pos).setPresidente(presidente);
                            System.out.print("Numero total de empleados: ");
                            int empleados=KaOz.nextInt();
                            corp.get(pos).setNumEmpleados(empleados);
                            System.out.println("Cantidad de autos que se pueden fabricar: ");
                            int cantAutos=KaOz.nextInt();
                            corp.get(pos).setCantAutos(cantAutos);
                            System.out.println("Se modificó!");
                        }
                        break;
                        case 4: {
                            Print(corp);
                            System.out.println("Que desea modificar:");
                            int mod = KaOz.nextInt();
                            while (mod < 0 || mod > corp.size()) {
                                System.out.println("No existe");
                                Print(corp);
                                System.out.println("Igrese de nuevo el valor:");
                            }
                            corp.remove(mod);
                        }
                        break;
                        case 5: {
                            break;
                        }
                        default:
                            System.out.println("Ingrese de nuevo el valor");
                    }
                }
                case 2: {
                    if (fabricas.isEmpty()) {
                        System.out.println("Debe crear una fabrica por lo menos");
                        break;
                    }
                    System.out.print("1) Crear\n"
                            + "2) Modificar\n"
                            + "3) Listar\n"
                            + "4) Eliminar\n"
                            + "5) Salir");
                    int p = KaOz.nextInt();
                    switch (p) {
                        case 1: {
                            System.out.println("Agregando marcas...");
                            for (int i = 0; i < corp.size(); i++) {
                                System.out.println("Posicion " + i + ": " + corp.get(i).getNombre());
                            }
                            System.out.println("Ingrese la posicion de la corporacion: ");
                            int posicion = KaOz.nextInt();
                            System.out.println(corp.get(p).getNombre());
                            String nombre, slogan, fundador, presidente;
                            int yearfundacion, yearIntegro, numModelos; //número de modelos: size del arraylist Modelos;
                            double totalVentas;
                                numModelos=modelos.size();
                            System.out.println("Ingrese nombre de la marca: ");
                            nombre = KaOz.next();
                            System.out.println("Ingrese slogan: ");
                            slogan = KaOz.next();
                            System.out.println("Fundador: ");
                            fundador = KaOz.next();
                            System.out.println("Nombre del presidente de marca: ");
                            presidente = KaOz.next();
                            System.out.println("Anio de fundacion de la marca: ");
                            yearfundacion = KaOz.nextInt();
                            System.out.println("Anio de integracion: ");
                            yearIntegro = KaOz.nextInt();
                            System.out.println("Total de ventas: ");
                            totalVentas = KaOz.nextDouble();
                            marcas.add(new Marcas(nombre, slogan, fundador, presidente, yearfundacion, yearIntegro, numModelos, totalVentas));
                        }
                        break;
                        case 2: {
                            System.out.println("Listando marcas...");
                            for(int i=0; i<marcas.size(); i++){
                                System.out.println(marcas.get(i));
                            }
                        }
                        break;
                        case 3: {
                            System.out.println("Modificando marcas...");
                            System.out.println("Ingrese posicion de la marca a modificar: ");
                            int pos=KaOz.nextInt();
                            String nombre, slogan, fundador, presidente;
                            int yearfundacion, yearIntegro, numModelos; //número de modelos: size del arraylist Modelos;
                            double totalVentas;
                            System.out.println("Ingrese nombre de la marca: ");
                            nombre=KaOz.next();
                            marcas.get(pos).setNombre(nombre);
                            
                            System.out.println("Ingrese slogan: ");
                            slogan=KaOz.next();
                            marcas.get(pos).setSlogan(slogan);
                            System.out.println("Fundador: ");
                            fundador=KaOz.next();
                            marcas.get(pos).setFundador(fundador);
                            System.out.println("Nombre del presidente de marca: ");
                            presidente=KaOz.next();
                            marcas.get(pos).setPresidente(presidente);
                            System.out.println("Anio de fundacion de la marca: ");
                            yearfundacion=KaOz.nextInt();
                            marcas.get(pos).setYearfundacion(yearfundacion);
                            System.out.println("Anio de integracion: ");
                            yearIntegro=KaOz.nextInt();
                            marcas.get(pos).setYearIntegro(yearIntegro);
                            System.out.println("Total de ventas: ");
                            totalVentas=KaOz.nextDouble();
                            marcas.get(pos).setTotalVentas(totalVentas);
                            System.out.println("Se modificó la marca!");
                        }
                        break;
                        case 4: {
                             Print2(marcas);
                            System.out.println("Que desea modificar:");
                            int mod = KaOz.nextInt();
                            while (mod < 0 || mod > marcas.size()) {
                                System.out.println("No existe");
                                Print2(marcas);
                                System.out.println("Igrese de nuevo el valor:");
                            }
                            marcas.remove(mod);
                        }
                        break;
                        case 5: {
                            break;
                        }
                        default:
                            System.out.println("Ingrese de nuevo el valor");
                    }
                }
                case 3: {
                     if (fabricas.isEmpty()) {
                        System.out.println("Debe crear una fabrica por lo menos");
                        break;
                    }else if (marcas.isEmpty()) {
                          System.out.println("Debe crear una marca por lo menos");
                        break;
                    }
                    System.out.print("1) Crear\n"
                            + "2) Modificar\n"
                            + "3) Listar\n"
                            + "4) Eliminar\n"
                            + "5) Salir");
                    int v = KaOz.nextInt();
                    switch (v) {
                        case 1: {
                             System.out.println("Agregando modelos...");
                                System.out.println("Corporaciones disponibles: ");
                                for(int i=0; i<corp.size(); i++){
                                    System.out.println("Posicion "+i+": "+corp.get(i).getNombre());
                                }
                                System.out.println("Ingrese la posicion de la corporacion: ");
                                int p=KaOz.nextInt();
                                
                                System.out.println("Marcas existentes de esa Corporacion:");
                                for(int i=0; i<corp.get(p).getMarcas().size(); i++){
                                    System.out.println(i+" "+corp.get(p).getMarcas().get(i).getNombre());
                                }
                                System.out.println("Ingrese posicion de marca: ");
                                int pos=KaOz.nextInt();
                                
                                String nombre, anioFabricacion, tipoMotor, cilindradaMotor, precio, tecnologias; 
                                System.out.println("Ingrese nombre: ");
                                nombre=KaOz.next();
                                System.out.println("Anio de fabricacion: ");
                                anioFabricacion=KaOz.next();
                                System.out.println("Tipo de mototr: ");
                                tipoMotor=KaOz.next();
                                System.out.println("Cilindrada de motor: ");
                                cilindradaMotor=KaOz.next();
                                System.out.println("Ingrese precio: ");
                                precio=KaOz.next();
                                System.out.println("Tecnologias: ");
                                tecnologias=KaOz.next();
                                System.out.println("Carrocerias");
                                System.out.println("1. Hatchback");
                                System.out.println("2. Sedan");
                                System.out.println("3. SUV");
                                System.out.println("Eliga: ");
                                int elig=KaOz.nextInt();
                                if(elig==1){
                                    int capacidadMaletero, longitudTotal, bolsasDeAire;
                                    System.out.println("Capacidad de maletero: ");
                                    capacidadMaletero=KaOz.nextInt();
                                    System.out.println("Longitud: ");
                                    longitudTotal=KaOz.nextInt();
                                    System.out.println("Bolsas de aire cantidad: ");
                                    bolsasDeAire=KaOz.nextInt();
                                    modelos.add(new MoHatchback(capacidadMaletero,longitudTotal,bolsasDeAire,nombre,anioFabricacion,tipoMotor,cilindradaMotor,precio,tecnologias));
                                    marcas.get(pos).setModelos(modelos);
                                }
                                else if(elig==2){
                                    String AndroidPlay="no", AndroidAuto="no";
                                    //AndroidPlay es SI o NO
                                    ArrayList<String> asistentesDeConduccion = new ArrayList();
                                    System.out.println("AndroidPlay? [s/n]: ");
                                    AndroidPlay=KaOz.next();
                                    System.out.println("Android Auto [s\n]: ");
                                    AndroidAuto=KaOz.next();
                                    System.out.println("Cuantos asistentes de conduccion?: ");
                                    int asis=KaOz.nextInt();
                                    for(int i=0;i<asis; i++){
                                        System.out.println("Ingrese asistente de conduccion: ");
                                        String asistente=KaOz.next();
                                        asistentesDeConduccion.add(asistente);
                                    }
                                    modelos.add(new MoSedan(AndroidPlay,AndroidAuto,asistentesDeConduccion,nombre,anioFabricacion,tipoMotor,cilindradaMotor,precio,tecnologias));
                                    marcas.get(pos).setModelos(modelos);
                                }
                        }
                        break;
                        case 2: {
                             System.out.println("Listando modelos...");
                            for(int i=0; i<modelos.size(); i++){
                                System.out.println(modelos.get(i));
                            }
                        }
                        break;
                        case 3: {

                        }
                        break;
                        case 4: {
                             Print4(modelos);
                            System.out.println("Que desea modificar:");
                            int mod = KaOz.nextInt();
                            while (mod < 0 || mod > modelos.size()) {
                                System.out.println("No existe");
                                Print2(modelos);
                                System.out.println("Igrese de nuevo el valor:");
                            }
                            marcas.remove(mod);
                        }
                        break;
                        case 5: {
                            break;
                        }
                        default:
                            System.out.println("Ingrese de nuevo el valor");
                    }
                }
                case 4: {
                     if (fabricas.isEmpty()) {
                        System.out.println("Debe crear una fabrica por lo menos");
                        break;
                    }
                    System.out.print("1) Crear\n"
                            + "2) Modificar\n"
                            + "3) Listar\n"
                            + "4) Eliminar\n"
                            + "5) Salir");
                    int p = KaOz.nextInt();
                    switch (p) {
                        case 1: {
                            System.out.println("Ingrese el nombre");
                            String nombre = KaOz.next();
                            System.out.println("Ingrese la ubicacion");
                            String ubicacion = KaOz.next();
                            System.out.println("Ingrese la cantidad de empleados");
                            int cant_empleados = KaOz.nextInt();
                            System.out.println("Ingrese la cantidad maxima de modelos");
                            int cantmax_modelos = KaOz.nextInt();
                            System.out.println("Ingrese el tipo de carroceria");
                            String tipo_carroceria = KaOz.next();
                            System.out.println("Ingrese el nombre de las marcas");
                            String nombre_marcas = KaOz.next();
                            System.out.println("Ingrese la cantidad de autos");
                            int cant_autos = KaOz.nextInt();
                            fabricas.add(new Fabricas(nombre, ubicacion, tipo_carroceria, nombre_marcas, cantmax_modelos, cant_empleados, cant_autos));
                        }
                        break;
                        case 2: {

                        }
                        break;
                        case 3: {

                        }
                        break;
                        case 4: {

                        }
                        break;
                        case 5: {
                            break;
                        }
                        default:
                            System.out.println("Ingrese de nuevo el valor");
                    }
                }
                case 5: {
                     if (fabricas.isEmpty()) {
                        System.out.println("Debe crear una fabrica por lo menos");
                        break;
                    }
                    System.out.print("1) Crear\n"
                            + "2) Modificar\n"
                            + "3) Listar\n"
                            + "4) Eliminar\n"
                            + "5) Salir");
                    int p = KaOz.nextInt();
                    switch (p) {
                        case 1: {
                            System.out.println("Ingrese el nombre");
                            String nombre = KaOz.next();
                            System.out.println("Ingrese el año en el que se creo");
                            int año_creacion = KaOz.nextInt();
                            System.out.println("Ingrese el campo");
                            String campo = KaOz.next();
                            System.out.println("Ingrese la tecnologia desarrollada");
                            String tech_desarrollada = KaOz.next();
                            Print(corp);
                            int sel=KaOz.nextInt();
                             while (sel < 0 || sel > corp.size()) {
                                System.out.println("No existe");
                                Print(corp);
                                System.out.println("Igrese de nuevo el valor:");
                                sel=KaOz.nextInt();
                            }
                            Corporaciones corporacion = corp.get(sel);
                            tech.add(new Divisiones_Tech(nombre, campo, tech_desarrollada, año_creacion,corporacion));

                        }
                        break;
                        case 2: {
                            Print3(tech);
                        }
                        break;
                        case 3: {
                             Print(tech);
                            int mod=KaOz.nextInt();
                             while (mod < 0 || mod > corp.size()) {
                                System.out.println("No existe");
                                Print(tech);
                                System.out.println("Igrese de nuevo el valor:");
                                mod=KaOz.nextInt();
                            }
                            System.out.println("Ingrese el nombre");
                            String nombre = KaOz.next();
                            System.out.println("Ingrese el año en el que se creo");
                            int año_creacion = KaOz.nextInt();
                            System.out.println("Ingrese el campo");
                            String campo = KaOz.next();
                            System.out.println("Ingrese la tecnologia desarrollada");
                            String tech_desarrollada = KaOz.next();
                            Print(corp);
                            int sel=KaOz.nextInt();
                             while (sel < 0 || sel > corp.size()) {
                                System.out.println("No existe");
                                Print(corp);
                                System.out.println("Igrese de nuevo el valor:");
                                sel=KaOz.nextInt();
                            }
                            Corporaciones corporacion = corp.get(sel);
                            tech.get(mod).setNombre(nombre);
                             tech.get(mod).setAño_creacion(año_creacion);
                              tech.get(mod).setCampo(campo);
                               tech.get(mod).setTech_desarrollada(tech_desarrollada);
                                tech.get(mod).setCorporacion(corporacion);
                                 
                        }
                        break;
                        case 4: {
                             Print3(tech);
                            System.out.println("Que desea modificar:");
                            int mod = KaOz.nextInt();
                            while (mod < 0 || mod > tech.size()) {
                                System.out.println("No existe");
                                Print3(tech);
                                System.out.println("Igrese de nuevo el valor:");
                            }
                            tech.remove(mod);
                        }
                        
                        break;
                        case 5: {
                            break;
                        }
                        default:
                            System.out.println("Ingrese de nuevo el valor");
                    }
                }
                case 6: {

                }
                case 7: {
                    k = 'l';
                }
                default:
                    System.out.println("Ingrese de nuevo el valor");
            }
        }
    }

    static void Print(ArrayList corp) {
        for (int i = 0; i < corp.size(); i++) {
                System.out.println("[" + corp.get(i) + "]");
           
        }
    }
    static void Print1(ArrayList marcas) {
        
        for (int i = 0; i < marcas.size(); i++) {
            
                System.out.println("[" + marcas.get(i) + "]");
        }
    }
    static void Print4(ArrayList modelos) {
        
        for (int i = 0; i < modelos.size(); i++) {
            
                System.out.println("[" + modelos.get(i) + "]");
        }
    }
static void Print2(ArrayList fabricas) {
        for (int i = 0; i < corp.size(); i++) {
                System.out.println("[" + fabricas.get(i) + "]");
           
        }
    }
static void Print3(ArrayList tech) {
        for (int i = 0; i < tech.size(); i++) {
                System.out.println("[" + tech.get(i) + "]");
           
        }
    }
}
