package com.mycompany.principalcombusca;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class PrincipalComBusca {
        
        
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        String busca ="";
        List<Titulo>titulos = new ArrayList();
        
        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();
        while(!busca.equalsIgnoreCase("sair")){
        System.out.println("digite um filme para busca ");
        busca = scanner.nextLine();
        
        if(busca.equalsIgnoreCase("sair")){
            break;
        }
        
        String endereco = "https://www.omdbapi.com/?t="+busca.replace(" ","+")+"&apikey=2aab26f6";
        try{  
        HttpClient client = HttpClient.newHttpClient();
   HttpRequest request = HttpRequest.newBuilder()
         .uri(URI.create(endereco))
         .build();
        
   HttpResponse<String> response = client
           .send(request, BodyHandlers.ofString());
        
   //parte da aula 2
        String json = response.body();
        System.out.println(json);
        
        
        //Titulo meuTitulo = gson.fromJson(json, Titulo.class);
        TituloOmdb meuTituloOmdb = gson.fromJson(json, TituloOmdb.class);
        System.out.println(meuTituloOmdb);
        
        //try{
        Titulo meuTitulo = new Titulo(meuTituloOmdb);
        
        System.out.println("titulo ja convertido");
        System.out.println(meuTitulo);
        
        titulos.add(meuTitulo);
        }catch (NumberFormatException e) {
            System.out.println("========================");
            System.out.println("aconteceu um erro");
            System.out.println(e.getMessage());
        } catch(IllegalArgumentException ilegal){
            System.out.println("caractere ilegal localizado verifique o indereco");
        } catch(ErroDeConversaoDeAnoException e){
        
            System.out.println(e.getMessage());
        }finally{
        System.out.println("fim do codigo");
        
        FileWriter escrita = new FileWriter("filmes.json");
        escrita.write(gson.toJson(titulos));
        escrita.close();
            System.out.println(titulos);
            }
        }
    }
}
