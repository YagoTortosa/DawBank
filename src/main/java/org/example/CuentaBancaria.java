package org.example;

import java.util.ArrayList;

public class CuentaBancaria {
    private String iban;
    private String titular;
    private double saldo;
    private ArrayList<Movimiento> movimientos;

    private static double SALDO_MINIMO = -50.0;
    private static double SALDO_MAXIMO = 3000.0;

    public CuentaBancaria(String iban, String titular) {
        this.iban = iban;
        this.titular = titular;
        this.saldo = 0.0;
        this.movimientos = new ArrayList<>();
    }



    public static class Movimiento {
        private String concepto;
        private double importe;
        private double saldoPostMovimiento;

        public Movimiento(String concepto, double importe, double saldoPostMovimiento) {
            this.concepto = concepto;
            this.importe = importe;
            this.saldoPostMovimiento = saldoPostMovimiento;
        }
    }

    public CuentaBancaria(CuentaBancaria cuentaBancaria) {
        this.iban = cuentaBancaria.iban;
        this.titular = cuentaBancaria.titular;
        this.saldo = cuentaBancaria.saldo;
        this.movimientos = cuentaBancaria.movimientos;
    }

    public String getiban() {
        return iban;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getsaldo() {
        return saldo;
    }



    public void ingresar(double cantidad, String concepto) {
        if (cantidad <= 0) {
            System.out.println("El cantidad debe ser mayor que 0");
            return;
        }
        saldo += cantidad;
        Movimiento movimiento = new Movimiento(concepto, cantidad, saldo);
        movimientos.add(movimiento);
        System.out.println("Ingreso realizado correctamente.");
    }


    public void retirar(double cantidad, String concepto) {
        if (cantidad <= 0) {
            System.out.println("El cantidad debe ser mayor que 0");
            return;
        }
        if (cantidad > saldo) {
            System.out.println("Error: Saldo insuficiente.");
            return;
        }
        saldo -= cantidad;
        Movimiento movimiento = new Movimiento(concepto, -cantidad, saldo);
        movimientos.add(movimiento);
        System.out.println("Retiro realizado correctamente.");
    }



    public void mostrarMovimientos() {
        System.out.println("Historial de movimientos de la cuenta " + iban + ":");
        for (Movimiento movimiento : movimientos) {
            System.out.println(movimiento);
        }
    }





}
