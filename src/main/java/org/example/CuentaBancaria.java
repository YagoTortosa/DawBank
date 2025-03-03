package org.example;

import java.util.ArrayList;

public class CuentaBancaria {
    private String IBAN;
    private String Titular;
    private double saldo;
    private ArrayList<String> movimientos;

    private static double SALDO_MINIMO = -50.0;
    private static double SALDO_MAXIMO = 3000.0;

    public CuentaBancaria() {
        if (!validarIBAN(IBAN)) {
            throw new IllegalArgumentException("IBAN no válido.");
        }
        this.IBAN = IBAN;
        this.Titular = Titular;
        this.saldo = 0.0;
        this.movimientos = new ArrayList<>();
    }

    private boolean validarIBAN(String IBAN) {
        return IBAN.matches("[A-Z]{2}\\d{22}");
    }


    public String getIBAN() {
        return IBAN;
    }

    public String getTitular() {
        return Titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public ArrayList<String> getMovimientos() {
        return movimientos;
    }





}
