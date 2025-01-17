
import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Main {

    public static void main(String[] args) {
        Filme meuFilme = new Filme();

        meuFilme.setNome("O Rei Leão");
        meuFilme.setAnoDeLancamento(1994);
        meuFilme.setDuracaoEmMinutos(118);

        System.out.println("Duração do Filme: " + meuFilme.getDuracaoEmMinutos());

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(9);
        meuFilme.avalia(8);
        meuFilme.avalia(9);

        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());

        Serie serie = new Serie();
        serie.setNome("Meu malvado meuFilme");
        serie.setAnoDeLancamento(2018);
        serie.setTemporadas(10);
        serie.setEpisodiosPorTemporada(6);
        serie.setMinutosPorEpisodio(50);
        System.out.println("Duração para maratonar a série: " + serie.getDuracaoEmMinutos());


        Filme outroFilme = new Filme();

        outroFilme.setNome("Avatar");
        outroFilme.setAnoDeLancamento(1994);
        outroFilme.setDuracaoEmMinutos(150);

        CalculadoraDeTempo calculadoraDeTempo = new CalculadoraDeTempo();
        calculadoraDeTempo.inclui(meuFilme);
        calculadoraDeTempo.inclui(outroFilme);
        calculadoraDeTempo.inclui(serie);
        System.out.println(calculadoraDeTempo.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(serie);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);
    }

}