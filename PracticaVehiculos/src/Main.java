public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Vehiculos datos = new Vehiculos();
        Vehiculos datos1 = new Vehiculos();
        Vehiculos datos2 = new Vehiculos();
        Vehiculos datos3 = new Vehiculos();
        Vehiculos datos4 = new Vehiculos();

        System.out.println("datos de auto 1: ");
        datos1.car1(datos1);
        System.out.println("datos de auto 2: ");
        datos2.car2(datos2);
        System.out.println("datos de auto 3: ");
        datos3.car3(datos3);
        System.out.println("datos de auto 4: ");
        datos4.car4(datos4);
        System.out.println("Impresion");
        datos.impresion(datos1,datos2,datos3,datos4);
    }
}