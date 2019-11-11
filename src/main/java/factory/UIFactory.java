package factory;

import presentation.ConsoleUI;
import presentation.FakeUI;
import presentation.UI;

/**
 * Pattern: Factory
 * The purpose of Factory is to create an object without exposing the creation logic 
 * and refer to the newly created object using a common interface 
 * @see https://www.tutorialspoint.com/design_pattern/factory_pattern.htm
 * @author TM
 */
public class UIFactory {
    public UI getUI(String uiType){
      if(uiType == null){
         return null;
      }		
      if(uiType.equalsIgnoreCase("CONSOLE")){
         return new ConsoleUI();
         
      } else if(uiType.equalsIgnoreCase("FAKE")){
         return new FakeUI();
      }
      
      return null;
   }
}
