/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ghibli.modelo;

import ghibli.persistencia.PersistenciaFilme;
import java.util.ArrayList;

/**
 * Classe destinada a adição de filmes na persistência.
 * @author kelly
 */
public class AddFilmes {
    
    public static void inicializarDadosDeTeste() {
        ArrayList<Filme> filmesIniciais = new ArrayList<>();
        filmesIniciais.add(new Filme("Nausicaä do Vale do Vento", "1984", "Fantasia Científica", "Hayao Miyazaki", "Em um futuro pós-apocalíptico, uma princesa se esforça para manter a paz entre humanos e uma floresta tóxica.", 52.50, 21.00));
        filmesIniciais.add(new Filme("O Castelo no Céu", "1986", "Aventura/Fantasia", "Hayao Miyazaki", "Um órfão e uma garota com um colar mágico buscam uma lendária cidade flutuante.", 49.90, 19.90));
        filmesIniciais.add(new Filme("Meu Amigo Totoro", "1988", "Fantasia", "Hayao Miyazaki", "Duas jovens irmãs se mudam para o campo e conhecem os espíritos da floresta, incluindo o amigável Totoro.", 48.00, 18.50));
        filmesIniciais.add(new Filme("O Túmulo dos Vagalumes", "1988", "Drama/Guerra", "Isao Takahata", "A dolorosa história de dois irmãos lutando para sobreviver durante a Segunda Guerra Mundial no Japão.", 55.00, 22.00));
        filmesIniciais.add(new Filme("O Serviço de Entregas da Kiki", "1989", "Fantasia/Aventura", "Hayao Miyazaki", "Uma jovem bruxa de 13 anos deixa sua casa para viver por conta própria, usando sua habilidade de voar para fazer entregas.", 47.50, 18.00));
        filmesIniciais.add(new Filme("Memórias de Ontem", "1991", "Drama/Romance", "Isao Takahata", "Uma jovem de Tóquio visita sua família no interior e reflete sobre sua infância e escolhas de vida.", 51.00, 20.50));
        filmesIniciais.add(new Filme("Porco Rosso: O Último Herói Romântico", "1992", "Aventura/Fantasia", "Hayao Miyazaki", "Um aviador italiano amaldiçoado com a aparência de um porco caça piratas no Mar Adriático.", 50.50, 20.00));
        filmesIniciais.add(new Filme("Pom Poko: A Grande Batalha dos Guaxinins", "1994", "Fantasia/Comédia", "Isao Takahata", "Um grupo de guaxinins com poderes de transformação tenta salvar sua floresta da urbanização.", 49.00, 19.50));
        filmesIniciais.add(new Filme("Sussurros do Coração", "1995", "Romance/Drama", "Yoshifumi Kondō", "Uma garota encontra um livro que a leva a um misterioso antiquário e a um jovem talentoso.", 48.50, 19.00));
        filmesIniciais.add(new Filme("Princesa Mononoke", "1997", "Aventura/Fantasia", "Hayao Miyazaki", "Um príncipe amaldiçoado se envolve em uma guerra entre deuses da floresta e humanos que buscam seus recursos.", 54.00, 21.50));
        filmesIniciais.add(new Filme("Meus Vizinhos Os Yamadas", "1999", "Comédia/Slice of Life", "Isao Takahata", "Uma série de curtas animados sobre o cotidiano e as peculiaridades da família Yamada.", 46.50, 17.50));
        filmesIniciais.add(new Filme("A Viagem de Chihiro", "2001", "Fantasia", "Hayao Miyazaki", "Uma garota de dez anos se vê presa em um mundo de espíritos, onde precisa trabalhar para libertar seus pais.", 53.00, 21.00));
        filmesIniciais.add(new Filme("O Reino dos Gatos", "2002", "Fantasia/Aventura", "Hiroyuki Morita", "Uma garota que pode falar com gatos é convidada para o Reino dos Gatos após salvar um príncipe.", 47.00, 18.00));
        filmesIniciais.add(new Filme("O Castelo Animado", "2004", "Fantasia/Romance", "Hayao Miyazaki", "Uma jovem é amaldiçoada e transformada em uma idosa, buscando a cura em um castelo mágico voador.", 52.00, 20.50));
        filmesIniciais.add(new Filme("Contos de Terramar", "2006", "Fantasia/Aventura", "Gorō Miyazaki", "Um príncipe rebelde e um arquimago embarcam em uma jornada para descobrir o que está afligindo seu mundo.", 49.50, 19.00));
        filmesIniciais.add(new Filme("Ponyo: Uma Amizade que Veio do Mar", "2008", "Fantasia", "Hayao Miyazaki", "Um menino faz amizade com uma princesa-peixe dourada que sonha em se tornar humana.", 48.00, 18.50));
        filmesIniciais.add(new Filme("O Mundo Secreto de Arrietty", "2010", "Fantasia/Aventura", "Hiromasa Yonebayashi", "Uma família de 'emprestadores' minúsculos vive sob o assoalho de uma casa e luta pela sobrevivência.", 47.90, 18.80));
        filmesIniciais.add(new Filme("Da Colina Kokuriko", "2011", "Romance/Drama", "Gorō Miyazaki", "Em 1963, uma jovem se envolve com o clube de jornalismo de sua escola e luta para salvar um antigo casarão.", 48.20, 19.20));
        filmesIniciais.add(new Filme("Vidas ao Vento", "2013", "Drama/Histórico", "Hayao Miyazaki", "A biografia fictícia de Jiro Horikoshi, o designer de aviões de caça japoneses da Segunda Guerra Mundial.", 53.50, 21.80));
        filmesIniciais.add(new Filme("O Conto da Princesa Kaguya", "2013", "Fantasia/Drama", "Isao Takahata", "Uma pequena criatura encontrada dentro de um bambu cresce rapidamente e se torna uma linda princesa.", 56.00, 22.50));
        filmesIniciais.add(new Filme("As Memórias de Marnie", "2014", "Mistério/Drama", "Hiromasa Yonebayashi", "Uma garota solitária encontra uma amiga misteriosa em uma mansão abandonada à be beira-mar.", 50.80, 20.20));
        filmesIniciais.add(new Filme("Aya e a Bruxa", "2020", "Fantasia", "Gorō Miyazaki", "Uma órfã que não quer ser adotada acaba vivendo com uma bruxa egoísta e seus segredos.", 45.00, 16.90));
        filmesIniciais.add(new Filme("O Menino e a Garça", "2023", "Fantasia/Aventura", "Hayao Miyazaki", "Um jovem lida com a perda de sua mãe e se aventura em um mundo misterioso com uma garça falante.", 57.00, 23.00));
    
        // Salvar os filmes no arquivo JSON
        PersistenciaFilme.salvar(filmesIniciais);
    }
    
    public static void main (String[] args) {
        
        // O método deve ser chamado apenas uma vez. 
        inicializarDadosDeTeste();
    }
}
