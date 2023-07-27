package test.java.com.steps;

import io.appium.java_client.MobileElement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import test.java.com.pagesDispatch.FlujoBooking;
import test.java.com.selenium.base.BaseDispatch;

import java.net.MalformedURLException;
import static test.java.com.selenium.base.BaseDispatch.driverAppium;

public class flujoBooking {

    BaseDispatch basedispatch = new BaseDispatch();

    public flujoBooking() {

    }

    @Given("Que ingresamos a la App Booking")
    public void queIngresamosALaAppBooking() throws MalformedURLException, InterruptedException{
        basedispatch.startAppium(driverAppium);
    }

    @And("Ingresamos con {string} y clave {string}")
    public void ingresamosConYClave(String email, String pass) {
        FlujoBooking sesion = new FlujoBooking(driverAppium);
        sesion.InicioSesion(email,pass);
    }

    @And("Seleccionamos destino {string}")
    public void seleccionamosDestino(String destino) throws InterruptedException {
        FlujoBooking fecha = new FlujoBooking(driverAppium);
        fecha.Ingresardestino(destino);

    }

    @And("Seleccionamos la fecha desde {string}")
    public void seleccionamosLaFechaDesdeAl(String dynamicValue) {
        MobileElement element = FlujoBooking.seleccionfecha(dynamicValue); // Utilizar el método para encontrar el elemento con el valor dinámico
        element.click();
    }

    @And("Seleccionamos la fecha hasta {string}")
    public void seleccionamosLaFechaHasta(String dynamicValue) {
        MobileElement element = FlujoBooking.seleccionfecha(dynamicValue);
        element.click();
    }

    @When("Seleccionamos {int} habitaciones")
    public void seleccionamosHabitaciones(int numberOfRooms) { //se pasa argumento al metodo int
        FlujoBooking room = new FlujoBooking(driverAppium);
        room.SelectHabitaciones(numberOfRooms);
    }

    @Then("el numero de habitaciones seleccionado debe ser {int}")
    public void elNumeroDeHabitacionesSeleccionadoDebeSer(int expectedNumberOfRooms) {
        // Obtener el número actual de habitaciones seleccionadas
        MobileElement roomsElement = driverAppium.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.view.ViewGroup[1]/android.widget.LinearLayout/android.widget.TextView"));
        int actualNumberOfRooms = Integer.parseInt(roomsElement.getText());
        // Verificar que el número de habitaciones seleccionadas coincida con el esperado
        assert actualNumberOfRooms == expectedNumberOfRooms;
    }

    @When("Seleccionamos {int} adultos")
    public void seleccionamosAdultos(int numberOfadultos) {
        FlujoBooking adultos = new FlujoBooking(driverAppium);
        adultos.Selectadultos(numberOfadultos);
    }

    @Then("el numero de adultos seleccionado debe ser {int}")
    public void elNumeroDeAdultosSeleccionadoDebeSer(int expectedNumberOfAdultos) {
        // Obtener el número actual de adultos seleccionadas
        MobileElement adultosElement = driverAppium.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.LinearLayout/android.widget.TextView"));
        int actualNumberOfAdultos = Integer.parseInt(adultosElement.getText());
        // Verificar que el número de adultos seleccionadas coincida con el esperado
        assert actualNumberOfAdultos == expectedNumberOfAdultos;
    }

    @When("Seleccionamos {int} ninos de 5 anos")
    public void seleccionamosNinos(int numberOfninos) throws InterruptedException {
        FlujoBooking ninos = new FlujoBooking(driverAppium);
        ninos.Selectninos(numberOfninos);

    }

    @And("Seleccionamos la habitacion")
    public void seleccionamosLaHabitacion() {
        FlujoBooking alojamiento = new FlujoBooking(driverAppium);
        alojamiento.Alojamiento();
    }
}
