package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

/**
 *
 * @author Charly Cimino Aprendé más Java en mi canal:
 * https://www.youtube.com/c/CharlyCimino Encontrá más código en mi repo de
 * GitHub: https://github.com/CharlyCimino
 */
public class Principal {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        try {
            // definimos el nombre de la clase (incluyendo el paquete)
            String sClass = "java.lang.Object";
            // obtengo una instancia de Class apuntando a la clase
            Class clazz = Class.forName(sClass);
            Constructor ctor = clazz.getConstructor();
            Object obj = ctor.newInstance();
            
            String mtdName = "toString";
            System.out.println("Método " + mtdName);
            Method mtd = obj.getClass().getDeclaredMethod(mtdName);

            int i = mtd.getModifiers();

            /*
            Este método retorna un int dentro del cual se encuentra codificada en potencias
            de 2 la lista de modificadores del método m. Para decodificar esta lista, tenemos que
            usar las constantes definidas en la clase java.lang.reflect.Modifiers.
            */
            
            // https://es.wikipedia.org/wiki/Operador_a_nivel_de_bits#Determinando_el_estado_de_bits
            if ((i & Modifier.PUBLIC) == i) {
                System.out.println("Es publico");
            }
            if ((i & Modifier.STATIC) == i) {
                System.out.println("Es estatico");
            }
            
            Class clazzReturn = mtd.getReturnType();
            System.out.println( "Retorna un " + clazzReturn.getName() );

        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

}
