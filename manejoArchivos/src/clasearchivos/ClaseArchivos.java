/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasearchivos;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;
import javax.lang.model.SourceVersion;
import javax.tools.DiagnosticListener;
import javax.tools.JavaCompiler;
import javax.tools.JavaFileManager;
import javax.tools.JavaFileObject;
import javax.tools.StandardJavaFileManager;

/**
 *
 * @author Estudiante
 */
public class ClaseArchivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        //Se crea 
//        File archivo = new File("hamlet.txt");
//        Scanner input = new Scanner(archivo);
//        File archivo2 = new File("temp.txt");
//        archivo2.createNewFile();
//        PrintStream output = new PrintStream(archivo2);
//        while (input.hasNext()){
//            output.print(input.next());
//            output.print('\n');
//        }
//        input.close();
//        output.close();
//        boolean bool = false;
//        try {
//            archivo.delete();
//            bool = archivo2.renameTo(archivo);
//        } catch (SecurityException e) {
//            System.out.println("ocurrio error");
//        }
//        if(bool){
//            System.out.println("Cambio de nombre");
//        } else {
//            System.out.println("nel");
//        }

        //Se crea el archivo hamlet2.txt y luego se escribe encima
//        File newfile = new File("hamlet2.txt");
//        PrintStream out = new PrintStream(newfile);
//        out.print("Se creo el archivo solito :'D");
    }
}
