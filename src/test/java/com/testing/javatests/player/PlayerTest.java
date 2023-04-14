package com.testing.javatests.player;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class PlayerTest {

    // pierde cuando el número de dados es demasiado bajo
    @Test
    public void looses_when_dice_number_is_too_low () {

        // Creamos los objetos Dice y Player para hacer la pruebas correspondientes
        // Dice dice = new Dice(6);
        // Vamos a implementar la libraria mockito para simular el comportamiento de la clase Dice
        Dice dice = Mockito.mock(Dice.class);
        // estomo defininedo el comportamiento que tendra la clase en su respuesta
        // cuando el dice.roll() se este ejecutando, me va a devolver un 2
        Mockito.when(dice.roll()).thenReturn(2);

        Player player = new Player(dice, 3);
        // esperamos una respuesta false caundo el numero no sea mayor al minNumberToWin
        assertEquals(false, player.play());

    }

    // gana cuando el número de dados es mas grande
    @Test
    public void wins_when_dice_number_is_big () {


        Dice dice = Mockito.mock(Dice.class);

        Mockito.when(dice.roll()).thenReturn(4);

        Player player = new Player(dice, 3);
        // esperamos una respuesta false caundo el numero no sea mayor al minNumberToWin
        // en este caso simplifique el metodo. el cual hace lo mismo que el anterior.
        assertTrue(player.play());

    }
}