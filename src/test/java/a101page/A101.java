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

    @FindBy(xpath = "//li[@class='col-md-4 col-sm-6 col-xs-6 set-product-item']")
    public WebElement tumCoraplar;

    @FindBy(xpath = "//button[@class='add-to-basket button green block with-icon js-add-basket']")
    public WebElement sepeteEkleButton;

    @FindBy(xpath = "(//a[.='Sepeti Görüntüle'])[2]")
    public WebElement sepetiGoruntuleButton;

    @FindBy(xpath = "//a[@class='button green checkout-button block js-checkout-button']")
    public WebElement sepetiOnaylaButton;

    @FindBy(xpath = "(//a[@class='auth__form__proceed js-proceed-to-checkout-btn']")
    public WebElement uyeOlmadanDevamEtButton;

    @FindBy(xpath = "//input[@name='user_email']")
    public WebElement emailTextBox;
    //Devamet butonu tab ile ilerliyor

    @FindBy(xpath = "(//a[@class='new-address js-new-address'])[1]")
    public WebElement yeniAdresOlusturSekmesi;

    @FindBy(xpath = "//input[@name='title']")
    public WebElement adresBasligiTextBox;

    @FindBy(xpath = "//select[@name='city']")
    public WebElement ilDropDownElement;

    @FindBy(xpath = "//select[@name='township']")
    public WebElement ilceDropDownElement;

    @FindBy(xpath = "//select[@name='township']")
    public WebElement mahalleDropDownElement;

    @FindBy(xpath = "//button[@class='button green js-set-country js-prevent-emoji']")
    public WebElement kaydetButton;

    @FindBy(xpath = "//button[@class='button green js-set-country js-prevent-emoji']")
    public WebElement kaydetVeDevamEtButton;

    @FindBy(xpath = "(//label[@class='js-checkout-cargo-item'])[1]")
    public WebElement sendeoKargoCheckBoxElement;








}
