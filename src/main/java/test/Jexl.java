package test;

import org.apache.commons.jexl.Expression;
import org.apache.commons.jexl.ExpressionFactory;
import org.apache.commons.jexl.JexlContext;
import org.apache.commons.jexl.JexlHelper;

public class Jexl {
	
	
	public static void main(String args[]) {

	    Integer a = Integer.valueOf (330);
	    Integer b = Integer.valueOf (250);
	    JexlContext jc = JexlHelper.createContext();
	    jc.getVars().put("a", 1);
	    jc.getVars().put("b", 2);
	    jc.getVars().put("c", 4);
	    jc.getVars().put("d", 2);
	    try {
	      Expression e = ExpressionFactory.createExpression("((c+a)-d)/b");
	      Object o = e.evaluate(jc);
	      //assertEquals(o, Long.valueOf(13));
	      System.out.println(o.toString());
	      System.out.println("JEXL library test ok");
	    } catch (Exception e) {
	      e.printStackTrace();
	     // throw (e);
	    }
	  }
	}

