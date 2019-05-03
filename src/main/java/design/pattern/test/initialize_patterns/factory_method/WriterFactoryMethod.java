package design.pattern.test.initialize_patterns.factory_method;

import com.sun.xml.internal.stream.writers.XMLWriter;

import java.io.CharArrayWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * Factory method can return one of the child of parent class depend some parameter
 **/
public class WriterFactoryMethod {

    public Writer getWriter(ReaderStatus readerStatus,String fileName) throws IOException {
        switch (readerStatus){
            case XML:
                return new XMLWriter(new FileWriter(fileName));
            case FILE:
                return new FileWriter(fileName);
            default:
                return new CharArrayWriter();
        }
    }
}
