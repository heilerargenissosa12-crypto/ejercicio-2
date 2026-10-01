package annalynsinfiltration;

/**
 * Ejercicio 2: Annalyn's Infiltration
 * Concepto: Booleans (Lógica booleana y operadores !, &&, ||)
 *
 * Annalyn planea rescatar a su mejor amiga secuestrada.
 * Dependiendo del estado del caballero, el arquero, la prisionera
 * y el perro mascota de Annalyn, determinará si ciertas acciones son posibles.
 */
public class AnnalynsInfiltration {

    /**
     * Ataque rápido: solo es posible si el caballero está dormido.
     */
    public static boolean canFastAttack(boolean knightIsAwake) {
        return !knightIsAwake;
    }

    /**
     * Espiar: es posible si al menos una persona está despierta.
     */
    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        return knightIsAwake || archerIsAwake || prisonerIsAwake;
    }

    /**
     * Hacer señas a la prisionera: solo si la prisionera está despierta y el arquero está dormido.
     */
    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        return !archerIsAwake && prisonerIsAwake;
    }

    /**
     * Liberar a la prisionera:
     * - Si el perro está presente: es posible si el arquero está dormido (el perro distrae al caballero).
     * - Si el perro NO está presente: la prisionera debe estar despierta, y tanto el caballero como el arquero deben estar dormidos.
     */
    public static boolean canFreePrisoner(boolean knightIsAwake,
                                          boolean archerIsAwake,
                                          boolean prisonerIsAwake,
                                          boolean petDogIsPresent) {
        if (petDogIsPresent) {
            return !archerIsAwake;
        } else {
            return prisonerIsAwake && !knightIsAwake && !archerIsAwake;
        }
    }
}
