import java.util.ArrayList;

import java.util.Scanner;

public class reto2 {

    public static String[] ciudades;

    public static void main(String[] args) {
        String cantidadPacientes;


        Scanner sc = new Scanner(System.in);
        cantidadPacientes = sc.nextLine();

        String[][] datosPacientes = new String[Integer.parseInt(cantidadPacientes)][6];

        for (int i = 0; i < Integer.parseInt(cantidadPacientes); i++) {
            String[] paciente = sc.nextLine().split("-");
            System.arraycopy(paciente, 0, datosPacientes[i], 0, paciente.length);
        }

        ciudades = new String[datosPacientes.length];
        ciudades = ExtraerCiudades(datosPacientes);
        System.out.println(CiudadMasRepetida(datosPacientes));
        Paciente.clasificarEdad(datosPacientes);
    }

    public static String CiudadMasRepetida(String[][] datosPacientes) {
        int[] cantidadCiudades = new int[ciudades.length];
        for (String[] datosPaciente : datosPacientes) {
            for (int j = 0; j < ciudades.length; j++) {
                if (datosPaciente[3].equals(ciudades[j])) {
                    cantidadCiudades[j]++;
                }
            }
        }
        int mayor = 0;
        int posicion = 0;
        for (int i = 0; i < cantidadCiudades.length; i++) {
            if (cantidadCiudades[i] > mayor) {
                mayor = cantidadCiudades[i];
                posicion = i;
            }
        }
        return ciudades[posicion];
    }

    public static String[] ExtraerCiudades(String[][] datosPacientes) {
        String[] ciudades;

        ArrayList ciudadesNoRepetidas = new ArrayList();
        for (String[] datosPaciente : datosPacientes) {
            if (!ciudadesNoRepetidas.contains(datosPaciente[3])) {
                ciudadesNoRepetidas.add(datosPaciente[3]);
            }
        }
        String str = String.join("-", ciudadesNoRepetidas);
        ciudades = str.split("-");
        return ciudades;
    }


}
