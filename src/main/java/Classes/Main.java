/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;
import java.util.Scanner;
/**
 *
 * @author LuisO
 */
public class Main {
    public static void main(String args[]) {
        
        //First I declarated the objets: categorys, rewards and the data of questions;
        
       //Create Rewards by level
        Reward level_1 = new Reward(1,"Dinero",12000);
        Reward level_2 = new Reward(2,"Dinero",24000);
        Reward level_3 = new Reward(3,"Dinero",36000);
        Reward level_4 = new Reward(4,"Dinero",48000);
        Reward level_5 = new Reward(5,"Dinero",60000);
       
       //Create Categorys - level 1 
        
       //Create entertainment questions 
       Question[] questionsE ={
       new Question("¿Quien interpreto a Jack Sparrow en piratas del caribe?", new String[]{"Jason Momoa","Roby Downey Jr","Jhonny Depp","Tobey Maguire"}, 3),
       new Question("¿Que vengador usa un escudo?", new String[]{"Iron Man","Thor","Capitan America","Vision"}, 3),
       new Question("¿Que personaje es famoso por la frase ‘Que hay de nuevo viejo’?", new String[]{"Pato Lucas","Bugs Bunny","Dexter","Peter Rabbit"}, 2),
       new Question("¿De que color es Clifford el perro gigante?", new String[]{"Rojo","Amarillo","Verde","Azul"}, 1),
       new Question("¿Quién dijo la frase ‘Yo soy tu padre’?", new String[]{"Yoda","Han Solo","Luke Skywalker","Darth Vader"}, 4)};
       //Create Category Entertainment
       Category entertainment = new Category(1,"Entretenimiento",questionsE); 
       
       //Create Sports questions 
       Question[] questionsS ={
       new Question("¿Cuánto dura un partido de fútbol? ", new String[]{"90 Minutos","60 Minutos","45 Minutos","80 Minutos"}, 1),
       new Question("¿Quién es el máximo goleador del FC Barcelona? ", new String[]{"Neymar","Xavi Hernandez","Gerad Pique","Lionel Messi"}, 4),
       new Question("¿Qué selección de fútbol ha ganado más Mundiales? ", new String[]{"Colombia","Chile","Rusia","Brasil"}, 2),
       new Question("¿Quién se considera el mejor jugador de baloncesto de todos los tiempos?", new String[]{"Michael Jordan","Stephen Curry","Lebron James","James Harden"}, 1),
       new Question("¿Cada cuántos años se celebran los Juegos Olímpicos?", new String[]{"1 Año","6 Años","4 años","2 Años"}, 3)};
       //Create Category Sport
       Category sport = new Category(1,"Deporte",questionsS); 
        
       //Create Categorys - level 2
       
       //Create Art and Literature questions 
       Question[] questionsAL ={
       new Question("¿Cuál de las siguientes obras fue escrita por Gabriel García Márquez?", new String[]{"El coronel no tiene quién le escriba","El Carnero","Manuela","Hush Hush"}, 1),
       new Question("¿Quién pintó la obra mundialmente conocida con el nombre de \"Mona Lisa\" o \"Gioconda\"?", new String[]{"Pablo Picasso","Fernando Botero","Leonardo Da Vinci","Vincent van Gogh"}, 3),
       new Question("¿Dónde se encontraba el cuadro \"El Grito\"?", new String[]{"España","Francia","Estados Unidos","Argentina"}, 2),
       new Question("¿Qué obra NO pertenece a Shakespeare?", new String[]{"Hamlet","Romeo y Julieta","Julio Cesar","Don quijote de la mancha"}, 4),
       new Question("¿Quién era la diosa de la sabiduría en la mitología griega?", new String[]{"Ares","Kratos","Zeus","Demeter"}, 4)};
       //Create Category Literature and Art
       Category artAndLiterature = new Category(2,"Arte y Literatura",questionsAL); 
       
       //Create Geography questions 
       Question[] questionsG ={
       new Question("¿Que pais no tiene mar? ", new String[]{"Colombia","Bolivia","Argentina","Venezuela"}, 2),
       new Question("¿Cuál de estos países NO se encuentra ubicado en sudamérica?", new String[]{"Ecuador","Peru","Brasil","Haiti"}, 4),
       new Question("¿Con qué objeto se asocia a Italia visualmente?", new String[]{"Una bota","Una cometa","Una mano","Brasil"}, 1),
       new Question("¿En qué continente se encuentra España?", new String[]{"Asia","America","Europa","Africa"}, 3),
       new Question("¿Capital de alemania?", new String[]{"Berlin","Hamburgo","Munich","Stuttgart"}, 1)};
       //Create Category Geography
       Category geography = new Category(2,"Geografia",questionsG); 
        
 
        
       //Create Categorys - level 3
        
       //Create History questions 
       Question[] questionsH ={
       new Question("¿Qué país comenzó la Segunda Guerra Mundial?", new String[]{"Alemania","Estados unidos","Japon","Correa"}, 1),
       new Question("¿Qué país le regaló la Estatua de la Libertad a Nueva York?", new String[]{"Japon","Alemania","Francia","España"}, 3),
       new Question("¿En que año llego el hombre por primera vez a la luna?", new String[]{"1982","1969","1940","1980"}, 2),
       new Question("¿Dónde surgió la filosofía?", new String[]{"Roma","Egipto","Islandia","Grecia"}, 4),
       new Question("¿Qué ciudad quedó partida en dos tras la Segunda Guerra Mundial?", new String[]{"Whasington","Paris","Moscu","Berlin"}, 4)};
       //Create Category History
       Category history = new Category(3,"Historia",questionsH); 
       
       //Create Cience questions 
       Question[] questionsC ={
       new Question("¿En matemáticas, ¿qué es 3,14?", new String[]{"Pi","Beta","Epsilon","Mi"}, 1),
       new Question("¿Cuál es la hormona sexual masculina más importante?", new String[]{"Adrenalina","Testosterona","Estrogeno","Progesterona"}, 2),
       new Question("¿Qué es la luna? ", new String[]{"Satelite","Gran roca","Cometa","Asteroide"}, 1),
       new Question("Las 'itis' nos indican que algo está", new String[]{"Quemado","Cortado","Hinchado","Infectado"}, 3),
       new Question("¿Qué órgano del cuerpo es el más dañado por el consumo excesivo de alcohol? ", new String[]{"Pancreas","Estomago","Riñon","Higado"}, 4)};
       //Create Category Cience
       Category cience = new Category(3,"Ciencia",questionsC); 

        
       //Create Categorys - level 4
       
       //Create entertainment2 questions 
       Question[] questionsE2 = {
       new Question("¿Cuál fue la primera película de Disney?", new String[]{"Blanca Nieves","La Cenicienta","Pinocho","Bambi"}, 3),
       new Question("¿Cómo se llama el cangrejo de la película \"La sirenita\" de Walt Disney?", new String[]{"Sebastan","Lucas","Juan","Juancho"}, 1),
       new Question("¿Qué tortuga llevaba el pañuelo azul en 'Las tortugas ninja'?", new String[]{"Leonardo","Donatello","Miguel Angel","Raphael"}, 1),
       new Question("¿Cómo se llamaba el cantante de Queen?", new String[]{"Bon Scott","Bruce Dickinson","Ozzy Osbourne","Freddie Mercury"}, 4),
       new Question("¿Cómo se llamaba el primer gato de Los Simpsons?", new String[]{"Cuate","Bola de nieve","Pulgoso","Pequeño ayudante de santa"}, 2)};
       //Create Category Entertainment2
       Category entertainment2 = new Category(4,"Entretenimiento nivel 2",questionsE2); 
       
       //Create Sport2 questions 
       Question[] questionsS2 ={
       new Question("¿Qué Boxeador es Filipino ", new String[]{"Manny Pacquiao","Saul Alvarez","Vasyl Lomachenko","Julio Cesar Chavez"}, 1),
       new Question("¿Numero de jugadores en un equipo de beisbol?", new String[]{"10","12","11","9"}, 4),
       new Question("¿Qué deporte estamos viendo si el árbitro señala \"falta de rotación\"?", new String[]{"Basketball","Tennis","Balon Mano","Volleyball"}, 4),
       new Question("¿Que Color no pertenece a los colores de los anillos olímpicos? ", new String[]{"Azul","Rojo","Dorado","Negro"}, 3),
       new Question("¿Qué Arma no se utiliza en esgrima?", new String[]{"Espada","Florete","Falcata","Sable"}, 3)};
       //Create Category Sport2
       Category sport2 = new Category(4,"Deporte nivel 2",questionsS2); 
        

       //Create Categorys - level 5
        
       //Create History questions 
       Question[] questionsH2 ={
       new Question("¿Cuántos meses duró la batalla de Stalingrado en la Segunda Guerra Mundial? ", new String[]{"6 meses","8 meses","10 meses","7 meses"}, 1),
       new Question("¿En qué año sucedió el accidente de Chernóbil?", new String[]{"1989","1979","1986","1876"}, 3),
       new Question("¿Dónde vivía Ana Frank?", new String[]{"Berlin","Amsterdan","Bergen","Francort"}, 2),
       new Question("¿A qué diosa está dedicado el Partenón?", new String[]{"Atenea","Hera","Artemisa","Afrodita"}, 1),
       new Question("¿Quién fue el primer presidente de los Estados Unidos? ", new String[]{"Abraham Lincoln","Thomas Jefferson","Jhon Adams","George Washington"}, 4)};
       //Create Category History2
       Category history2 = new Category(5,"Historia 2 Nivel",questionsH2); 
       
       //Create Cience questions 
       Question[] questionsC2 ={
       new Question("¿Qué son los leucocitos? ", new String[]{"Globulos blancos","Globulos rojos","Hormonas","Celulas Germinales"}, 1),
       new Question("¿Cómo llamamos a la inflamación de la piel?", new String[]{"Conjuntivitis","Adenitis","Skinitis","Dermatitis"}, 4),
       new Question("¿Cuántas vertebras forman la columna vertebral humana? ", new String[]{"31","33","32","30"}, 2),
       new Question("¿Qué es la filofobia?", new String[]{"Miedo a enamorarse","Miedo a la sabiduria","Miedo al pensamiento","Ninguna de las anteriores"}, 1),
       new Question("¿Cuántos millones de años se estima que le restan de vida a nuestro Sol?", new String[]{"6500","7500","5500","8500"}, 3)};
       //Create Category Cience2
       Category cience2 = new Category(5,"Ciencia 2 Nivel",questionsC2); 
       
       //Create Round 
       Round round_1 = new Round(1,new Category[]{entertainment,sport},level_1);
       Round round_2 = new Round(2,new Category[]{artAndLiterature,geography},level_2);
       Round round_3 = new Round(3,new Category[]{history,cience},level_3);
       Round round_4 = new Round(4,new Category[]{entertainment2,sport2},level_4);
       Round round_5 = new Round(5,new Category[]{history2,cience2},level_5);
        
       Round[] arrRound = {round_1,round_2,round_3,round_4,round_5};
       
       Scanner scan = new Scanner (System.in);
        System.out.println("Bienvenido a preguntados\nDigita la opcion que desea: \n1.Iniciar Nuevo juego \n2.Ver puntajes \nRespuesta:>");
        int select = scan.nextInt();
        
        boolean correct = true;
        do {
            switch (select){
                case 1 -> {
                    System.out.println("Por Favor ingrese su nombre: ");
                    String name = scan.next();
                    //create player
                    Player player1 = new Player(name);
                    
                    for(Round round: arrRound ){
                        round.selectCategory();
                        
                    }
                }

                
                case 2 -> {
                }
                default -> {
                    correct = false;
                    System.out.println("Opcion desconocida ingrese una valida:");
                    select = scan.nextInt();
                }
                }
            
        } while (correct = true);
        
        
}
}
