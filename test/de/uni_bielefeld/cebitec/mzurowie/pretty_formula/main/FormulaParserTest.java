package de.uni_bielefeld.cebitec.mzurowie.pretty_formula.main;

import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author martin
 */
public class FormulaParserTest {
   String formula;
   String expResult;
   

   public FormulaParserTest() {
      this.formula = "";
      this.expResult = "";
   }

   @Before
   public void setUp() throws Exception {
      this.formula = "";
      this.expResult = "";
   }
   
   @Test
   public void testSimple() {
      this.formula = "a+b";
      this.expResult = "a+b";
      this.doTest();
      this.formula = "a-b";
      this.expResult = "a-b";
      this.doTest();
   }
   
   @Test
   public void testVariable() {
      this.formula = "a";
      this.expResult = "a";
      this.doTest();
   }
   
   @Test
   public void testNegativeVariable() {
      this.formula = "(-a)";
      this.expResult = "(-a)";
      this.doTest();
      this.formula = "(-a_b_hello)";
      this.expResult = "(-{a}_{b}_{hello})";
      this.doTest();
   }
   
   @Test
   public void testFrac() {
      this.formula = "a/b/c";
      this.expResult = "\\frac{\\frac{a}{b}}{c}";
      this.doTest();
   }
   
   @Test
   public void testCdot() {
      this.formula = "a*b";
      this.expResult = "a\\cdot b";
      this.doTest();
   }
   
   @Test
   public void testPow() {
      this.formula = "a^b^c";
      this.expResult = "a^{b}^{c}";
      this.doTest();
   }
   
   @Test
   public void testSqrt() {
      this.formula = "sqrt(a)";
      this.expResult = "\\sqrt{a}";
      this.doTest();
   }
   
   @Test(expected = DetailedParseCancellationException.class)
   public void testSqrtMultipleArguments() {
      this.formula = "sqrt(a,b,c)";
      this.expResult = "the exception is thrown";
      this.doTest();
   }
   
   @Test
   public void testSin() {
      this.formula = "sin(a)";
      this.expResult = "\\sin{(a)}";
      this.doTest();
   }
   
   @Test(expected = DetailedParseCancellationException.class)
   public void testSinMultipleArguments() {
      this.formula = "sin(a,b,c)";
      this.expResult = "the exception is thrown";
      this.doTest();
   }
   
   @Test
   public void testCos() {
      this.formula = "cos(a)";
      this.expResult = "\\cos{(a)}";
      this.doTest();
   }
   
   @Test(expected = DetailedParseCancellationException.class)
   public void testCosMultipleArguments() {
      this.formula = "cos(a,b,c)";
      this.expResult = "the exception is thrown";
      this.doTest();
   }
   
   @Test
   public void testTan() {
      this.formula = "tan(a)";
      this.expResult = "\\tan{(a)}";
      this.doTest();
   }
   
   @Test(expected = DetailedParseCancellationException.class)
   public void testTanMultipleArguments() {
      this.formula = "tan(a,b,c)";
      this.expResult = "the exception is thrown";
      this.doTest();
   }
   
   @Test
   public void testAbs() {
      this.formula = "abs(a)";
      this.expResult = "\\abs{(a)}";
      this.doTest();
   }
   
   @Test(expected = DetailedParseCancellationException.class)
   public void testAbsMultipleArguments() {
      this.formula = "abs(a,b,c)";
      this.expResult = "the exception is thrown";
      this.doTest();
   }
   
   @Test
   public void testMin() {
      this.formula = "min(a, b, c)";
      this.expResult = "\\min{(a,b,c)}";
      this.doTest();
   }
   
   @Test
   public void testMax() {
      this.formula = "max(a, b, c)";
      this.expResult = "\\max{(a,b,c)}";
      this.doTest();
   }
   
   @Test
   public void testFunction() {
      this.formula = "func(a)";
      this.expResult = "func(a)";
      this.doTest();
   }
   
   @Test
   public void testFunctionMultipleParameters() {
      this.formula = "func(a, b, c)";
      this.expResult = "func(a,b,c)";
      this.doTest();
   }
   
   @Test
   public void testPriorityPlusFrac() {
      this.formula = "a+b/c";
      this.expResult = "a+\\frac{b}{c}";
      this.doTest();
   }
   
   @Test
   public void testPriorityFracPow() {
      this.formula = "a/b^c";
      this.expResult = "\\frac{a}{b^{c}}";
      this.doTest();
   }
   
   @Test
   public void testPriorityMultDiv() {
      this.formula = "a/b*c/e";
      this.expResult = "\\frac{a}{b}\\cdot \\frac{c}{e}";
      this.doTest();
   }
   
   @Test
   public void testLodash() {
      this.formula = "a_bc_de_fg";
      this.expResult = "{a}_{bc}_{de}_{fg}";
      this.doTest();
   }
   
   @Test(expected = ParseCancellationException.class)
   public void testNoViableAlternativeException() {
      this.formula = "a+";
      this.expResult = "the exception is thrown";
      this.doTest();
   }
   
   @Test(expected = ParseCancellationException.class)
   public void testMissingToken() {
      this.formula = "(a+b";
      this.expResult = "the exception is thrown";
      this.doTest();
   }
   
   @Test(expected = ParseCancellationException.class)
   public void testUnwantedToken() {
      this.formula = "a-a)";
      this.expResult = "the exception is thrown";
      this.doTest();
   }
   
   private void doTest() {
      assertEquals(this.expResult, FormulaParser.parseToLatex(formula));
   }
   
}