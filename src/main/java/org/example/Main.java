package org.example;


import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Integer idDeudor;
        String tipoDocumento;
        String documento;
        String nombres;
        String apellidos;
        String telefonoMovil;
        String telefonoFijo;
        String direccion;
        Integer idFiador;
        String nombresFiador;
        String documentoFiador;
        Double valorBrutoMoto;
        Double valorTotalMoto;

        Boolean tieneLicenciaElConductor;
        String tipoCompra;

        Scanner leer = new Scanner(System.in);

        //Proceso
        System.out.println("****************");
        System.out.println("MUNDO YAMAHA");
        System.out.println("****************");

        System.out.println("Apreciado cliente, ¿Usted cuenta con licencia?");
        tieneLicenciaElConductor=leer.nextBoolean();

        //PRIMERA PREGUNTA O DESICION
        if(tieneLicenciaElConductor==true){
            //SI TIENE LICENCIA
            System.out.println("Nombres del cliente: ");
            nombres=leer.nextLine();

            System.out.println("Apellidos del cliente: ");
            apellidos=leer.nextLine();

            System.out.println("Tipo de documento: ");
            tipoDocumento=leer.nextLine();

            System.out.println("Numero de documento: ");
            documento=leer.nextLine();

            System.out.print("Telefono celular: ");
            telefonoMovil=leer.nextLine();

            System.out.println("Telefono fijo: ");
            telefonoFijo=leer.nextLine();

            System.out.println("Direccion: ");
            direccion=leer.nextLine();

            System.out.print("Documento del fiador: ");
            documentoFiador=leer.nextLine();

            System.out.print("Nombres del fiador");
            nombresFiador=leer.nextLine();

            System.out.println("Nuestras motocicletas: ");
            System.out.println("1. Yamaha SZR-150---$10000000");
            System.out.println("2. Yamaha Crypton FI---$8000000");
            System.out.println("3. Yamaha XTZ-125---$10500000");
            System.out.println("4. Yamaha MT10---$72000000");
            System.out.println("5. Yamaha XMax300---$34000000");

            Integer motoSeleccionada;
            System.out.print("Digita la motocicleta deseada: ");
            motoSeleccionada=leer.nextInt();
            Double valorMoto=0.0;
            if(motoSeleccionada==1){
                valorMoto=10000000.0;

            } else if (motoSeleccionada==2) {
                valorMoto=8000000.0;

            } else if (motoSeleccionada==3) {
                valorMoto=10500000.0;

            } else if (motoSeleccionada==4) {
                valorMoto=72000000.0;

            } else if (motoSeleccionada==5) {
                valorMoto=34000000.0;

            }else{
                System.out.println("Moto invalida");
            }

            //2. PREDUNTA: ¿LO QUIERE A CREDITO?
            System.out.println("Usuario, digite /credito o /contado para continuar su compra.");
            leer.nextLine();
            tipoCompra=leer.nextLine().toLowerCase();
            if (tipoCompra.equals("credito")){
                //Le pregunta por % a financear
                Double porcentajeCredito;
                System.out.println("Ingresa el porcentage a financear: ");
                porcentajeCredito=leer.nextDouble();
                if (porcentajeCredito==1.0){
                    Double valorIntereses=0.25;
                    valorMoto=valorMoto+(valorMoto*valorIntereses);

                }else if (porcentajeCredito==0.7){
                    Double valorIntereses=0.15;
                    valorMoto=valorMoto+(valorMoto*valorIntereses);

                } else if (porcentajeCredito==0.5){
                    Double valorIntereses=0.07;
                    valorMoto=valorMoto+(valorMoto*valorIntereses);

                }else{

                }
            }else{
                System.out.println("Excelente le daremos un descuento del 10%");
            }
        }else{
            //NO TIENE LICENCIA
            System.out.println("Apreciado usuario, no podemos continuar la transaccion");
            System.out.println("Lo invitamos a tramitar su licencia, vuelva pronto...");
        }








    }
}