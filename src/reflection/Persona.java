
package reflection;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class Persona {
    
    private String nombre;
    private int edad;
    private boolean tieneHijos;

    public Persona(String nombre, int edad, boolean tieneHijos) {
        this.nombre = nombre;
        this.edad = edad;
        this.tieneHijos = tieneHijos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isTieneHijos() {
        return tieneHijos;
    }

    public void setTieneHijos(boolean tieneHijos) {
        this.tieneHijos = tieneHijos;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", tieneHijos=" + tieneHijos + '}';
    }
    
}
