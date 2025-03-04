package org.example;

public class Cliente {
    private String dni;
    private String nombreCompleto;
    private String correoElectronico;

    public String getDNI() {
        return dni;
    }

    public String getnombreCompleto() {
        return nombreCompleto;
    }

    public void setnombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getcorreoElectronico() {
        return correoElectronico;
    }

    public void setcorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }


    public Cliente(String DNI, String NombreCompleto, String CorreoElectronico) {
        this.dni = dni;
        this.nombreCompleto = nombreCompleto;
        this.correoElectronico = correoElectronico;
    }


    public Cliente(Cliente Clientecopia) {
        this(Clientecopia.dni, Clientecopia.nombreCompleto, Clientecopia.correoElectronico);
    }


    void imprimirCliente() {
        System.out.println("DATOS DEL CLIENTE");
        System.out.println("DNI: " + dni);
        System.out.println("NombreCompleto: " + nombreCompleto);
        System.out.println("CorreoElectronico: " + correoElectronico);
    }



}
