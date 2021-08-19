package exemplo_exception;

public class ValorMenorQueOPermitidoException extends Exception{
    ValorMenorQueOPermitidoException(String str){
        super(str);
    }
}