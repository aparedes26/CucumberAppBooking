package test.java.com.pagesDispatch;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import test.java.com.selenium.base.BaseDispatch;

import static com.falabella.utils.WaitWebDriver.waitVisibility;

public class FlujoBooking extends BaseDispatch {

    public static AppiumDriver<MobileElement> driverAppium;
    private int maxAttempts = 6;
    public AndroidTouchAction actions;


    public FlujoBooking(AppiumDriver<MobileElement> driverAppium) {
        this.driverAppium = driverAppium;
        PageFactory.initElements(new AppiumFieldDecorator(driverAppium), this);
    }


    @AndroidFindBy(xpath= "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.Button")
    public WebElement iniciosesion;

    @AndroidFindBy(id= "com.booking:id/identity_text_input_edit_text")
    public WebElement ingresarcorreoypass;

    @AndroidFindBy(xpath= "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.Button")
    public WebElement btncontinuar;

    @AndroidFindBy(id= "com.booking:id/identity_text_input_edit_text")
    public WebElement clave;

    @AndroidFindBy(xpath= "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.Button")
    public WebElement btniniciarsesion;

    @AndroidFindBy(id= "com.booking:id/genius_onbaording_bottomsheet_cta")
    public WebElement empbuscar;

    @AndroidFindBy(xpath= "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout[1]/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView[2]/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.TextView")
    public WebElement ingresardestino;

    @AndroidFindBy(id= "com.booking:id/facet_with_bui_free_search_booking_header_toolbar_content")
    public WebElement escribirdestino;

    @AndroidFindBy(xpath= "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]")
    public WebElement oprimirdestino;


    @AndroidFindBy(xpath= "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout[1]/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView[2]/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.TextView")
    public WebElement seleccionarfecha;

    @AndroidFindBy(xpath= "//android.widget.ImageButton[@content-desc=\"Desplazarse hacia arriba\"]")
    public WebElement des;

    @AndroidFindBy(id= "com.booking:id/facet_date_picker_confirm")
    public WebElement seleccionarfechas;

    @AndroidFindBy(id= "com.booking:id/facet_search_box_accommodation_occupancy")
    public WebElement selechab;

    @AndroidFindBy(id= "com.booking:id/group_config_apply_button")
    public WebElement btnaplicar;

    @AndroidFindBy(xpath= "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.NumberPicker/android.widget.Button[2]")
    public WebElement edad;

    @AndroidFindBy(id= "android:id/button1")
    public WebElement btnokedad;

    @AndroidFindBy(xpath= "out/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.TextView[1]")
    public WebElement textedad;

    @AndroidFindBy(id= "com.booking:id/facet_search_box_cta")
    public WebElement btnbuscar;

    @AndroidFindBy(xpath= "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.FrameLayout/android.widget.TextView")
    public WebElement validaciontextfront;

    @AndroidFindBy(xpath= "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.view.ViewGroup")
    public WebElement tapsegundaopcion;

    @AndroidFindBy(id= "com.booking:id/price_view_stay_details")
    public WebElement textdetallesalojamiento;

    @AndroidFindBy(id= "com.booking:id/price_view_price")
    public WebElement textprecio;

    @AndroidFindBy(id= "com.booking:id/select_room_cta")
    public WebElement btnelegirhabitacion;

    @AndroidFindBy(id= "com.booking:id/recommended_block_subtotal_price_view")
    public WebElement texttotalprecio;

    @AndroidFindBy(id= "com.booking:id/recommended_block_reserve_button")
    public WebElement btnreserva;





    public void InicioSesion (String email, String pass) {
        iniciosesion.click();
        ingresarcorreoypass.sendKeys(email);
        btncontinuar.click();
        clave.sendKeys(pass);
        btniniciarsesion.click();
        empbuscar.click();

    }

    public void Ingresardestino (String destino) {
        des.click();
        ingresardestino.click();
        escribirdestino.sendKeys(destino);
        oprimirdestino.click();

    }

    public static MobileElement seleccionfecha(String dynamicValue) {  //Se recibe un valor dinamico como parametro
        String xpathLocator = String.format("//android.view.View[@content-desc='%s']", dynamicValue);   //método, donde construimos el localizador XPath utilizando String.format()
        return driverAppium.findElement(By.xpath(xpathLocator));


    }

    public void SelectHabitaciones (int numberOfRooms) {
        waitVisibility(driverAppium, seleccionarfechas, 5);
        seleccionarfechas.click();
        selechab.click();
        MobileElement roomsElement = driverAppium.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.view.ViewGroup[1]/android.widget.LinearLayout/android.widget.TextView"));

        // Obtener el número actual de habitaciones
        int currentRooms = Integer.parseInt(roomsElement.getText());

        // Seleccionar el número correcto de habitaciones utilizando los botones "+" y "-"
        if (numberOfRooms > currentRooms) {
            for (int i = currentRooms; i < numberOfRooms; i++) {
                driverAppium.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.view.ViewGroup[1]/android.widget.LinearLayout/android.widget.Button[2]")).click(); //boton +
            }
        } else if (numberOfRooms < currentRooms) {
            for (int i = currentRooms; i > numberOfRooms; i--) {
                driverAppium.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.view.ViewGroup[1]/android.widget.LinearLayout/android.widget.Button[1]")).click(); //boton -
            }
        }
    }

    public void Selectadultos (int numberOfadultos) {

        MobileElement adultosElement = driverAppium.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.LinearLayout/android.widget.TextView"));

        // Obtener el número actual de habitaciones
        int currentAdultos = Integer.parseInt(adultosElement.getText());

        // Seleccionar el número correcto de habitaciones utilizando los botones "+" y "-"
        if (numberOfadultos > currentAdultos) {
            for (int i = currentAdultos; i < numberOfadultos; i++) {
                driverAppium.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.LinearLayout/android.widget.Button[2]")).click(); //boton +
            }
        } else if (numberOfadultos < currentAdultos) {
            for (int i = currentAdultos; i > numberOfadultos; i--) {
                driverAppium.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.LinearLayout/android.widget.Button[1]")).click(); //boton -
            }
        }

    }


    public void Selectninos(int numberOfninos) throws InterruptedException {

        MobileElement ninosElement = driverAppium.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.view.ViewGroup[3]/android.widget.LinearLayout/android.widget.TextView"));

        // Obtener el número actual de niños
        int currentNinos = Integer.parseInt(ninosElement.getText());

        // Seleccionar el número correcto de niños utilizando los botones "+" y "-"
        if (numberOfninos > currentNinos) {
            for (int i = currentNinos; i < numberOfninos; i++) {
                driverAppium.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.view.ViewGroup[3]/android.widget.LinearLayout/android.widget.Button[2]")).click(); //boton +
                edad.click();
                edad.click();
                edad.click();
                edad.click();
                edad.click();
                edad.click();
                System.out.println("La edad del niño es: "+edad.getAttribute("text"));
                btnokedad.click();
                btnaplicar.click();
            }

        } else if (numberOfninos == 0) {
                btnaplicar.click();

        }

    }


    public void Alojamiento () {
        btnbuscar.click();
        if (validaciontextfront.isDisplayed()){
            System.out.println("Numero de resultados obtenidos: "+validaciontextfront.getAttribute("text"));
            waitVisibility(driverAppium, tapsegundaopcion, 5);
            tapsegundaopcion.click();
            System.out.println("Detalle de la reserva es: "+textdetallesalojamiento.getAttribute("text")+"\nPrecio de la reserva: "+textprecio.getAttribute("text"));
            waitVisibility(driverAppium, btnelegirhabitacion, 5);
            btnelegirhabitacion.click();




        }



    }






}









