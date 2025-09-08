package br.cefetmg.inf.lab20250901;

import javax.management.RuntimeErrorException;

public class ForaDosLimitesException extends RuntimeErrorException{

    public ForaDosLimitesException(Error e) {
        super(e);
    }

}