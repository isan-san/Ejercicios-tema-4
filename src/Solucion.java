public class Solucion {
    public static void main(String[] args) {
        double numeroIf = 0;
        if (numeroIf < 0) {
            System.out.println("La variable numeroIf (" + numeroIf + ") es negativa");
        } else if (numeroIf > 0) {
            System.out.println("La variable numeorIf (" + numeroIf + ") es positiva");
        } else {
            System.out.println("La variable numeroIf (" + numeroIf + ") es 0");
        }


        int numeroWhile = 0;
        while (numeroWhile < 3) {
            numeroWhile++;
            System.out.println("Se ejecuta el while");
        }

        do {
            numeroWhile++;
            System.out.println("Se ejecuta el Do while");
        } while ((numeroWhile < 3));


        for (int numeroFor = 0; numeroFor < 3; numeroFor++) {
            System.out.println("La variable numeroFor es "+numeroFor);
        }

        String estacion = "verano";
        switch (estacion) {
            case "primavera" -> System.out.println("La estacion es primavera");
            case "verano" -> System.out.println("La estacion es verano");
            case "otoño" -> System.out.println("La estacion es otoño");
            case "invierno" -> System.out.println("La estacion es invierno");
        }
    }
}
