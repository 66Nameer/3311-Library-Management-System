import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        int int0 = java.awt.image.ImageObserver.FRAMEBITS;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 16 + "'", int0 == 16);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        api.Cart cart0 = new api.Cart();
        java.awt.event.ComponentListener componentListener1 = null;
        cart0.removeComponentListener(componentListener1);
        java.awt.Container container3 = cart0.getTopLevelAncestor();
        org.junit.Assert.assertNull(container3);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        api.Cart cart0 = new api.Cart();
        java.awt.event.ComponentListener componentListener1 = null;
        cart0.removeComponentListener(componentListener1);
        java.awt.Cursor cursor3 = null;
        cart0.setCursor(cursor3);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        api.Cart cart0 = new api.Cart();
        cart0.setFocusTraversalPolicyProvider(true);
        java.awt.event.MouseWheelListener[] mouseWheelListenerArray3 = cart0.getMouseWheelListeners();
        java.awt.Image image4 = null;
        api.Cart cart5 = new api.Cart();
        cart5.setFocusTraversalPolicyProvider(true);
        java.awt.event.MouseWheelListener[] mouseWheelListenerArray8 = cart5.getMouseWheelListeners();
        boolean boolean9 = cart0.prepareImage(image4, cart5);
        org.junit.Assert.assertNotNull(mouseWheelListenerArray3);
        org.junit.Assert.assertNotNull(mouseWheelListenerArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        api.Cart cart0 = new api.Cart();
        cart0.setFocusTraversalPolicyProvider(true);
        boolean boolean3 = cart0.isFocusTraversalPolicyProvider();
        java.awt.event.ActionListener actionListener4 = null;
        javax.swing.KeyStroke keyStroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            cart0.registerKeyboardAction(actionListener4, keyStroke5, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: condition must be one of JComponent.WHEN_IN_FOCUSED_WINDOW, JComponent.WHEN_FOCUSED or JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        api.Cart cart0 = new api.Cart();
        cart0.setFocusTraversalPolicyProvider(true);
        javax.swing.InputMap inputMap3 = cart0.getInputMap();
        java.awt.Graphics graphics4 = null;
        cart0.paintComponents(graphics4);
        boolean boolean6 = cart0.isValidateRoot();
        org.junit.Assert.assertNotNull(inputMap3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        java.util.Locale locale0 = javax.swing.JComponent.getDefaultLocale();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_CA");
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        int int0 = javax.swing.JComponent.WHEN_FOCUSED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        api.Cart cart0 = new api.Cart();
        cart0.setFocusTraversalPolicyProvider(true);
        javax.swing.InputMap inputMap3 = cart0.getInputMap();
        api.Cart cart4 = new api.Cart();
        cart4.setFocusTraversalPolicyProvider(true);
        boolean boolean7 = cart4.isFocusTraversalPolicyProvider();
        java.awt.Component component8 = cart0.add((java.awt.Component) cart4);
        java.awt.AWTEvent aWTEvent9 = null;
        // The following exception was thrown during execution in test generation
        try {
            component8.dispatchEvent(aWTEvent9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.AWTEvent.getID()\" because \"e\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputMap3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(component8);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        float float0 = java.awt.Component.LEFT_ALIGNMENT;
        org.junit.Assert.assertTrue("'" + float0 + "' != '" + 0.0f + "'", float0 == 0.0f);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        api.CartCaretaker cartCaretaker0 = new api.CartCaretaker();
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        api.Cart cart0 = new api.Cart();
        cart0.setFocusTraversalPolicyProvider(true);
        javax.swing.InputMap inputMap3 = cart0.getInputMap();
        java.awt.Graphics graphics4 = null;
        cart0.paintComponents(graphics4);
        java.awt.image.ColorModel colorModel6 = cart0.getColorModel();
        java.awt.event.MouseWheelListener mouseWheelListener7 = null;
        cart0.removeMouseWheelListener(mouseWheelListener7);
        boolean boolean9 = cart0.requestFocusInWindow();
        boolean boolean10 = cart0.isFocusTraversalPolicyProvider();
        org.junit.Assert.assertNotNull(inputMap3);
        org.junit.Assert.assertNotNull(colorModel6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        api.Cart cart0 = new api.Cart();
        cart0.setFocusTraversalPolicyProvider(true);
        javax.swing.InputMap inputMap3 = cart0.getInputMap();
        java.awt.Graphics graphics4 = null;
        cart0.paintComponents(graphics4);
        java.awt.image.ColorModel colorModel6 = cart0.getColorModel();
        int int7 = cart0.getY();
        org.junit.Assert.assertNotNull(inputMap3);
        org.junit.Assert.assertNotNull(colorModel6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        api.SimpleUserFactory simpleUserFactory0 = new api.SimpleUserFactory();
    }
}

