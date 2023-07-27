Feature: Booking

  @Test
  Scenario: Flujo ok Booking
    Given Que ingresamos a la App Booking
    And Seleccionamos destino "CUSCO"
    And Seleccionamos la fecha desde "27 julio 2023"
    And Seleccionamos la fecha hasta "31 julio 2023"
    When Seleccionamos 1 habitaciones
    Then el numero de habitaciones seleccionado debe ser 2
    When Seleccionamos 2 adultos
    Then el numero de adultos seleccionado debe ser 2
    When Seleccionamos 1 ninos de 5 anos
    And Seleccionamos la habitacion





