package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

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
            String sClass = "java.awt.Frame";
            // obtengo una instancia de Class apuntando a la clase
            Class clazz = Class.forName(sClass);
            // invoco al constructor que recibe un String como argumento
            Class[] paramTypesConstructor = {String.class};
            Object[] paramValuesConstructor = {"Ventana AWT Reflect"};
            Constructor ctor = clazz.getConstructor(paramTypesConstructor);
            Object obj = ctor.newInstance(paramValuesConstructor);
            // invoco al metodo setSize que recibe dos enteros
            String mtdName1 = "setSize";
            Class[] pTypes1 = {Integer.TYPE, Integer.TYPE};
            Object[] pValues1 = {300, 300};
            Method mtd = obj.getClass().getMethod(mtdName1, pTypes1);
            mtd.invoke(obj, pValues1);
            // invoco al metodo setVisible que recibe un boolean
            String mtdName2 = "setVisible";
            Class[] pTypes2 = {Boolean.TYPE};
            Object[] pValues2 = {true};
            Method mtd2 = obj.getClass().getMethod(mtdName2, pTypes2);
            mtd2.invoke(obj, pValues2);
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

}
