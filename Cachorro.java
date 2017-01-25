import java.io.File;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import javax.swing.text.html.HTMLDocument.Iterator;

/* Author: Fabiano Girardi 25/01/2017
 * A Interface Set � considerada uma interface que faz parte do pacote �java.util� e 
 * representa grupos de elementos sem duplicatas, ou seja, 
 * s�o usados quando o programador n�o precisar ter nenhum dado duplicado na cole��o.
 * 
 * Explicacao de TreeSet, HashSet e LinkedHashSet Prova OCJP 
 * <<interface>> Collection <- <<interface Set>> <- HashSet | LinkedHashSet 
 * <<interface>> Collection <- <<interface Set>> <- <<interface>> <- TreeSet
 * 
 * 

 */

public class Cachorro{
	
	private String nome;
	private Double peso;
	private static int count;
	
	public Cachorro(String nome, Double peso){
		//super();
		this.nome = nome;
		this.peso = peso;
	}
	
	 @Override
	    public String toString() {
	        return "Cachorro "+ ++count + ": " +this.nome + " Peso: "+this.peso;
	    }

	
	 
	public static void main(String[] args) {
		/*
		Caracter�sticas - Set
		   Velocidade na pesquisa de dados, sendo mais r�pida que um objeto do tipo List;
		   A inser��o de dados � mais lenta;
		   Permite trabalhar com conjuntos e pode ser implementado como inst�ncias das classes HashSet ou TreeSet;
		   N�o precisa especificar a posi��o para adicionar um elemento;
		   N�o aceita valores duplicados. Se caso inserir um registro que j� tenha no Set n�o ser� adicionado.
		   Podem ser implementados como inst�ncias das classes HashSet ou TreeSet;
		*/
		
		Set<Cachorro> hSet = new HashSet<Cachorro>();
		hSet.add(new Cachorro("Spyke",20d));
		hSet.add(new Cachorro("Boby",30.2d));
		hSet.add(new Cachorro("Jorg",7.63d));
		
		System.out.println("Tamanho cole��o Set: "+hSet.size());
        int count = 0;
        for(Cachorro valor : hSet){
            System.out.println(++count + " -> " + valor);
        }
		
        /*
        Caracter�sticas do HashSet
        N�o tem ordena��o na varredura ou impress�o. A ordem de sa�da n�o � a mesma de entrada;
        Aceitam valores do tipo null;
        N�o � sincronizada (thread-safe);
        Velocidade no acesso, leitura e modifica��o de dados;
	   */
	   HashSet<Cachorro> hashSet = new HashSet<Cachorro>();
	   hashSet.add(new Cachorro("Spyke",20d));
	   hashSet.add(new Cachorro("Boby",30.2d));
	   hashSet.add(new Cachorro("Jorg",7.63d));
 	
	   System.out.println("Tamanho cole��o Set: "+hashSet.size());
	   java.util.Iterator<Cachorro> it = hashSet.iterator();
       while(it.hasNext()){
           Cachorro cachorro = (Cachorro)it.next();
           System.out.println(cachorro);
       }

	/*Declara��o - TreeSet
      Nessa classe para construir objetos � a mesma ideia da interface Set, 
      precisa informar que tipo de cole��o ser� implementada.
	*/
     Set<String> cursos = new HashSet<String>();
     cursos.add("PHP");
     cursos.add("Java");
     cursos.add("PL/SQL");
     cursos.add("Adobe");
     cursos.add("PHP");
        
     Set<String> ord = new TreeSet<String>(cursos);
        
     System.out.println("Sem ordena��o: "+cursos);
     System.out.println("Com ordena��o: "+ord);
  
     /*a LinkedHashSet que � um meio termo entre HashSet e TreeSet, ou seja, 
      * ela nos proporciona um pouco da performance do HashSet e um pouco do poder de ordena��o do TreeSet. 
      * O LinkedHashSet faz uso tamb�m do HashTable com linked list, ou seja, temos aqui a seguinte situa��o: 
      * Os elementos continuam na ordem que s�o inseridos, diferente do HashSet que �embaralha� tudo. 
      * E a complexidade do LinkedHashSet � O(1) para opera��es b�sicas.
      */
     LinkedHashSet<Cachorro> lset = new LinkedHashSet<Cachorro>();
     lset.add(new Cachorro("Bob",2d));
     lset.add(new Cachorro("Xuxa",1d));
     lset.add(new Cachorro("Thor",5.63d));
     lset.add(new Cachorro("Spyke",10d));
     lset.add(new Cachorro("Brax",22.57d));
	 lset.add(new Cachorro("Chuck",50.88d));
     java.util.Iterator<Cachorro> iterator = lset.iterator();
     while (iterator.hasNext()) {
     	System.out.print(iterator.next() + " ");
     } 
	}
	
	
}
