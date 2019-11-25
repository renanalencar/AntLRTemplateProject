// Generated from c:\Users\renan\OneDrive\Documents\workspace\SimpleCalcVsCode\src\SimpleCalc.g4 by ANTLR 4.7.1
package grammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SimpleCalcParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SimpleCalcVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SimpleCalcParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(SimpleCalcParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleCalcParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(SimpleCalcParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleCalcParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(SimpleCalcParser.NumberContext ctx);
}