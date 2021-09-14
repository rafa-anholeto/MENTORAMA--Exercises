package application;

import entities.Cliente;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;



public class Testa {
    public static void main(String[] args) {
        Cliente cli1 = new Cliente("Rafael",true,"abc",10);
        Cliente cli2 = new Cliente("Mentorama",true,"iop",30);
        Cliente cli3 = new Cliente("Brasil",false,"qwe",50);
        Cliente cli4 = new Cliente("João",true,"abc",15);
        Cliente cli5 = new Cliente("Guilherme",false,"iop",25);
        Cliente cli6 = new Cliente("Vinicius",true,"qwe",40);
        Cliente cli7 = new Cliente("Jonas",true,"abc",45);
        Cliente cli8 = new Cliente("Renan",true,"iop",5);
        Cliente cli9 = new Cliente("Ana",false,"qwe",2);
        Cliente cli10 = new Cliente("Mariana",false,"qwe",85);

        List<Cliente> clientes = Arrays.asList(cli1,cli2,cli3, cli4, cli5, cli6, cli7, cli8, cli9, cli10);




        // Expressão lambda
        //clientes.forEach(c -> System.out.println(c.getCompras()));
        System.out.println("---------");

        //Obtendo uma stream
        Stream<Cliente> stream = clientes.stream().filter(c -> c.getCompras() > 10);
        Optional<Cliente> max = clientes.stream().max(Comparator.comparing(Cliente::getCompras));
        Optional<Cliente> min = clientes.stream().min(Comparator.comparing(Cliente::getCompras));
        OptionalDouble mediaCompras = clientes.stream().mapToInt(Cliente::getCompras).average();
        System.out.println("Compra máxima: "+max);
        System.out.println("Compra mínima: "+min);
        System.out.println("Média de compras: "+mediaCompras);


        System.out.println("---------------------------------");


        List<Cliente> selecionados = stream.collect(Collectors.toList());
        selecionados.forEach(c -> System.out.println(c.getCompras()));

    }
}
