package com.pruebas;

public class Factura {
    private Integer importe;
    private String concepto;

    public Factura() {
    }

    public Factura(String concepto, Integer importe) {
        this.importe = importe;
        this.concepto = concepto;
    }

    public Integer getImporte() {
        return importe;
    }

    public void setImporte(Integer importe) {
        this.importe = importe;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }
}
