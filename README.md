# Ejercicio 2: Annalyn's Infiltration

- **Concepto:** Booleans (Operadores booleanos `!`, `&&`, `||`)
- **Plataforma:** Exercism (Java Track)

## Descripción del Problema
Annalyn planea rescatar a su amiga secuestrada en un campamento custodiado por un caballero y un arquero. Ella cuenta con su sigilo y la compañía opcional de su perro de rescate.

## Reglas del juego:
1. **Ataque rápido (`canFastAttack`):** Solo si el caballero está dormido (`!knightIsAwake`).
2. **Espiar (`canSpy`):** Posible si cualquiera de los tres (caballero, arquero o prisionera) está despierto.
3. **Señal a la prisionera (`canSignalPrisoner`):** Posible solo si la prisionera está despierta y el arquero está dormido.
4. **Liberar a la prisionera (`canFreePrisoner`):**
   - Si el perro está presente: solo hace falta que el arquero esté dormido.
   - Si el perro NO está presente: la prisionera debe estar despierta, y el caballero y el arquero dormidos.

## Cómo ejecutar en Visual Studio / VS Code:
Abre `Main.java` y haz clic en **Run** o presiona `F5`.
