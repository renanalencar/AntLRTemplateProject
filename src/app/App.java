/***
 * Excerpted from "The Definitive ANTLR 4 Reference",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/tpantlr2 for more book information.
***/

package app;

import java.util.Arrays;

import javax.swing.JFrame;
import javax.swing.JPanel;

import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.*;
import grammar.*;

/* Class App
** @author: renanalencar
*/

public class App {
	public static void main(String[] args) throws Exception {
        
        // cria um CharStream que lê da entrada padrão
        CharStream input = CharStreams.fromFileName(args[0]);

        // crie um lexer que se alimenta da entrada CharStream
        SimpleCalcLexer lexer = new SimpleCalcLexer(input);
        
        // crie um buffer de tokens retirados do lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        
        // crie um analisador que se alimenta do buffer de tokens
        SimpleCalcParser parser = new SimpleCalcParser(tokens);
        
        // constroi a árvore sintática do analisador sintático
        parser.setBuildParseTree(true);
        
        // começa a analisar pela regra inicial (ver arquivo SimpleCalc.g4 para saber a regra inicial)
        RuleContext tree = parser.expr();
        
        // mostra Árvore Sintática (AST) em GUI
        JFrame frame = new JFrame("AntLR AST");
        JPanel panel = new JPanel();
        TreeViewer viewr = new TreeViewer(Arrays.asList(parser.getRuleNames()),tree);
        
        // diminui a escala um pouco
        viewr.setScale(1.5);
        panel.add(viewr);
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200,200);
        frame.setVisible(true);
        
        // mostra Árvore Sintática (AST) no terminal
        System.out.println("Imprimindo árvore sintática no terminal...");
        System.out.println(tree.toStringTree(parser));

    }
    
}
