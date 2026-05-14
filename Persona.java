public class Persona {
    private String Nombre;
    private int Edad;
    private String Numero_telefonico;
    private char Genero;
    private String Correo_electronico;

    public Persona(String Nombre, int Edad, String Numero_telefonico){
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Numero_telefonico = Numero_telefonico;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        if(Edad > 0 && Edad < 100){
            this.Edad = Edad;
        } else {
            this.Edad = 0;
        }
    }

    public String getNumero_telefonico() {
        return Numero_telefonico;
    }

    public void setNumero_telefonico(String Numero_telefonico) {
        this.Numero_telefonico = Numero_telefonico;
    }

    public char getGenero() {
        return Genero;
    }

    public void setGenero(char Genero) {
        if(Genero == 'F' || Genero == 'M'){
            this.Genero = Genero;
        } else {
            this.Genero = 'X';
        }
    }

    public String getCorreo_electronico() {
        return Correo_electronico;
    }

    public void setCorreo_electronico(String Correo_electronico) {
        this.Correo_electronico = Correo_electronico;
    }

    @Override
    public String toString(){
        return "Nombre: "+Nombre+"\nEdad: "+Edad+"\nNúmero telefónico: "+Numero_telefonico+"\nGénero: "+Genero+"\nCorreo electronico: "+Correo_electronico;
    }
    
}
