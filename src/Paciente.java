

public class Paciente {

    public static void clasificarEdad( String[][] datosPacientes) {
        for (String[] datosPaciente : datosPacientes) {
            if (Integer.parseInt(datosPaciente[2]) >= 21 && Integer.parseInt(datosPaciente[2]) <= 30) {
                System.out.println(datosPaciente[1] + " Joven adulto");
            } else if (Integer.parseInt(datosPaciente[2]) > 30 && Integer.parseInt(datosPaciente[2]) <= 60) {
                System.out.println(datosPaciente[1] +" Adulto");
            } else if (Integer.parseInt(datosPaciente[2]) > 60) {
                System.out.println(datosPaciente[1] +" Tercera edad");
            }
        }
    }

}
