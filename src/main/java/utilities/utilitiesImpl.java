package utilities;

import org.openqa.selenium.WebElement;

public class utilitiesImpl {

    public void clickElement(WebElement element){
        try{
            element.click();
            System.out.println("click on element "+element+" successful");
        } catch(Exception e){
            System.out.println("Unable to click on element "+ element);
        }
    }

    public void sendKeys(WebElement element, String text){
        try{
            element.sendKeys(text);
            System.out.println(text + " has been set for " + element);

        }catch(Exception e){
            System.out.println("Unable to enter text "+text+" on element "+ element);
        }
    }
}
