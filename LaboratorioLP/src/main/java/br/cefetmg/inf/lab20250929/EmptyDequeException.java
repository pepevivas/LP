package br.cefetmg.inf.lab20250929;

public class EmptyDequeException extends RuntimeException{
    EmptyDequeException(Error e){
        super(e);
    }
}
