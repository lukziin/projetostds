import java.util.Scanner;



public class Main {
    public static void main(String[] args){
        Scanner meuObj = new Scanner (System.in);
       
    
    
          System.out.println("Como você avalia seu conhecimento sobre investimentos? \n 1)Não tenho conhecimento \n 2)Razoável \n 3)Bom \n 4)Excelente");
          int r1 =  meuObj.nextInt();
          System.out.println("Vamos pra próximo!");

          System.out.println("Selecione abaixo os investimentos que você tem ou já teve: \n 1)Nunca investi \n 2)Poupança \n 3)Títulos de renda fixa (CDB, LCI, LCA, Debêntures, DPGE, FIDC, entr outros) \n 4)Ações");
          int r2 =  meuObj.nextInt();
          System.out.println("Vamos pra próximo!");

          System.out.println("Qual é o seu objetivo ao investir? \n 1)Preservar capital: corrigir os investimentos pela variação da inflação \n 2)Acumular recursos: obter rentabilidade acima da inflação \n 3)Especular: ter alta valorização, correndo riscos maiores, se necessário \n 4)Outros");
          int r3 =  meuObj.nextInt();
          System.out.println("Vamos pra próximo!");

          System.out.println("Por quanto tempo você deseja manter o seu investimento? \n 1)Acima de 5 anos - Longo prazo \n 2)Entre 3 e 5 anos - Médio-longo prazo \n 3)Entre 1 e 3 anos - Médio prazo \n 4)Menos de 1 ano - Curto prazo" ); 
          int r4 =  meuObj.nextInt();
          System.out.println("Vamos pra próximo!");

          System.out.println("Qual a melhor opção para descrever sua tolerância ao risco? \n 1)Baixa: quero rentabilidade acima da poupança com preservação do poder de compra \n 2)Regular: quero rentabilidade próxima a taxa de juros DI (CDI) e aceito eventuais riscos \n 3)Média: estou disposto a assumir riscos maiores para superar a taxa de juros DI (CDI) \n 4)Alta: estou disposto a assumir riscos elevados para alcançar retornos expressivos");
          int r5 =  meuObj.nextInt();
         
          System.out.println("Possui conhecimento sobre o conceito volatilidade? \n 1)Não tenho conhecimento deste conceito \n 2) Tenho conhecimento deste conceito e aceito um rendimento com maior variação no curto prazo, buscando no longo prazo um rendimento que apresente melhor retorno \n 3)Conheço este conceito e aceito um rendimento com maior variação, ou até mesmo negativo no curto prazo");
          int r6 =  meuObj.nextInt();
          System.out.println("Vamos pra próximo!");

          System.out.println("Sobre os investimentos no Tesouro Direto: \n 1)Não tenho nenhum conhecimento sobre o Tesouro Direto \n 2)Tenho conhecimento sobre o assunto, mas ainda não fiz nenhuma aplicação \n 3)Conheço bem o assunto e os riscos");
          int r7=  meuObj.nextInt();
          System.out.println("Vamos pra próximo!");

          System.out.println("Qual a sua faixa etária? \n 1)Mais de 49 anos \n 2)Entre 30 e 49 anos \n 3)Abaixo de 30 anos");
          int r8 =  meuObj.nextInt();
          System.out.println("Vamos pra próximo!");

          System.out.println("Qual a sua situação atual? \n 1)Possuo somente uma fonte de renda, no máximo apenas suficiente para cobrir meus gastos \n 2)Possuo uma ou mais fontes de renda, que me permitem cobrir meus gastos e ainda eventualmente poupar \n 3)Possuo renda que me permite viver confortavelmente e ainda poupar" ); 
          int r9 =  meuObj.nextInt();
          System.out.println("Vamos pra próximo!");
          System.out.println("Seu resultado saira agora! Vamos ver se voce é um investidor conservador ou mais autonomo que deseja ganhar dinheiro mais rapido! E vamos te dar dicas também!");

            
          
          if (r1+r2+r3+r4+r5+r6+r7+r8+r9 <= 17 ){
              System.out.println("\n Você tem um perfil conservador, você prefere segurança e não ter surpresas desagradáveis com seu dinheiro, mesmo que elas sejam temporárias. \n     Por conta disso, evite investir em coisas mais arriscadas. \n Mesmo que em longo prazo o retorno seja maior, os altos e baixos podem afetar muito suas emoções e decisões de investimento. \n Alocação Sugerida: \n 10% em investimentos arriscados (bolsa de valores, fundos que buscam superar o Ibovespa); \n 30% em investimentos moderados (fundos imobiliários, fundos que buscam superar o CDI); \n  60% em investimentos conservadores (títulos pós fixados, CDBs e fundos que buscam superar a inflação");
            System.out.println("\n Você sabe por onde começar? Digite 1 para sim e 0 para não.");
            int s1 = meuObj.nextInt();
               if (s1 == 0){
                System.out.println("\n Então fique calmo que nós iremos ajudar, vimos que seu perfil é conservador, então devemos começar com os investimentos em titulos diretos, cdb e derivados, esses tipo de investimento você pode encontrar no proprio site ou aplicativo do banco quee você utiliza, esse é o seu investimento mais importante foque nele!");
                System.out.println("\n Agora que você aprendeu investir em renda fixa, podemos começar a parte em que você se expoem mais a volatilidade do mercado, ou seja, bolsa de valores e criptomodas, primeiro será preciso criar uma conta em uma corretora, em criptomodas indicamos a Binance, ja na parte da Bolsa de Valores indicamos a Toro Investimentos.");
                System.out.print("\n Como já vimos, para investir em algo de renda fixa você precisa apenas do seu banco, por exemplo o banco inter que ofereçe suporte para cdb, cdi, etc, porém para ações e criptomedas já sera em outros lugares, então vamos mostrar as plataformas que consideramos as melhores e mais seguras corretoras. ");
                System.out.print("\n Plataformas para investir em criptomoedas: \n 1 – Binance \n 2 - CoinBase \n 3 - Gate.io \n 4 - FoxBit");
                System.out.print("\n Plataformas para investir em ações: \n 1 – Toro Investimentos \n 2 - XP Investimentos  \n 3 - RICO \n 4 - NUINVEST");
                System.out.println("\n Agora é só começar seus estudos tanto da plataforma quanto dos seus investimentos, caso preciso de mais algo, nos contate por email  : investcerto@gmail.com");
            }  else {
                System.out.println("\n Então vá fundo nos seus estudos!");
            }
        
           
           
        }if (r1+r2+r3+r4+r5+r6+r7+r8+r9 >= 18) {
              System.out.println("\n Você tem um perfil moderado, já aceita alguns riscos. Portanto, você deve buscar investimentos que ofereçam maior retorno do que título públicos e renda fixa. \n Porém, evite os que podem ter muitas variações de valor, como ações de companhias menores ou fundos de investimento muito agressivos. \n Alocação Sugerida: \n 30% em investimentos arriscados (bolsa de valores, fundos que buscam superar o Ibovespa); \n 30% em investimentos moderados (fundos imobiliários, fundos que buscam superar o CDI); \n 40% em investimentos conservadores (títulos pós fixados, CDBs e fundos que buscam superar a inflação). " );
              System.out.println("\n Você sabe por onde começar? Digite 1 para sim e 0 para não.");
              int s2 = meuObj.nextInt();
              if (s2 == 0){
                  System.out.println("\n Então fique calmo que nós iremos ajudar, vimos que seu perfil é moderado, então voce é alguem que quer apenas redimentos legais mas arriscando pouco, podemos indicar pra que você diversifique uniformemente seus investimentos e começe com uma renda fixa, como cdb's, tesouro direto e derivados, dessa forma você pode começar a investir a partir do seu banco sem muita dificuldade.");
                  System.out.println("\n Agora que você aprendeu investir em renda fixa, podemos começar a parte em que você se expoem mais a volatilidade do mercado, ou seja, bolsa de valores e criptomodas, primeiro será preciso criar uma conta em uma corretora, em criptomodas indicamos a Binance, ja na parte da Bolsa de Valores indicamos a Toro Investimentos.");
                  System.out.print("\n Como já vimos, para investir em algo de renda fixa você precisa apenas do seu banco, por exemplo o banco inter que ofereçe suporte para cdb, cdi, etc, porém para ações e criptomedas já sera em outros lugares, então vamos mostrar as plataformas que consideramos as melhores e mais seguras corretoras. ");
                  System.out.print("\n Plataformas para investir em criptomoedas: \n 1 – Binance \n 2 - CoinBase \n 3 - Gate.io \n 4 - FoxBit");
                  System.out.print("\n Plataformas para investir em ações: \n 1 – Toro Investimentos \n 2 - XP Investimentos  \n 3 - RICO \n 4 - NUINVEST");
                  System.out.println("\n Agora é só começar seus estudos tanto da plataforma quanto dos seus investimentos, caso preciso de mais algo, nos contate por email  : investcerto@gmail.com");
                  
                  }else {
                    System.out.println("\n Então vá fundo nos seus estudos!");
              }
         
          
          }if (r1+r2+r3+r4+r5+r6+r7+r8+r9 > 20){
            System.out.println("\n Vocé é alguem do tipo que tem sangue frio e lida bem com riscos. \n Se esse é o seu perfil, procure investir seu dinheiro de longo prazo em investimentos com maior potencial de retorno, deixando pelo menos 25% do seu patrimônio em investimentos seguros. \n Alocação Sugerida: \n 60% em investimentos arriscados (bolsa de valores, fundos que buscam superar o Ibovespa); \n 20% em investimentos moderados (fundos imobiliários, fundos que buscam superar o CDI); \n 20% em investimentos conservadores (títulos pós fixados, CDBs e fundos que buscam superar a inflação). \n Perfil Muito Arriscado. Cuidado! Risco pode significar mais retorno, porém, é importante ter uma reserva de dinheiro sempre garantida e à mão para momentos turbulentos.");
            System.out.println("\n Você sabe por onde começar? Digite 1 para sim e 0 para não.");
            int s3 = meuObj.nextInt();
            if (s3 == 0){
                System.out.println("\n Então fique calmo que nós iremos ajudar, vimos que seu perfil é arrojado, então devemos começar com os investimentos que te rendam mais dinheiro, acçoes e criptomoedas, primeiro será preciso criar uma conta em uma corretora, em criptomodas indicamos a Binance, ja na parte da Bolsa de Valores indicamos a Toro Investimentos.");
                System.out.println("\n Agora que você aprendeu investir em algo mais perigoso mas que te gire mais lucro, você deve aprender a investir em renda fixa também que poderá ser algo que te renda menos mas seja algo mais concreto, mais seguro, esse tipo de renda é possível achar no próprio banco, em site ou aplicativo, lá tera itens como tesouro direto, taca selic, cdb's e nesse tipo que você deve aprofundar seus conhecimentos e começar a investir! ");
                System.out.print("\n Como já vimos, para investir em algo de renda fixa você precisa apenas do seu banco, por exemplo o banco inter que ofereçe suporte para cdb, cdi, etc, porém para ações e criptomedas já sera em outros lugares, então vamos mostrar as plataformas que consideramos as melhores e mais seguras corretoras. ");
                System.out.print("\n Plataformas para investir em criptomoedas: \n 1 – Binance \n 2 - CoinBase \n 3 - Gate.io \n 4 - FoxBit");
                System.out.print("\n Plataformas para investir em ações: \n 1 – Toro Investimentos \n 2 - XP Investimentos  \n 3 - RICO \n 4 - NUINVEST");
                System.out.println("\n Agora é só começar seus estudos tanto da plataforma quanto dos seus investimentos, caso preciso de mais algo, nos contate por email  : investcerto@gmail.com");
            } else {
                System.out.println("\n Então vá fundo nos seus estudos!");
        }
        
          meuObj.close();

      
    }
    
}
}



