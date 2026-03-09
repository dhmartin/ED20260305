package jcolonia.daw2025.tablasmvc;

import java.util.ArrayList;
import java.util.List;

public class TablaMultiplicar {

    private int numero;
    private List<String> listaTextos;

    // Constructor
    public TablaMultiplicar(int numero) {
        this.numero = numero;
        this.listaTextos = new ArrayList<>();
    }

    // Generar la tabla
    public void generarTabla() {
        listaTextos.clear();
        for (int i = 1; i <= 10; i++) {
            listaTextos.add(numero + " x " + i + " = " + (numero * i));
        }
    }

    // Lista para exportación
    public List<String> toListaExportacion() {
        return listaTextos;
    }

    // Lista para mostrar en pantalla
    public List<String> toListaPantalla() {
        return listaTextos;
    }

    // Convertir a texto
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (String linea : listaTextos) {
            sb.append(linea).append("\n");
        }
        return sb.toString();
    }
}