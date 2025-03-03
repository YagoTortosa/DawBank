package org.example;

public class Cliente {
    private String DNI;
    private String NombreCompleto;
    private String CorreoElectronico;

    public String getDNI() {
        return DNI;
    }

    public String getNombreCompleto() {
        return NombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.NombreCompleto = nombreCompleto;
    }

    public String getCorreoElectronico() {
        return CorreoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.CorreoElectronico = correoElectronico;
    }


    public Cliente(String DNI, String NombreCompleto, String CorreoElectronico) {
        this.DNI = DNI;
        this.NombreCompleto = NombreCompleto;
        this.CorreoElectronico = CorreoElectronico;
    }


    public Cliente(Cliente Clientecopia) {
        this(Clientecopia.DNI, Clientecopia.NombreCompleto, Clientecopia.CorreoElectronico);
    }


    void imprimirCliente() {
        System.out.println("DATOS DEL CLIENTE");
        System.out.println("DNI: " + DNI);
        System.out.println("NombreCompleto: " + NombreCompleto);
        System.out.println("CorreoElectronico: " + CorreoElectronico);
    }



}
