package reflection;

import java.lang.reflect.Method;

/**
 *
 * @author Charly Cimino Aprendé más Java en mi canal:
 * https://www.youtube.com/c/CharlyCimino Encontrá más código en mi repo de
 * GitHub: https://github.com/CharlyCimino
 */
public class Principal {

    public static void main(String[] args) {
        try {
            // definimos el nombre de la clase (incluyendo el paquete)
            String sClass = "reflection.Persona";
            // obtengo una instancia de Class apuntando a la clase
            Class clazz = Class.forName(sClass);
            // obtengo la lista de methods (de tipo Method) de la clase
            Method metodos[] = clazz.getDeclaredMethods();
            // recorro la lista de methods y muestro sus nombres
            for (Method mtd : metodos) {
                System.out.println(mtd.getName());
            }
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

}
