/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seleniumteste;

import com.metodos.MetodosSelenium;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;


/**
 *
 * @author adamvinicius@gmail.com
 */
public class SeleniumTeste {
        private static MetodosSelenium umMetodo;
 
        
        static WiniumDriver driver1;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        umMetodo = new MetodosSelenium();
        
          
            DesktopOptions options = new DesktopOptions();
            options.setApplicationPath("C:\\Windows\\System32\\calc.exe");
            
            try {
              driver1 = new WiniumDriver(new URL("http://localhost:9999"), options);
              
            } catch (Exception e) {
                e.printStackTrace();;
            }
           
     
            umMetodo.click(driver1, "Exibir");
           // driver1.findElementById("Item 1").click();
            driver1.findElementById("Item 304").click();
            driver1.findElementByName("2").click();
            driver1.findElementByName("Multiplicar").click();
            driver1.findElementByName("9").click();
            driver1.findElementByName("Igual a").click();
      

         
            
            
   
        
        
        
   
    
}
    
}
