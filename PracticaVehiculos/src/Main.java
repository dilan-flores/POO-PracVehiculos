public class Main {
    public static void main(String[] args) {
        Vehiculos datos = new Vehiculos();
        Vehiculos datos1 = new Vehiculos();
        Vehiculos datos2 = new Vehiculos();
        Vehiculos datos3 = new Vehiculos();
        Vehiculos datos4 = new Vehiculos();
        Vehiculos datos5 = new Vehiculos();
        Vehiculos menu_de_opciones = new Vehiculos();
        int opciones = 0;
        boolean salir = false;
        while (!salir) {
            switch (menu_de_opciones.menu()) {
                case 1:
                    System.out.println("");
                    System.out.println("               *REGISTRE SUS VEHICULOS*        ");
                    System.out.println("");
                    System.out.println("-----------------------------");
                    System.out.println("| Registro del 1er vehiculo |");
                    System.out.println("-----------------------------");
                    datos1.car1(datos1);
                    System.out.println("-----------------------------");
                    System.out.println("| Registro del 2do vehiculo |");
                    System.out.println("-----------------------------");
                    datos2.car2(datos2);
                    System.out.println("-----------------------------");
                    System.out.println("| Registro del 3er vehiculo |");
                    System.out.println("-----------------------------");
                    datos3.car3(datos3);
                    System.out.println("-----------------------------");
                    System.out.println("| Registro del 4to vehiculo |");
                    System.out.println("-----------------------------");
                    datos4.car4(datos4);
                    System.out.println("-----------------------------");
                    System.out.println("| Registro del 5to vehiculo |");
                    System.out.println("-----------------------------");
                    datos5.car5(datos5);
                    break;
                case 2:
                    System.out.println("-----------------------------------");
                    System.out.println("| AUTOS REGISTRADOS EN EL SISTEMA |");
                    System.out.println("-----------------------------------");
                    datos.impresion(datos1, datos2, datos3, datos4, datos5);
                    break;
                case 3:
                    salir = true;
                    break;
                default:
                    System.out.println("-------------------");
                    System.out.println("| OPCION NO VALIDA|");
                    System.out.println("-------------------");
            }
        }
        System.out.println("-------------------------");
        System.out.println("| GRACIAS VUELVA PRONTO |");
        System.out.println("-------------------------");
    }
}