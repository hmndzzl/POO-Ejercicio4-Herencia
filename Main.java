//
// Programación orientada a objetos
// Sección 20
// Ejercicio 1
// 
// Hugo Méndez - 241265
// Diego Calderón = 241263
// Pedro Caso - 241286
// Arodi Chávez - 241112
//

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;
        int opcion;

        // Crear zoológico
        Zoologico zoologico = new Zoologico();

        // Presupuesto y costos
        double presupuestoAnual;
        double costoConstruccionRecinto;

        System.out.println("Ingrese el presupuesto anual del zoológico: ");
        presupuestoAnual = scanner.nextDouble();

        System.out.println("Ingrese el costo de construcción de un nuevo recinto: ");
        costoConstruccionRecinto = scanner.nextDouble();

        while (continuar) {
            System.out.println("\n---------------------------------------------------------\n");
            System.out.println("1. Agregar una serpiente");
            System.out.println("2. Agregar un reptil acuático");
            System.out.println("3. Mostrar información completa de los ejemplares");
            System.out.println("4. Consultar tamaño del recinto");
            System.out.println("5. Consultar comida diaria");
            System.out.println("6. Consultar costo mensual de mantenimiento");
            System.out.println("7. Verificar si el zoológico puede aceptar el ejemplar");
            System.out.println("8. Eliminar un animal");
            System.out.println("9. Salir");
            System.out.print("Elija una opción: ");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    // Agregar una nueva serpiente
                    Serpiente nuevaSerpiente = crearSerpiente(scanner);
                    zoologico.agregarAnimal(nuevaSerpiente);
                    System.out.println("Serpiente agregada exitosamente!");
                    break;

                case 2:
                    // Agregar un nuevo reptil acuático
                    ReptilAcuatico nuevoReptil = crearReptilAcuatico(scanner);
                    zoologico.agregarAnimal(nuevoReptil);
                    System.out.println("Reptil acuático agregado exitosamente!");
                    break;

                case 3:
                    // Mostrar información completa de todos los animales
                    zoologico.imprimirAnimales();
                    break;

                case 4:
                    // Consultar tamaño del recinto
                    System.out.println("\nSeleccione el tipo de ejemplar para consultar el tamaño del recinto:");
                    System.out.println("1. Serpientes");
                    System.out.println("2. Reptiles Acuáticos");
                    int seleccion = scanner.nextInt();

                    if (seleccion == 1) {
                        for (Animal animal : zoologico.getAnimales()) {
                            if (animal instanceof Serpiente) {
                                System.out.println("Tamaño del recinto para la serpiente " + animal.nombreCientifico
                                        + ": " + ((Serpiente) animal).TamañoRecinto() + " m^2");
                            }
                        }
                    } else if (seleccion == 2) {
                        for (Animal animal : zoologico.getAnimales()) {
                            if (animal instanceof ReptilAcuatico) {
                                System.out
                                        .println("Tamaño del recinto para el reptil acuático " + animal.nombreCientifico
                                                + ": " + ((ReptilAcuatico) animal).tamañoRecinto() + " m^2");
                            }
                        }
                    }
                    break;

                case 5:
                    // Consultar comida diaria
                    System.out.println("1. Serpientes");
                    System.out.println("2. Reptiles Acuáticos");
                    int seleccion2 = scanner.nextInt();

                    if (seleccion2 == 1) {
                        for (Animal animal : zoologico.getAnimales()) {
                            if (animal instanceof Serpiente) {
                                System.out.println("Comida diaria para la serpiente " + animal.nombreCientifico + ": "
                                        + ((Serpiente) animal).ComidaDiaria() + " gramos");
                            }
                        }
                    } else if (seleccion2 == 2) {
                        for (Animal animal : zoologico.getAnimales()) {
                            if (animal instanceof ReptilAcuatico) {
                                System.out.println("Comida diaria para el reptil acuático " + animal.nombreCientifico
                                        + ": " + ((ReptilAcuatico) animal).comidaDiaria() + " gramos");
                            }
                        }
                    }
                    break;

                case 6:
                    // Mostrar costo mensual de mantenimiento
                    System.out.println(
                            "\nSeleccione el tipo de ejemplar para consultar el costo mensual de mantenimiento:");
                    System.out.println("1. Serpientes");
                    System.out.println("2. Reptiles Acuáticos");
                    int seleccion3 = scanner.nextInt();

                    if (seleccion3 == 1) {
                        for (Animal animal : zoologico.getAnimales()) {
                            if (animal instanceof Serpiente) {
                                System.out.println("Costo mensual para la serpiente " + animal.nombreCientifico + ": Q"
                                        + ((Serpiente) animal).CostoMantenimientoMensual());
                            }
                        }
                    } else if (seleccion3 == 2) {
                        for (Animal animal : zoologico.getAnimales()) {
                            if (animal instanceof ReptilAcuatico) {
                                System.out.println("Costo mensual para el reptil acuático " + animal.nombreCientifico
                                        + ": Q" + ((ReptilAcuatico) animal).costoMantenimiento());
                            }
                        }
                    }
                    break;

                case 7:
                    // Verificar si el zoológico puede aceptar a un ejemplar
                    System.out.println("\nSeleccione el tipo de ejemplar para verificar si se puede aceptar:");
                    System.out.println("1. Serpientes");
                    System.out.println("2. Reptiles Acuáticos");
                    int seleccion4 = scanner.nextInt();
                    double costoTotal = 0;

                    if (seleccion4 == 1) {
                        for (Animal animal : zoologico.getAnimales()) {
                            if (animal instanceof Serpiente) {
                                costoTotal += ((Serpiente) animal).costoMantenimiento() + costoConstruccionRecinto;
                            }
                        }
                    } else if (seleccion4 == 2) {
                        for (Animal animal : zoologico.getAnimales()) {
                            if (animal instanceof ReptilAcuatico) {
                                costoTotal += ((ReptilAcuatico) animal).costoMantenimiento() + costoConstruccionRecinto;
                            }
                        }
                    }

                    if (costoTotal <= presupuestoAnual) {
                        System.out.println("El zoológico tiene suficiente presupuesto para aceptar a los ejemplares.");
                    } else {
                        System.out
                                .println("El zoológico no tiene suficiente presupuesto para aceptar a los ejemplares.");
                    }
                    break;

                case 8:
                    // Eliminar un animal
                    System.out.println("Ingrese el índice del animal que desea eliminar:");
                    int indexEliminar = scanner.nextInt();
                    zoologico.eliminarAnimal(indexEliminar);
                    System.out.println("Animal eliminado exitosamente (si el índice era válido).");
                    break;

                case 9:
                    // Salir del programa
                    continuar = false;
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Error, por favor ingrese una opción válida.");
            }
        }

        scanner.close();
        System.out.println("Programa terminado");
    }

    // Método para agregar una serpiente
    public static Serpiente crearSerpiente(Scanner scanner) {
        System.out.println("\nIngrese los datos de la serpiente:");
        System.out.print("Nombre Científico: ");
        String nombreCientifico = scanner.next();
        System.out.print("Descripción del Hábitat: ");
        String descripcionHabitat = scanner.next();
        System.out.print("Esperanza de Vida (en años): ");
        int esperanzaVida = scanner.nextInt();
        System.out.print("Temperatura Corporal (°C): ");
        double temperaturaCorporal = scanner.nextDouble();
        System.out.print("Cantidad de Huevos: ");
        int cantidadHuevos = scanner.nextInt();
        System.out.print("Peso (kg): ");
        double peso = scanner.nextDouble();
        System.out.print("¿Está en peligro de extinción? (true/false): ");
        boolean enPeligroExtincion = scanner.nextBoolean();
        System.out.print("Dieta: ");
        String dieta = scanner.next();
        System.out.print("Longitud (m): ");
        double longitud = scanner.nextDouble();
        System.out.print("Especie: ");
        String especie = scanner.next();
        System.out.print("Color de la piel: ");
        String colorPiel = scanner.next();
        System.out.print("¿Es venenosa? (true/false): ");
        boolean venenosa = scanner.nextBoolean();
        String tipoVeneno = "";
        if (venenosa == true) {
            System.out.print("Tipo de veneno (neurotoxico/hemotoxico): ");
            tipoVeneno = scanner.next();
        }
        return new Serpiente(nombreCientifico, descripcionHabitat, esperanzaVida, temperaturaCorporal, cantidadHuevos,
                peso, enPeligroExtincion, dieta, longitud, especie, colorPiel, venenosa, tipoVeneno);
    }

    // Método para agregar un reptil acuático
    public static ReptilAcuatico crearReptilAcuatico(Scanner scanner) {
        System.out.println("\nIngrese los datos del reptil acuático:");
        System.out.print("Nombre Científico: ");
        String nombreCientifico = scanner.next();
        System.out.print("Descripción del Hábitat: ");
        String descripcionHabitat = scanner.next();
        System.out.print("Esperanza de Vida (en años): ");
        int esperanzaVida = scanner.nextInt();
        System.out.print("Temperatura Corporal (°C): ");
        double temperaturaCorporal = scanner.nextDouble();
        System.out.print("Cantidad de Huevos: ");
        int cantidadHuevos = scanner.nextInt();
        System.out.print("Peso (kg): ");
        double peso = scanner.nextDouble();
        System.out.print("¿Está en peligro de extinción? (true/false): ");
        boolean enPeligroExtincion = scanner.nextBoolean();
        System.out.print("Dieta: ");
        String dieta = scanner.next();
        System.out.println("Longitud (cm): ");
        Double longitud = scanner.nextDouble();
        System.out.print("Tipo de Agua (dulce/salada): ");
        String tipoAgua = scanner.next();
        System.out.print("Velocidad de Nado (km/h): ");
        double velocidadNado = scanner.nextDouble();
        System.out.print("Duración de Buceo (min): ");
        int duracionBuceo = scanner.nextInt();

        return new ReptilAcuatico(nombreCientifico, descripcionHabitat, esperanzaVida, temperaturaCorporal,
                cantidadHuevos, peso, enPeligroExtincion, dieta, longitud, tipoAgua, velocidadNado, duracionBuceo);
    }
}
