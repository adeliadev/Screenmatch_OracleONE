package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.*;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme outroFilme = new Filme("Dune - Part One", 2021);
        outroFilme.avalia(9.5);
        Filme meuFilme = new Filme("Dune - Part Two", 2024);
        meuFilme.avalia(10);
        var filmeDoPaulo = new Filme("Dogville", 2003);
        filmeDoPaulo.avalia(2);
        Serie lost = new Serie("Lost", 2000);

        Filme f1 = filmeDoPaulo;

        List<Titulo> lista = new LinkedList<>();
        lista.add(filmeDoPaulo);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);

        for (Titulo item : lista) {
            System.out.println(item);
            if (item instanceof Filme filme && filme.getClassificacao() > 2) {
                System.out.println("Classificação: " + filme.getClassificacao());
            }
        }

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Emma Stone");
        buscaPorArtista.add("Barry Keoghan");
        buscaPorArtista.add("Rebecca Ferguson");

        Collections.sort(buscaPorArtista);
        System.out.println("Após ordenação:");
        System.out.println(buscaPorArtista);

        Collections.sort(lista);
        System.out.println("Após ordenação:");
        System.out.println(lista);

        System.out.println("Ordenando por ano:");
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println(lista);

    }
}
