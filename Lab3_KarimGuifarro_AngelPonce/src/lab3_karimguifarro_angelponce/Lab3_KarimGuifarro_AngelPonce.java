package lab3_karimguifarro_angelponce;

import java.util.*;

public class Lab3_KarimGuifarro_AngelPonce {

    public static Scanner KaOz = new Scanner(System.in);
    public static ArrayList<Corporaciones> corp = new ArrayList();
    public static ArrayList<Corporaciones> corporaciones = new ArrayList();
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

                        }
                        break;
                        case 3: {

                        }
                        break;
                        case 4: {
                            Print(corp);
                            System.out.println("Que desea modificar:");
                            int mod = KaOz.nextInt();
                            while (mod < 0 || mod > corp.size()) {
                                System.out.println("No existe este detective");
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
                case 3: {
                    System.out.print("1) Crear\n"
                            + "2) Modificar\n"
                            + "3) Listar\n"
                            + "4) Eliminar\n"
                            + "5) Salir");
                    int p = KaOz.nextInt();
                    switch (p) {
                        case 1: {

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
                case 4: {
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
                            tech.add(new Divisiones_Tech(nombre, campo, tech_desarrollada, año_creacion));

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
        System.out.println("Que estado dese ver?");
        String est = "Premium";
        for (int i = 0; i < corp.size(); i++) {
            if (corp.get(i).equals(est)) {
                System.out.println("[" + corp.get(i) + "]");
            } else {
            }
        }
    }
}
