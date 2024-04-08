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
        int int0 = javax.swing.JComponent.WHEN_FOCUSED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        int int0 = java.awt.image.ImageObserver.SOMEBITS;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
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
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        api.ItemAttributesBuilder itemAttributesBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            api.ItemAttributes itemAttributes1 = new api.ItemAttributes(itemAttributesBuilder0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"name\" because \"builder\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        float float0 = java.awt.Component.CENTER_ALIGNMENT;
        org.junit.Assert.assertTrue("'" + float0 + "' != '" + 0.5f + "'", float0 == 0.5f);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        java.awt.Component component0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean1 = javax.swing.JComponent.isLightweightComponent(component0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"peer\" because \"comp\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        int int0 = java.awt.image.ImageObserver.ABORT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 128 + "'", int0 == 128);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        int int0 = javax.swing.JComponent.UNDEFINED_CONDITION;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + (-1) + "'", int0 == (-1));
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        float float0 = java.awt.Component.BOTTOM_ALIGNMENT;
        org.junit.Assert.assertTrue("'" + float0 + "' != '" + 1.0f + "'", float0 == 1.0f);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        int int0 = javax.swing.JComponent.WHEN_IN_FOCUSED_WINDOW;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
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
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        api.User user0 = null;
        api.PhysicalItem physicalItem1 = null;
        java.time.LocalDate localDate2 = null;
        api.Rental rental3 = new api.Rental(user0, physicalItem1, localDate2);
        java.lang.Class<?> wildcardClass4 = rental3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        api.Subscription subscription0 = new api.Subscription();
        java.lang.String str1 = subscription0.getServiceName();
        boolean boolean2 = subscription0.isActive();
        java.lang.Class<?> wildcardClass3 = subscription0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        api.Subscription subscription2 = new api.Subscription("hi!", true);
        boolean boolean3 = subscription2.isActive();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        api.User user0 = null;
        api.PhysicalItem physicalItem1 = null;
        java.time.LocalDate localDate2 = null;
        api.Rental rental3 = new api.Rental(user0, physicalItem1, localDate2);
        api.User user4 = rental3.getUser();
        org.junit.Assert.assertNull(user4);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
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
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        int int0 = java.awt.image.ImageObserver.WIDTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        api.Subscription subscription2 = new api.Subscription("hi!", false);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        api.CartCaretaker cartCaretaker0 = new api.CartCaretaker();
        api.Cart cart1 = null;
        cartCaretaker0.undo(cart1);
        api.Cart cart3 = null;
        // The following exception was thrown during execution in test generation
        try {
            cartCaretaker0.save(cart3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"api.Cart.save()\" because \"cart\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        api.ItemAttributes itemAttributes0 = null;
        // The following exception was thrown during execution in test generation
        try {
            api.Book book1 = new api.Book(itemAttributes0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"api.ItemAttributes.getName()\" because \"builder\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        api.ItemAttributesBuilder itemAttributesBuilder0 = new api.ItemAttributesBuilder();
        api.ItemAttributesBuilder itemAttributesBuilder2 = itemAttributesBuilder0.setName("hi!");
        api.ItemAttributesBuilder itemAttributesBuilder4 = itemAttributesBuilder2.setID(8);
        org.junit.Assert.assertNotNull(itemAttributesBuilder2);
        org.junit.Assert.assertNotNull(itemAttributesBuilder4);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        int int0 = javax.swing.JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        api.ItemAttributes itemAttributes0 = null;
        // The following exception was thrown during execution in test generation
        try {
            api.Textbook textbook1 = new api.Textbook(itemAttributes0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"api.ItemAttributes.getName()\" because \"builder\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        java.lang.String str0 = javax.swing.JComponent.TOOL_TIP_TEXT_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "ToolTipText" + "'", str0, "ToolTipText");
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        int int0 = java.awt.image.ImageObserver.FRAMEBITS;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 16 + "'", int0 == 16);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        int int0 = java.awt.image.ImageObserver.ALLBITS;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 32 + "'", int0 == 32);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        java.util.Locale locale0 = javax.swing.JComponent.getDefaultLocale();
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_CA");
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        api.ItemAttributesBuilder itemAttributesBuilder0 = new api.ItemAttributesBuilder();
        api.ItemAttributesBuilder itemAttributesBuilder2 = itemAttributesBuilder0.setISBN("");
        org.junit.Assert.assertNotNull(itemAttributesBuilder2);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        api.ItemAttributesBuilder itemAttributesBuilder0 = new api.ItemAttributesBuilder();
        api.ItemAttributesBuilder itemAttributesBuilder2 = itemAttributesBuilder0.setPrice((double) 2);
        api.ItemType itemType3 = null;
        api.ItemAttributesBuilder itemAttributesBuilder4 = itemAttributesBuilder2.setType(itemType3);
        org.junit.Assert.assertNotNull(itemAttributesBuilder2);
        org.junit.Assert.assertNotNull(itemAttributesBuilder4);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        api.User user0 = null;
        api.PhysicalItem physicalItem1 = null;
        java.time.LocalDate localDate2 = null;
        api.Rental rental3 = new api.Rental(user0, physicalItem1, localDate2);
        api.PhysicalItem physicalItem4 = rental3.getItem();
        java.time.LocalDate localDate5 = rental3.getDueDate();
        org.junit.Assert.assertNull(physicalItem4);
        org.junit.Assert.assertNull(localDate5);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        api.CartCaretaker cartCaretaker0 = new api.CartCaretaker();
        api.Cart cart1 = null;
        cartCaretaker0.undo(cart1);
        api.Cart cart3 = null;
        cartCaretaker0.undo(cart3);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        api.ItemAttributes itemAttributes0 = null;
        // The following exception was thrown during execution in test generation
        try {
            api.CD cD1 = new api.CD(itemAttributes0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"api.ItemAttributes.getName()\" because \"builder\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }
}

