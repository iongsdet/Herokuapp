package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AddRemoveElementsPage {

    public AddRemoveElementsPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//button")
    private WebElement addElement;

    @FindBy(xpath = "//*[@id='elements']/button")
    List<WebElement> elementsList;

    public void addElements (String element){
        int num = Integer.parseInt(element);
        for(int i=1; i<=num; i++ ){
            addElement.click();
        }
    }

    public String listSize (){
        return String.valueOf(elementsList.size());
    }
}
