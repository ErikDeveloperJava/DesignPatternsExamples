package design.pattern.test.behavior_patterns.state;

import java.io.*;

/**
 * Through State pattern can change state in Object
**/
public class ReaderObject {

    private ReaderState readerState = ReaderState.CHAR_ARRAY;
    private String fileName;

    public void setReaderState(ReaderState readerState) {
        this.readerState = readerState;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public void read(){
        try {
            int read = getReader().read();
            System.out.println(read);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Reader getReader(){
        if(readerState == ReaderState.CHAR_ARRAY){
            return new CharArrayReader(new char[12]);
        }else {
            try {
                return new FileReader(fileName);
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
