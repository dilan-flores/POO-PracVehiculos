import java.util.Scanner;

public class Vehiculos {

    // ATRIBUTOS
    String marca;
    String modelo;
    int anio_fabricacion;
    String placa;
    String color;
    String combustible;


    Scanner entrada = new Scanner(System.in);

    //CONTRUCTOR
    public Vehiculos() {
        marca = "";
        modelo = "";
        anio_fabricacion = 0;
        placa = "";
        color = "";
        combustible = "";
    }

    //METODOS

    public void car1 (Vehiculos datos1){
        datos1.setMarca(entrada.nextLine());
        datos1.setModelo(entrada.nextLine());
        datos1.setAnio_fabricacion(entrada.nextInt());
        datos1.setPlaca(entrada.nextLine());
        datos1.setColor(entrada.nextLine());
        datos1.setCombustible(entrada.nextLine());
    }

    public void car2 (Vehiculos datos2){
        datos2.setMarca(entrada.nextLine());
        datos2.setModelo(entrada.nextLine());
        datos2.setAnio_fabricacion(entrada.nextInt());
        datos2.setPlaca(entrada.nextLine());
        datos2.setColor(entrada.nextLine());
        datos2.setCombustible(entrada.nextLine());

    }

    public void car3 (Vehiculos datos3){
        datos3.setMarca(entrada.nextLine());
        datos3.setModelo(entrada.nextLine());
        datos3.setAnio_fabricacion(entrada.nextInt());
        datos3.setPlaca(entrada.nextLine());
        datos3.setColor(entrada.nextLine());
        datos3.setCombustible(entrada.nextLine());
    }

    public void car4 (Vehiculos datos4){
        datos4.setMarca(entrada.nextLine());
        datos4.setModelo(entrada.nextLine());
        datos4.setAnio_fabricacion(entrada.nextInt());
        datos4.setPlaca(entrada.nextLine());
        datos4.setColor(entrada.nextLine());
        datos4.setCombustible(entrada.nextLine());
    }

    public void impresion (Vehiculos datos1, Vehiculos datos2, Vehiculos datos3, Vehiculos datos4){
        System.out.println("Marca: " + datos1.getMarca());
        System.out.println("Modelo: " + datos1.getModelo());
        System.out.println("Anio de Fabricación: " + datos1.getAnio_fabricacion());
        System.out.println("Placa: " + datos1.getPlaca());
        System.out.println("Color: " + datos1.getColor());
        System.out.println("Combustible: " + datos1.getCombustible());

        System.out.println("Marca: " + datos2.getMarca());
        System.out.println("Modelo: " + datos2.getModelo());
        System.out.println("Anio de Fabricación: " + datos2.getAnio_fabricacion());
        System.out.println("Placa: " + datos2.getPlaca());
        System.out.println("Color: " + datos2.getColor());
        System.out.println("Combustible: " + datos2.getCombustible());

        System.out.println("Marca: " + datos3.getMarca());
        System.out.println("Modelo: " + datos3.getModelo());
        System.out.println("Anio de Fabricación: " + datos3.getAnio_fabricacion());
        System.out.println("Placa: " + datos3.getPlaca());
        System.out.println("Color: " + datos3.getColor());
        System.out.println("Combustible: " + datos3.getCombustible());

        System.out.println("Marca: " + datos4.getMarca());
        System.out.println("Modelo: " + datos4.getModelo());
        System.out.println("Anio de Fabricación: " + datos4.getAnio_fabricacion());
        System.out.println("Placa: " + datos4.getPlaca());
        System.out.println("Color: " + datos4.getColor());
        System.out.println("Combustible: " + datos4.getCombustible());
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio_fabricacion() {
        return anio_fabricacion;
    }

    public void setAnio_fabricacion(int anio_fabricacion) {
        this.anio_fabricacion = anio_fabricacion;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }
}