package teste;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

public class SayHelloTests {
  
    // These example test cases are editable, feel free to add
    // your own tests to debug your code.
  
    @Test
    public void shouldSayHello() {
    	Chalenge chalenge = new Chalenge();
    	String name= chalenge.sayHello("Hello") ;
    	
    	
       Assert.assertEquals("Hello, Name!", "Hello there!" );
    }
}

/*
Tarefa Para este desafio prático, escreva uma função de saudação simples. Se for passado em um nome NAME, retorne "Hello, NAME!". Se for chamado sem nome, retorne "Hello there!". */