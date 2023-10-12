package br.com.fiap.pettech.PosTech_Pet_Tech.controller.exception;

public class ControllerNotFoundException extends RuntimeException{
    public ControllerNotFoundException(String message){
        super(message);
    }
}
