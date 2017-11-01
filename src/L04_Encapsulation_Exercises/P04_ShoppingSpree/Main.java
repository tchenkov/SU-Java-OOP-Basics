package L04_Encapsulation_Exercises.P04_ShoppingSpree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
        Map<String, Person> people;
        Map<String, Product> productList;
        
        try {
            people = getPeople(br);
            productList = getProducts(br);
        } catch (IllegalArgumentException iae){
            System.out.println(iae.getMessage());
            return;
        }
        
        String command = br.readLine();
        
        while (!command.equals("END")) {
            String[] personAndProduct = command.split(" ");
            Person person = people.get(personAndProduct[0]);
            Product product = productList.get(personAndProduct[1]);
            try {
                person.buyProduct(product);
                System.out.println(person.getName() + " bought " + product.getName());
            }
            catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
            
            command = br.readLine();
        }
        
        people.values().forEach(System.out::println);
    }
    
    private static Map<String, Product> getProducts(BufferedReader br) throws IOException {
        Map<String, Product> productList = new LinkedHashMap<>();
        Arrays.stream(br.readLine().split(";"))
                .forEach(person -> {
                    String[] personInfo = person.split("=");
                    String name = personInfo[0];
                    double price = Double.parseDouble(personInfo[1]);
                    
                    productList.putIfAbsent(name, new Product(name, price));
                });
        return productList;
    }
    
    private static Map<String, Person> getPeople(BufferedReader br) throws IOException {
        Map<String, Person> people = new LinkedHashMap<>();
        Arrays.stream(br.readLine().split(";"))
                .forEach(person -> {
                    String[] personInfo = person.split("=");
                    String name = personInfo[0];
                    double budget = Double.parseDouble(personInfo[1]);
                    
                    people.putIfAbsent(name, new Person(name, budget));
                });
        return people;
    }
}
