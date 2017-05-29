/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphismordynamicmethoddispatchorruntimebinding2;

/**
 *
 * @author tiago.lucas
 */
public abstract class Shape {
    /*
    Interfaces:

·         Uma interface não é considerada uma Classe e sim uma Entidade.

·         Não possui implementação, apenas assinatura, ou seja, apenas a definição dos seus métodos sem o corpo.

·         Todos os métodos são abstratos.

·         Seus métodos são implicitamente Públicos e Abstratos.

·         Não há como fazer uma instância de uma Interface e nem como criar um Construtor.

·         Funcionam como um tipo de "contrato", onde são especificados os atributos, métodos e funções que as classes que implementem essa interface são obrigadas a implementar.

·         Já que C# não suporta Heranças Múltiplas, as Interfaces são usadas para implementá-las.
    */
    
    /*Classes Abstratas:

·         As classes abstratas devem conter pelo menos um método abstrato, que não tem corpo.

·         É um tipo especial de classe que não há como criar instâncias dela.

·         É usada apenas para ser herdada, funciona como uma super classe.

·         Uma grande vantagem é que força a hierarquia para todas as sub-classes.

·         É um tipo de contrato que faz com que as sub-classes contemplem as mesmas hierarquias e/ou padrões. 
    http://www.devmedia.com.br/interfaces-x-classes-abstratas/13337
    */
    abstract void draw();
    
    public void teste(){
        System.out.println("Hello");
    }
}
