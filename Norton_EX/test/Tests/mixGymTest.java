package Tests;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.*;
import java.time.LocalDate;
import java.util.Date;
import mastergym.Pase;
import mastergym.PaseVencidoException;
import mastergym.Producto;
import mastergym.Socio;

import static org.junit.Assert.*;

public class mixGymTest {

    private static Socio s1;
    private static Socio s2;
    private static Pase pase;

    @Before
    public void antesDeCadaTest() {
        System.out.println("=====================================");
        System.out.println("Ejecutando prueba...");
    }

    @After
    public void despuesDeCadaTest() {
        System.out.println("=====================================");
    }

    @BeforeClass
    public static void antesDeTodo() {
        System.out.println("Inicializando los objetos...");
        s1 = new Socio(1, "Martin", "12345678", "Las Cañas 1622", "Ninguna");
        s2 = new Socio(2, "Pablo", "87654321", "Madrid 33", "Ninguna");
        pase = new Pase(1, "Mensual", 100.0, 8, new Date());
    }
    
    @AfterClass
    public static void despuesDeTodo() {
        LocalDate ayercitoNoma = LocalDate.now().minusDays(1);
        System.out.println("Fin de las pruebas. Fecha de ayer: " + ayercitoNoma);
    }

    @Test(timeout = 30)
    public void noAndaElCheck() throws InterruptedException {
        Thread.sleep(60);
    }

    @Test
    public void testSociosDiferentes() {
        assertNotSame("Los socios deberían ser diferentes", s1, s2);
    }

    @Test
    public void descontarPaseTest() {
        pase.registrarAsistencia();
        assertEquals(0, pase.getClasesRestantes());
    }

    @Test
    public void descontarPaseTest2() {
        pase = new Pase(1, "Mensual", 100.0, 0, new Date());
        pase.registrarAsistencia();
        assertEquals(9, pase.getClasesRestantes());
    }

    @Test(expected = PaseVencidoException.class)
    public void descontarPaseTest3() {
        pase = new Pase(1, "Mensual", 100.0, 0, new Date(System.currentTimeMillis() - 1000000000));
        pase.registrarAsistencia();
    }

    @Test
    public void comprarGatoradeTest() {
        Producto gatorade = new Producto(1, "Gatorade", 1050.0, "Bebida");
        double montoTotal = gatorade.getPrecio() * 2;
        assertEquals(1050.0, montoTotal, 0);
    }
}
