import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        api.ItemAttributes itemAttributes0 = null;
        // The following exception was thrown during execution in test generation
        try {
            api.CD cD1 = new api.CD(itemAttributes0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"api.ItemAttributes.getName()\" because \"builder\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        int int0 = java.awt.image.ImageObserver.ABORT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 128 + "'", int0 == 128);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        int int0 = java.awt.image.ImageObserver.HEIGHT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        int int0 = java.awt.image.ImageObserver.WIDTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        float float0 = java.awt.Component.TOP_ALIGNMENT;
        org.junit.Assert.assertTrue("'" + float0 + "' != '" + 0.0f + "'", float0 == 0.0f);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        int int0 = java.awt.image.ImageObserver.SOMEBITS;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.User user1 = null;
        sessionManager0.loginUser(user1);
        org.junit.Assert.assertNotNull(sessionManager0);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        float float0 = java.awt.Component.CENTER_ALIGNMENT;
        org.junit.Assert.assertTrue("'" + float0 + "' != '" + 0.5f + "'", float0 == 0.5f);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        cart1.setDebugGraphicsOptions(10);
        api.SessionManager sessionManager5 = api.SessionManager.getInstance();
        api.Cart cart6 = sessionManager5.getCurrentCart();
        cart6.setDebugGraphicsOptions(10);
        api.SessionManager sessionManager9 = api.SessionManager.getInstance();
        api.Cart cart10 = sessionManager9.getCurrentCart();
        java.awt.event.ContainerListener containerListener11 = null;
        cart10.addContainerListener(containerListener11);
        boolean boolean13 = cart6.isFocusCycleRoot((java.awt.Container) cart10);
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Component component14 = cart1.add("", (java.awt.Component) cart10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: adding container's parent to itself");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertNotNull(sessionManager5);
        org.junit.Assert.assertNotNull(cart6);
        org.junit.Assert.assertNotNull(sessionManager9);
        org.junit.Assert.assertNotNull(cart10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        cart1.setDebugGraphicsOptions(10);
        api.SessionManager sessionManager4 = api.SessionManager.getInstance();
        api.Cart cart5 = sessionManager4.getCurrentCart();
        java.awt.event.ContainerListener containerListener6 = null;
        cart5.addContainerListener(containerListener6);
        boolean boolean8 = cart1.isFocusCycleRoot((java.awt.Container) cart5);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<java.awt.AWTKeyStroke> aWTKeyStrokeSet10 = cart5.getFocusTraversalKeys((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid focus traversal key identifier");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertNotNull(sessionManager4);
        org.junit.Assert.assertNotNull(cart5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        java.awt.Event event2 = null;
        boolean boolean4 = cart1.gotFocus(event2, (java.lang.Object) ' ');
        java.io.PrintStream printStream5 = null;
        // The following exception was thrown during execution in test generation
        try {
            cart1.list(printStream5, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintStream.print(String)\" because \"out\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        api.PenaltyCalculation penaltyCalculation0 = new api.PenaltyCalculation();
        java.lang.Class<?> wildcardClass1 = penaltyCalculation0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        float float0 = java.awt.Component.RIGHT_ALIGNMENT;
        org.junit.Assert.assertTrue("'" + float0 + "' != '" + 1.0f + "'", float0 == 1.0f);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        int int4 = cart1.getBaseline(10, (int) '4');
        cart1.paintImmediately(10, (int) (byte) 0, 0, (int) (byte) 10);
        java.awt.Graphics graphics10 = null;
        // The following exception was thrown during execution in test generation
        try {
            cart1.update(graphics10);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Graphics.setColor(java.awt.Color)\" because \"this.graphics\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        int int0 = java.awt.image.ImageObserver.PROPERTIES;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        java.awt.Color color2 = null;
        cart1.setBackground(color2);
        java.awt.Graphics graphics4 = null;
        // The following exception was thrown during execution in test generation
        try {
            cart1.print(graphics4);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Graphics.setColor(java.awt.Color)\" because \"this.graphics\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI2 = cart1.getUI();
        cart1.doLayout();
        java.awt.event.HierarchyBoundsListener[] hierarchyBoundsListenerArray4 = cart1.getHierarchyBoundsListeners();
        cart1.firePropertyChange("hi!", (byte) 1, (byte) -1);
        java.awt.Insets insets9 = cart1.getInsets();
        java.awt.Event event10 = null;
        // The following exception was thrown during execution in test generation
        try {
            cart1.deliverEvent(event10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"x\" because \"e\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertNotNull(panelUI2);
        org.junit.Assert.assertNotNull(hierarchyBoundsListenerArray4);
        org.junit.Assert.assertNotNull(insets9);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        java.awt.Event event2 = null;
        boolean boolean4 = cart1.gotFocus(event2, (java.lang.Object) ' ');
        java.awt.Event event5 = null;
        // The following exception was thrown during execution in test generation
        try {
            cart1.deliverEvent(event5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"x\" because \"e\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI2 = cart1.getUI();
        cart1.doLayout();
        java.awt.event.HierarchyBoundsListener[] hierarchyBoundsListenerArray4 = cart1.getHierarchyBoundsListeners();
        cart1.firePropertyChange("hi!", (byte) 1, (byte) -1);
        java.awt.Event event9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = cart1.handleEvent(event9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"id\" because \"evt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertNotNull(panelUI2);
        org.junit.Assert.assertNotNull(hierarchyBoundsListenerArray4);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        api.SubscriptionData subscriptionData0 = new api.SubscriptionData();
        api.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            subscriptionData0.loginUser(user1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"api.User.getEmail()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        api.SubscriptionData subscriptionData0 = new api.SubscriptionData();
        subscriptionData0.removeSubscription("hi!");
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI2 = cart1.getUI();
        java.awt.LayoutManager layoutManager3 = null;
        cart1.setLayout(layoutManager3);
        api.SessionManager sessionManager5 = api.SessionManager.getInstance();
        api.Cart cart6 = sessionManager5.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI7 = cart6.getUI();
        cart6.firePropertyChange("hi!", (int) 'a', 1);
        java.awt.Rectangle rectangle12 = null;
        java.awt.Rectangle rectangle13 = cart6.getBounds(rectangle12);
        // The following exception was thrown during execution in test generation
        try {
            cart1.setBounds(rectangle12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"x\" because \"r\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertNotNull(panelUI2);
        org.junit.Assert.assertNotNull(sessionManager5);
        org.junit.Assert.assertNotNull(cart6);
        org.junit.Assert.assertNotNull(panelUI7);
        org.junit.Assert.assertNotNull(rectangle13);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI2 = cart1.getUI();
        boolean boolean5 = cart1.inside(0, (int) (byte) 100);
        api.CartMemento cartMemento6 = null;
        // The following exception was thrown during execution in test generation
        try {
            cart1.undo(cartMemento6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"api.CartMemento.getItems()\" because \"memento\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertNotNull(panelUI2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        cart1.setDebugGraphicsOptions(10);
        api.SessionManager sessionManager4 = api.SessionManager.getInstance();
        api.Cart cart5 = sessionManager4.getCurrentCart();
        java.awt.event.ContainerListener containerListener6 = null;
        cart5.addContainerListener(containerListener6);
        boolean boolean8 = cart1.isFocusCycleRoot((java.awt.Container) cart5);
        java.awt.Event event9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = cart1.postEvent(event9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"id\" because \"evt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertNotNull(sessionManager4);
        org.junit.Assert.assertNotNull(cart5);
// flaky:         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        boolean boolean2 = cart1.isBackgroundSet();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener3 = null;
        cart1.addHierarchyBoundsListener(hierarchyBoundsListener3);
        java.awt.MenuComponent menuComponent5 = null;
        cart1.remove(menuComponent5);
        java.awt.Event event7 = null;
        boolean boolean10 = cart1.mouseEnter(event7, (-1), (int) (byte) 1);
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI2 = cart1.getUI();
        cart1.firePropertyChange("hi!", (int) 'a', 1);
        java.awt.Rectangle rectangle7 = null;
        java.awt.Rectangle rectangle8 = cart1.getBounds(rectangle7);
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener9 = null;
        cart1.addHierarchyBoundsListener(hierarchyBoundsListener9);
        api.SessionManager sessionManager11 = api.SessionManager.getInstance();
        api.Cart cart12 = sessionManager11.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI13 = cart12.getUI();
        cart12.firePropertyChange("hi!", (int) 'a', 1);
        java.awt.Rectangle rectangle18 = null;
        java.awt.Rectangle rectangle19 = cart12.getBounds(rectangle18);
        cart1.scrollRectToVisible(rectangle19);
        java.awt.Toolkit toolkit21 = cart1.getToolkit();
        java.awt.Event event22 = null;
        boolean boolean25 = cart1.mouseDrag(event22, (int) (byte) 100, (int) (byte) 100);
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertNotNull(panelUI2);
        org.junit.Assert.assertNotNull(rectangle8);
        org.junit.Assert.assertNotNull(sessionManager11);
        org.junit.Assert.assertNotNull(cart12);
        org.junit.Assert.assertNotNull(panelUI13);
        org.junit.Assert.assertNotNull(rectangle19);
        org.junit.Assert.assertNotNull(toolkit21);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        java.awt.event.ContainerListener containerListener2 = null;
        cart1.addContainerListener(containerListener2);
        cart1.resize((int) (short) 100, 100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<java.awt.AWTKeyStroke> aWTKeyStrokeSet8 = cart1.getFocusTraversalKeys((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid focus traversal key identifier");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        java.awt.event.ContainerListener containerListener2 = null;
        cart1.addContainerListener(containerListener2);
        cart1.resize(1, 100);
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        int int4 = cart1.getBaseline(10, (int) '4');
        cart1.paintImmediately(10, (int) (byte) 0, 0, (int) (byte) 10);
        java.awt.ComponentOrientation componentOrientation10 = null;
        // The following exception was thrown during execution in test generation
        try {
            cart1.applyComponentOrientation(componentOrientation10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI2 = cart1.getUI();
        cart1.doLayout();
        java.awt.event.HierarchyBoundsListener[] hierarchyBoundsListenerArray4 = cart1.getHierarchyBoundsListeners();
        cart1.firePropertyChange("hi!", (byte) 1, (byte) -1);
        java.awt.Insets insets9 = cart1.getInsets();
        cart1.setSize(128, (int) 'a');
        javax.swing.ActionMap actionMap13 = cart1.getActionMap();
        cart1.firePropertyChange("", (-1.0f), (float) '#');
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertNotNull(panelUI2);
        org.junit.Assert.assertNotNull(hierarchyBoundsListenerArray4);
        org.junit.Assert.assertNotNull(insets9);
        org.junit.Assert.assertNotNull(actionMap13);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        javax.swing.InputMap inputMap3 = null;
        // The following exception was thrown during execution in test generation
        try {
            cart1.setInputMap((int) (short) 100, inputMap3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: condition must be one of JComponent.WHEN_IN_FOCUSED_WINDOW, JComponent.WHEN_FOCUSED or JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI2 = cart1.getUI();
        boolean boolean5 = cart1.inside(0, (int) (byte) 100);
        boolean boolean6 = cart1.isOptimizedDrawingEnabled();
        boolean boolean7 = cart1.isMaximumSizeSet();
        boolean boolean8 = cart1.isLightweight();
        java.io.PrintWriter printWriter9 = null;
        // The following exception was thrown during execution in test generation
        try {
            cart1.list(printWriter9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(Object)\" because \"out\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertNotNull(panelUI2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI2 = cart1.getUI();
        java.awt.LayoutManager layoutManager3 = null;
        cart1.setLayout(layoutManager3);
        cart1.nextFocus();
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertNotNull(panelUI2);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI2 = cart1.getUI();
        boolean boolean5 = cart1.inside(0, (int) (byte) 100);
        cart1.list();
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertNotNull(panelUI2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI2 = cart1.getUI();
        cart1.doLayout();
        java.awt.event.HierarchyBoundsListener[] hierarchyBoundsListenerArray4 = cart1.getHierarchyBoundsListeners();
        cart1.firePropertyChange("hi!", (byte) 1, (byte) -1);
        java.awt.Insets insets9 = cart1.getInsets();
        cart1.setSize(128, (int) 'a');
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener13 = null;
        cart1.removeHierarchyBoundsListener(hierarchyBoundsListener13);
        java.awt.Point point15 = cart1.getMousePosition();
        java.awt.Point point16 = null;
        // The following exception was thrown during execution in test generation
        try {
            cart1.setLocation(point16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"x\" because \"p\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertNotNull(panelUI2);
        org.junit.Assert.assertNotNull(hierarchyBoundsListenerArray4);
        org.junit.Assert.assertNotNull(insets9);
        org.junit.Assert.assertNull(point15);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI2 = cart1.getUI();
        cart1.doLayout();
        java.awt.event.HierarchyBoundsListener[] hierarchyBoundsListenerArray4 = cart1.getHierarchyBoundsListeners();
        cart1.firePropertyChange("hi!", (byte) 1, (byte) -1);
        java.awt.Insets insets9 = cart1.getInsets();
        java.beans.VetoableChangeListener[] vetoableChangeListenerArray10 = cart1.getVetoableChangeListeners();
        api.SessionManager sessionManager11 = api.SessionManager.getInstance();
        api.Cart cart12 = sessionManager11.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI13 = cart12.getUI();
        cart12.doLayout();
        java.awt.event.HierarchyBoundsListener[] hierarchyBoundsListenerArray15 = cart12.getHierarchyBoundsListeners();
        cart12.firePropertyChange("hi!", (byte) 1, (byte) -1);
        java.awt.Insets insets20 = cart12.getInsets();
        cart12.setSize(128, (int) 'a');
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener24 = null;
        cart12.removeHierarchyBoundsListener(hierarchyBoundsListener24);
        java.awt.Point point26 = cart12.getMousePosition();
        // The following exception was thrown during execution in test generation
        try {
            cart1.add((java.awt.Component) cart12, (java.lang.Object) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: adding container's parent to itself");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertNotNull(panelUI2);
        org.junit.Assert.assertNotNull(hierarchyBoundsListenerArray4);
        org.junit.Assert.assertNotNull(insets9);
        org.junit.Assert.assertNotNull(vetoableChangeListenerArray10);
        org.junit.Assert.assertNotNull(sessionManager11);
        org.junit.Assert.assertNotNull(cart12);
        org.junit.Assert.assertNotNull(panelUI13);
        org.junit.Assert.assertNotNull(hierarchyBoundsListenerArray15);
        org.junit.Assert.assertNotNull(insets20);
        org.junit.Assert.assertNull(point26);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        api.ItemAttributes itemAttributes0 = null;
        // The following exception was thrown during execution in test generation
        try {
            api.eBook eBook1 = new api.eBook(itemAttributes0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"api.ItemAttributes.getName()\" because \"builder\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        cart1.setDebugGraphicsOptions(10);
        api.SessionManager sessionManager4 = api.SessionManager.getInstance();
        api.Cart cart5 = sessionManager4.getCurrentCart();
        java.awt.event.ContainerListener containerListener6 = null;
        cart5.addContainerListener(containerListener6);
        boolean boolean8 = cart1.isFocusCycleRoot((java.awt.Container) cart5);
        java.beans.VetoableChangeListener[] vetoableChangeListenerArray9 = cart5.getVetoableChangeListeners();
        boolean boolean10 = javax.swing.JComponent.isLightweightComponent((java.awt.Component) cart5);
        javax.accessibility.AccessibleContext accessibleContext11 = cart5.getAccessibleContext();
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertNotNull(sessionManager4);
        org.junit.Assert.assertNotNull(cart5);
// flaky:         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(vetoableChangeListenerArray9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(accessibleContext11);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        float float0 = java.awt.Component.LEFT_ALIGNMENT;
        org.junit.Assert.assertTrue("'" + float0 + "' != '" + 0.0f + "'", float0 == 0.0f);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        cart1.setDebugGraphicsOptions(10);
        api.SessionManager sessionManager4 = api.SessionManager.getInstance();
        api.Cart cart5 = sessionManager4.getCurrentCart();
        java.awt.event.ContainerListener containerListener6 = null;
        cart5.addContainerListener(containerListener6);
        boolean boolean8 = cart1.isFocusCycleRoot((java.awt.Container) cart5);
        java.beans.VetoableChangeListener[] vetoableChangeListenerArray9 = cart5.getVetoableChangeListeners();
        java.awt.Graphics graphics10 = null;
        // The following exception was thrown during execution in test generation
        try {
            cart5.print(graphics10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Graphics.setColor(java.awt.Color)\" because \"this.graphics\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertNotNull(sessionManager4);
        org.junit.Assert.assertNotNull(cart5);
// flaky:         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(vetoableChangeListenerArray9);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        cart1.setDebugGraphicsOptions(10);
        api.SessionManager sessionManager4 = api.SessionManager.getInstance();
        api.Cart cart5 = sessionManager4.getCurrentCart();
        java.awt.event.ContainerListener containerListener6 = null;
        cart5.addContainerListener(containerListener6);
        boolean boolean8 = cart1.isFocusCycleRoot((java.awt.Container) cart5);
        java.beans.VetoableChangeListener vetoableChangeListener9 = null;
        cart1.addVetoableChangeListener(vetoableChangeListener9);
        java.awt.Container container11 = cart1.getTopLevelAncestor();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = container11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertNotNull(sessionManager4);
        org.junit.Assert.assertNotNull(cart5);
// flaky:         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(container11);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        int int4 = cart1.getBaseline(10, (int) '4');
        boolean boolean5 = cart1.isPaintingTile();
        api.SessionManager sessionManager6 = api.SessionManager.getInstance();
        api.Cart cart7 = sessionManager6.getCurrentCart();
        boolean boolean8 = cart7.isBackgroundSet();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener9 = null;
        cart7.addHierarchyBoundsListener(hierarchyBoundsListener9);
        boolean boolean11 = cart7.isOptimizedDrawingEnabled();
        // The following exception was thrown during execution in test generation
        try {
            cart1.setComponentZOrder((java.awt.Component) cart7, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: illegal component position");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(sessionManager6);
        org.junit.Assert.assertNotNull(cart7);
// flaky:         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        java.awt.Event event2 = null;
        boolean boolean4 = cart1.gotFocus(event2, (java.lang.Object) ' ');
        javax.swing.TransferHandler transferHandler5 = null;
        cart1.setTransferHandler(transferHandler5);
        java.awt.FocusTraversalPolicy focusTraversalPolicy7 = cart1.getFocusTraversalPolicy();
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky:         org.junit.Assert.assertNotNull(focusTraversalPolicy7);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI2 = cart1.getUI();
        boolean boolean5 = cart1.inside(0, (int) (byte) 100);
        boolean boolean6 = cart1.isOptimizedDrawingEnabled();
        boolean boolean7 = cart1.isMaximumSizeSet();
        javax.accessibility.AccessibleContext accessibleContext8 = cart1.getAccessibleContext();
        java.awt.event.MouseWheelListener mouseWheelListener9 = null;
        cart1.removeMouseWheelListener(mouseWheelListener9);
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertNotNull(panelUI2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(accessibleContext8);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        cart1.show(true);
        java.awt.Event event4 = null;
        boolean boolean6 = cart1.action(event4, (java.lang.Object) 10);
        cart1.setVisible(false);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = cart1.areFocusTraversalKeysSet((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid focus traversal key identifier");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI2 = cart1.getUI();
        boolean boolean5 = cart1.inside(0, (int) (byte) 100);
        int int6 = cart1.countComponents();
        cart1.setSize(100, (int) (byte) 1);
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertNotNull(panelUI2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        boolean boolean2 = cart1.isBackgroundSet();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener3 = null;
        cart1.addHierarchyBoundsListener(hierarchyBoundsListener3);
        java.awt.Image image7 = cart1.createImage((int) '#', (-1));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = cart1.areFocusTraversalKeysSet(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid focus traversal key identifier");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
// flaky:         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(image7);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI2 = cart1.getUI();
        boolean boolean5 = cart1.inside(0, (int) (byte) 100);
        boolean boolean6 = cart1.isOptimizedDrawingEnabled();
        api.CartMemento cartMemento7 = null;
        // The following exception was thrown during execution in test generation
        try {
            cart1.undo(cartMemento7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"api.CartMemento.getItems()\" because \"memento\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertNotNull(panelUI2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        boolean boolean2 = cart1.isBackgroundSet();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener3 = null;
        cart1.addHierarchyBoundsListener(hierarchyBoundsListener3);
        java.awt.event.MouseListener mouseListener5 = null;
        cart1.removeMouseListener(mouseListener5);
        api.SessionManager sessionManager7 = api.SessionManager.getInstance();
        api.Cart cart8 = sessionManager7.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI9 = cart8.getUI();
        boolean boolean12 = cart8.inside(0, (int) (byte) 100);
        boolean boolean13 = cart8.isOptimizedDrawingEnabled();
        boolean boolean14 = cart8.isMaximumSizeSet();
        api.SessionManager sessionManager15 = api.SessionManager.getInstance();
        api.Cart cart16 = sessionManager15.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI17 = cart16.getUI();
        cart16.firePropertyChange("hi!", (int) 'a', 1);
        java.awt.Rectangle rectangle22 = null;
        java.awt.Rectangle rectangle23 = cart16.getBounds(rectangle22);
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener24 = null;
        cart16.addHierarchyBoundsListener(hierarchyBoundsListener24);
        java.beans.PropertyChangeListener propertyChangeListener27 = null;
        cart16.removePropertyChangeListener("", propertyChangeListener27);
        api.SessionManager sessionManager29 = api.SessionManager.getInstance();
        api.Cart cart30 = sessionManager29.getCurrentCart();
        boolean boolean31 = cart30.isBackgroundSet();
        cart16.remove((java.awt.Component) cart30);
        // The following exception was thrown during execution in test generation
        try {
            cart1.add((java.awt.Component) cart8, (java.lang.Object) cart16, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: illegal component position");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
// flaky:         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(sessionManager7);
        org.junit.Assert.assertNotNull(cart8);
        org.junit.Assert.assertNotNull(panelUI9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(sessionManager15);
        org.junit.Assert.assertNotNull(cart16);
        org.junit.Assert.assertNotNull(panelUI17);
        org.junit.Assert.assertNotNull(rectangle23);
        org.junit.Assert.assertNotNull(sessionManager29);
        org.junit.Assert.assertNotNull(cart30);
// flaky:         org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI2 = cart1.getUI();
        cart1.doLayout();
        java.awt.event.HierarchyBoundsListener[] hierarchyBoundsListenerArray4 = cart1.getHierarchyBoundsListeners();
        cart1.firePropertyChange("Your cart is empty.", (double) '#', (double) (byte) 1);
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertNotNull(panelUI2);
        org.junit.Assert.assertNotNull(hierarchyBoundsListenerArray4);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        cart1.setDebugGraphicsOptions(10);
        api.SessionManager sessionManager4 = api.SessionManager.getInstance();
        api.Cart cart5 = sessionManager4.getCurrentCart();
        java.awt.event.ContainerListener containerListener6 = null;
        cart5.addContainerListener(containerListener6);
        boolean boolean8 = cart1.isFocusCycleRoot((java.awt.Container) cart5);
        cart1.transferFocusDownCycle();
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertNotNull(sessionManager4);
        org.junit.Assert.assertNotNull(cart5);
// flaky:         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        cart1.show(true);
        java.awt.Event event4 = null;
        boolean boolean6 = cart1.action(event4, (java.lang.Object) 10);
        cart1.setVisible(false);
        cart1.grabFocus();
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        java.awt.event.ContainerListener containerListener2 = null;
        cart1.addContainerListener(containerListener2);
        cart1.resize((int) (short) 100, 100);
        java.awt.event.MouseMotionListener[] mouseMotionListenerArray7 = cart1.getMouseMotionListeners();
        int int8 = cart1.getHeight();
        java.awt.Image image11 = cart1.createImage(8, 2);
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertNotNull(mouseMotionListenerArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNull(image11);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        cart1.setDebugGraphicsOptions(10);
        api.SessionManager sessionManager4 = api.SessionManager.getInstance();
        api.Cart cart5 = sessionManager4.getCurrentCart();
        java.awt.event.ContainerListener containerListener6 = null;
        cart5.addContainerListener(containerListener6);
        boolean boolean8 = cart1.isFocusCycleRoot((java.awt.Container) cart5);
        java.beans.VetoableChangeListener vetoableChangeListener9 = null;
        cart1.addVetoableChangeListener(vetoableChangeListener9);
        java.awt.Event event11 = null;
        boolean boolean14 = cart1.mouseDrag(event11, (int) (byte) -1, (-1));
        cart1.setName("");
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertNotNull(sessionManager4);
        org.junit.Assert.assertNotNull(cart5);
// flaky:         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI2 = cart1.getUI();
        cart1.doLayout();
        java.awt.event.HierarchyBoundsListener[] hierarchyBoundsListenerArray4 = cart1.getHierarchyBoundsListeners();
        cart1.firePropertyChange("hi!", (byte) 1, (byte) -1);
        java.awt.Insets insets9 = cart1.getInsets();
        java.beans.VetoableChangeListener[] vetoableChangeListenerArray10 = cart1.getVetoableChangeListeners();
        api.SessionManager sessionManager11 = api.SessionManager.getInstance();
        api.Cart cart12 = sessionManager11.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI13 = cart12.getUI();
        boolean boolean16 = cart12.inside(0, (int) (byte) 100);
        java.awt.Rectangle rectangle17 = cart12.bounds();
        cart1.setMixingCutoutShape((java.awt.Shape) rectangle17);
        java.awt.event.MouseWheelListener mouseWheelListener19 = null;
        cart1.removeMouseWheelListener(mouseWheelListener19);
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertNotNull(panelUI2);
        org.junit.Assert.assertNotNull(hierarchyBoundsListenerArray4);
        org.junit.Assert.assertNotNull(insets9);
        org.junit.Assert.assertNotNull(vetoableChangeListenerArray10);
        org.junit.Assert.assertNotNull(sessionManager11);
        org.junit.Assert.assertNotNull(cart12);
        org.junit.Assert.assertNotNull(panelUI13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(rectangle17);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        api.PenaltyCalculation penaltyCalculation0 = new api.PenaltyCalculation();
        double double2 = penaltyCalculation0.calculatePenalty((int) ' ');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 16.0d + "'", double2 == 16.0d);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        int int4 = cart1.getBaseline(10, (int) '4');
        cart1.paintImmediately(10, (int) (byte) 0, 0, (int) (byte) 10);
        cart1.firePropertyChange("", true, false);
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI2 = cart1.getUI();
        cart1.repaint();
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertNotNull(panelUI2);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        cart1.setDebugGraphicsOptions(10);
        api.SessionManager sessionManager4 = api.SessionManager.getInstance();
        api.Cart cart5 = sessionManager4.getCurrentCart();
        java.awt.event.ContainerListener containerListener6 = null;
        cart5.addContainerListener(containerListener6);
        boolean boolean8 = cart1.isFocusCycleRoot((java.awt.Container) cart5);
        java.beans.VetoableChangeListener[] vetoableChangeListenerArray9 = cart5.getVetoableChangeListeners();
        javax.accessibility.AccessibleContext accessibleContext10 = cart5.getAccessibleContext();
        boolean boolean11 = cart5.isFocusTraversable();
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertNotNull(sessionManager4);
        org.junit.Assert.assertNotNull(cart5);
// flaky:         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(vetoableChangeListenerArray9);
        org.junit.Assert.assertNotNull(accessibleContext10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        java.util.Locale locale0 = null;
        javax.swing.JComponent.setDefaultLocale(locale0);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI2 = cart1.getUI();
        cart1.firePropertyChange("hi!", (int) 'a', 1);
        java.awt.Rectangle rectangle7 = null;
        java.awt.Rectangle rectangle8 = cart1.getBounds(rectangle7);
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener9 = null;
        cart1.addHierarchyBoundsListener(hierarchyBoundsListener9);
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        cart1.removePropertyChangeListener("", propertyChangeListener12);
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Component component15 = cart1.getComponent(10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: No such child: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertNotNull(panelUI2);
        org.junit.Assert.assertNotNull(rectangle8);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI2 = cart1.getUI();
        cart1.doLayout();
        cart1.resetKeyboardActions();
        api.SessionManager sessionManager5 = api.SessionManager.getInstance();
        api.Cart cart6 = sessionManager5.getCurrentCart();
        cart6.setDebugGraphicsOptions(10);
        api.SessionManager sessionManager9 = api.SessionManager.getInstance();
        api.Cart cart10 = sessionManager9.getCurrentCart();
        java.awt.event.ContainerListener containerListener11 = null;
        cart10.addContainerListener(containerListener11);
        boolean boolean13 = cart6.isFocusCycleRoot((java.awt.Container) cart10);
        javax.swing.JPopupMenu jPopupMenu14 = null;
        cart6.setComponentPopupMenu(jPopupMenu14);
        api.SessionManager sessionManager16 = api.SessionManager.getInstance();
        api.Cart cart17 = sessionManager16.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI18 = cart17.getUI();
        cart6.setUI(panelUI18);
        cart1.setUI(panelUI18);
        javax.swing.TransferHandler transferHandler21 = cart1.getTransferHandler();
        java.awt.Graphics graphics22 = null;
        // The following exception was thrown during execution in test generation
        try {
            cart1.update(graphics22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Graphics.setColor(java.awt.Color)\" because \"this.graphics\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertNotNull(panelUI2);
        org.junit.Assert.assertNotNull(sessionManager5);
        org.junit.Assert.assertNotNull(cart6);
        org.junit.Assert.assertNotNull(sessionManager9);
        org.junit.Assert.assertNotNull(cart10);
// flaky:         org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(sessionManager16);
        org.junit.Assert.assertNotNull(cart17);
        org.junit.Assert.assertNotNull(panelUI18);
        org.junit.Assert.assertNull(transferHandler21);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        cart1.setDebugGraphicsOptions(10);
        api.SessionManager sessionManager4 = api.SessionManager.getInstance();
        api.Cart cart5 = sessionManager4.getCurrentCart();
        java.awt.event.ContainerListener containerListener6 = null;
        cart5.addContainerListener(containerListener6);
        boolean boolean8 = cart1.isFocusCycleRoot((java.awt.Container) cart5);
        javax.swing.JPopupMenu jPopupMenu9 = null;
        cart1.setComponentPopupMenu(jPopupMenu9);
        api.SessionManager sessionManager11 = api.SessionManager.getInstance();
        api.Cart cart12 = sessionManager11.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI13 = cart12.getUI();
        cart1.setUI(panelUI13);
        java.awt.event.MouseWheelListener[] mouseWheelListenerArray15 = cart1.getMouseWheelListeners();
        boolean boolean16 = cart1.isMaximumSizeSet();
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertNotNull(sessionManager4);
        org.junit.Assert.assertNotNull(cart5);
// flaky:         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(sessionManager11);
        org.junit.Assert.assertNotNull(cart12);
        org.junit.Assert.assertNotNull(panelUI13);
        org.junit.Assert.assertNotNull(mouseWheelListenerArray15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        boolean boolean2 = cart1.isBackgroundSet();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener3 = null;
        cart1.addHierarchyBoundsListener(hierarchyBoundsListener3);
        java.awt.event.MouseListener mouseListener5 = null;
        cart1.removeMouseListener(mouseListener5);
        cart1.setInheritsPopupMenu(false);
        javax.swing.KeyStroke keyStroke9 = null;
        java.awt.event.ActionListener actionListener10 = cart1.getActionForKeyStroke(keyStroke9);
        java.awt.Point point11 = null;
        // The following exception was thrown during execution in test generation
        try {
            cart1.setLocation(point11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"x\" because \"p\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(actionListener10);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI2 = cart1.getUI();
        boolean boolean5 = cart1.inside(0, (int) (byte) 100);
        java.awt.event.FocusEvent.Cause cause6 = null;
        boolean boolean7 = cart1.requestFocusInWindow(cause6);
        java.awt.event.KeyListener keyListener8 = null;
        cart1.addKeyListener(keyListener8);
        javax.swing.InputMap inputMap11 = null;
        // The following exception was thrown during execution in test generation
        try {
            cart1.setInputMap(100, inputMap11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: condition must be one of JComponent.WHEN_IN_FOCUSED_WINDOW, JComponent.WHEN_FOCUSED or JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertNotNull(panelUI2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI2 = cart1.getUI();
        cart1.doLayout();
        java.awt.event.HierarchyBoundsListener[] hierarchyBoundsListenerArray4 = cart1.getHierarchyBoundsListeners();
        cart1.firePropertyChange("hi!", (byte) 1, (byte) -1);
        java.awt.Insets insets9 = cart1.getInsets();
        cart1.setSize(128, (int) 'a');
        javax.swing.ActionMap actionMap13 = cart1.getActionMap();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale14 = cart1.getLocale();
// flaky:             org.junit.Assert.fail("Expected exception of type java.awt.IllegalComponentStateException; message: This component must have a parent in order to determine its locale");
        } catch (java.awt.IllegalComponentStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertNotNull(panelUI2);
        org.junit.Assert.assertNotNull(hierarchyBoundsListenerArray4);
        org.junit.Assert.assertNotNull(insets9);
        org.junit.Assert.assertNotNull(actionMap13);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        cart1.setDebugGraphicsOptions(10);
        api.SessionManager sessionManager4 = api.SessionManager.getInstance();
        api.Cart cart5 = sessionManager4.getCurrentCart();
        java.awt.event.ContainerListener containerListener6 = null;
        cart5.addContainerListener(containerListener6);
        boolean boolean8 = cart1.isFocusCycleRoot((java.awt.Container) cart5);
        java.beans.VetoableChangeListener[] vetoableChangeListenerArray9 = cart5.getVetoableChangeListeners();
        javax.accessibility.AccessibleContext accessibleContext10 = cart5.getAccessibleContext();
        java.awt.Image image13 = cart5.createImage(1, 10);
        boolean boolean14 = cart5.isFocusCycleRoot();
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertNotNull(sessionManager4);
        org.junit.Assert.assertNotNull(cart5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(vetoableChangeListenerArray9);
        org.junit.Assert.assertNotNull(accessibleContext10);
        org.junit.Assert.assertNull(image13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI2 = cart1.getUI();
        boolean boolean5 = cart1.inside(0, (int) (byte) 100);
        java.awt.event.FocusEvent.Cause cause6 = null;
        boolean boolean7 = cart1.requestFocusInWindow(cause6);
        java.awt.Rectangle rectangle8 = cart1.getBounds();
        javax.swing.event.AncestorListener[] ancestorListenerArray9 = cart1.getAncestorListeners();
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertNotNull(panelUI2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(rectangle8);
        org.junit.Assert.assertNotNull(ancestorListenerArray9);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI2 = cart1.getUI();
        cart1.firePropertyChange("hi!", (int) 'a', 1);
        java.awt.Rectangle rectangle7 = null;
        java.awt.Rectangle rectangle8 = cart1.getBounds(rectangle7);
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener9 = null;
        cart1.addHierarchyBoundsListener(hierarchyBoundsListener9);
        api.SessionManager sessionManager11 = api.SessionManager.getInstance();
        api.Cart cart12 = sessionManager11.getCurrentCart();
        cart12.show(true);
        java.awt.Event event15 = null;
        boolean boolean17 = cart12.action(event15, (java.lang.Object) 10);
        cart12.setVisible(false);
        boolean boolean20 = cart1.isAncestorOf((java.awt.Component) cart12);
        cart12.setSize(1, (int) (short) -1);
        cart12.hide();
        java.awt.Insets insets25 = cart12.insets();
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertNotNull(panelUI2);
        org.junit.Assert.assertNotNull(rectangle8);
        org.junit.Assert.assertNotNull(sessionManager11);
        org.junit.Assert.assertNotNull(cart12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(insets25);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI2 = cart1.getUI();
        javax.swing.plaf.PanelUI panelUI3 = cart1.getUI();
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertNotNull(panelUI2);
        org.junit.Assert.assertNotNull(panelUI3);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        api.ItemFactory itemFactory0 = new api.ItemFactory();
        api.ItemAttributes itemAttributes1 = null;
        // The following exception was thrown during execution in test generation
        try {
            api.Item item2 = itemFactory0.getItem(itemAttributes1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"api.ItemAttributes.getType()\" because \"attributes\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI2 = cart1.getUI();
        cart1.doLayout();
        java.awt.event.HierarchyBoundsListener[] hierarchyBoundsListenerArray4 = cart1.getHierarchyBoundsListeners();
        cart1.firePropertyChange("hi!", (byte) 1, (byte) -1);
        java.awt.Insets insets9 = cart1.getInsets();
        cart1.setSize(128, (int) 'a');
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener13 = null;
        cart1.removeHierarchyBoundsListener(hierarchyBoundsListener13);
        java.awt.Point point15 = cart1.getMousePosition();
        java.awt.Rectangle rectangle16 = cart1.getVisibleRect();
        java.io.PrintWriter printWriter17 = null;
        // The following exception was thrown during execution in test generation
        try {
            cart1.list(printWriter17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(Object)\" because \"out\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertNotNull(panelUI2);
        org.junit.Assert.assertNotNull(hierarchyBoundsListenerArray4);
        org.junit.Assert.assertNotNull(insets9);
        org.junit.Assert.assertNull(point15);
        org.junit.Assert.assertNotNull(rectangle16);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        cart1.setDebugGraphicsOptions(10);
        java.lang.String str4 = cart1.displayCart();
        java.awt.event.FocusListener focusListener5 = null;
        cart1.addFocusListener(focusListener5);
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Your cart is empty." + "'", str4, "Your cart is empty.");
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        int int4 = cart1.getBaseline(10, (int) '4');
        cart1.paintImmediately(10, (int) (byte) 0, 0, (int) (byte) 10);
        api.SessionManager sessionManager10 = api.SessionManager.getInstance();
        api.Cart cart11 = sessionManager10.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI12 = cart11.getUI();
        boolean boolean15 = cart11.inside(0, (int) (byte) 100);
        java.awt.event.FocusEvent.Cause cause16 = null;
        boolean boolean17 = cart11.requestFocusInWindow(cause16);
        java.awt.Dimension dimension18 = cart11.getMaximumSize();
        java.awt.Dimension dimension19 = cart1.getSize(dimension18);
        api.SessionManager sessionManager20 = api.SessionManager.getInstance();
        api.Cart cart21 = sessionManager20.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI22 = cart21.getUI();
        cart21.firePropertyChange("hi!", (int) 'a', 1);
        java.awt.Rectangle rectangle27 = null;
        java.awt.Rectangle rectangle28 = cart21.getBounds(rectangle27);
        cart1.setMixingCutoutShape((java.awt.Shape) rectangle28);
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(sessionManager10);
        org.junit.Assert.assertNotNull(cart11);
        org.junit.Assert.assertNotNull(panelUI12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(dimension18);
        org.junit.Assert.assertNotNull(dimension19);
        org.junit.Assert.assertNotNull(sessionManager20);
        org.junit.Assert.assertNotNull(cart21);
        org.junit.Assert.assertNotNull(panelUI22);
        org.junit.Assert.assertNotNull(rectangle28);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        cart1.setDebugGraphicsOptions(10);
        api.SessionManager sessionManager4 = api.SessionManager.getInstance();
        api.Cart cart5 = sessionManager4.getCurrentCart();
        java.awt.event.ContainerListener containerListener6 = null;
        cart5.addContainerListener(containerListener6);
        boolean boolean8 = cart1.isFocusCycleRoot((java.awt.Container) cart5);
        java.beans.VetoableChangeListener[] vetoableChangeListenerArray9 = cart5.getVetoableChangeListeners();
        cart5.paintImmediately(10, (int) (short) -1, (int) (byte) 0, 10);
        cart5.repaint();
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertNotNull(sessionManager4);
        org.junit.Assert.assertNotNull(cart5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(vetoableChangeListenerArray9);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        cart1.setDebugGraphicsOptions(10);
        api.SessionManager sessionManager4 = api.SessionManager.getInstance();
        api.Cart cart5 = sessionManager4.getCurrentCart();
        java.awt.event.ContainerListener containerListener6 = null;
        cart5.addContainerListener(containerListener6);
        boolean boolean8 = cart1.isFocusCycleRoot((java.awt.Container) cart5);
        java.beans.VetoableChangeListener[] vetoableChangeListenerArray9 = cart5.getVetoableChangeListeners();
        java.awt.Point point10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = cart5.contains(point10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"x\" because \"p\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertNotNull(sessionManager4);
        org.junit.Assert.assertNotNull(cart5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(vetoableChangeListenerArray9);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        api.ItemAttributes itemAttributes0 = null;
        // The following exception was thrown during execution in test generation
        try {
            api.Magazine magazine1 = new api.Magazine(itemAttributes0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"api.ItemAttributes.getName()\" because \"builder\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        cart1.setDebugGraphicsOptions(10);
        api.SessionManager sessionManager4 = api.SessionManager.getInstance();
        api.Cart cart5 = sessionManager4.getCurrentCart();
        java.awt.event.ContainerListener containerListener6 = null;
        cart5.addContainerListener(containerListener6);
        boolean boolean8 = cart1.isFocusCycleRoot((java.awt.Container) cart5);
        javax.swing.JPopupMenu jPopupMenu9 = null;
        cart1.setComponentPopupMenu(jPopupMenu9);
        api.SessionManager sessionManager11 = api.SessionManager.getInstance();
        api.Cart cart12 = sessionManager11.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI13 = cart12.getUI();
        cart1.setUI(panelUI13);
        java.awt.event.MouseWheelListener[] mouseWheelListenerArray15 = cart1.getMouseWheelListeners();
        java.awt.Event event16 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = cart1.handleEvent(event16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"id\" because \"evt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertNotNull(sessionManager4);
        org.junit.Assert.assertNotNull(cart5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(sessionManager11);
        org.junit.Assert.assertNotNull(cart12);
        org.junit.Assert.assertNotNull(panelUI13);
        org.junit.Assert.assertNotNull(mouseWheelListenerArray15);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        api.ItemAttributes itemAttributes0 = null;
        // The following exception was thrown during execution in test generation
        try {
            api.Newsletter newsletter1 = new api.Newsletter(itemAttributes0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"api.ItemAttributes.getName()\" because \"builder\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        api.Staff staff4 = new api.Staff("", "");
        api.Subscription subscription5 = null;
        staff4.addSubscription(subscription5);
        sessionManager0.loginUser((api.User) staff4);
        api.UserType userType8 = staff4.getUserType();
        // The following exception was thrown during execution in test generation
        try {
            staff4.removeSubscription("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"api.Subscription.getServiceName()\" because \"sub2\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertTrue("'" + userType8 + "' != '" + api.UserType.STAFF + "'", userType8.equals(api.UserType.STAFF));
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        api.Rental rental0 = new api.Rental();
        api.PhysicalItem physicalItem1 = rental0.getItem();
        org.junit.Assert.assertNull(physicalItem1);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        boolean boolean2 = cart1.isBackgroundSet();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener3 = null;
        cart1.addHierarchyBoundsListener(hierarchyBoundsListener3);
        api.SessionManager sessionManager5 = api.SessionManager.getInstance();
        api.Cart cart6 = sessionManager5.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI7 = cart6.getUI();
        java.awt.LayoutManager layoutManager8 = null;
        cart6.setLayout(layoutManager8);
        cart6.transferFocusBackward();
        boolean boolean11 = cart1.isFocusCycleRoot((java.awt.Container) cart6);
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(sessionManager5);
        org.junit.Assert.assertNotNull(cart6);
        org.junit.Assert.assertNotNull(panelUI7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        boolean boolean2 = cart1.isBackgroundSet();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener3 = null;
        cart1.addHierarchyBoundsListener(hierarchyBoundsListener3);
        boolean boolean5 = cart1.isOptimizedDrawingEnabled();
        java.awt.Component component8 = cart1.locate(0, (int) (short) 10);
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(component8);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        cart1.setDebugGraphicsOptions(10);
        api.SessionManager sessionManager4 = api.SessionManager.getInstance();
        api.Cart cart5 = sessionManager4.getCurrentCart();
        java.awt.event.ContainerListener containerListener6 = null;
        cart5.addContainerListener(containerListener6);
        boolean boolean8 = cart1.isFocusCycleRoot((java.awt.Container) cart5);
        java.beans.VetoableChangeListener[] vetoableChangeListenerArray9 = cart5.getVetoableChangeListeners();
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        cart5.removePropertyChangeListener("PanelUI", propertyChangeListener11);
        boolean boolean13 = cart5.getIgnoreRepaint();
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertNotNull(sessionManager4);
        org.junit.Assert.assertNotNull(cart5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(vetoableChangeListenerArray9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI2 = cart1.getUI();
        java.awt.Dimension dimension3 = null;
        cart1.setMaximumSize(dimension3);
        java.awt.Event event5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = cart1.handleEvent(event5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"id\" because \"evt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertNotNull(panelUI2);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        java.awt.event.ContainerListener containerListener2 = null;
        cart1.addContainerListener(containerListener2);
        cart1.resize((int) (short) 100, 100);
        java.awt.event.MouseMotionListener[] mouseMotionListenerArray7 = cart1.getMouseMotionListeners();
        int int8 = cart1.getHeight();
        api.SessionManager sessionManager9 = api.SessionManager.getInstance();
        api.Cart cart10 = sessionManager9.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI11 = cart10.getUI();
        boolean boolean14 = cart10.inside(0, (int) (byte) 100);
        java.awt.event.FocusEvent.Cause cause15 = null;
        boolean boolean16 = cart10.requestFocusInWindow(cause15);
        java.awt.Insets insets17 = cart10.insets();
        java.awt.Graphics graphics18 = cart10.getGraphics();
        cart1.paintAll(graphics18);
        cart1.setAlignmentX((float) (-1));
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertNotNull(mouseMotionListenerArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNotNull(sessionManager9);
        org.junit.Assert.assertNotNull(cart10);
        org.junit.Assert.assertNotNull(panelUI11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(insets17);
        org.junit.Assert.assertNotNull(graphics18);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI2 = cart1.getUI();
        cart1.doLayout();
        cart1.enableInputMethods(true);
        java.awt.event.ComponentListener componentListener6 = null;
        cart1.addComponentListener(componentListener6);
        boolean boolean8 = cart1.isPreferredSizeSet();
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertNotNull(panelUI2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        api.Staff staff2 = new api.Staff("", "");
        staff2.removeSubscription("");
        api.PhysicalItem physicalItem5 = null;
        // The following exception was thrown during execution in test generation
        try {
            staff2.rentItem(physicalItem5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"canRent\" because \"item\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        java.awt.event.ContainerListener containerListener2 = null;
        cart1.addContainerListener(containerListener2);
        cart1.resize((int) (short) 100, 100);
        java.awt.event.MouseMotionListener[] mouseMotionListenerArray7 = cart1.getMouseMotionListeners();
        float float8 = cart1.getAlignmentX();
        cart1.setFocusTraversalKeysEnabled(false);
        java.awt.Component component13 = cart1.getComponentAt(8, 128);
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertNotNull(mouseMotionListenerArray7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertNull(component13);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        api.Staff staff4 = new api.Staff("", "");
        api.Subscription subscription5 = null;
        staff4.addSubscription(subscription5);
        sessionManager0.loginUser((api.User) staff4);
        api.UserType userType8 = staff4.getUserType();
        java.util.ArrayList<api.Rental> rentalList9 = staff4.getRentals();
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertTrue("'" + userType8 + "' != '" + api.UserType.STAFF + "'", userType8.equals(api.UserType.STAFF));
        org.junit.Assert.assertNotNull(rentalList9);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        int int0 = java.awt.image.ImageObserver.ALLBITS;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 32 + "'", int0 == 32);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        api.Staff staff4 = new api.Staff("", "");
        api.Subscription subscription5 = null;
        staff4.addSubscription(subscription5);
        sessionManager0.loginUser((api.User) staff4);
        api.SubscriptionData subscriptionData8 = new api.SubscriptionData();
        api.Subscription subscription9 = new api.Subscription();
        subscriptionData8.addSubscription(subscription9);
        // The following exception was thrown during execution in test generation
        try {
            staff4.addSubscription(subscription9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"api.Subscription.getServiceName()\" because \"sub2\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        boolean boolean2 = cart1.isBackgroundSet();
        java.awt.event.MouseMotionListener mouseMotionListener3 = null;
        cart1.addMouseMotionListener(mouseMotionListener3);
        javax.accessibility.AccessibleContext accessibleContext5 = cart1.getAccessibleContext();
        cart1.setFocusTraversalKeysEnabled(false);
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(accessibleContext5);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI2 = cart1.getUI();
        cart1.firePropertyChange("hi!", (int) 'a', 1);
        java.awt.Rectangle rectangle7 = null;
        java.awt.Rectangle rectangle8 = cart1.getBounds(rectangle7);
        boolean boolean9 = cart1.isOptimizedDrawingEnabled();
        java.util.Locale locale10 = cart1.getLocale();
        javax.swing.JComponent.setDefaultLocale(locale10);
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertNotNull(panelUI2);
        org.junit.Assert.assertNotNull(rectangle8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_CA");
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        api.Faculty faculty2 = new api.Faculty("Your cart is empty.", "PanelUI");
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI2 = cart1.getUI();
        cart1.doLayout();
        java.awt.event.HierarchyBoundsListener[] hierarchyBoundsListenerArray4 = cart1.getHierarchyBoundsListeners();
        cart1.firePropertyChange("hi!", (byte) 1, (byte) -1);
        java.awt.Insets insets9 = cart1.getInsets();
        cart1.setSize(128, (int) 'a');
        javax.swing.ActionMap actionMap13 = cart1.getActionMap();
        cart1.setFocusTraversalKeysEnabled(true);
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertNotNull(panelUI2);
        org.junit.Assert.assertNotNull(hierarchyBoundsListenerArray4);
        org.junit.Assert.assertNotNull(insets9);
        org.junit.Assert.assertNotNull(actionMap13);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        int int0 = javax.swing.JComponent.UNDEFINED_CONDITION;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + (-1) + "'", int0 == (-1));
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        java.awt.event.ContainerListener containerListener2 = null;
        cart1.addContainerListener(containerListener2);
        cart1.resize((int) (short) 100, 100);
        java.awt.event.MouseMotionListener[] mouseMotionListenerArray7 = cart1.getMouseMotionListeners();
        int int8 = cart1.getHeight();
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        cart1.removePropertyChangeListener("PanelUI", propertyChangeListener10);
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertNotNull(mouseMotionListenerArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI2 = cart1.getUI();
        cart1.firePropertyChange("hi!", (int) 'a', 1);
        boolean boolean7 = cart1.isFocusTraversable();
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertNotNull(panelUI2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI2 = cart1.getUI();
        cart1.doLayout();
        java.awt.event.HierarchyBoundsListener[] hierarchyBoundsListenerArray4 = cart1.getHierarchyBoundsListeners();
        cart1.firePropertyChange("hi!", (byte) 1, (byte) -1);
        java.awt.Insets insets9 = cart1.getInsets();
        cart1.setSize(128, (int) 'a');
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener13 = null;
        cart1.removeHierarchyBoundsListener(hierarchyBoundsListener13);
        cart1.setIgnoreRepaint(false);
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertNotNull(panelUI2);
        org.junit.Assert.assertNotNull(hierarchyBoundsListenerArray4);
        org.junit.Assert.assertNotNull(insets9);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI2 = cart1.getUI();
        cart1.doLayout();
        cart1.enableInputMethods(true);
        java.awt.Event event6 = null;
        boolean boolean9 = cart1.mouseExit(event6, 0, (int) (short) 1);
        java.beans.PropertyChangeListener[] propertyChangeListenerArray10 = cart1.getPropertyChangeListeners();
        cart1.setFocusCycleRoot(false);
        java.awt.event.FocusListener focusListener13 = null;
        cart1.removeFocusListener(focusListener13);
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertNotNull(panelUI2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray10);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI2 = cart1.getUI();
        boolean boolean5 = cart1.inside(0, (int) (byte) 100);
        boolean boolean6 = cart1.isOptimizedDrawingEnabled();
        boolean boolean7 = cart1.isMaximumSizeSet();
        java.awt.event.MouseWheelListener[] mouseWheelListenerArray8 = cart1.getMouseWheelListeners();
        java.awt.Event event9 = null;
        boolean boolean12 = cart1.mouseExit(event9, (int) (short) -1, (int) (byte) 10);
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertNotNull(panelUI2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(mouseWheelListenerArray8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI2 = cart1.getUI();
        api.SessionManager sessionManager3 = api.SessionManager.getInstance();
        api.Cart cart4 = sessionManager3.getCurrentCart();
        cart4.setDebugGraphicsOptions(10);
        api.SessionManager sessionManager7 = api.SessionManager.getInstance();
        api.Cart cart8 = sessionManager7.getCurrentCart();
        java.awt.event.ContainerListener containerListener9 = null;
        cart8.addContainerListener(containerListener9);
        boolean boolean11 = cart4.isFocusCycleRoot((java.awt.Container) cart8);
        javax.swing.JPopupMenu jPopupMenu12 = null;
        cart4.setComponentPopupMenu(jPopupMenu12);
        cart1.remove((java.awt.Component) cart4);
        java.lang.Class<?> wildcardClass15 = cart1.getClass();
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertNotNull(panelUI2);
        org.junit.Assert.assertNotNull(sessionManager3);
        org.junit.Assert.assertNotNull(cart4);
        org.junit.Assert.assertNotNull(sessionManager7);
        org.junit.Assert.assertNotNull(cart8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        java.awt.event.ContainerListener containerListener2 = null;
        cart1.addContainerListener(containerListener2);
        cart1.resize((int) (short) 100, 100);
        java.awt.event.MouseMotionListener[] mouseMotionListenerArray7 = cart1.getMouseMotionListeners();
        float float8 = cart1.getAlignmentX();
        cart1.setAutoscrolls(false);
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertNotNull(mouseMotionListenerArray7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.5f + "'", float8 == 0.5f);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        int int0 = java.awt.image.ImageObserver.ERROR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 64 + "'", int0 == 64);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI2 = cart1.getUI();
        boolean boolean5 = cart1.inside(0, (int) (byte) 100);
        java.awt.event.FocusEvent.Cause cause6 = null;
        boolean boolean7 = cart1.requestFocusInWindow(cause6);
        java.awt.event.MouseMotionListener mouseMotionListener8 = null;
        cart1.removeMouseMotionListener(mouseMotionListener8);
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertNotNull(panelUI2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        cart1.setDebugGraphicsOptions(10);
        api.SessionManager sessionManager4 = api.SessionManager.getInstance();
        api.Cart cart5 = sessionManager4.getCurrentCart();
        java.awt.event.ContainerListener containerListener6 = null;
        cart5.addContainerListener(containerListener6);
        boolean boolean8 = cart1.isFocusCycleRoot((java.awt.Container) cart5);
        api.SessionManager sessionManager9 = api.SessionManager.getInstance();
        api.Cart cart10 = sessionManager9.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI11 = cart10.getUI();
        cart10.doLayout();
        java.awt.event.HierarchyBoundsListener[] hierarchyBoundsListenerArray13 = cart10.getHierarchyBoundsListeners();
        cart10.firePropertyChange("hi!", (byte) 1, (byte) -1);
        java.awt.Insets insets18 = cart10.getInsets();
        java.beans.VetoableChangeListener[] vetoableChangeListenerArray19 = cart10.getVetoableChangeListeners();
        api.SessionManager sessionManager20 = api.SessionManager.getInstance();
        api.Cart cart21 = sessionManager20.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI22 = cart21.getUI();
        boolean boolean25 = cart21.inside(0, (int) (byte) 100);
        java.awt.Rectangle rectangle26 = cart21.bounds();
        cart10.setMixingCutoutShape((java.awt.Shape) rectangle26);
        java.awt.Rectangle rectangle28 = cart5.getBounds(rectangle26);
        api.SessionManager sessionManager29 = api.SessionManager.getInstance();
        api.Cart cart30 = sessionManager29.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI31 = cart30.getUI();
        boolean boolean34 = cart30.inside(0, (int) (byte) 100);
        java.awt.event.FocusEvent.Cause cause35 = null;
        boolean boolean36 = cart30.requestFocusInWindow(cause35);
        java.awt.Insets insets37 = cart30.insets();
        java.awt.Graphics graphics38 = cart30.getGraphics();
        // The following exception was thrown during execution in test generation
        try {
            cart5.printAll(graphics38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Graphics.setColor(java.awt.Color)\" because \"this.graphics\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertNotNull(sessionManager4);
        org.junit.Assert.assertNotNull(cart5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(sessionManager9);
        org.junit.Assert.assertNotNull(cart10);
        org.junit.Assert.assertNotNull(panelUI11);
        org.junit.Assert.assertNotNull(hierarchyBoundsListenerArray13);
        org.junit.Assert.assertNotNull(insets18);
        org.junit.Assert.assertNotNull(vetoableChangeListenerArray19);
        org.junit.Assert.assertNotNull(sessionManager20);
        org.junit.Assert.assertNotNull(cart21);
        org.junit.Assert.assertNotNull(panelUI22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(rectangle26);
        org.junit.Assert.assertNotNull(rectangle28);
        org.junit.Assert.assertNotNull(sessionManager29);
        org.junit.Assert.assertNotNull(cart30);
        org.junit.Assert.assertNotNull(panelUI31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(insets37);
        org.junit.Assert.assertNotNull(graphics38);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        int int4 = cart1.getBaseline(10, (int) '4');
        int int5 = cart1.getComponentCount();
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI2 = cart1.getUI();
        cart1.doLayout();
        java.awt.event.HierarchyBoundsListener[] hierarchyBoundsListenerArray4 = cart1.getHierarchyBoundsListeners();
        cart1.firePropertyChange("hi!", (byte) 1, (byte) -1);
        java.awt.Insets insets9 = cart1.getInsets();
        java.beans.VetoableChangeListener[] vetoableChangeListenerArray10 = cart1.getVetoableChangeListeners();
        java.awt.event.MouseEvent mouseEvent11 = null;
        java.awt.Point point12 = cart1.getPopupLocation(mouseEvent11);
        java.awt.Toolkit toolkit13 = cart1.getToolkit();
        api.SessionManager sessionManager14 = api.SessionManager.getInstance();
        api.Cart cart15 = sessionManager14.getCurrentCart();
        cart15.setDebugGraphicsOptions(10);
        cart15.setFocusCycleRoot(true);
        boolean boolean22 = cart15.contains((int) '4', (-1));
        api.SessionManager sessionManager23 = api.SessionManager.getInstance();
        api.Cart cart24 = sessionManager23.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI25 = cart24.getUI();
        boolean boolean28 = cart24.inside(0, (int) (byte) 100);
        java.awt.event.FocusEvent.Cause cause29 = null;
        boolean boolean30 = cart24.requestFocusInWindow(cause29);
        java.awt.Dimension dimension31 = cart24.getMaximumSize();
        cart15.resize(dimension31);
        cart1.resize(dimension31);
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertNotNull(panelUI2);
        org.junit.Assert.assertNotNull(hierarchyBoundsListenerArray4);
        org.junit.Assert.assertNotNull(insets9);
        org.junit.Assert.assertNotNull(vetoableChangeListenerArray10);
        org.junit.Assert.assertNull(point12);
        org.junit.Assert.assertNotNull(toolkit13);
        org.junit.Assert.assertNotNull(sessionManager14);
        org.junit.Assert.assertNotNull(cart15);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(sessionManager23);
        org.junit.Assert.assertNotNull(cart24);
        org.junit.Assert.assertNotNull(panelUI25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(dimension31);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        java.awt.event.ContainerListener containerListener2 = null;
        cart1.addContainerListener(containerListener2);
        cart1.resize((int) (short) 100, 100);
        java.awt.event.MouseMotionListener[] mouseMotionListenerArray7 = cart1.getMouseMotionListeners();
        int int8 = cart1.getHeight();
        javax.swing.TransferHandler transferHandler9 = null;
        cart1.setTransferHandler(transferHandler9);
        java.awt.Event event11 = null;
        boolean boolean13 = cart1.keyDown(event11, 0);
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertNotNull(mouseMotionListenerArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI2 = cart1.getUI();
        cart1.doLayout();
        cart1.enableInputMethods(true);
        java.awt.Event event6 = null;
        boolean boolean9 = cart1.mouseExit(event6, 0, (int) (short) 1);
        java.beans.PropertyChangeListener[] propertyChangeListenerArray10 = cart1.getPropertyChangeListeners();
        cart1.setAlignmentY((float) (short) -1);
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertNotNull(panelUI2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray10);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI2 = cart1.getUI();
        java.awt.LayoutManager layoutManager3 = null;
        cart1.setLayout(layoutManager3);
        cart1.transferFocusBackward();
        java.awt.dnd.DropTarget dropTarget6 = cart1.getDropTarget();
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertNotNull(panelUI2);
        org.junit.Assert.assertNull(dropTarget6);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        java.awt.event.ContainerListener containerListener2 = null;
        cart1.addContainerListener(containerListener2);
        cart1.resize((int) (short) 100, 100);
        java.awt.event.MouseMotionListener[] mouseMotionListenerArray7 = cart1.getMouseMotionListeners();
        cart1.removeAll();
        api.SessionManager sessionManager9 = api.SessionManager.getInstance();
        api.Cart cart10 = sessionManager9.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI11 = cart10.getUI();
        int int12 = cart1.getComponentZOrder((java.awt.Component) cart10);
        api.SessionManager sessionManager13 = api.SessionManager.getInstance();
        api.Cart cart14 = sessionManager13.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI15 = cart14.getUI();
        cart14.doLayout();
        java.awt.event.HierarchyBoundsListener[] hierarchyBoundsListenerArray17 = cart14.getHierarchyBoundsListeners();
        cart14.firePropertyChange("hi!", (byte) 1, (byte) -1);
        java.awt.Insets insets22 = cart14.getInsets();
        cart14.setSize(128, (int) 'a');
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener26 = null;
        cart14.removeHierarchyBoundsListener(hierarchyBoundsListener26);
        java.awt.GraphicsConfiguration graphicsConfiguration28 = cart14.getGraphicsConfiguration();
        javax.swing.ActionMap actionMap29 = cart14.getActionMap();
        cart1.setActionMap(actionMap29);
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertNotNull(mouseMotionListenerArray7);
        org.junit.Assert.assertNotNull(sessionManager9);
        org.junit.Assert.assertNotNull(cart10);
        org.junit.Assert.assertNotNull(panelUI11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(sessionManager13);
        org.junit.Assert.assertNotNull(cart14);
        org.junit.Assert.assertNotNull(panelUI15);
        org.junit.Assert.assertNotNull(hierarchyBoundsListenerArray17);
        org.junit.Assert.assertNotNull(insets22);
        org.junit.Assert.assertNull(graphicsConfiguration28);
        org.junit.Assert.assertNotNull(actionMap29);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI2 = cart1.getUI();
        boolean boolean5 = cart1.inside(0, (int) (byte) 100);
        boolean boolean6 = cart1.isOptimizedDrawingEnabled();
        boolean boolean7 = cart1.isMaximumSizeSet();
        javax.accessibility.AccessibleContext accessibleContext8 = cart1.getAccessibleContext();
        java.awt.ComponentOrientation componentOrientation9 = null;
        cart1.setComponentOrientation(componentOrientation9);
        java.awt.Event event11 = null;
        boolean boolean14 = cart1.mouseExit(event11, (int) (byte) 0, (int) (byte) 10);
        api.SessionManager sessionManager15 = api.SessionManager.getInstance();
        api.Cart cart16 = sessionManager15.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI17 = cart16.getUI();
        boolean boolean20 = cart16.inside(0, (int) (byte) 100);
        java.awt.Rectangle rectangle21 = cart16.bounds();
        cart1.repaint(rectangle21);
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertNotNull(panelUI2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(accessibleContext8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(sessionManager15);
        org.junit.Assert.assertNotNull(cart16);
        org.junit.Assert.assertNotNull(panelUI17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(rectangle21);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        api.Rental rental0 = new api.Rental();
        api.User user1 = rental0.getUser();
        org.junit.Assert.assertNull(user1);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        java.awt.Event event2 = null;
        boolean boolean4 = cart1.gotFocus(event2, (java.lang.Object) ' ');
        javax.swing.TransferHandler transferHandler5 = null;
        cart1.setTransferHandler(transferHandler5);
        boolean boolean7 = cart1.getIgnoreRepaint();
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI2 = cart1.getUI();
        cart1.doLayout();
        java.awt.event.HierarchyBoundsListener[] hierarchyBoundsListenerArray4 = cart1.getHierarchyBoundsListeners();
        java.awt.ComponentOrientation componentOrientation5 = null;
        cart1.setComponentOrientation(componentOrientation5);
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertNotNull(panelUI2);
        org.junit.Assert.assertNotNull(hierarchyBoundsListenerArray4);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        cart1.setDebugGraphicsOptions(10);
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        cart1.removePropertyChangeListener("PanelUI", propertyChangeListener5);
        int int7 = cart1.getY();
        java.awt.event.FocusListener[] focusListenerArray8 = cart1.getFocusListeners();
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertNotNull(focusListenerArray8);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        java.awt.event.ContainerListener containerListener2 = null;
        cart1.addContainerListener(containerListener2);
        cart1.resize((int) (short) 100, 100);
        java.awt.event.MouseMotionListener[] mouseMotionListenerArray7 = cart1.getMouseMotionListeners();
        cart1.removeAll();
        api.SessionManager sessionManager9 = api.SessionManager.getInstance();
        api.Cart cart10 = sessionManager9.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI11 = cart10.getUI();
        int int12 = cart1.getComponentZOrder((java.awt.Component) cart10);
        java.io.PrintWriter printWriter13 = null;
        // The following exception was thrown during execution in test generation
        try {
            cart1.list(printWriter13, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.print(String)\" because \"out\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertNotNull(mouseMotionListenerArray7);
        org.junit.Assert.assertNotNull(sessionManager9);
        org.junit.Assert.assertNotNull(cart10);
        org.junit.Assert.assertNotNull(panelUI11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI2 = cart1.getUI();
        cart1.doLayout();
        java.awt.event.HierarchyBoundsListener[] hierarchyBoundsListenerArray4 = cart1.getHierarchyBoundsListeners();
        cart1.firePropertyChange("hi!", (byte) 1, (byte) -1);
        java.awt.Insets insets9 = cart1.getInsets();
        cart1.setSize(128, (int) 'a');
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener13 = null;
        cart1.removeHierarchyBoundsListener(hierarchyBoundsListener13);
        java.awt.Point point15 = cart1.getMousePosition();
        java.awt.Graphics graphics16 = null;
        // The following exception was thrown during execution in test generation
        try {
            cart1.printAll(graphics16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Graphics.setColor(java.awt.Color)\" because \"this.graphics\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertNotNull(panelUI2);
        org.junit.Assert.assertNotNull(hierarchyBoundsListenerArray4);
        org.junit.Assert.assertNotNull(insets9);
        org.junit.Assert.assertNull(point15);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        cart1.show(true);
        java.awt.Event event4 = null;
        boolean boolean6 = cart1.action(event4, (java.lang.Object) 10);
        cart1.setVisible(false);
        java.awt.GraphicsConfiguration graphicsConfiguration9 = cart1.getGraphicsConfiguration();
        cart1.firePropertyChange("", false, true);
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(graphicsConfiguration9);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        java.awt.event.ContainerListener containerListener2 = null;
        cart1.addContainerListener(containerListener2);
        javax.swing.ActionMap actionMap4 = cart1.getActionMap();
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertNotNull(actionMap4);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI2 = cart1.getUI();
        cart1.doLayout();
        cart1.enableInputMethods(true);
        java.awt.Event event6 = null;
        boolean boolean9 = cart1.mouseExit(event6, 0, (int) (short) 1);
        java.beans.PropertyChangeListener[] propertyChangeListenerArray10 = cart1.getPropertyChangeListeners();
        cart1.updateUI();
        java.awt.event.HierarchyBoundsListener[] hierarchyBoundsListenerArray12 = cart1.getHierarchyBoundsListeners();
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertNotNull(panelUI2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray10);
        org.junit.Assert.assertNotNull(hierarchyBoundsListenerArray12);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        api.Staff staff2 = new api.Staff("", "");
        staff2.removeSubscription("Your cart is empty.");
        api.PhysicalItem physicalItem5 = null;
        // The following exception was thrown during execution in test generation
        try {
            staff2.rentItem(physicalItem5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"canRent\" because \"item\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        api.Staff staff2 = new api.Staff("", "");
        api.Subscription subscription3 = null;
        staff2.addSubscription(subscription3);
        java.lang.String str5 = staff2.getEmail();
        java.util.ArrayList<api.Rental> rentalList6 = staff2.getRentals();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(rentalList6);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI2 = cart1.getUI();
        cart1.doLayout();
        cart1.enableInputMethods(true);
        java.awt.Event event6 = null;
        boolean boolean9 = cart1.mouseExit(event6, 0, (int) (short) 1);
        java.beans.PropertyChangeListener[] propertyChangeListenerArray10 = cart1.getPropertyChangeListeners();
        java.awt.Point point11 = cart1.getLocation();
        java.awt.Event event12 = null;
        api.SessionManager sessionManager13 = api.SessionManager.getInstance();
        api.Cart cart14 = sessionManager13.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI15 = cart14.getUI();
        cart14.doLayout();
        java.awt.event.HierarchyBoundsListener[] hierarchyBoundsListenerArray17 = cart14.getHierarchyBoundsListeners();
        cart14.firePropertyChange("hi!", (byte) 1, (byte) -1);
        java.awt.Insets insets22 = cart14.getInsets();
        cart14.setSize(128, (int) 'a');
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener26 = null;
        cart14.removeHierarchyBoundsListener(hierarchyBoundsListener26);
        java.awt.Point point28 = cart14.getMousePosition();
        boolean boolean29 = cart1.gotFocus(event12, (java.lang.Object) cart14);
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertNotNull(panelUI2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray10);
        org.junit.Assert.assertNotNull(point11);
        org.junit.Assert.assertNotNull(sessionManager13);
        org.junit.Assert.assertNotNull(cart14);
        org.junit.Assert.assertNotNull(panelUI15);
        org.junit.Assert.assertNotNull(hierarchyBoundsListenerArray17);
        org.junit.Assert.assertNotNull(insets22);
        org.junit.Assert.assertNull(point28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI2 = cart1.getUI();
        cart1.firePropertyChange("hi!", (int) 'a', 1);
        java.awt.Rectangle rectangle7 = null;
        java.awt.Rectangle rectangle8 = cart1.getBounds(rectangle7);
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener9 = null;
        cart1.addHierarchyBoundsListener(hierarchyBoundsListener9);
        javax.swing.event.AncestorListener[] ancestorListenerArray11 = cart1.getAncestorListeners();
        api.SessionManager sessionManager12 = api.SessionManager.getInstance();
        api.Cart cart13 = sessionManager12.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI14 = cart13.getUI();
        boolean boolean17 = cart13.inside(0, (int) (byte) 100);
        java.awt.event.FocusEvent.Cause cause18 = null;
        boolean boolean19 = cart13.requestFocusInWindow(cause18);
        java.awt.Insets insets20 = cart13.insets();
        java.awt.Graphics graphics21 = cart13.getGraphics();
        cart1.paintAll(graphics21);
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertNotNull(panelUI2);
        org.junit.Assert.assertNotNull(rectangle8);
        org.junit.Assert.assertNotNull(ancestorListenerArray11);
        org.junit.Assert.assertNotNull(sessionManager12);
        org.junit.Assert.assertNotNull(cart13);
        org.junit.Assert.assertNotNull(panelUI14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(insets20);
        org.junit.Assert.assertNotNull(graphics21);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        cart1.setDebugGraphicsOptions(10);
        cart1.setFocusCycleRoot(true);
        api.SessionManager sessionManager6 = api.SessionManager.getInstance();
        api.Cart cart7 = sessionManager6.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI8 = cart7.getUI();
        api.SessionManager sessionManager9 = api.SessionManager.getInstance();
        api.Cart cart10 = sessionManager9.getCurrentCart();
        cart10.setDebugGraphicsOptions(10);
        api.SessionManager sessionManager13 = api.SessionManager.getInstance();
        api.Cart cart14 = sessionManager13.getCurrentCart();
        java.awt.event.ContainerListener containerListener15 = null;
        cart14.addContainerListener(containerListener15);
        boolean boolean17 = cart10.isFocusCycleRoot((java.awt.Container) cart14);
        javax.swing.JPopupMenu jPopupMenu18 = null;
        cart10.setComponentPopupMenu(jPopupMenu18);
        cart7.remove((java.awt.Component) cart10);
        api.SessionManager sessionManager21 = api.SessionManager.getInstance();
        api.Cart cart22 = sessionManager21.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI23 = cart22.getUI();
        boolean boolean26 = cart22.inside(0, (int) (byte) 100);
        java.awt.Rectangle rectangle27 = cart22.bounds();
        cart7.setBounds(rectangle27);
        java.awt.Rectangle rectangle29 = cart1.getBounds(rectangle27);
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertNotNull(sessionManager6);
        org.junit.Assert.assertNotNull(cart7);
        org.junit.Assert.assertNotNull(panelUI8);
        org.junit.Assert.assertNotNull(sessionManager9);
        org.junit.Assert.assertNotNull(cart10);
        org.junit.Assert.assertNotNull(sessionManager13);
        org.junit.Assert.assertNotNull(cart14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(sessionManager21);
        org.junit.Assert.assertNotNull(cart22);
        org.junit.Assert.assertNotNull(panelUI23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(rectangle27);
        org.junit.Assert.assertNotNull(rectangle29);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        boolean boolean2 = cart1.isFocusOwner();
        java.awt.Graphics graphics3 = null;
        // The following exception was thrown during execution in test generation
        try {
            cart1.update(graphics3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Graphics.setColor(java.awt.Color)\" because \"this.graphics\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI2 = cart1.getUI();
        cart1.firePropertyChange("hi!", (int) 'a', 1);
        java.awt.Rectangle rectangle7 = null;
        java.awt.Rectangle rectangle8 = cart1.getBounds(rectangle7);
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener9 = null;
        cart1.addHierarchyBoundsListener(hierarchyBoundsListener9);
        api.SessionManager sessionManager11 = api.SessionManager.getInstance();
        api.Cart cart12 = sessionManager11.getCurrentCart();
        cart12.show(true);
        java.awt.Event event15 = null;
        boolean boolean17 = cart12.action(event15, (java.lang.Object) 10);
        cart12.setVisible(false);
        boolean boolean20 = cart1.isAncestorOf((java.awt.Component) cart12);
        boolean boolean21 = cart12.isOpaque();
        cart12.reshape((int) '4', (int) ' ', (int) (byte) -1, (int) (byte) -1);
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener27 = null;
        cart12.removeHierarchyBoundsListener(hierarchyBoundsListener27);
        cart12.setVerifyInputWhenFocusTarget(true);
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertNotNull(panelUI2);
        org.junit.Assert.assertNotNull(rectangle8);
        org.junit.Assert.assertNotNull(sessionManager11);
        org.junit.Assert.assertNotNull(cart12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        api.Faculty faculty2 = new api.Faculty("hi!", "Your cart is empty.");
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI2 = cart1.getUI();
        cart1.firePropertyChange("hi!", (int) 'a', 1);
        java.awt.Rectangle rectangle7 = null;
        java.awt.Rectangle rectangle8 = cart1.getBounds(rectangle7);
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener9 = null;
        cart1.addHierarchyBoundsListener(hierarchyBoundsListener9);
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        cart1.removePropertyChangeListener("", propertyChangeListener12);
        java.io.PrintStream printStream14 = null;
        // The following exception was thrown during execution in test generation
        try {
            cart1.list(printStream14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintStream.println(Object)\" because \"out\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertNotNull(panelUI2);
        org.junit.Assert.assertNotNull(rectangle8);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        api.Staff staff4 = new api.Staff("", "");
        api.Subscription subscription5 = null;
        staff4.addSubscription(subscription5);
        sessionManager0.loginUser((api.User) staff4);
        api.User user8 = sessionManager0.getCurrentUser();
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertNotNull(user8);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI2 = cart1.getUI();
        cart1.doLayout();
        java.awt.event.HierarchyBoundsListener[] hierarchyBoundsListenerArray4 = cart1.getHierarchyBoundsListeners();
        cart1.firePropertyChange("hi!", (byte) 1, (byte) -1);
        boolean boolean9 = cart1.getFocusTraversalKeysEnabled();
        api.SessionManager sessionManager10 = api.SessionManager.getInstance();
        api.Cart cart11 = sessionManager10.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI12 = cart11.getUI();
        java.awt.Dimension dimension13 = null;
        java.awt.Dimension dimension14 = cart11.getSize(dimension13);
        cart1.setPreferredSize(dimension13);
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertNotNull(panelUI2);
        org.junit.Assert.assertNotNull(hierarchyBoundsListenerArray4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(sessionManager10);
        org.junit.Assert.assertNotNull(cart11);
        org.junit.Assert.assertNotNull(panelUI12);
        org.junit.Assert.assertNotNull(dimension14);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        java.awt.event.ContainerListener containerListener2 = null;
        cart1.addContainerListener(containerListener2);
        cart1.resize((int) (short) 100, 100);
        cart1.enable(false);
        int int9 = cart1.countComponents();
        cart1.firePropertyChange("", (double) (byte) 1, (double) (byte) 1);
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        java.awt.event.ContainerListener containerListener2 = null;
        cart1.addContainerListener(containerListener2);
        cart1.resize((int) (short) 100, 100);
        java.awt.event.MouseMotionListener[] mouseMotionListenerArray7 = cart1.getMouseMotionListeners();
        float float8 = cart1.getAlignmentX();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior9 = cart1.getBaselineResizeBehavior();
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertNotNull(mouseMotionListenerArray7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.5f + "'", float8 == 0.5f);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior9 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior9.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI2 = cart1.getUI();
        cart1.firePropertyChange("hi!", (int) 'a', 1);
        java.awt.Rectangle rectangle7 = null;
        java.awt.Rectangle rectangle8 = cart1.getBounds(rectangle7);
        boolean boolean9 = cart1.isOptimizedDrawingEnabled();
        java.awt.Graphics graphics10 = cart1.getGraphics();
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertNotNull(panelUI2);
        org.junit.Assert.assertNotNull(rectangle8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(graphics10);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI2 = cart1.getUI();
        cart1.doLayout();
        cart1.enableInputMethods(true);
        java.awt.event.ComponentListener componentListener6 = null;
        cart1.addComponentListener(componentListener6);
        java.awt.event.MouseMotionListener[] mouseMotionListenerArray8 = cart1.getMouseMotionListeners();
        cart1.setInheritsPopupMenu(false);
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertNotNull(panelUI2);
        org.junit.Assert.assertNotNull(mouseMotionListenerArray8);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI2 = cart1.getUI();
        cart1.firePropertyChange("hi!", (int) 'a', 1);
        java.awt.Rectangle rectangle7 = null;
        java.awt.Rectangle rectangle8 = cart1.getBounds(rectangle7);
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener9 = null;
        cart1.addHierarchyBoundsListener(hierarchyBoundsListener9);
        api.SessionManager sessionManager11 = api.SessionManager.getInstance();
        api.Cart cart12 = sessionManager11.getCurrentCart();
        cart12.show(true);
        java.awt.Event event15 = null;
        boolean boolean17 = cart12.action(event15, (java.lang.Object) 10);
        cart12.setVisible(false);
        boolean boolean20 = cart1.isAncestorOf((java.awt.Component) cart12);
        cart12.setSize(1, (int) (short) -1);
        cart12.hide();
        java.awt.MenuComponent menuComponent25 = null;
        cart12.remove(menuComponent25);
        java.lang.String str27 = cart12.toString();
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertNotNull(panelUI2);
        org.junit.Assert.assertNotNull(rectangle8);
        org.junit.Assert.assertNotNull(sessionManager11);
        org.junit.Assert.assertNotNull(cart12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "api.Cart[,0,0,1x-1,invalid,hidden,disabled,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]" + "'", str27, "api.Cart[,0,0,1x-1,invalid,hidden,disabled,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]");
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        api.CartCaretaker cartCaretaker0 = new api.CartCaretaker();
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        cart1.show(true);
        java.awt.Image image4 = null;
        api.SessionManager sessionManager7 = api.SessionManager.getInstance();
        api.Cart cart8 = sessionManager7.getCurrentCart();
        cart8.setEnabled(false);
        boolean boolean11 = cart1.prepareImage(image4, (int) (short) 1, (int) (short) 10, (java.awt.image.ImageObserver) cart8);
        java.awt.event.ContainerListener containerListener12 = null;
        cart1.removeContainerListener(containerListener12);
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertNotNull(sessionManager7);
        org.junit.Assert.assertNotNull(cart8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI2 = cart1.getUI();
        cart1.doLayout();
        cart1.repaint((long) (byte) 0, (int) '#', (int) (short) 1, (int) (byte) 100, (int) (short) 0);
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertNotNull(panelUI2);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        cart1.show(true);
        java.awt.Image image4 = null;
        api.SessionManager sessionManager7 = api.SessionManager.getInstance();
        api.Cart cart8 = sessionManager7.getCurrentCart();
        cart8.setEnabled(false);
        boolean boolean11 = cart1.prepareImage(image4, (int) (short) 1, (int) (short) 10, (java.awt.image.ImageObserver) cart8);
        java.awt.Dimension dimension12 = cart8.minimumSize();
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertNotNull(sessionManager7);
        org.junit.Assert.assertNotNull(cart8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(dimension12);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI2 = cart1.getUI();
        cart1.firePropertyChange("hi!", (int) 'a', 1);
        java.awt.Rectangle rectangle7 = null;
        java.awt.Rectangle rectangle8 = cart1.getBounds(rectangle7);
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener9 = null;
        cart1.addHierarchyBoundsListener(hierarchyBoundsListener9);
        api.SessionManager sessionManager11 = api.SessionManager.getInstance();
        api.Cart cart12 = sessionManager11.getCurrentCart();
        cart12.show(true);
        java.awt.Event event15 = null;
        boolean boolean17 = cart12.action(event15, (java.lang.Object) 10);
        cart12.setVisible(false);
        boolean boolean20 = cart1.isAncestorOf((java.awt.Component) cart12);
        api.Item item21 = null;
        cart1.addItem(item21, 32);
        javax.swing.border.Border border24 = cart1.getBorder();
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertNotNull(panelUI2);
        org.junit.Assert.assertNotNull(rectangle8);
        org.junit.Assert.assertNotNull(sessionManager11);
        org.junit.Assert.assertNotNull(cart12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(border24);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI2 = cart1.getUI();
        cart1.doLayout();
        cart1.enableInputMethods(true);
        java.awt.Event event6 = null;
        boolean boolean9 = cart1.mouseExit(event6, 0, (int) (short) 1);
        java.beans.PropertyChangeListener[] propertyChangeListenerArray10 = cart1.getPropertyChangeListeners();
        javax.swing.InputVerifier inputVerifier11 = null;
        cart1.setInputVerifier(inputVerifier11);
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertNotNull(panelUI2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray10);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI2 = cart1.getUI();
        boolean boolean5 = cart1.inside(0, (int) (byte) 100);
        boolean boolean6 = cart1.isOptimizedDrawingEnabled();
        boolean boolean7 = cart1.isMaximumSizeSet();
        javax.accessibility.AccessibleContext accessibleContext8 = cart1.getAccessibleContext();
        java.awt.ComponentOrientation componentOrientation9 = null;
        cart1.setComponentOrientation(componentOrientation9);
        api.SessionManager sessionManager11 = api.SessionManager.getInstance();
        api.Cart cart12 = sessionManager11.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI13 = cart12.getUI();
        java.awt.Dimension dimension14 = null;
        java.awt.Dimension dimension15 = cart12.getSize(dimension14);
        java.awt.Rectangle rectangle16 = cart12.getBounds();
        cart1.repaint(rectangle16);
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertNotNull(panelUI2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(accessibleContext8);
        org.junit.Assert.assertNotNull(sessionManager11);
        org.junit.Assert.assertNotNull(cart12);
        org.junit.Assert.assertNotNull(panelUI13);
        org.junit.Assert.assertNotNull(dimension15);
        org.junit.Assert.assertNotNull(rectangle16);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI2 = cart1.getUI();
        cart1.firePropertyChange("hi!", (int) 'a', 1);
        java.awt.Rectangle rectangle7 = null;
        java.awt.Rectangle rectangle8 = cart1.getBounds(rectangle7);
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener9 = null;
        cart1.addHierarchyBoundsListener(hierarchyBoundsListener9);
        api.SessionManager sessionManager11 = api.SessionManager.getInstance();
        api.Cart cart12 = sessionManager11.getCurrentCart();
        cart12.show(true);
        java.awt.Event event15 = null;
        boolean boolean17 = cart12.action(event15, (java.lang.Object) 10);
        cart12.setVisible(false);
        boolean boolean20 = cart1.isAncestorOf((java.awt.Component) cart12);
        cart12.setSize(1, (int) (short) -1);
        cart12.hide();
        java.awt.MenuComponent menuComponent25 = null;
        cart12.remove(menuComponent25);
        cart12.invalidate();
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertNotNull(panelUI2);
        org.junit.Assert.assertNotNull(rectangle8);
        org.junit.Assert.assertNotNull(sessionManager11);
        org.junit.Assert.assertNotNull(cart12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        boolean boolean2 = cart1.isBackgroundSet();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener3 = null;
        cart1.addHierarchyBoundsListener(hierarchyBoundsListener3);
        java.awt.MenuComponent menuComponent5 = null;
        cart1.remove(menuComponent5);
        javax.swing.KeyStroke keyStroke7 = null;
        java.awt.event.ActionListener actionListener8 = cart1.getActionForKeyStroke(keyStroke7);
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(actionListener8);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        cart1.show(true);
        boolean boolean4 = cart1.isFocusTraversalPolicyProvider();
        int int5 = cart1.getWidth();
        boolean boolean6 = cart1.isForegroundSet();
        java.awt.ComponentOrientation componentOrientation7 = cart1.getComponentOrientation();
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(componentOrientation7);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI2 = cart1.getUI();
        boolean boolean5 = cart1.inside(0, (int) (byte) 100);
        java.awt.Rectangle rectangle6 = cart1.bounds();
        boolean boolean7 = cart1.getFocusTraversalKeysEnabled();
        boolean boolean8 = cart1.isDisplayable();
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertNotNull(panelUI2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(rectangle6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        api.SubscriptionData subscriptionData0 = new api.SubscriptionData();
        api.Subscription subscription1 = new api.Subscription();
        subscriptionData0.addSubscription(subscription1);
        subscription1.setActive(true);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        java.awt.event.ContainerListener containerListener2 = null;
        cart1.addContainerListener(containerListener2);
        cart1.resize((int) (short) 100, 100);
        java.lang.String str7 = cart1.getUIClassID();
        cart1.firePropertyChange("hi!", (long) '4', (long) 52);
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "PanelUI" + "'", str7, "PanelUI");
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        cart1.show(true);
        java.awt.Image image4 = null;
        api.SessionManager sessionManager7 = api.SessionManager.getInstance();
        api.Cart cart8 = sessionManager7.getCurrentCart();
        cart8.setEnabled(false);
        boolean boolean11 = cart1.prepareImage(image4, (int) (short) 1, (int) (short) 10, (java.awt.image.ImageObserver) cart8);
        api.SessionManager sessionManager12 = api.SessionManager.getInstance();
        api.Cart cart13 = sessionManager12.getCurrentCart();
        int int16 = cart13.getBaseline(10, (int) '4');
        cart13.paintImmediately(10, (int) (byte) 0, 0, (int) (byte) 10);
        api.SessionManager sessionManager22 = api.SessionManager.getInstance();
        api.Cart cart23 = sessionManager22.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI24 = cart23.getUI();
        boolean boolean27 = cart23.inside(0, (int) (byte) 100);
        java.awt.event.FocusEvent.Cause cause28 = null;
        boolean boolean29 = cart23.requestFocusInWindow(cause28);
        java.awt.Dimension dimension30 = cart23.getMaximumSize();
        java.awt.Dimension dimension31 = cart13.getSize(dimension30);
        cart8.setMinimumSize(dimension30);
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertNotNull(sessionManager7);
        org.junit.Assert.assertNotNull(cart8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(sessionManager12);
        org.junit.Assert.assertNotNull(cart13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(sessionManager22);
        org.junit.Assert.assertNotNull(cart23);
        org.junit.Assert.assertNotNull(panelUI24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(dimension30);
        org.junit.Assert.assertNotNull(dimension31);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        boolean boolean2 = cart1.isBackgroundSet();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener3 = null;
        cart1.addHierarchyBoundsListener(hierarchyBoundsListener3);
        java.awt.Image image7 = cart1.createImage((int) '#', (-1));
        java.util.Locale locale8 = null;
        cart1.setLocale(locale8);
        java.awt.event.MouseWheelListener[] mouseWheelListenerArray10 = cart1.getMouseWheelListeners();
        javax.swing.plaf.PanelUI panelUI11 = cart1.getUI();
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(image7);
        org.junit.Assert.assertNotNull(mouseWheelListenerArray10);
        org.junit.Assert.assertNotNull(panelUI11);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI2 = cart1.getUI();
        api.SessionManager sessionManager3 = api.SessionManager.getInstance();
        api.Cart cart4 = sessionManager3.getCurrentCart();
        cart4.setDebugGraphicsOptions(10);
        api.SessionManager sessionManager7 = api.SessionManager.getInstance();
        api.Cart cart8 = sessionManager7.getCurrentCart();
        java.awt.event.ContainerListener containerListener9 = null;
        cart8.addContainerListener(containerListener9);
        boolean boolean11 = cart4.isFocusCycleRoot((java.awt.Container) cart8);
        javax.swing.JPopupMenu jPopupMenu12 = null;
        cart4.setComponentPopupMenu(jPopupMenu12);
        cart1.remove((java.awt.Component) cart4);
        api.Item item15 = null;
        cart4.addItem(item15, 8);
        java.beans.VetoableChangeListener[] vetoableChangeListenerArray18 = cart4.getVetoableChangeListeners();
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertNotNull(panelUI2);
        org.junit.Assert.assertNotNull(sessionManager3);
        org.junit.Assert.assertNotNull(cart4);
        org.junit.Assert.assertNotNull(sessionManager7);
        org.junit.Assert.assertNotNull(cart8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(vetoableChangeListenerArray18);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI2 = cart1.getUI();
        cart1.firePropertyChange("hi!", (int) 'a', 1);
        java.awt.Rectangle rectangle7 = null;
        java.awt.Rectangle rectangle8 = cart1.getBounds(rectangle7);
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener9 = null;
        cart1.addHierarchyBoundsListener(hierarchyBoundsListener9);
        api.SessionManager sessionManager11 = api.SessionManager.getInstance();
        api.Cart cart12 = sessionManager11.getCurrentCart();
        cart12.show(true);
        java.awt.Event event15 = null;
        boolean boolean17 = cart12.action(event15, (java.lang.Object) 10);
        cart12.setVisible(false);
        boolean boolean20 = cart1.isAncestorOf((java.awt.Component) cart12);
        api.Item item21 = null;
        cart1.addItem(item21, 32);
// flaky:         cart1.layout();
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertNotNull(panelUI2);
        org.junit.Assert.assertNotNull(rectangle8);
        org.junit.Assert.assertNotNull(sessionManager11);
        org.junit.Assert.assertNotNull(cart12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        cart1.setDebugGraphicsOptions(10);
        javax.swing.InputVerifier inputVerifier4 = cart1.getInputVerifier();
        api.SessionManager sessionManager5 = api.SessionManager.getInstance();
        api.Cart cart6 = sessionManager5.getCurrentCart();
        cart6.setDebugGraphicsOptions(10);
        api.SessionManager sessionManager9 = api.SessionManager.getInstance();
        api.Cart cart10 = sessionManager9.getCurrentCart();
        java.awt.event.ContainerListener containerListener11 = null;
        cart10.addContainerListener(containerListener11);
        boolean boolean13 = cart6.isFocusCycleRoot((java.awt.Container) cart10);
        java.beans.VetoableChangeListener[] vetoableChangeListenerArray14 = cart10.getVetoableChangeListeners();
        java.awt.Font font15 = cart10.getFont();
        cart1.setFont(font15);
        java.awt.Color color17 = cart1.getBackground();
        cart1.reshape((int) 'a', (int) (byte) 100, 0, (int) (short) -1);
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertNull(inputVerifier4);
        org.junit.Assert.assertNotNull(sessionManager5);
        org.junit.Assert.assertNotNull(cart6);
        org.junit.Assert.assertNotNull(sessionManager9);
        org.junit.Assert.assertNotNull(cart10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(vetoableChangeListenerArray14);
        org.junit.Assert.assertNotNull(font15);
        org.junit.Assert.assertNotNull(color17);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI2 = cart1.getUI();
        boolean boolean5 = cart1.inside(0, (int) (byte) 100);
        boolean boolean6 = cart1.isOptimizedDrawingEnabled();
        boolean boolean7 = cart1.isMaximumSizeSet();
        api.Item item8 = cart1.getLastAdded();
        cart1.setSize((int) (short) 1, (int) 'a');
        api.SessionManager sessionManager12 = api.SessionManager.getInstance();
        api.Cart cart13 = sessionManager12.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI14 = cart13.getUI();
        java.awt.LayoutManager layoutManager15 = null;
        cart13.setLayout(layoutManager15);
        api.SessionManager sessionManager17 = api.SessionManager.getInstance();
        api.Cart cart18 = sessionManager17.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI19 = cart18.getUI();
        cart18.firePropertyChange("hi!", (int) 'a', 1);
        java.awt.Rectangle rectangle24 = null;
        java.awt.Rectangle rectangle25 = cart18.getBounds(rectangle24);
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener26 = null;
        cart18.addHierarchyBoundsListener(hierarchyBoundsListener26);
        api.SessionManager sessionManager28 = api.SessionManager.getInstance();
        api.Cart cart29 = sessionManager28.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI30 = cart29.getUI();
        cart29.firePropertyChange("hi!", (int) 'a', 1);
        java.awt.Rectangle rectangle35 = null;
        java.awt.Rectangle rectangle36 = cart29.getBounds(rectangle35);
        cart18.scrollRectToVisible(rectangle36);
        cart1.putClientProperty((java.lang.Object) cart13, (java.lang.Object) cart18);
        java.awt.ComponentOrientation componentOrientation39 = null;
        // The following exception was thrown during execution in test generation
        try {
            cart1.applyComponentOrientation(componentOrientation39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertNotNull(panelUI2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNotNull(sessionManager12);
        org.junit.Assert.assertNotNull(cart13);
        org.junit.Assert.assertNotNull(panelUI14);
        org.junit.Assert.assertNotNull(sessionManager17);
        org.junit.Assert.assertNotNull(cart18);
        org.junit.Assert.assertNotNull(panelUI19);
        org.junit.Assert.assertNotNull(rectangle25);
        org.junit.Assert.assertNotNull(sessionManager28);
        org.junit.Assert.assertNotNull(cart29);
        org.junit.Assert.assertNotNull(panelUI30);
        org.junit.Assert.assertNotNull(rectangle36);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI2 = cart1.getUI();
        java.awt.Dimension dimension3 = null;
        cart1.setMaximumSize(dimension3);
        boolean boolean5 = cart1.isLightweight();
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertNotNull(panelUI2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI2 = cart1.getUI();
        cart1.doLayout();
        java.awt.event.HierarchyBoundsListener[] hierarchyBoundsListenerArray4 = cart1.getHierarchyBoundsListeners();
        cart1.firePropertyChange("hi!", (byte) 1, (byte) -1);
        java.awt.Insets insets9 = cart1.getInsets();
        cart1.setSize(128, (int) 'a');
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener13 = null;
        cart1.removeHierarchyBoundsListener(hierarchyBoundsListener13);
        java.awt.Point point15 = cart1.getMousePosition();
        java.awt.Color color16 = cart1.getForeground();
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertNotNull(panelUI2);
        org.junit.Assert.assertNotNull(hierarchyBoundsListenerArray4);
        org.junit.Assert.assertNotNull(insets9);
        org.junit.Assert.assertNull(point15);
        org.junit.Assert.assertNotNull(color16);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI2 = cart1.getUI();
        cart1.doLayout();
        cart1.enableInputMethods(true);
        java.awt.Event event6 = null;
        boolean boolean9 = cart1.mouseExit(event6, 0, (int) (short) 1);
        java.beans.PropertyChangeListener[] propertyChangeListenerArray10 = cart1.getPropertyChangeListeners();
        cart1.updateUI();
        boolean boolean12 = cart1.isVisible();
        boolean boolean13 = cart1.isShowing();
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertNotNull(panelUI2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI2 = cart1.getUI();
        boolean boolean5 = cart1.inside(0, (int) (byte) 100);
        boolean boolean6 = cart1.isOptimizedDrawingEnabled();
        boolean boolean7 = cart1.isMaximumSizeSet();
        api.Item item8 = cart1.getLastAdded();
        cart1.setSize((int) (short) 1, (int) 'a');
        api.SessionManager sessionManager12 = api.SessionManager.getInstance();
        api.Cart cart13 = sessionManager12.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI14 = cart13.getUI();
        java.awt.LayoutManager layoutManager15 = null;
        cart13.setLayout(layoutManager15);
        api.SessionManager sessionManager17 = api.SessionManager.getInstance();
        api.Cart cart18 = sessionManager17.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI19 = cart18.getUI();
        cart18.firePropertyChange("hi!", (int) 'a', 1);
        java.awt.Rectangle rectangle24 = null;
        java.awt.Rectangle rectangle25 = cart18.getBounds(rectangle24);
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener26 = null;
        cart18.addHierarchyBoundsListener(hierarchyBoundsListener26);
        api.SessionManager sessionManager28 = api.SessionManager.getInstance();
        api.Cart cart29 = sessionManager28.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI30 = cart29.getUI();
        cart29.firePropertyChange("hi!", (int) 'a', 1);
        java.awt.Rectangle rectangle35 = null;
        java.awt.Rectangle rectangle36 = cart29.getBounds(rectangle35);
        cart18.scrollRectToVisible(rectangle36);
        cart1.putClientProperty((java.lang.Object) cart13, (java.lang.Object) cart18);
        boolean boolean39 = cart18.isFocusTraversable();
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertNotNull(panelUI2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNotNull(sessionManager12);
        org.junit.Assert.assertNotNull(cart13);
        org.junit.Assert.assertNotNull(panelUI14);
        org.junit.Assert.assertNotNull(sessionManager17);
        org.junit.Assert.assertNotNull(cart18);
        org.junit.Assert.assertNotNull(panelUI19);
        org.junit.Assert.assertNotNull(rectangle25);
        org.junit.Assert.assertNotNull(sessionManager28);
        org.junit.Assert.assertNotNull(cart29);
        org.junit.Assert.assertNotNull(panelUI30);
        org.junit.Assert.assertNotNull(rectangle36);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI2 = cart1.getUI();
        java.awt.LayoutManager layoutManager3 = null;
        cart1.setLayout(layoutManager3);
        java.awt.Image image5 = null;
        api.SessionManager sessionManager8 = api.SessionManager.getInstance();
        api.Cart cart9 = sessionManager8.getCurrentCart();
        cart9.show(true);
        int int12 = cart1.checkImage(image5, 10, (int) (short) 10, (java.awt.image.ImageObserver) cart9);
        java.awt.event.InputMethodListener[] inputMethodListenerArray13 = cart1.getInputMethodListeners();
        cart1.setBounds((-1), 0, 32, 1);
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertNotNull(panelUI2);
        org.junit.Assert.assertNotNull(sessionManager8);
        org.junit.Assert.assertNotNull(cart9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertNotNull(inputMethodListenerArray13);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI2 = cart1.getUI();
        cart1.doLayout();
        java.awt.event.HierarchyBoundsListener[] hierarchyBoundsListenerArray4 = cart1.getHierarchyBoundsListeners();
        cart1.firePropertyChange("hi!", (byte) 1, (byte) -1);
        java.awt.Insets insets9 = cart1.getInsets();
        java.beans.VetoableChangeListener[] vetoableChangeListenerArray10 = cart1.getVetoableChangeListeners();
        java.awt.AWTEvent aWTEvent11 = null;
        // The following exception was thrown during execution in test generation
        try {
            cart1.dispatchEvent(aWTEvent11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.AWTEvent.getID()\" because \"e\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertNotNull(panelUI2);
        org.junit.Assert.assertNotNull(hierarchyBoundsListenerArray4);
        org.junit.Assert.assertNotNull(insets9);
        org.junit.Assert.assertNotNull(vetoableChangeListenerArray10);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI2 = cart1.getUI();
        cart1.firePropertyChange("hi!", (int) 'a', 1);
        java.awt.Rectangle rectangle7 = null;
        java.awt.Rectangle rectangle8 = cart1.getBounds(rectangle7);
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener9 = null;
        cart1.addHierarchyBoundsListener(hierarchyBoundsListener9);
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        cart1.removePropertyChangeListener("", propertyChangeListener12);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale14 = cart1.getLocale();
            org.junit.Assert.fail("Expected exception of type java.awt.IllegalComponentStateException; message: This component must have a parent in order to determine its locale");
        } catch (java.awt.IllegalComponentStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertNotNull(panelUI2);
        org.junit.Assert.assertNotNull(rectangle8);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        cart1.setDebugGraphicsOptions(10);
        api.SessionManager sessionManager4 = api.SessionManager.getInstance();
        api.Cart cart5 = sessionManager4.getCurrentCart();
        java.awt.event.ContainerListener containerListener6 = null;
        cart5.addContainerListener(containerListener6);
        boolean boolean8 = cart1.isFocusCycleRoot((java.awt.Container) cart5);
        java.beans.VetoableChangeListener[] vetoableChangeListenerArray9 = cart5.getVetoableChangeListeners();
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        cart5.removePropertyChangeListener("PanelUI", propertyChangeListener11);
        api.SessionManager sessionManager13 = api.SessionManager.getInstance();
        api.Cart cart14 = sessionManager13.getCurrentCart();
        int int17 = cart14.getBaseline(10, (int) '4');
        cart14.paintImmediately(10, (int) (byte) 0, 0, (int) (byte) 10);
        api.SessionManager sessionManager23 = api.SessionManager.getInstance();
        api.Cart cart24 = sessionManager23.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI25 = cart24.getUI();
        boolean boolean28 = cart24.inside(0, (int) (byte) 100);
        java.awt.event.FocusEvent.Cause cause29 = null;
        boolean boolean30 = cart24.requestFocusInWindow(cause29);
        java.awt.Dimension dimension31 = cart24.getMaximumSize();
        java.awt.Dimension dimension32 = cart14.getSize(dimension31);
        cart5.setMaximumSize(dimension31);
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertNotNull(sessionManager4);
        org.junit.Assert.assertNotNull(cart5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(vetoableChangeListenerArray9);
        org.junit.Assert.assertNotNull(sessionManager13);
        org.junit.Assert.assertNotNull(cart14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(sessionManager23);
        org.junit.Assert.assertNotNull(cart24);
        org.junit.Assert.assertNotNull(panelUI25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(dimension31);
        org.junit.Assert.assertNotNull(dimension32);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        int int4 = cart1.getBaseline(10, (int) '4');
        boolean boolean5 = cart1.isPaintingTile();
        boolean boolean6 = cart1.isDisplayable();
        java.lang.Object obj7 = cart1.getTreeLock();
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        api.SubscriptionData subscriptionData0 = new api.SubscriptionData();
        api.Subscription subscription1 = new api.Subscription();
        subscriptionData0.addSubscription(subscription1);
        boolean boolean3 = subscription1.isActive();
        subscription1.setServiceName("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI2 = cart1.getUI();
        cart1.firePropertyChange("hi!", (int) 'a', 1);
        java.awt.Rectangle rectangle7 = null;
        java.awt.Rectangle rectangle8 = cart1.getBounds(rectangle7);
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener9 = null;
        cart1.addHierarchyBoundsListener(hierarchyBoundsListener9);
        boolean boolean11 = cart1.isValidateRoot();
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertNotNull(panelUI2);
        org.junit.Assert.assertNotNull(rectangle8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        cart1.setDebugGraphicsOptions(10);
        api.SessionManager sessionManager4 = api.SessionManager.getInstance();
        api.Cart cart5 = sessionManager4.getCurrentCart();
        java.awt.event.ContainerListener containerListener6 = null;
        cart5.addContainerListener(containerListener6);
        boolean boolean8 = cart1.isFocusCycleRoot((java.awt.Container) cart5);
        api.CartMemento cartMemento9 = cart5.save();
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertNotNull(sessionManager4);
        org.junit.Assert.assertNotNull(cart5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cartMemento9);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        boolean boolean2 = cart1.isBackgroundSet();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener3 = null;
        cart1.addHierarchyBoundsListener(hierarchyBoundsListener3);
        java.awt.Image image7 = cart1.createImage((int) '#', (-1));
        java.awt.event.FocusEvent.Cause cause8 = null;
        boolean boolean9 = cart1.requestFocusInWindow(cause8);
        cart1.removeNotify();
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(image7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        api.Student student2 = new api.Student("api.Cart[,0,0,1x-1,invalid,hidden,disabled,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]", "Your cart is empty.");
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI2 = cart1.getUI();
        cart1.doLayout();
        java.awt.event.HierarchyBoundsListener[] hierarchyBoundsListenerArray4 = cart1.getHierarchyBoundsListeners();
        cart1.firePropertyChange("hi!", (byte) 1, (byte) -1);
        java.awt.Insets insets9 = cart1.getInsets();
        java.beans.VetoableChangeListener[] vetoableChangeListenerArray10 = cart1.getVetoableChangeListeners();
        api.SessionManager sessionManager11 = api.SessionManager.getInstance();
        api.Cart cart12 = sessionManager11.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI13 = cart12.getUI();
        boolean boolean16 = cart12.inside(0, (int) (byte) 100);
        java.awt.Rectangle rectangle17 = cart12.bounds();
        cart1.setMixingCutoutShape((java.awt.Shape) rectangle17);
        boolean boolean21 = cart1.inside(10, 1);
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertNotNull(panelUI2);
        org.junit.Assert.assertNotNull(hierarchyBoundsListenerArray4);
        org.junit.Assert.assertNotNull(insets9);
        org.junit.Assert.assertNotNull(vetoableChangeListenerArray10);
        org.junit.Assert.assertNotNull(sessionManager11);
        org.junit.Assert.assertNotNull(cart12);
        org.junit.Assert.assertNotNull(panelUI13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(rectangle17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI2 = cart1.getUI();
        cart1.doLayout();
        java.awt.event.HierarchyBoundsListener[] hierarchyBoundsListenerArray4 = cart1.getHierarchyBoundsListeners();
        cart1.firePropertyChange("hi!", (byte) 1, (byte) -1);
        java.awt.Insets insets9 = cart1.getInsets();
        cart1.setSize(128, (int) 'a');
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener13 = null;
        cart1.removeHierarchyBoundsListener(hierarchyBoundsListener13);
        java.awt.Event event15 = null;
        boolean boolean17 = cart1.lostFocus(event15, (java.lang.Object) 0);
        javax.swing.InputMap inputMap18 = cart1.getInputMap();
        java.awt.Dimension dimension19 = cart1.getPreferredSize();
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertNotNull(panelUI2);
        org.junit.Assert.assertNotNull(hierarchyBoundsListenerArray4);
        org.junit.Assert.assertNotNull(insets9);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(inputMap18);
        org.junit.Assert.assertNotNull(dimension19);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        cart1.setDebugGraphicsOptions(10);
        javax.swing.InputVerifier inputVerifier4 = cart1.getInputVerifier();
        api.SessionManager sessionManager5 = api.SessionManager.getInstance();
        api.Cart cart6 = sessionManager5.getCurrentCart();
        cart6.setDebugGraphicsOptions(10);
        api.SessionManager sessionManager9 = api.SessionManager.getInstance();
        api.Cart cart10 = sessionManager9.getCurrentCart();
        java.awt.event.ContainerListener containerListener11 = null;
        cart10.addContainerListener(containerListener11);
        boolean boolean13 = cart6.isFocusCycleRoot((java.awt.Container) cart10);
        java.beans.VetoableChangeListener[] vetoableChangeListenerArray14 = cart10.getVetoableChangeListeners();
        java.awt.Font font15 = cart10.getFont();
        cart1.setFont(font15);
        cart1.firePropertyChange("Your cart is empty.", (double) (short) 0, (double) 10);
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertNull(inputVerifier4);
        org.junit.Assert.assertNotNull(sessionManager5);
        org.junit.Assert.assertNotNull(cart6);
        org.junit.Assert.assertNotNull(sessionManager9);
        org.junit.Assert.assertNotNull(cart10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(vetoableChangeListenerArray14);
        org.junit.Assert.assertNotNull(font15);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI2 = cart1.getUI();
        java.awt.LayoutManager layoutManager3 = null;
        cart1.setLayout(layoutManager3);
        java.awt.Color color5 = cart1.getForeground();
        boolean boolean6 = cart1.requestDefaultFocus();
        cart1.firePropertyChange("api.Cart[,0,0,1x-1,invalid,hidden,disabled,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]", true, true);
        boolean boolean13 = cart1.contains(2, (int) (byte) 10);
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertNotNull(panelUI2);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI2 = cart1.getUI();
        boolean boolean5 = cart1.inside(0, (int) (byte) 100);
        java.awt.Rectangle rectangle6 = cart1.bounds();
        int int7 = cart1.getX();
        api.Item item8 = null;
        cart1.addItem(item8, (int) (short) 1);
        boolean boolean11 = cart1.getFocusTraversalKeysEnabled();
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertNotNull(panelUI2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(rectangle6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        java.awt.event.ContainerListener containerListener2 = null;
        cart1.addContainerListener(containerListener2);
        cart1.resize((int) (short) 100, 100);
        int int7 = cart1.getDebugGraphicsOptions();
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        boolean boolean2 = cart1.isBackgroundSet();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener3 = null;
        cart1.addHierarchyBoundsListener(hierarchyBoundsListener3);
        java.awt.event.MouseListener mouseListener5 = null;
        cart1.removeMouseListener(mouseListener5);
        cart1.setInheritsPopupMenu(false);
        javax.swing.plaf.PanelUI panelUI9 = cart1.getUI();
        cart1.doLayout();
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(panelUI9);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        float float0 = java.awt.Component.BOTTOM_ALIGNMENT;
        org.junit.Assert.assertTrue("'" + float0 + "' != '" + 1.0f + "'", float0 == 1.0f);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        cart1.setDebugGraphicsOptions(10);
        javax.swing.InputVerifier inputVerifier4 = cart1.getInputVerifier();
        cart1.setFocusTraversalKeysEnabled(false);
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertNull(inputVerifier4);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI2 = cart1.getUI();
        java.awt.LayoutManager layoutManager3 = null;
        cart1.setLayout(layoutManager3);
        java.awt.Color color5 = cart1.getForeground();
        java.awt.Point point7 = cart1.getMousePosition(true);
        api.SessionManager sessionManager8 = api.SessionManager.getInstance();
        api.Cart cart9 = sessionManager8.getCurrentCart();
        cart9.setDebugGraphicsOptions(10);
        cart9.setFocusCycleRoot(true);
        boolean boolean16 = cart9.contains((int) '4', (-1));
        api.SessionManager sessionManager17 = api.SessionManager.getInstance();
        api.Cart cart18 = sessionManager17.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI19 = cart18.getUI();
        boolean boolean22 = cart18.inside(0, (int) (byte) 100);
        java.awt.event.FocusEvent.Cause cause23 = null;
        boolean boolean24 = cart18.requestFocusInWindow(cause23);
        java.awt.Dimension dimension25 = cart18.getMaximumSize();
        cart9.resize(dimension25);
        cart1.setPreferredSize(dimension25);
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertNotNull(panelUI2);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNull(point7);
        org.junit.Assert.assertNotNull(sessionManager8);
        org.junit.Assert.assertNotNull(cart9);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(sessionManager17);
        org.junit.Assert.assertNotNull(cart18);
        org.junit.Assert.assertNotNull(panelUI19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(dimension25);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI2 = cart1.getUI();
        cart1.doLayout();
        java.awt.event.HierarchyBoundsListener[] hierarchyBoundsListenerArray4 = cart1.getHierarchyBoundsListeners();
        cart1.firePropertyChange("hi!", (byte) 1, (byte) -1);
        java.awt.Insets insets9 = cart1.getInsets();
        cart1.setSize(128, (int) 'a');
        javax.swing.ActionMap actionMap13 = cart1.getActionMap();
        boolean boolean14 = cart1.isEnabled();
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertNotNull(panelUI2);
        org.junit.Assert.assertNotNull(hierarchyBoundsListenerArray4);
        org.junit.Assert.assertNotNull(insets9);
        org.junit.Assert.assertNotNull(actionMap13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI2 = cart1.getUI();
        boolean boolean5 = cart1.inside(0, (int) (byte) 100);
        java.awt.Rectangle rectangle6 = cart1.bounds();
        cart1.requestFocus();
        javax.swing.event.AncestorListener ancestorListener8 = null;
        cart1.removeAncestorListener(ancestorListener8);
        javax.swing.event.AncestorListener ancestorListener10 = null;
        cart1.removeAncestorListener(ancestorListener10);
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertNotNull(panelUI2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(rectangle6);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        api.SubscriptionData subscriptionData0 = api.SubscriptionData.getInstance();
        subscriptionData0.removeSubscription("");
        org.junit.Assert.assertNotNull(subscriptionData0);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI2 = cart1.getUI();
        boolean boolean5 = cart1.inside(0, (int) (byte) 100);
        boolean boolean6 = cart1.isOptimizedDrawingEnabled();
        boolean boolean7 = cart1.isMaximumSizeSet();
        javax.accessibility.AccessibleContext accessibleContext8 = cart1.getAccessibleContext();
        java.awt.Rectangle rectangle9 = cart1.getVisibleRect();
        java.awt.Point point10 = cart1.getMousePosition();
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertNotNull(panelUI2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(accessibleContext8);
        org.junit.Assert.assertNotNull(rectangle9);
        org.junit.Assert.assertNull(point10);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        cart1.setDebugGraphicsOptions(10);
        api.SessionManager sessionManager4 = api.SessionManager.getInstance();
        api.Cart cart5 = sessionManager4.getCurrentCart();
        java.awt.event.ContainerListener containerListener6 = null;
        cart5.addContainerListener(containerListener6);
        boolean boolean8 = cart1.isFocusCycleRoot((java.awt.Container) cart5);
        java.beans.VetoableChangeListener[] vetoableChangeListenerArray9 = cart5.getVetoableChangeListeners();
        cart5.paintImmediately(10, (int) (short) -1, (int) (byte) 0, 10);
        api.SessionManager sessionManager15 = api.SessionManager.getInstance();
        api.Cart cart16 = sessionManager15.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI17 = cart16.getUI();
        boolean boolean20 = cart16.inside(0, (int) (byte) 100);
        java.awt.event.FocusEvent.Cause cause21 = null;
        boolean boolean22 = cart16.requestFocusInWindow(cause21);
        java.awt.Insets insets23 = cart16.insets();
        java.awt.Graphics graphics24 = cart16.getGraphics();
        // The following exception was thrown during execution in test generation
        try {
            cart5.update(graphics24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Graphics.setColor(java.awt.Color)\" because \"this.graphics\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertNotNull(sessionManager4);
        org.junit.Assert.assertNotNull(cart5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(vetoableChangeListenerArray9);
        org.junit.Assert.assertNotNull(sessionManager15);
        org.junit.Assert.assertNotNull(cart16);
        org.junit.Assert.assertNotNull(panelUI17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(insets23);
        org.junit.Assert.assertNotNull(graphics24);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        cart1.show(true);
        boolean boolean4 = cart1.isFocusTraversalPolicyProvider();
        int int5 = cart1.getWidth();
        api.SessionManager sessionManager6 = api.SessionManager.getInstance();
        api.Cart cart7 = sessionManager6.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI8 = cart7.getUI();
        boolean boolean11 = cart7.inside(0, (int) (byte) 100);
        java.awt.event.FocusEvent.Cause cause12 = null;
        boolean boolean13 = cart7.requestFocusInWindow(cause12);
        java.awt.Insets insets14 = cart7.insets();
        java.awt.Graphics graphics15 = cart7.getGraphics();
        // The following exception was thrown during execution in test generation
        try {
            cart1.print(graphics15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Graphics.setColor(java.awt.Color)\" because \"this.graphics\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 128 + "'", int5 == 128);
        org.junit.Assert.assertNotNull(sessionManager6);
        org.junit.Assert.assertNotNull(cart7);
        org.junit.Assert.assertNotNull(panelUI8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(insets14);
        org.junit.Assert.assertNotNull(graphics15);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        cart1.setDebugGraphicsOptions(10);
        api.SessionManager sessionManager4 = api.SessionManager.getInstance();
        api.Cart cart5 = sessionManager4.getCurrentCart();
        java.awt.event.ContainerListener containerListener6 = null;
        cart5.addContainerListener(containerListener6);
        boolean boolean8 = cart1.isFocusCycleRoot((java.awt.Container) cart5);
        java.awt.event.MouseEvent mouseEvent9 = null;
        java.awt.Point point10 = cart1.getPopupLocation(mouseEvent9);
        api.SessionManager sessionManager11 = api.SessionManager.getInstance();
        api.Cart cart12 = sessionManager11.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI13 = cart12.getUI();
        cart12.firePropertyChange("hi!", (int) 'a', 1);
        java.awt.Rectangle rectangle18 = null;
        java.awt.Rectangle rectangle19 = cart12.getBounds(rectangle18);
        api.SessionManager sessionManager20 = api.SessionManager.getInstance();
        api.Cart cart21 = sessionManager20.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI22 = cart21.getUI();
        boolean boolean25 = cart21.inside(0, (int) (byte) 100);
        java.awt.event.FocusEvent.Cause cause26 = null;
        boolean boolean27 = cart21.requestFocusInWindow(cause26);
        java.awt.Dimension dimension28 = cart21.getMaximumSize();
        cart12.setMinimumSize(dimension28);
        cart1.setMaximumSize(dimension28);
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertNotNull(sessionManager4);
        org.junit.Assert.assertNotNull(cart5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(point10);
        org.junit.Assert.assertNotNull(sessionManager11);
        org.junit.Assert.assertNotNull(cart12);
        org.junit.Assert.assertNotNull(panelUI13);
        org.junit.Assert.assertNotNull(rectangle19);
        org.junit.Assert.assertNotNull(sessionManager20);
        org.junit.Assert.assertNotNull(cart21);
        org.junit.Assert.assertNotNull(panelUI22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(dimension28);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        boolean boolean2 = cart1.isFocusOwner();
        cart1.setFocusable(false);
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        cart1.setDebugGraphicsOptions(10);
        cart1.setFocusCycleRoot(true);
        boolean boolean8 = cart1.contains((int) '4', (-1));
        java.awt.event.HierarchyListener hierarchyListener9 = null;
        cart1.removeHierarchyListener(hierarchyListener9);
        java.awt.Image image11 = null;
        api.SessionManager sessionManager12 = api.SessionManager.getInstance();
        api.Cart cart13 = sessionManager12.getCurrentCart();
        cart13.setDebugGraphicsOptions(10);
        api.SessionManager sessionManager16 = api.SessionManager.getInstance();
        api.Cart cart17 = sessionManager16.getCurrentCart();
        java.awt.event.ContainerListener containerListener18 = null;
        cart17.addContainerListener(containerListener18);
        boolean boolean20 = cart13.isFocusCycleRoot((java.awt.Container) cart17);
        javax.swing.JPopupMenu jPopupMenu21 = null;
        cart13.setComponentPopupMenu(jPopupMenu21);
        api.SessionManager sessionManager23 = api.SessionManager.getInstance();
        api.Cart cart24 = sessionManager23.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI25 = cart24.getUI();
        cart13.setUI(panelUI25);
        boolean boolean27 = cart1.prepareImage(image11, (java.awt.image.ImageObserver) cart13);
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(sessionManager12);
        org.junit.Assert.assertNotNull(cart13);
        org.junit.Assert.assertNotNull(sessionManager16);
        org.junit.Assert.assertNotNull(cart17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(sessionManager23);
        org.junit.Assert.assertNotNull(cart24);
        org.junit.Assert.assertNotNull(panelUI25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        cart1.setDebugGraphicsOptions(10);
        api.SessionManager sessionManager4 = api.SessionManager.getInstance();
        api.Cart cart5 = sessionManager4.getCurrentCart();
        java.awt.event.ContainerListener containerListener6 = null;
        cart5.addContainerListener(containerListener6);
        boolean boolean8 = cart1.isFocusCycleRoot((java.awt.Container) cart5);
        java.awt.event.MouseEvent mouseEvent9 = null;
        java.awt.Point point10 = cart1.getPopupLocation(mouseEvent9);
        cart1.firePropertyChange("", (float) 128, 0.0f);
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertNotNull(sessionManager4);
        org.junit.Assert.assertNotNull(cart5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(point10);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI2 = cart1.getUI();
        cart1.doLayout();
        java.awt.event.HierarchyBoundsListener[] hierarchyBoundsListenerArray4 = cart1.getHierarchyBoundsListeners();
        cart1.firePropertyChange("hi!", (byte) 1, (byte) -1);
        java.awt.Insets insets9 = cart1.getInsets();
        cart1.setSize(128, (int) 'a');
        java.awt.ImageCapabilities imageCapabilities15 = null;
        java.awt.image.VolatileImage volatileImage16 = cart1.createVolatileImage((int) ' ', (-1), imageCapabilities15);
        java.awt.GraphicsConfiguration graphicsConfiguration17 = cart1.getGraphicsConfiguration();
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertNotNull(panelUI2);
        org.junit.Assert.assertNotNull(hierarchyBoundsListenerArray4);
        org.junit.Assert.assertNotNull(insets9);
        org.junit.Assert.assertNull(volatileImage16);
        org.junit.Assert.assertNull(graphicsConfiguration17);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        cart1.setDebugGraphicsOptions(10);
        api.SessionManager sessionManager4 = api.SessionManager.getInstance();
        api.Cart cart5 = sessionManager4.getCurrentCart();
        java.awt.event.ContainerListener containerListener6 = null;
        cart5.addContainerListener(containerListener6);
        boolean boolean8 = cart1.isFocusCycleRoot((java.awt.Container) cart5);
        java.beans.VetoableChangeListener vetoableChangeListener9 = null;
        cart1.addVetoableChangeListener(vetoableChangeListener9);
        java.awt.Event event11 = null;
        boolean boolean14 = cart1.mouseDrag(event11, (int) (byte) -1, (-1));
        java.lang.String str15 = cart1.getUIClassID();
        cart1.invalidate();
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertNotNull(sessionManager4);
        org.junit.Assert.assertNotNull(cart5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "PanelUI" + "'", str15, "PanelUI");
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI2 = cart1.getUI();
        cart1.doLayout();
        cart1.resetKeyboardActions();
        api.SessionManager sessionManager5 = api.SessionManager.getInstance();
        api.Cart cart6 = sessionManager5.getCurrentCart();
        cart6.setDebugGraphicsOptions(10);
        api.SessionManager sessionManager9 = api.SessionManager.getInstance();
        api.Cart cart10 = sessionManager9.getCurrentCart();
        java.awt.event.ContainerListener containerListener11 = null;
        cart10.addContainerListener(containerListener11);
        boolean boolean13 = cart6.isFocusCycleRoot((java.awt.Container) cart10);
        javax.swing.JPopupMenu jPopupMenu14 = null;
        cart6.setComponentPopupMenu(jPopupMenu14);
        api.SessionManager sessionManager16 = api.SessionManager.getInstance();
        api.Cart cart17 = sessionManager16.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI18 = cart17.getUI();
        cart6.setUI(panelUI18);
        cart1.setUI(panelUI18);
        javax.swing.event.AncestorListener ancestorListener21 = null;
        cart1.removeAncestorListener(ancestorListener21);
        cart1.revalidate();
        java.awt.event.HierarchyListener hierarchyListener24 = null;
        cart1.addHierarchyListener(hierarchyListener24);
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertNotNull(panelUI2);
        org.junit.Assert.assertNotNull(sessionManager5);
        org.junit.Assert.assertNotNull(cart6);
        org.junit.Assert.assertNotNull(sessionManager9);
        org.junit.Assert.assertNotNull(cart10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(sessionManager16);
        org.junit.Assert.assertNotNull(cart17);
        org.junit.Assert.assertNotNull(panelUI18);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        cart1.show(true);
        java.awt.Event event4 = null;
        boolean boolean6 = cart1.action(event4, (java.lang.Object) 10);
        cart1.enable();
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI2 = cart1.getUI();
        cart1.doLayout();
        java.awt.event.HierarchyBoundsListener[] hierarchyBoundsListenerArray4 = cart1.getHierarchyBoundsListeners();
        cart1.firePropertyChange("hi!", (byte) 1, (byte) -1);
        java.awt.Insets insets9 = cart1.getInsets();
        cart1.setSize(128, (int) 'a');
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener13 = null;
        cart1.removeHierarchyBoundsListener(hierarchyBoundsListener13);
        java.awt.GraphicsConfiguration graphicsConfiguration15 = cart1.getGraphicsConfiguration();
        javax.swing.InputMap inputMap16 = cart1.getInputMap();
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertNotNull(panelUI2);
        org.junit.Assert.assertNotNull(hierarchyBoundsListenerArray4);
        org.junit.Assert.assertNotNull(insets9);
        org.junit.Assert.assertNull(graphicsConfiguration15);
        org.junit.Assert.assertNotNull(inputMap16);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI2 = cart1.getUI();
        boolean boolean5 = cart1.inside(0, (int) (byte) 100);
        boolean boolean6 = cart1.isOptimizedDrawingEnabled();
        boolean boolean7 = cart1.isMaximumSizeSet();
        javax.accessibility.AccessibleContext accessibleContext8 = cart1.getAccessibleContext();
        java.awt.Rectangle rectangle9 = cart1.getVisibleRect();
        cart1.revalidate();
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertNotNull(panelUI2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(accessibleContext8);
        org.junit.Assert.assertNotNull(rectangle9);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        cart1.setEnabled(false);
        java.util.Set<java.awt.AWTKeyStroke> aWTKeyStrokeSet5 = cart1.getFocusTraversalKeys(0);
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertNotNull(aWTKeyStrokeSet5);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI2 = cart1.getUI();
        cart1.firePropertyChange("hi!", (int) 'a', 1);
        java.awt.Rectangle rectangle7 = null;
        java.awt.Rectangle rectangle8 = cart1.getBounds(rectangle7);
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener9 = null;
        cart1.addHierarchyBoundsListener(hierarchyBoundsListener9);
        api.SessionManager sessionManager11 = api.SessionManager.getInstance();
        api.Cart cart12 = sessionManager11.getCurrentCart();
        cart12.show(true);
        java.awt.Event event15 = null;
        boolean boolean17 = cart12.action(event15, (java.lang.Object) 10);
        cart12.setVisible(false);
        boolean boolean20 = cart1.isAncestorOf((java.awt.Component) cart12);
        boolean boolean21 = cart12.isOpaque();
        cart12.reshape((int) '4', (int) ' ', (int) (byte) -1, (int) (byte) -1);
        api.SessionManager sessionManager27 = api.SessionManager.getInstance();
        api.Cart cart28 = sessionManager27.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI29 = cart28.getUI();
        cart28.firePropertyChange("hi!", (int) 'a', 1);
        java.awt.Rectangle rectangle34 = null;
        java.awt.Rectangle rectangle35 = cart28.getBounds(rectangle34);
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener36 = null;
        cart28.addHierarchyBoundsListener(hierarchyBoundsListener36);
        api.SessionManager sessionManager38 = api.SessionManager.getInstance();
        api.Cart cart39 = sessionManager38.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI40 = cart39.getUI();
        cart39.firePropertyChange("hi!", (int) 'a', 1);
        java.awt.Rectangle rectangle45 = null;
        java.awt.Rectangle rectangle46 = cart39.getBounds(rectangle45);
        cart28.scrollRectToVisible(rectangle46);
        cart12.repaint(rectangle46);
        cart12.invalidate();
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertNotNull(panelUI2);
        org.junit.Assert.assertNotNull(rectangle8);
        org.junit.Assert.assertNotNull(sessionManager11);
        org.junit.Assert.assertNotNull(cart12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(sessionManager27);
        org.junit.Assert.assertNotNull(cart28);
        org.junit.Assert.assertNotNull(panelUI29);
        org.junit.Assert.assertNotNull(rectangle35);
        org.junit.Assert.assertNotNull(sessionManager38);
        org.junit.Assert.assertNotNull(cart39);
        org.junit.Assert.assertNotNull(panelUI40);
        org.junit.Assert.assertNotNull(rectangle46);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI2 = cart1.getUI();
        boolean boolean5 = cart1.inside(0, (int) (byte) 100);
        boolean boolean6 = cart1.isOptimizedDrawingEnabled();
        boolean boolean7 = cart1.isMaximumSizeSet();
        boolean boolean8 = cart1.isLightweight();
        java.awt.event.FocusEvent.Cause cause9 = null;
        cart1.requestFocus(cause9);
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertNotNull(panelUI2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        int int0 = javax.swing.JComponent.WHEN_IN_FOCUSED_WINDOW;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        cart1.setDebugGraphicsOptions(10);
        javax.swing.InputVerifier inputVerifier4 = cart1.getInputVerifier();
        api.SessionManager sessionManager5 = api.SessionManager.getInstance();
        api.Cart cart6 = sessionManager5.getCurrentCart();
        cart6.setDebugGraphicsOptions(10);
        api.SessionManager sessionManager9 = api.SessionManager.getInstance();
        api.Cart cart10 = sessionManager9.getCurrentCart();
        java.awt.event.ContainerListener containerListener11 = null;
        cart10.addContainerListener(containerListener11);
        boolean boolean13 = cart6.isFocusCycleRoot((java.awt.Container) cart10);
        java.beans.VetoableChangeListener[] vetoableChangeListenerArray14 = cart10.getVetoableChangeListeners();
        java.awt.Font font15 = cart10.getFont();
        cart1.setFont(font15);
        cart1.setRequestFocusEnabled(true);
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertNull(inputVerifier4);
        org.junit.Assert.assertNotNull(sessionManager5);
        org.junit.Assert.assertNotNull(cart6);
        org.junit.Assert.assertNotNull(sessionManager9);
        org.junit.Assert.assertNotNull(cart10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(vetoableChangeListenerArray14);
        org.junit.Assert.assertNotNull(font15);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        int int4 = cart1.getBaseline(10, (int) '4');
        cart1.paintImmediately(10, (int) (byte) 0, 0, (int) (byte) 10);
        api.SessionManager sessionManager10 = api.SessionManager.getInstance();
        api.Cart cart11 = sessionManager10.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI12 = cart11.getUI();
        boolean boolean15 = cart11.inside(0, (int) (byte) 100);
        java.awt.event.FocusEvent.Cause cause16 = null;
        boolean boolean17 = cart11.requestFocusInWindow(cause16);
        java.awt.Dimension dimension18 = cart11.getMaximumSize();
        java.awt.Dimension dimension19 = cart1.getSize(dimension18);
        int int20 = cart1.getWidth();
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(sessionManager10);
        org.junit.Assert.assertNotNull(cart11);
        org.junit.Assert.assertNotNull(panelUI12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(dimension18);
        org.junit.Assert.assertNotNull(dimension19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        cart1.show(true);
        java.awt.Event event4 = null;
        boolean boolean6 = cart1.action(event4, (java.lang.Object) 10);
        cart1.setVisible(false);
        java.awt.GraphicsConfiguration graphicsConfiguration9 = cart1.getGraphicsConfiguration();
        java.beans.PropertyChangeListener[] propertyChangeListenerArray10 = cart1.getPropertyChangeListeners();
        cart1.setName("PanelUI");
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(graphicsConfiguration9);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray10);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        java.awt.event.ContainerListener containerListener2 = null;
        cart1.addContainerListener(containerListener2);
        cart1.resize((int) (short) 100, 100);
        java.awt.event.MouseMotionListener[] mouseMotionListenerArray7 = cart1.getMouseMotionListeners();
        int int8 = cart1.getHeight();
        api.SessionManager sessionManager9 = api.SessionManager.getInstance();
        api.Cart cart10 = sessionManager9.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI11 = cart10.getUI();
        boolean boolean14 = cart10.inside(0, (int) (byte) 100);
        java.awt.event.FocusEvent.Cause cause15 = null;
        boolean boolean16 = cart10.requestFocusInWindow(cause15);
        java.awt.Insets insets17 = cart10.insets();
        java.awt.Graphics graphics18 = cart10.getGraphics();
        cart1.paintAll(graphics18);
        javax.swing.event.AncestorListener ancestorListener20 = null;
        cart1.removeAncestorListener(ancestorListener20);
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertNotNull(mouseMotionListenerArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNotNull(sessionManager9);
        org.junit.Assert.assertNotNull(cart10);
        org.junit.Assert.assertNotNull(panelUI11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(insets17);
        org.junit.Assert.assertNotNull(graphics18);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI2 = cart1.getUI();
        cart1.doLayout();
        cart1.enableInputMethods(true);
        java.awt.Event event6 = null;
        boolean boolean9 = cart1.mouseExit(event6, 0, (int) (short) 1);
        java.beans.PropertyChangeListener[] propertyChangeListenerArray10 = cart1.getPropertyChangeListeners();
        cart1.updateUI();
        java.awt.Event event12 = null;
        boolean boolean15 = cart1.mouseEnter(event12, (int) (short) 1, (int) (byte) -1);
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertNotNull(panelUI2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        api.Staff staff2 = new api.Staff("", "");
        staff2.removeSubscription("Your cart is empty.");
        api.Item item5 = null;
        staff2.makeRequests(item5);
        java.lang.String str7 = staff2.getEmail();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        cart1.show(true);
        boolean boolean4 = cart1.isFocusTraversalPolicyProvider();
        java.awt.Point point5 = cart1.getLocation();
        boolean boolean6 = cart1.isBackgroundSet();
        java.awt.image.VolatileImage volatileImage9 = cart1.createVolatileImage((int) ' ', 100);
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(point5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(volatileImage9);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI2 = cart1.getUI();
        cart1.firePropertyChange("hi!", (int) 'a', 1);
        java.awt.Rectangle rectangle7 = null;
        java.awt.Rectangle rectangle8 = cart1.getBounds(rectangle7);
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener9 = null;
        cart1.addHierarchyBoundsListener(hierarchyBoundsListener9);
        api.SessionManager sessionManager11 = api.SessionManager.getInstance();
        api.Cart cart12 = sessionManager11.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI13 = cart12.getUI();
        cart12.firePropertyChange("hi!", (int) 'a', 1);
        java.awt.Rectangle rectangle18 = null;
        java.awt.Rectangle rectangle19 = cart12.getBounds(rectangle18);
        cart1.scrollRectToVisible(rectangle19);
        cart1.setSize(10, (int) (byte) 100);
        java.awt.event.MouseWheelListener mouseWheelListener24 = null;
        cart1.addMouseWheelListener(mouseWheelListener24);
        java.awt.LayoutManager layoutManager26 = cart1.getLayout();
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertNotNull(panelUI2);
        org.junit.Assert.assertNotNull(rectangle8);
        org.junit.Assert.assertNotNull(sessionManager11);
        org.junit.Assert.assertNotNull(cart12);
        org.junit.Assert.assertNotNull(panelUI13);
        org.junit.Assert.assertNotNull(rectangle19);
        org.junit.Assert.assertNull(layoutManager26);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        api.Subscription subscription2 = new api.Subscription("api.Cart[,0,0,1x-1,invalid,hidden,disabled,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]", true);
        subscription2.setServiceName("Your cart is empty.");
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI2 = cart1.getUI();
        cart1.doLayout();
        cart1.enableInputMethods(true);
        java.awt.Event event6 = null;
        boolean boolean9 = cart1.mouseExit(event6, 0, (int) (short) 1);
        java.beans.PropertyChangeListener[] propertyChangeListenerArray10 = cart1.getPropertyChangeListeners();
        int int11 = cart1.getY();
        api.SessionManager sessionManager12 = api.SessionManager.getInstance();
        api.Cart cart13 = sessionManager12.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI14 = cart13.getUI();
        cart13.firePropertyChange("hi!", (int) 'a', 1);
        java.awt.Rectangle rectangle19 = null;
        java.awt.Rectangle rectangle20 = cart13.getBounds(rectangle19);
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener21 = null;
        cart13.addHierarchyBoundsListener(hierarchyBoundsListener21);
        api.SessionManager sessionManager23 = api.SessionManager.getInstance();
        api.Cart cart24 = sessionManager23.getCurrentCart();
        cart24.show(true);
        java.awt.Event event27 = null;
        boolean boolean29 = cart24.action(event27, (java.lang.Object) 10);
        cart24.setVisible(false);
        boolean boolean32 = cart13.isAncestorOf((java.awt.Component) cart24);
        boolean boolean33 = cart24.isOpaque();
        cart24.reshape((int) '4', (int) ' ', (int) (byte) -1, (int) (byte) -1);
        api.SessionManager sessionManager39 = api.SessionManager.getInstance();
        api.Cart cart40 = sessionManager39.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI41 = cart40.getUI();
        cart40.firePropertyChange("hi!", (int) 'a', 1);
        java.awt.Rectangle rectangle46 = null;
        java.awt.Rectangle rectangle47 = cart40.getBounds(rectangle46);
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener48 = null;
        cart40.addHierarchyBoundsListener(hierarchyBoundsListener48);
        api.SessionManager sessionManager50 = api.SessionManager.getInstance();
        api.Cart cart51 = sessionManager50.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI52 = cart51.getUI();
        cart51.firePropertyChange("hi!", (int) 'a', 1);
        java.awt.Rectangle rectangle57 = null;
        java.awt.Rectangle rectangle58 = cart51.getBounds(rectangle57);
        cart40.scrollRectToVisible(rectangle58);
        cart24.repaint(rectangle58);
        cart1.scrollRectToVisible(rectangle58);
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertNotNull(panelUI2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertNotNull(sessionManager12);
        org.junit.Assert.assertNotNull(cart13);
        org.junit.Assert.assertNotNull(panelUI14);
        org.junit.Assert.assertNotNull(rectangle20);
        org.junit.Assert.assertNotNull(sessionManager23);
        org.junit.Assert.assertNotNull(cart24);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(sessionManager39);
        org.junit.Assert.assertNotNull(cart40);
        org.junit.Assert.assertNotNull(panelUI41);
        org.junit.Assert.assertNotNull(rectangle47);
        org.junit.Assert.assertNotNull(sessionManager50);
        org.junit.Assert.assertNotNull(cart51);
        org.junit.Assert.assertNotNull(panelUI52);
        org.junit.Assert.assertNotNull(rectangle58);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI2 = cart1.getUI();
        cart1.firePropertyChange("hi!", (int) 'a', 1);
        java.awt.Rectangle rectangle7 = null;
        java.awt.Rectangle rectangle8 = cart1.getBounds(rectangle7);
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener9 = null;
        cart1.addHierarchyBoundsListener(hierarchyBoundsListener9);
        api.SessionManager sessionManager11 = api.SessionManager.getInstance();
        api.Cart cart12 = sessionManager11.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI13 = cart12.getUI();
        cart12.firePropertyChange("hi!", (int) 'a', 1);
        java.awt.Rectangle rectangle18 = null;
        java.awt.Rectangle rectangle19 = cart12.getBounds(rectangle18);
        cart1.scrollRectToVisible(rectangle19);
        cart1.setSize(10, (int) (byte) 100);
        java.awt.MenuComponent menuComponent24 = null;
        cart1.remove(menuComponent24);
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertNotNull(panelUI2);
        org.junit.Assert.assertNotNull(rectangle8);
        org.junit.Assert.assertNotNull(sessionManager11);
        org.junit.Assert.assertNotNull(cart12);
        org.junit.Assert.assertNotNull(panelUI13);
        org.junit.Assert.assertNotNull(rectangle19);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        java.awt.event.ContainerListener containerListener2 = null;
        cart1.addContainerListener(containerListener2);
        api.SessionManager sessionManager4 = api.SessionManager.getInstance();
        api.Cart cart5 = sessionManager4.getCurrentCart();
        java.awt.event.ContainerListener containerListener6 = null;
        cart5.addContainerListener(containerListener6);
        cart5.resize((int) (short) 100, 100);
        java.awt.event.MouseMotionListener[] mouseMotionListenerArray11 = cart5.getMouseMotionListeners();
        int int12 = cart5.getHeight();
        api.SessionManager sessionManager13 = api.SessionManager.getInstance();
        api.Cart cart14 = sessionManager13.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI15 = cart14.getUI();
        boolean boolean18 = cart14.inside(0, (int) (byte) 100);
        java.awt.event.FocusEvent.Cause cause19 = null;
        boolean boolean20 = cart14.requestFocusInWindow(cause19);
        java.awt.Insets insets21 = cart14.insets();
        java.awt.Graphics graphics22 = cart14.getGraphics();
        cart5.paintAll(graphics22);
        // The following exception was thrown during execution in test generation
        try {
            cart1.printAll(graphics22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Graphics.setColor(java.awt.Color)\" because \"this.graphics\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertNotNull(sessionManager4);
        org.junit.Assert.assertNotNull(cart5);
        org.junit.Assert.assertNotNull(mouseMotionListenerArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(sessionManager13);
        org.junit.Assert.assertNotNull(cart14);
        org.junit.Assert.assertNotNull(panelUI15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(insets21);
        org.junit.Assert.assertNotNull(graphics22);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI2 = cart1.getUI();
        boolean boolean5 = cart1.inside(0, (int) (byte) 100);
        boolean boolean6 = cart1.isOptimizedDrawingEnabled();
        boolean boolean7 = cart1.isMaximumSizeSet();
        java.awt.event.MouseWheelListener[] mouseWheelListenerArray8 = cart1.getMouseWheelListeners();
        java.awt.event.HierarchyBoundsListener[] hierarchyBoundsListenerArray9 = cart1.getHierarchyBoundsListeners();
        java.awt.Image image10 = null;
        api.SessionManager sessionManager13 = api.SessionManager.getInstance();
        api.Cart cart14 = sessionManager13.getCurrentCart();
        cart14.setDebugGraphicsOptions(10);
        javax.swing.InputVerifier inputVerifier17 = cart14.getInputVerifier();
        api.SessionManager sessionManager18 = api.SessionManager.getInstance();
        api.Cart cart19 = sessionManager18.getCurrentCart();
        cart19.setDebugGraphicsOptions(10);
        api.SessionManager sessionManager22 = api.SessionManager.getInstance();
        api.Cart cart23 = sessionManager22.getCurrentCart();
        java.awt.event.ContainerListener containerListener24 = null;
        cart23.addContainerListener(containerListener24);
        boolean boolean26 = cart19.isFocusCycleRoot((java.awt.Container) cart23);
        java.beans.VetoableChangeListener[] vetoableChangeListenerArray27 = cart23.getVetoableChangeListeners();
        java.awt.Font font28 = cart23.getFont();
        cart14.setFont(font28);
        java.awt.Color color30 = cart14.getBackground();
        boolean boolean31 = cart1.prepareImage(image10, 4, 8, (java.awt.image.ImageObserver) cart14);
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertNotNull(panelUI2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(mouseWheelListenerArray8);
        org.junit.Assert.assertNotNull(hierarchyBoundsListenerArray9);
        org.junit.Assert.assertNotNull(sessionManager13);
        org.junit.Assert.assertNotNull(cart14);
        org.junit.Assert.assertNull(inputVerifier17);
        org.junit.Assert.assertNotNull(sessionManager18);
        org.junit.Assert.assertNotNull(cart19);
        org.junit.Assert.assertNotNull(sessionManager22);
        org.junit.Assert.assertNotNull(cart23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(vetoableChangeListenerArray27);
        org.junit.Assert.assertNotNull(font28);
        org.junit.Assert.assertNotNull(color30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        cart1.setDebugGraphicsOptions(10);
        api.SessionManager sessionManager4 = api.SessionManager.getInstance();
        api.Cart cart5 = sessionManager4.getCurrentCart();
        java.awt.event.ContainerListener containerListener6 = null;
        cart5.addContainerListener(containerListener6);
        boolean boolean8 = cart1.isFocusCycleRoot((java.awt.Container) cart5);
        java.beans.VetoableChangeListener[] vetoableChangeListenerArray9 = cart5.getVetoableChangeListeners();
        javax.accessibility.AccessibleContext accessibleContext10 = cart5.getAccessibleContext();
        java.awt.Image image13 = cart5.createImage(1, 10);
        boolean boolean14 = cart5.isOptimizedDrawingEnabled();
        api.SessionManager sessionManager15 = api.SessionManager.getInstance();
        api.Cart cart16 = sessionManager15.getCurrentCart();
        cart16.show(true);
        java.awt.Dimension dimension19 = cart16.getMaximumSize();
        cart5.resize(dimension19);
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertNotNull(sessionManager4);
        org.junit.Assert.assertNotNull(cart5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(vetoableChangeListenerArray9);
        org.junit.Assert.assertNotNull(accessibleContext10);
        org.junit.Assert.assertNull(image13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(sessionManager15);
        org.junit.Assert.assertNotNull(cart16);
        org.junit.Assert.assertNotNull(dimension19);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI2 = cart1.getUI();
        cart1.firePropertyChange("hi!", (int) 'a', 1);
        java.awt.Rectangle rectangle7 = null;
        java.awt.Rectangle rectangle8 = cart1.getBounds(rectangle7);
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener9 = null;
        cart1.addHierarchyBoundsListener(hierarchyBoundsListener9);
        boolean boolean11 = cart1.isFocusTraversalPolicyProvider();
        cart1.invalidate();
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertNotNull(panelUI2);
        org.junit.Assert.assertNotNull(rectangle8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI2 = cart1.getUI();
        cart1.doLayout();
        java.awt.event.HierarchyBoundsListener[] hierarchyBoundsListenerArray4 = cart1.getHierarchyBoundsListeners();
        cart1.firePropertyChange("hi!", (byte) 1, (byte) -1);
        boolean boolean9 = cart1.getFocusTraversalKeysEnabled();
        api.SessionManager sessionManager10 = api.SessionManager.getInstance();
        api.Cart cart11 = sessionManager10.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI12 = cart11.getUI();
        boolean boolean15 = cart11.inside(0, (int) (byte) 100);
        java.awt.event.FocusEvent.Cause cause16 = null;
        boolean boolean17 = cart11.requestFocusInWindow(cause16);
        api.CartMemento cartMemento18 = cart11.save();
        cart1.undo(cartMemento18);
        java.beans.PropertyChangeListener propertyChangeListener20 = null;
        cart1.addPropertyChangeListener(propertyChangeListener20);
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertNotNull(panelUI2);
        org.junit.Assert.assertNotNull(hierarchyBoundsListenerArray4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(sessionManager10);
        org.junit.Assert.assertNotNull(cart11);
        org.junit.Assert.assertNotNull(panelUI12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(cartMemento18);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        cart1.show(true);
        boolean boolean4 = cart1.isEnabled();
        int int5 = cart1.getComponentCount();
        java.awt.event.ActionListener actionListener6 = null;
        javax.swing.KeyStroke keyStroke8 = null;
        // The following exception was thrown during execution in test generation
        try {
            cart1.registerKeyboardAction(actionListener6, "PanelUI", keyStroke8, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: condition must be one of JComponent.WHEN_IN_FOCUSED_WINDOW, JComponent.WHEN_FOCUSED or JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        int int0 = java.awt.image.ImageObserver.FRAMEBITS;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 16 + "'", int0 == 16);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI2 = cart1.getUI();
        api.SessionManager sessionManager3 = api.SessionManager.getInstance();
        api.Cart cart4 = sessionManager3.getCurrentCart();
        cart4.setDebugGraphicsOptions(10);
        api.SessionManager sessionManager7 = api.SessionManager.getInstance();
        api.Cart cart8 = sessionManager7.getCurrentCart();
        java.awt.event.ContainerListener containerListener9 = null;
        cart8.addContainerListener(containerListener9);
        boolean boolean11 = cart4.isFocusCycleRoot((java.awt.Container) cart8);
        javax.swing.JPopupMenu jPopupMenu12 = null;
        cart4.setComponentPopupMenu(jPopupMenu12);
        cart1.remove((java.awt.Component) cart4);
        java.awt.event.ActionListener actionListener15 = null;
        javax.swing.KeyStroke keyStroke17 = null;
        // The following exception was thrown during execution in test generation
        try {
            cart1.registerKeyboardAction(actionListener15, "hi!", keyStroke17, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: condition must be one of JComponent.WHEN_IN_FOCUSED_WINDOW, JComponent.WHEN_FOCUSED or JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertNotNull(panelUI2);
        org.junit.Assert.assertNotNull(sessionManager3);
        org.junit.Assert.assertNotNull(cart4);
        org.junit.Assert.assertNotNull(sessionManager7);
        org.junit.Assert.assertNotNull(cart8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI2 = cart1.getUI();
        cart1.doLayout();
        java.awt.event.HierarchyBoundsListener[] hierarchyBoundsListenerArray4 = cart1.getHierarchyBoundsListeners();
        cart1.firePropertyChange("hi!", (byte) 1, (byte) -1);
        java.awt.Insets insets9 = cart1.getInsets();
        api.SessionManager sessionManager10 = api.SessionManager.getInstance();
        api.Cart cart11 = sessionManager10.getCurrentCart();
        cart11.setDebugGraphicsOptions(10);
        api.SessionManager sessionManager14 = api.SessionManager.getInstance();
        api.Cart cart15 = sessionManager14.getCurrentCart();
        java.awt.event.ContainerListener containerListener16 = null;
        cart15.addContainerListener(containerListener16);
        boolean boolean18 = cart11.isFocusCycleRoot((java.awt.Container) cart15);
        javax.swing.JPopupMenu jPopupMenu19 = null;
        cart11.setComponentPopupMenu(jPopupMenu19);
        api.SessionManager sessionManager21 = api.SessionManager.getInstance();
        api.Cart cart22 = sessionManager21.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI23 = cart22.getUI();
        cart11.setUI(panelUI23);
        java.awt.event.MouseWheelListener[] mouseWheelListenerArray25 = cart11.getMouseWheelListeners();
        java.awt.Insets insets26 = cart11.insets();
        api.SessionManager sessionManager27 = api.SessionManager.getInstance();
        api.Cart cart28 = sessionManager27.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI29 = cart28.getUI();
        cart28.firePropertyChange("hi!", (int) 'a', 1);
        java.awt.Rectangle rectangle34 = null;
        java.awt.Rectangle rectangle35 = cart28.getBounds(rectangle34);
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener36 = null;
        cart28.addHierarchyBoundsListener(hierarchyBoundsListener36);
        api.SessionManager sessionManager38 = api.SessionManager.getInstance();
        api.Cart cart39 = sessionManager38.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI40 = cart39.getUI();
        cart39.firePropertyChange("hi!", (int) 'a', 1);
        java.awt.Rectangle rectangle45 = null;
        java.awt.Rectangle rectangle46 = cart39.getBounds(rectangle45);
        cart28.scrollRectToVisible(rectangle46);
        cart11.setMixingCutoutShape((java.awt.Shape) rectangle46);
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Component component49 = cart1.add((java.awt.Component) cart11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: adding container's parent to itself");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertNotNull(panelUI2);
        org.junit.Assert.assertNotNull(hierarchyBoundsListenerArray4);
        org.junit.Assert.assertNotNull(insets9);
        org.junit.Assert.assertNotNull(sessionManager10);
        org.junit.Assert.assertNotNull(cart11);
        org.junit.Assert.assertNotNull(sessionManager14);
        org.junit.Assert.assertNotNull(cart15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(sessionManager21);
        org.junit.Assert.assertNotNull(cart22);
        org.junit.Assert.assertNotNull(panelUI23);
        org.junit.Assert.assertNotNull(mouseWheelListenerArray25);
        org.junit.Assert.assertNotNull(insets26);
        org.junit.Assert.assertNotNull(sessionManager27);
        org.junit.Assert.assertNotNull(cart28);
        org.junit.Assert.assertNotNull(panelUI29);
        org.junit.Assert.assertNotNull(rectangle35);
        org.junit.Assert.assertNotNull(sessionManager38);
        org.junit.Assert.assertNotNull(cart39);
        org.junit.Assert.assertNotNull(panelUI40);
        org.junit.Assert.assertNotNull(rectangle46);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        cart1.setDebugGraphicsOptions(10);
        api.SessionManager sessionManager4 = api.SessionManager.getInstance();
        api.Cart cart5 = sessionManager4.getCurrentCart();
        java.awt.event.ContainerListener containerListener6 = null;
        cart5.addContainerListener(containerListener6);
        boolean boolean8 = cart1.isFocusCycleRoot((java.awt.Container) cart5);
        javax.swing.JPopupMenu jPopupMenu9 = null;
        cart1.setComponentPopupMenu(jPopupMenu9);
        api.SessionManager sessionManager11 = api.SessionManager.getInstance();
        api.Cart cart12 = sessionManager11.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI13 = cart12.getUI();
        cart1.setUI(panelUI13);
        java.beans.VetoableChangeListener[] vetoableChangeListenerArray15 = cart1.getVetoableChangeListeners();
        boolean boolean17 = cart1.requestFocus(false);
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertNotNull(sessionManager4);
        org.junit.Assert.assertNotNull(cart5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(sessionManager11);
        org.junit.Assert.assertNotNull(cart12);
        org.junit.Assert.assertNotNull(panelUI13);
        org.junit.Assert.assertNotNull(vetoableChangeListenerArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        boolean boolean2 = cart1.isBackgroundSet();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener3 = null;
        cart1.addHierarchyBoundsListener(hierarchyBoundsListener3);
        java.awt.MenuComponent menuComponent5 = null;
        cart1.remove(menuComponent5);
        javax.swing.event.AncestorListener ancestorListener7 = null;
        cart1.addAncestorListener(ancestorListener7);
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI2 = cart1.getUI();
        boolean boolean5 = cart1.inside(0, (int) (byte) 100);
        boolean boolean6 = cart1.isOptimizedDrawingEnabled();
        boolean boolean7 = cart1.isMaximumSizeSet();
        api.SessionManager sessionManager8 = api.SessionManager.getInstance();
        api.Cart cart9 = sessionManager8.getCurrentCart();
        cart9.setDebugGraphicsOptions(10);
        api.SessionManager sessionManager12 = api.SessionManager.getInstance();
        api.Cart cart13 = sessionManager12.getCurrentCart();
        java.awt.event.ContainerListener containerListener14 = null;
        cart13.addContainerListener(containerListener14);
        boolean boolean16 = cart9.isFocusCycleRoot((java.awt.Container) cart13);
        api.SessionManager sessionManager17 = api.SessionManager.getInstance();
        api.Cart cart18 = sessionManager17.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI19 = cart18.getUI();
        cart18.doLayout();
        java.awt.event.HierarchyBoundsListener[] hierarchyBoundsListenerArray21 = cart18.getHierarchyBoundsListeners();
        cart18.firePropertyChange("hi!", (byte) 1, (byte) -1);
        java.awt.Insets insets26 = cart18.getInsets();
        java.beans.VetoableChangeListener[] vetoableChangeListenerArray27 = cart18.getVetoableChangeListeners();
        api.SessionManager sessionManager28 = api.SessionManager.getInstance();
        api.Cart cart29 = sessionManager28.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI30 = cart29.getUI();
        boolean boolean33 = cart29.inside(0, (int) (byte) 100);
        java.awt.Rectangle rectangle34 = cart29.bounds();
        cart18.setMixingCutoutShape((java.awt.Shape) rectangle34);
        java.awt.Rectangle rectangle36 = cart13.getBounds(rectangle34);
        cart1.paintImmediately(rectangle36);
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertNotNull(panelUI2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(sessionManager8);
        org.junit.Assert.assertNotNull(cart9);
        org.junit.Assert.assertNotNull(sessionManager12);
        org.junit.Assert.assertNotNull(cart13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(sessionManager17);
        org.junit.Assert.assertNotNull(cart18);
        org.junit.Assert.assertNotNull(panelUI19);
        org.junit.Assert.assertNotNull(hierarchyBoundsListenerArray21);
        org.junit.Assert.assertNotNull(insets26);
        org.junit.Assert.assertNotNull(vetoableChangeListenerArray27);
        org.junit.Assert.assertNotNull(sessionManager28);
        org.junit.Assert.assertNotNull(cart29);
        org.junit.Assert.assertNotNull(panelUI30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(rectangle34);
        org.junit.Assert.assertNotNull(rectangle36);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI2 = cart1.getUI();
        cart1.firePropertyChange("hi!", (int) 'a', 1);
        java.awt.Rectangle rectangle7 = null;
        java.awt.Rectangle rectangle8 = cart1.getBounds(rectangle7);
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener9 = null;
        cart1.addHierarchyBoundsListener(hierarchyBoundsListener9);
        api.SessionManager sessionManager11 = api.SessionManager.getInstance();
        api.Cart cart12 = sessionManager11.getCurrentCart();
        cart12.show(true);
        java.awt.Event event15 = null;
        boolean boolean17 = cart12.action(event15, (java.lang.Object) 10);
        cart12.setVisible(false);
        boolean boolean20 = cart1.isAncestorOf((java.awt.Component) cart12);
        cart12.disable();
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertNotNull(panelUI2);
        org.junit.Assert.assertNotNull(rectangle8);
        org.junit.Assert.assertNotNull(sessionManager11);
        org.junit.Assert.assertNotNull(cart12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        int int0 = javax.swing.JComponent.WHEN_FOCUSED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        api.Staff staff2 = new api.Staff("", "");
        staff2.removeSubscription("Your cart is empty.");
        api.Item item5 = null;
        staff2.makeRequests(item5);
        api.PhysicalItem physicalItem7 = null;
        java.time.LocalDate localDate8 = null;
        api.Rental rental9 = new api.Rental((api.User) staff2, physicalItem7, localDate8);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        cart1.setDebugGraphicsOptions(10);
        api.SessionManager sessionManager4 = api.SessionManager.getInstance();
        api.Cart cart5 = sessionManager4.getCurrentCart();
        java.awt.event.ContainerListener containerListener6 = null;
        cart5.addContainerListener(containerListener6);
        boolean boolean8 = cart1.isFocusCycleRoot((java.awt.Container) cart5);
        api.SessionManager sessionManager9 = api.SessionManager.getInstance();
        api.Cart cart10 = sessionManager9.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI11 = cart10.getUI();
        cart10.doLayout();
        java.awt.event.HierarchyBoundsListener[] hierarchyBoundsListenerArray13 = cart10.getHierarchyBoundsListeners();
        cart10.firePropertyChange("hi!", (byte) 1, (byte) -1);
        java.awt.Insets insets18 = cart10.getInsets();
        java.beans.VetoableChangeListener[] vetoableChangeListenerArray19 = cart10.getVetoableChangeListeners();
        api.SessionManager sessionManager20 = api.SessionManager.getInstance();
        api.Cart cart21 = sessionManager20.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI22 = cart21.getUI();
        boolean boolean25 = cart21.inside(0, (int) (byte) 100);
        java.awt.Rectangle rectangle26 = cart21.bounds();
        cart10.setMixingCutoutShape((java.awt.Shape) rectangle26);
        java.awt.Rectangle rectangle28 = cart5.getBounds(rectangle26);
        boolean boolean29 = cart5.isFocusTraversalPolicySet();
        java.awt.event.MouseListener mouseListener30 = null;
        cart5.addMouseListener(mouseListener30);
        boolean boolean32 = cart5.isPaintingTile();
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertNotNull(sessionManager4);
        org.junit.Assert.assertNotNull(cart5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(sessionManager9);
        org.junit.Assert.assertNotNull(cart10);
        org.junit.Assert.assertNotNull(panelUI11);
        org.junit.Assert.assertNotNull(hierarchyBoundsListenerArray13);
        org.junit.Assert.assertNotNull(insets18);
        org.junit.Assert.assertNotNull(vetoableChangeListenerArray19);
        org.junit.Assert.assertNotNull(sessionManager20);
        org.junit.Assert.assertNotNull(cart21);
        org.junit.Assert.assertNotNull(panelUI22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(rectangle26);
        org.junit.Assert.assertNotNull(rectangle28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        int int4 = cart1.getBaseline(10, (int) '4');
        boolean boolean5 = cart1.isPaintingTile();
        boolean boolean6 = cart1.isDisplayable();
        cart1.firePropertyChange("PanelUI", true, false);
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI2 = cart1.getUI();
        cart1.doLayout();
        cart1.enableInputMethods(true);
        java.awt.Event event6 = null;
        boolean boolean9 = cart1.mouseExit(event6, 0, (int) (short) 1);
        java.awt.image.VolatileImage volatileImage12 = cart1.createVolatileImage(32, (int) (byte) -1);
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertNotNull(panelUI2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(volatileImage12);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI2 = cart1.getUI();
        boolean boolean5 = cart1.inside(0, (int) (byte) 100);
        java.awt.Rectangle rectangle6 = cart1.bounds();
        cart1.requestFocus();
        java.awt.Insets insets8 = cart1.getInsets();
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertNotNull(panelUI2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(rectangle6);
        org.junit.Assert.assertNotNull(insets8);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        api.Staff staff4 = new api.Staff("", "");
        api.Subscription subscription5 = null;
        staff4.addSubscription(subscription5);
        sessionManager0.loginUser((api.User) staff4);
        api.UserType userType8 = staff4.getUserType();
        java.lang.String str9 = staff4.getEmail();
        java.lang.String str10 = staff4.getEmail();
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertTrue("'" + userType8 + "' != '" + api.UserType.STAFF + "'", userType8.equals(api.UserType.STAFF));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        java.awt.event.ContainerListener containerListener2 = null;
        cart1.addContainerListener(containerListener2);
        cart1.resize((int) (short) 100, 100);
        java.lang.String str7 = cart1.getUIClassID();
        java.util.Locale locale8 = javax.swing.JComponent.getDefaultLocale();
        cart1.setLocale(locale8);
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "PanelUI" + "'", str7, "PanelUI");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en_CA");
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI2 = cart1.getUI();
        cart1.doLayout();
        cart1.enableInputMethods(true);
        java.awt.Event event6 = null;
        boolean boolean9 = cart1.mouseExit(event6, 0, (int) (short) 1);
        java.beans.PropertyChangeListener[] propertyChangeListenerArray10 = cart1.getPropertyChangeListeners();
        java.awt.event.ContainerListener[] containerListenerArray11 = cart1.getContainerListeners();
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertNotNull(panelUI2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray10);
        org.junit.Assert.assertNotNull(containerListenerArray11);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        boolean boolean2 = cart1.isBackgroundSet();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener3 = null;
        cart1.addHierarchyBoundsListener(hierarchyBoundsListener3);
        java.awt.event.MouseListener mouseListener5 = null;
        cart1.removeMouseListener(mouseListener5);
        cart1.setInheritsPopupMenu(false);
        javax.swing.KeyStroke keyStroke9 = null;
        java.awt.event.ActionListener actionListener10 = cart1.getActionForKeyStroke(keyStroke9);
        cart1.reshape((int) (short) -1, (int) (short) 0, (int) (byte) 100, 16);
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(actionListener10);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI2 = cart1.getUI();
        boolean boolean5 = cart1.inside(0, (int) (byte) 100);
        java.awt.event.FocusEvent.Cause cause6 = null;
        boolean boolean7 = cart1.requestFocusInWindow(cause6);
        cart1.setSize((int) (byte) -1, (int) '4');
        java.awt.Color color11 = cart1.getForeground();
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertNotNull(panelUI2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(color11);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI2 = cart1.getUI();
        cart1.firePropertyChange("hi!", (int) 'a', 1);
        java.awt.Rectangle rectangle7 = null;
        java.awt.Rectangle rectangle8 = cart1.getBounds(rectangle7);
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener9 = null;
        cart1.addHierarchyBoundsListener(hierarchyBoundsListener9);
        api.SessionManager sessionManager11 = api.SessionManager.getInstance();
        api.Cart cart12 = sessionManager11.getCurrentCart();
        cart12.show(true);
        java.awt.Event event15 = null;
        boolean boolean17 = cart12.action(event15, (java.lang.Object) 10);
        cart12.setVisible(false);
        boolean boolean20 = cart1.isAncestorOf((java.awt.Component) cart12);
        cart12.setSize(1, (int) (short) -1);
        java.beans.VetoableChangeListener vetoableChangeListener24 = null;
        cart12.addVetoableChangeListener(vetoableChangeListener24);
        boolean boolean26 = cart12.isManagingFocus();
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertNotNull(panelUI2);
        org.junit.Assert.assertNotNull(rectangle8);
        org.junit.Assert.assertNotNull(sessionManager11);
        org.junit.Assert.assertNotNull(cart12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI2 = cart1.getUI();
        api.SessionManager sessionManager3 = api.SessionManager.getInstance();
        api.Cart cart4 = sessionManager3.getCurrentCart();
        cart4.setDebugGraphicsOptions(10);
        api.SessionManager sessionManager7 = api.SessionManager.getInstance();
        api.Cart cart8 = sessionManager7.getCurrentCart();
        java.awt.event.ContainerListener containerListener9 = null;
        cart8.addContainerListener(containerListener9);
        boolean boolean11 = cart4.isFocusCycleRoot((java.awt.Container) cart8);
        javax.swing.JPopupMenu jPopupMenu12 = null;
        cart4.setComponentPopupMenu(jPopupMenu12);
        cart1.remove((java.awt.Component) cart4);
        cart4.repaint((long) 100);
        javax.swing.border.Border border17 = null;
        cart4.setBorder(border17);
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertNotNull(panelUI2);
        org.junit.Assert.assertNotNull(sessionManager3);
        org.junit.Assert.assertNotNull(cart4);
        org.junit.Assert.assertNotNull(sessionManager7);
        org.junit.Assert.assertNotNull(cart8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        api.Context context0 = new api.Context();
        api.PenaltyCalculation penaltyCalculation1 = new api.PenaltyCalculation();
        double double3 = penaltyCalculation1.calculatePenalty(1);
        context0.setPenaltyStrat((api.PenaltyCalculationStrategy) penaltyCalculation1);
        double double6 = context0.calculatePenalty(52);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.5d + "'", double3 == 0.5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 26.0d + "'", double6 == 26.0d);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI2 = cart1.getUI();
        cart1.doLayout();
        java.awt.event.HierarchyBoundsListener[] hierarchyBoundsListenerArray4 = cart1.getHierarchyBoundsListeners();
        cart1.firePropertyChange("hi!", (byte) 1, (byte) -1);
        java.awt.Insets insets9 = cart1.getInsets();
        cart1.setSize(128, (int) 'a');
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener13 = null;
        cart1.removeHierarchyBoundsListener(hierarchyBoundsListener13);
        java.awt.Point point15 = cart1.getMousePosition();
        java.awt.Rectangle rectangle16 = cart1.getVisibleRect();
        int int17 = cart1.getY();
        cart1.setInheritsPopupMenu(false);
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertNotNull(panelUI2);
        org.junit.Assert.assertNotNull(hierarchyBoundsListenerArray4);
        org.junit.Assert.assertNotNull(insets9);
        org.junit.Assert.assertNull(point15);
        org.junit.Assert.assertNotNull(rectangle16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        cart1.show(true);
        boolean boolean4 = cart1.isFocusTraversalPolicyProvider();
        int int5 = cart1.getWidth();
        api.SessionManager sessionManager6 = api.SessionManager.getInstance();
        api.Cart cart7 = sessionManager6.getCurrentCart();
        cart7.setDebugGraphicsOptions(10);
        api.SessionManager sessionManager10 = api.SessionManager.getInstance();
        api.Cart cart11 = sessionManager10.getCurrentCart();
        java.awt.event.ContainerListener containerListener12 = null;
        cart11.addContainerListener(containerListener12);
        boolean boolean14 = cart7.isFocusCycleRoot((java.awt.Container) cart11);
        api.SessionManager sessionManager15 = api.SessionManager.getInstance();
        api.Cart cart16 = sessionManager15.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI17 = cart16.getUI();
        cart16.doLayout();
        java.awt.event.HierarchyBoundsListener[] hierarchyBoundsListenerArray19 = cart16.getHierarchyBoundsListeners();
        cart16.firePropertyChange("hi!", (byte) 1, (byte) -1);
        java.awt.Insets insets24 = cart16.getInsets();
        java.beans.VetoableChangeListener[] vetoableChangeListenerArray25 = cart16.getVetoableChangeListeners();
        api.SessionManager sessionManager26 = api.SessionManager.getInstance();
        api.Cart cart27 = sessionManager26.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI28 = cart27.getUI();
        boolean boolean31 = cart27.inside(0, (int) (byte) 100);
        java.awt.Rectangle rectangle32 = cart27.bounds();
        cart16.setMixingCutoutShape((java.awt.Shape) rectangle32);
        java.awt.Rectangle rectangle34 = cart11.getBounds(rectangle32);
        boolean boolean35 = cart1.isFocusCycleRoot((java.awt.Container) cart11);
        cart1.layout();
        javax.swing.JRootPane jRootPane37 = cart1.getRootPane();
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 128 + "'", int5 == 128);
        org.junit.Assert.assertNotNull(sessionManager6);
        org.junit.Assert.assertNotNull(cart7);
        org.junit.Assert.assertNotNull(sessionManager10);
        org.junit.Assert.assertNotNull(cart11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(sessionManager15);
        org.junit.Assert.assertNotNull(cart16);
        org.junit.Assert.assertNotNull(panelUI17);
        org.junit.Assert.assertNotNull(hierarchyBoundsListenerArray19);
        org.junit.Assert.assertNotNull(insets24);
        org.junit.Assert.assertNotNull(vetoableChangeListenerArray25);
        org.junit.Assert.assertNotNull(sessionManager26);
        org.junit.Assert.assertNotNull(cart27);
        org.junit.Assert.assertNotNull(panelUI28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(rectangle32);
        org.junit.Assert.assertNotNull(rectangle34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(jRootPane37);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        cart1.show(true);
        java.awt.Event event4 = null;
        boolean boolean6 = cart1.action(event4, (java.lang.Object) 10);
        cart1.setVisible(false);
        java.awt.GraphicsConfiguration graphicsConfiguration9 = cart1.getGraphicsConfiguration();
        java.beans.PropertyChangeListener[] propertyChangeListenerArray10 = cart1.getPropertyChangeListeners();
        boolean boolean11 = cart1.isBackgroundSet();
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(graphicsConfiguration9);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        cart1.setDebugGraphicsOptions(10);
        api.SessionManager sessionManager4 = api.SessionManager.getInstance();
        api.Cart cart5 = sessionManager4.getCurrentCart();
        java.awt.event.ContainerListener containerListener6 = null;
        cart5.addContainerListener(containerListener6);
        boolean boolean8 = cart1.isFocusCycleRoot((java.awt.Container) cart5);
        javax.swing.JPopupMenu jPopupMenu9 = null;
        cart1.setComponentPopupMenu(jPopupMenu9);
        api.SessionManager sessionManager11 = api.SessionManager.getInstance();
        api.Cart cart12 = sessionManager11.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI13 = cart12.getUI();
        cart1.setUI(panelUI13);
        java.awt.event.MouseWheelListener[] mouseWheelListenerArray15 = cart1.getMouseWheelListeners();
        java.awt.event.ComponentListener componentListener16 = null;
        cart1.removeComponentListener(componentListener16);
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertNotNull(sessionManager4);
        org.junit.Assert.assertNotNull(cart5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(sessionManager11);
        org.junit.Assert.assertNotNull(cart12);
        org.junit.Assert.assertNotNull(panelUI13);
        org.junit.Assert.assertNotNull(mouseWheelListenerArray15);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        cart1.setDebugGraphicsOptions(10);
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        cart1.removePropertyChangeListener("PanelUI", propertyChangeListener5);
        int int7 = cart1.getY();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<java.awt.AWTKeyStroke> aWTKeyStrokeSet9 = cart1.getFocusTraversalKeys((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid focus traversal key identifier");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        cart1.show(true);
        boolean boolean4 = cart1.isFocusTraversalPolicyProvider();
        int int5 = cart1.getWidth();
        api.SessionManager sessionManager6 = api.SessionManager.getInstance();
        api.Cart cart7 = sessionManager6.getCurrentCart();
        cart7.setDebugGraphicsOptions(10);
        api.SessionManager sessionManager10 = api.SessionManager.getInstance();
        api.Cart cart11 = sessionManager10.getCurrentCart();
        java.awt.event.ContainerListener containerListener12 = null;
        cart11.addContainerListener(containerListener12);
        boolean boolean14 = cart7.isFocusCycleRoot((java.awt.Container) cart11);
        api.SessionManager sessionManager15 = api.SessionManager.getInstance();
        api.Cart cart16 = sessionManager15.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI17 = cart16.getUI();
        cart16.doLayout();
        java.awt.event.HierarchyBoundsListener[] hierarchyBoundsListenerArray19 = cart16.getHierarchyBoundsListeners();
        cart16.firePropertyChange("hi!", (byte) 1, (byte) -1);
        java.awt.Insets insets24 = cart16.getInsets();
        java.beans.VetoableChangeListener[] vetoableChangeListenerArray25 = cart16.getVetoableChangeListeners();
        api.SessionManager sessionManager26 = api.SessionManager.getInstance();
        api.Cart cart27 = sessionManager26.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI28 = cart27.getUI();
        boolean boolean31 = cart27.inside(0, (int) (byte) 100);
        java.awt.Rectangle rectangle32 = cart27.bounds();
        cart16.setMixingCutoutShape((java.awt.Shape) rectangle32);
        java.awt.Rectangle rectangle34 = cart11.getBounds(rectangle32);
        boolean boolean35 = cart1.isFocusCycleRoot((java.awt.Container) cart11);
        api.SessionManager sessionManager36 = api.SessionManager.getInstance();
        api.Cart cart37 = sessionManager36.getCurrentCart();
        java.awt.event.ContainerListener containerListener38 = null;
        cart37.addContainerListener(containerListener38);
        cart37.resize((int) (short) 100, 100);
        java.awt.event.MouseMotionListener[] mouseMotionListenerArray43 = cart37.getMouseMotionListeners();
        int int44 = cart37.getHeight();
        api.SessionManager sessionManager45 = api.SessionManager.getInstance();
        api.Cart cart46 = sessionManager45.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI47 = cart46.getUI();
        boolean boolean50 = cart46.inside(0, (int) (byte) 100);
        java.awt.event.FocusEvent.Cause cause51 = null;
        boolean boolean52 = cart46.requestFocusInWindow(cause51);
        java.awt.Insets insets53 = cart46.insets();
        java.awt.Graphics graphics54 = cart46.getGraphics();
        cart37.paintAll(graphics54);
        // The following exception was thrown during execution in test generation
        try {
            cart1.update(graphics54);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Graphics.setColor(java.awt.Color)\" because \"this.graphics\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 128 + "'", int5 == 128);
        org.junit.Assert.assertNotNull(sessionManager6);
        org.junit.Assert.assertNotNull(cart7);
        org.junit.Assert.assertNotNull(sessionManager10);
        org.junit.Assert.assertNotNull(cart11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(sessionManager15);
        org.junit.Assert.assertNotNull(cart16);
        org.junit.Assert.assertNotNull(panelUI17);
        org.junit.Assert.assertNotNull(hierarchyBoundsListenerArray19);
        org.junit.Assert.assertNotNull(insets24);
        org.junit.Assert.assertNotNull(vetoableChangeListenerArray25);
        org.junit.Assert.assertNotNull(sessionManager26);
        org.junit.Assert.assertNotNull(cart27);
        org.junit.Assert.assertNotNull(panelUI28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(rectangle32);
        org.junit.Assert.assertNotNull(rectangle34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(sessionManager36);
        org.junit.Assert.assertNotNull(cart37);
        org.junit.Assert.assertNotNull(mouseMotionListenerArray43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 100 + "'", int44 == 100);
        org.junit.Assert.assertNotNull(sessionManager45);
        org.junit.Assert.assertNotNull(cart46);
        org.junit.Assert.assertNotNull(panelUI47);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(insets53);
        org.junit.Assert.assertNotNull(graphics54);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        cart1.setDebugGraphicsOptions(10);
        api.SessionManager sessionManager4 = api.SessionManager.getInstance();
        api.Cart cart5 = sessionManager4.getCurrentCart();
        java.awt.event.ContainerListener containerListener6 = null;
        cart5.addContainerListener(containerListener6);
        boolean boolean8 = cart1.isFocusCycleRoot((java.awt.Container) cart5);
        java.beans.VetoableChangeListener[] vetoableChangeListenerArray9 = cart5.getVetoableChangeListeners();
        boolean boolean10 = javax.swing.JComponent.isLightweightComponent((java.awt.Component) cart5);
        cart5.firePropertyChange("", (float) 16, (float) ' ');
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertNotNull(sessionManager4);
        org.junit.Assert.assertNotNull(cart5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(vetoableChangeListenerArray9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI2 = cart1.getUI();
        cart1.firePropertyChange("hi!", (int) 'a', 1);
        java.awt.Rectangle rectangle7 = null;
        java.awt.Rectangle rectangle8 = cart1.getBounds(rectangle7);
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener9 = null;
        cart1.addHierarchyBoundsListener(hierarchyBoundsListener9);
        api.SessionManager sessionManager11 = api.SessionManager.getInstance();
        api.Cart cart12 = sessionManager11.getCurrentCart();
        cart12.show(true);
        java.awt.Event event15 = null;
        boolean boolean17 = cart12.action(event15, (java.lang.Object) 10);
        cart12.setVisible(false);
        boolean boolean20 = cart1.isAncestorOf((java.awt.Component) cart12);
        boolean boolean21 = cart12.isOpaque();
        cart12.reshape((int) '4', (int) ' ', (int) (byte) -1, (int) (byte) -1);
        api.SessionManager sessionManager27 = api.SessionManager.getInstance();
        api.Cart cart28 = sessionManager27.getCurrentCart();
        cart28.setDebugGraphicsOptions(10);
        api.SessionManager sessionManager31 = api.SessionManager.getInstance();
        api.Cart cart32 = sessionManager31.getCurrentCart();
        java.awt.event.ContainerListener containerListener33 = null;
        cart32.addContainerListener(containerListener33);
        boolean boolean35 = cart28.isFocusCycleRoot((java.awt.Container) cart32);
        java.beans.VetoableChangeListener vetoableChangeListener36 = null;
        cart28.addVetoableChangeListener(vetoableChangeListener36);
        cart28.reshape((int) (byte) -1, 8, 0, (int) (short) -1);
        api.SessionManager sessionManager43 = api.SessionManager.getInstance();
        api.Cart cart44 = sessionManager43.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI45 = cart44.getUI();
        boolean boolean48 = cart44.inside(0, (int) (byte) 100);
        boolean boolean49 = cart44.isOptimizedDrawingEnabled();
        boolean boolean50 = cart44.isMaximumSizeSet();
        javax.accessibility.AccessibleContext accessibleContext51 = cart44.getAccessibleContext();
        java.awt.Rectangle rectangle52 = cart44.getVisibleRect();
        cart28.computeVisibleRect(rectangle52);
        cart12.scrollRectToVisible(rectangle52);
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertNotNull(panelUI2);
        org.junit.Assert.assertNotNull(rectangle8);
        org.junit.Assert.assertNotNull(sessionManager11);
        org.junit.Assert.assertNotNull(cart12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(sessionManager27);
        org.junit.Assert.assertNotNull(cart28);
        org.junit.Assert.assertNotNull(sessionManager31);
        org.junit.Assert.assertNotNull(cart32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(sessionManager43);
        org.junit.Assert.assertNotNull(cart44);
        org.junit.Assert.assertNotNull(panelUI45);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(accessibleContext51);
        org.junit.Assert.assertNotNull(rectangle52);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI2 = cart1.getUI();
        cart1.firePropertyChange("hi!", (int) 'a', 1);
        java.awt.Rectangle rectangle7 = null;
        java.awt.Rectangle rectangle8 = cart1.getBounds(rectangle7);
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener9 = null;
        cart1.addHierarchyBoundsListener(hierarchyBoundsListener9);
        api.SessionManager sessionManager11 = api.SessionManager.getInstance();
        api.Cart cart12 = sessionManager11.getCurrentCart();
        cart12.show(true);
        java.awt.Event event15 = null;
        boolean boolean17 = cart12.action(event15, (java.lang.Object) 10);
        cart12.setVisible(false);
        boolean boolean20 = cart1.isAncestorOf((java.awt.Component) cart12);
        boolean boolean21 = cart12.isOpaque();
        java.awt.event.MouseWheelListener[] mouseWheelListenerArray22 = cart12.getMouseWheelListeners();
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertNotNull(panelUI2);
        org.junit.Assert.assertNotNull(rectangle8);
        org.junit.Assert.assertNotNull(sessionManager11);
        org.junit.Assert.assertNotNull(cart12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(mouseWheelListenerArray22);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        int int0 = javax.swing.JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI2 = cart1.getUI();
        cart1.doLayout();
        java.awt.event.HierarchyBoundsListener[] hierarchyBoundsListenerArray4 = cart1.getHierarchyBoundsListeners();
        cart1.firePropertyChange("hi!", (byte) 1, (byte) -1);
        java.awt.Insets insets9 = cart1.getInsets();
        cart1.setSize(128, (int) 'a');
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener13 = null;
        cart1.removeHierarchyBoundsListener(hierarchyBoundsListener13);
        java.awt.event.HierarchyListener hierarchyListener15 = null;
        cart1.addHierarchyListener(hierarchyListener15);
        cart1.validate();
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertNotNull(panelUI2);
        org.junit.Assert.assertNotNull(hierarchyBoundsListenerArray4);
        org.junit.Assert.assertNotNull(insets9);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        java.awt.event.ContainerListener containerListener2 = null;
        cart1.addContainerListener(containerListener2);
        cart1.resize((int) (short) 100, 100);
        java.awt.event.MouseMotionListener[] mouseMotionListenerArray7 = cart1.getMouseMotionListeners();
        cart1.removeAll();
        api.SessionManager sessionManager9 = api.SessionManager.getInstance();
        api.Cart cart10 = sessionManager9.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI11 = cart10.getUI();
        int int12 = cart1.getComponentZOrder((java.awt.Component) cart10);
        boolean boolean13 = cart10.isVisible();
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertNotNull(mouseMotionListenerArray7);
        org.junit.Assert.assertNotNull(sessionManager9);
        org.junit.Assert.assertNotNull(cart10);
        org.junit.Assert.assertNotNull(panelUI11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        java.awt.event.ContainerListener containerListener2 = null;
        cart1.addContainerListener(containerListener2);
        cart1.resize((int) (short) 100, 100);
        java.awt.event.MouseMotionListener[] mouseMotionListenerArray7 = cart1.getMouseMotionListeners();
        float float8 = cart1.getAlignmentX();
        java.lang.Object obj9 = cart1.getTreeLock();
        cart1.setFocusCycleRoot(false);
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertNotNull(mouseMotionListenerArray7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.5f + "'", float8 == 0.5f);
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI2 = cart1.getUI();
        boolean boolean5 = cart1.inside(0, (int) (byte) 100);
        boolean boolean6 = cart1.isOptimizedDrawingEnabled();
        boolean boolean7 = cart1.isMaximumSizeSet();
        api.Item item8 = cart1.getLastAdded();
        cart1.setSize((int) (short) 1, (int) 'a');
        cart1.show();
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertNotNull(panelUI2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(item8);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI2 = cart1.getUI();
        cart1.firePropertyChange("hi!", (int) 'a', 1);
        java.awt.Rectangle rectangle7 = null;
        java.awt.Rectangle rectangle8 = cart1.getBounds(rectangle7);
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener9 = null;
        cart1.addHierarchyBoundsListener(hierarchyBoundsListener9);
        java.lang.String str11 = cart1.displayCart();
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertNotNull(panelUI2);
        org.junit.Assert.assertNotNull(rectangle8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Your cart is empty." + "'", str11, "Your cart is empty.");
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        boolean boolean2 = cart1.isBackgroundSet();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener3 = null;
        cart1.addHierarchyBoundsListener(hierarchyBoundsListener3);
        java.awt.Image image7 = cart1.createImage((int) '#', (-1));
        java.util.Locale locale8 = null;
        cart1.setLocale(locale8);
        java.awt.event.MouseWheelListener[] mouseWheelListenerArray10 = cart1.getMouseWheelListeners();
        java.awt.Point point11 = cart1.getMousePosition();
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(image7);
        org.junit.Assert.assertNotNull(mouseWheelListenerArray10);
        org.junit.Assert.assertNull(point11);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        api.Faculty faculty2 = new api.Faculty("PanelUI", "PanelUI");
        java.util.ArrayList<api.Request> requestList3 = faculty2.requests();
        org.junit.Assert.assertNotNull(requestList3);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI2 = cart1.getUI();
        cart1.firePropertyChange("hi!", (int) 'a', 1);
        java.awt.Rectangle rectangle7 = null;
        java.awt.Rectangle rectangle8 = cart1.getBounds(rectangle7);
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener9 = null;
        cart1.addHierarchyBoundsListener(hierarchyBoundsListener9);
        api.Item item11 = null;
        cart1.addItem(item11, (int) 'a');
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertNotNull(panelUI2);
        org.junit.Assert.assertNotNull(rectangle8);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI2 = cart1.getUI();
        cart1.firePropertyChange("hi!", (int) 'a', 1);
        java.awt.Rectangle rectangle7 = null;
        java.awt.Rectangle rectangle8 = cart1.getBounds(rectangle7);
        boolean boolean9 = cart1.isOptimizedDrawingEnabled();
        cart1.setVerifyInputWhenFocusTarget(false);
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertNotNull(panelUI2);
        org.junit.Assert.assertNotNull(rectangle8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        api.Staff staff2 = new api.Staff("", "");
        api.Subscription subscription3 = null;
        staff2.addSubscription(subscription3);
        java.lang.String str5 = staff2.getEmail();
        api.PhysicalItem physicalItem6 = null;
        java.time.LocalDate localDate7 = null;
        api.Rental rental8 = new api.Rental((api.User) staff2, physicalItem6, localDate7);
        java.util.ArrayList<api.Subscription> subscriptionList9 = staff2.getSubscriptions();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(subscriptionList9);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        cart1.show(true);
        boolean boolean4 = cart1.isFocusTraversalPolicyProvider();
        int int5 = cart1.getWidth();
        api.SessionManager sessionManager6 = api.SessionManager.getInstance();
        api.Cart cart7 = sessionManager6.getCurrentCart();
        cart7.setDebugGraphicsOptions(10);
        api.SessionManager sessionManager10 = api.SessionManager.getInstance();
        api.Cart cart11 = sessionManager10.getCurrentCart();
        java.awt.event.ContainerListener containerListener12 = null;
        cart11.addContainerListener(containerListener12);
        boolean boolean14 = cart7.isFocusCycleRoot((java.awt.Container) cart11);
        api.SessionManager sessionManager15 = api.SessionManager.getInstance();
        api.Cart cart16 = sessionManager15.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI17 = cart16.getUI();
        cart16.doLayout();
        java.awt.event.HierarchyBoundsListener[] hierarchyBoundsListenerArray19 = cart16.getHierarchyBoundsListeners();
        cart16.firePropertyChange("hi!", (byte) 1, (byte) -1);
        java.awt.Insets insets24 = cart16.getInsets();
        java.beans.VetoableChangeListener[] vetoableChangeListenerArray25 = cart16.getVetoableChangeListeners();
        api.SessionManager sessionManager26 = api.SessionManager.getInstance();
        api.Cart cart27 = sessionManager26.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI28 = cart27.getUI();
        boolean boolean31 = cart27.inside(0, (int) (byte) 100);
        java.awt.Rectangle rectangle32 = cart27.bounds();
        cart16.setMixingCutoutShape((java.awt.Shape) rectangle32);
        java.awt.Rectangle rectangle34 = cart11.getBounds(rectangle32);
        boolean boolean35 = cart1.isFocusCycleRoot((java.awt.Container) cart11);
        java.awt.Dimension dimension36 = null;
        // The following exception was thrown during execution in test generation
        try {
            cart11.resize(dimension36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"width\" because \"d\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(sessionManager6);
        org.junit.Assert.assertNotNull(cart7);
        org.junit.Assert.assertNotNull(sessionManager10);
        org.junit.Assert.assertNotNull(cart11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(sessionManager15);
        org.junit.Assert.assertNotNull(cart16);
        org.junit.Assert.assertNotNull(panelUI17);
        org.junit.Assert.assertNotNull(hierarchyBoundsListenerArray19);
        org.junit.Assert.assertNotNull(insets24);
        org.junit.Assert.assertNotNull(vetoableChangeListenerArray25);
        org.junit.Assert.assertNotNull(sessionManager26);
        org.junit.Assert.assertNotNull(cart27);
        org.junit.Assert.assertNotNull(panelUI28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(rectangle32);
        org.junit.Assert.assertNotNull(rectangle34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        cart1.show(true);
        boolean boolean4 = cart1.isFocusTraversalPolicyProvider();
        java.awt.Point point5 = cart1.getLocation();
        float float6 = cart1.getAlignmentX();
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(point5);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.5f + "'", float6 == 0.5f);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI2 = cart1.getUI();
        boolean boolean5 = cart1.inside(0, (int) (byte) 100);
        boolean boolean6 = cart1.isOptimizedDrawingEnabled();
        boolean boolean7 = cart1.isMaximumSizeSet();
        java.awt.event.MouseWheelListener[] mouseWheelListenerArray8 = cart1.getMouseWheelListeners();
        java.awt.event.MouseEvent mouseEvent9 = null;
        java.awt.Point point10 = cart1.getPopupLocation(mouseEvent9);
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertNotNull(panelUI2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(mouseWheelListenerArray8);
        org.junit.Assert.assertNull(point10);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI2 = cart1.getUI();
        cart1.doLayout();
        cart1.resetKeyboardActions();
        api.SessionManager sessionManager5 = api.SessionManager.getInstance();
        api.Cart cart6 = sessionManager5.getCurrentCart();
        cart6.setDebugGraphicsOptions(10);
        api.SessionManager sessionManager9 = api.SessionManager.getInstance();
        api.Cart cart10 = sessionManager9.getCurrentCart();
        java.awt.event.ContainerListener containerListener11 = null;
        cart10.addContainerListener(containerListener11);
        boolean boolean13 = cart6.isFocusCycleRoot((java.awt.Container) cart10);
        javax.swing.JPopupMenu jPopupMenu14 = null;
        cart6.setComponentPopupMenu(jPopupMenu14);
        api.SessionManager sessionManager16 = api.SessionManager.getInstance();
        api.Cart cart17 = sessionManager16.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI18 = cart17.getUI();
        cart6.setUI(panelUI18);
        cart1.setUI(panelUI18);
        javax.swing.TransferHandler transferHandler21 = cart1.getTransferHandler();
        cart1.move(100, 8);
        boolean boolean25 = cart1.isRequestFocusEnabled();
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertNotNull(panelUI2);
        org.junit.Assert.assertNotNull(sessionManager5);
        org.junit.Assert.assertNotNull(cart6);
        org.junit.Assert.assertNotNull(sessionManager9);
        org.junit.Assert.assertNotNull(cart10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(sessionManager16);
        org.junit.Assert.assertNotNull(cart17);
        org.junit.Assert.assertNotNull(panelUI18);
        org.junit.Assert.assertNull(transferHandler21);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        api.SubscriptionData subscriptionData0 = new api.SubscriptionData();
        subscriptionData0.logoutUser();
        api.User user2 = subscriptionData0.getUser();
        subscriptionData0.removeSubscription("");
        api.User user5 = subscriptionData0.getUser();
        org.junit.Assert.assertNull(user2);
        org.junit.Assert.assertNull(user5);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        boolean boolean2 = cart1.isBackgroundSet();
        java.awt.event.MouseMotionListener mouseMotionListener3 = null;
        cart1.addMouseMotionListener(mouseMotionListener3);
        javax.accessibility.AccessibleContext accessibleContext5 = cart1.getAccessibleContext();
        java.awt.Event event6 = null;
        boolean boolean9 = cart1.mouseUp(event6, 1, 52);
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(accessibleContext5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI2 = cart1.getUI();
        cart1.doLayout();
        cart1.enableInputMethods(true);
        java.awt.Event event6 = null;
        boolean boolean9 = cart1.mouseExit(event6, 0, (int) (short) 1);
        api.SessionManager sessionManager10 = api.SessionManager.getInstance();
        api.Cart cart11 = sessionManager10.getCurrentCart();
        cart11.show(true);
        boolean boolean14 = cart11.isFocusTraversalPolicyProvider();
        java.awt.Point point15 = cart11.getLocation();
        boolean boolean16 = cart1.contains(point15);
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertNotNull(panelUI2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(sessionManager10);
        org.junit.Assert.assertNotNull(cart11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(point15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        api.SessionManager sessionManager0 = api.SessionManager.getInstance();
        api.Cart cart1 = sessionManager0.getCurrentCart();
        javax.swing.plaf.PanelUI panelUI2 = cart1.getUI();
        boolean boolean3 = cart1.getAutoscrolls();
        org.junit.Assert.assertNotNull(sessionManager0);
        org.junit.Assert.assertNotNull(cart1);
        org.junit.Assert.assertNotNull(panelUI2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }
}
