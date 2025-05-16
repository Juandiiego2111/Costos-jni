package com.example.costosjni;

import costosjni.lib.JavaCostos;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/costosjni-service")
public class CostosRestController {

    private JavaCostos javaCostos;

    public CostosRestController() {
        this.javaCostos = new JavaCostos();
    }

    @GetMapping("/costos/{costoFijo}/{costoVariable}/{cantidadProducida}/{margenGanancia}")
    public String calcularCostos(
            @PathVariable double costoFijo,
            @PathVariable double costoVariable,
            @PathVariable int cantidadProducida,
            @PathVariable double margenGanancia
    ) {
        return javaCostos.calcularCostosJSON(costoFijo, costoVariable, cantidadProducida, margenGanancia);
    }
}

