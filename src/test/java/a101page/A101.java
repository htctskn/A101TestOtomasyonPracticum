package a101page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class A101 {
    public A101() {
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//button[.='Kabul Et']")
    public WebElement cerezButton;

    @FindBy(xpath = "//a[@title='GİYİM & AKSESUAR']")
    public WebElement giyimAksesuarBolumu;

    @FindBy(xpath = "(//a[@class='js-filter-link '])[2]")
    public WebElement kadinIcGiyimBolumu;

    @FindBy(xpath = "(//a[@class='js-filter-link '])[2]")
    public WebElement dizAltiCorapBolumu;




}
