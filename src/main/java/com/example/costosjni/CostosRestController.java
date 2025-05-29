package com.example.costosjni;

import libcostos.JavaCostos;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/api/costos-jni")
public class CostosRestController {

    private final JavaCostos calculadora;

    public CostosRestController() {
        this.calculadora = new JavaCostos();
    }

    @GetMapping("/calcular")
    public String calcularCostos(
            @RequestParam(name = "cfijo") float costoFijo,
            @RequestParam(name = "cvariable") float costoVariable,
            @RequestParam(name = "cindirecto") float costoIndirecto,
            @RequestParam(name = "unidades") int unidadesProducidas,
            @RequestParam(name = "margen") float margenGananciaPorcentaje
    ) {
        return calculadora.generarJSONCostos(
                costoFijo,
                costoVariable,
                costoIndirecto,
                unidadesProducidas,
                margenGananciaPorcentaje
        );
    }
}