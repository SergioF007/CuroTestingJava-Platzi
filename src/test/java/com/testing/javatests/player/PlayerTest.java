package com.testing.javatests.player;

import org.junit.Test;

import static org.junit.Assert.*;

public class PlayerTest {

    // pierde cuando el número de dados es demasiado bajo
    @Test
    public void looses_when_dice_number_is_too_low () {

        // Creamos los objetos Dice y Player para hacer la pruebas correspondientes
        Dice dice = new Dice(6);
        Player player = new Player(dice, 3);
        // esperamos una respuesta false caundo el numero no sea mayor al minNumberToWin
        assertEquals(false, player.play());

    }
}