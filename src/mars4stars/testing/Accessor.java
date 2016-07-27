package mars4stars.testing;

import junit.framework.Assert;
import java.lang.reflect.Field;
import java.lang.NoSuchFieldException;

import javax.swing.text.html.HTML;

/**
 * Provides access to private members in classes.
 * 
 * @author Ross Burton (original) 
 * @author James McGuigan (modified to access variables within super-classes)
 * @see http://www.onjava.com/pub/a/onjava/2003/11/12/reflection.html?page=2
 */
public class Accessor {
    public static Object getPrivateField (Object o,  String fieldName) {
        /* Check we have valid arguments */
        Assert.assertNotNull(o);
        Assert.assertNotNull(fieldName);
        /* Go and find the private field... */
        boolean found = false;
        Class oClass = o.getClass();
        while (found == false) {
            final Field fields[] = oClass.getDeclaredFields();
            for (int i = 0; i < fields.length; ++i) {
                if (fieldName.equals(fields[i].getName())) {
                    try {
                        fields[i].setAccessible(true);
                        return fields[i].get(o);
                    }catch (IllegalAccessException ex) {
                        Assert.fail ("IllegalAccessException accessing " +  fieldName);
                    }
                }
            }
            // field not found - try superclass
            oClass = oClass.getSuperclass();
            if(oClass == null || oClass == new Object().getClass()) {
                Assert.fail ("Field '" + fieldName + "' not found");
                return null;	
            }    		
        }
        
        Assert.fail ("Field '" + fieldName + "' not found");
        return null;
    }
}