package annalynsinfiltration;

public class Main {
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("  Ejercicio 2: Annalyn's Infiltration (Booleans)");
        System.out.println("==================================================");

        boolean knightIsAwake = false;
        boolean archerIsAwake = true;
        boolean prisonerIsAwake = false;
        boolean petDogIsPresent = false;

        System.out.println("Estado inicial:");
        System.out.println(" - Caballero despierto: " + knightIsAwake);
        System.out.println(" - Arquero despierto:   " + archerIsAwake);
        System.out.println(" - Prisionera despierta: " + prisonerIsAwake);
        System.out.println(" - Perro presente:      " + petDogIsPresent);

        boolean fastAttack = AnnalynsInfiltration.canFastAttack(knightIsAwake);
        System.out.println("\n1. Puede hacer ataque rapido? " + fastAttack + " (Esperado: true)");

        boolean spy = AnnalynsInfiltration.canSpy(knightIsAwake, archerIsAwake, prisonerIsAwake);
        System.out.println("2. Puede espiar? " + spy + " (Esperado: true)");

        boolean signal = AnnalynsInfiltration.canSignalPrisoner(archerIsAwake, prisonerIsAwake);
        System.out.println("3. Puede hacer senas a la prisionera? " + signal + " (Esperado: false)");

        boolean free = AnnalynsInfiltration.canFreePrisoner(knightIsAwake, archerIsAwake, prisonerIsAwake, petDogIsPresent);
        System.out.println("4. Puede liberar a la prisionera? " + free + " (Esperado: false)");

        // Otro escenario: perro presente y arquero dormido
        boolean freeWithDog = AnnalynsInfiltration.canFreePrisoner(true, false, false, true);
        System.out.println("5. Con perro presente y arquero dormido: " + freeWithDog + " (Esperado: true)");

        boolean ok = fastAttack && spy && !signal && !free && freeWithDog;
        System.out.println("\n[RESULTADO]: " + (ok ? "TODAS LAS PRUEBAS PASARON EXITOSAMENTE" : "ERROR EN LAS PRUEBAS"));
        System.out.println("==================================================\n");
    }
}
