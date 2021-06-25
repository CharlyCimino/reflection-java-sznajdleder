package reflection;

/**
 *
 * @author Charly Cimino Aprendé más Java en mi canal:
 * https://www.youtube.com/c/CharlyCimino Encontrá más código en mi repo de
 * GitHub: https://github.com/CharlyCimino
 */
public class Principal {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws Exception {
        String sClass = "reflection.Demo";
        Class<?> clazz = Class.forName(sClass);
        HolaMundo a = clazz.getMethod("unMetodo").getAnnotation(HolaMundo.class);
        System.out.println("nombre = " + a.nombre());
        HolaMundo a2 = clazz.getMethod("otroMetodo").getAnnotation(HolaMundo.class);
        System.out.println("nombre = " + a2.nombre());
    }
}
