/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theChosenQuest.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Travis Harley
 */
public class MapControllerTest {
    
    public MapControllerTest() {
    }

    /**
     * Test of calcMapBorders method, of class MapController.
     */
    @Test
    public void testCalcMapBorders() {
        System.out.println("calcMapBorders");
        
        //test case #1
        System.out.println("\tTest Case #1");
        
        int mapWidth = 5;
        int mapHeight = 5;
        int expResult = 25;
        
        // create instance of MapController class
        MapController instance = new MapController();
        
        //call function
        int result = instance.calcMapBorders(mapWidth, mapHeight);
        
        //compare expecte return value
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
