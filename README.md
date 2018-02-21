# Pool-Score

O projeto é um contador de pontuação de uma série de partidas de sinuca, ele obedece as regras da sinuca brasileira. Deve ser forçado a aplicação a ficar em modo paisagem;
Ela vai ter 2 telas principais:

 - Tela de configuração;
 - Dashboard da partida;

## 1. Tela de Configuração
Na tela de configuração será configurado o nome dos jogadores que irão se enfrentar e a quantidade máxima de partidas.

## 2. Dashboard

A tela de dashboard é a tela principal, nela sera apontado o andamento do jogo como o todo e o da partida atual. A tela deve ter:
- Histórico de pontuação de cada jogador;
	- O histórico mostra as bolas encaçapadas do jogador, sem contar as penalidades
- Pontuação atual de cada jogador (destaque da tela);
- Partidas vencidas de cada jogador;
- Hora de início da partida;
- Duração da partida (tempo real);
- Duração do Jogo (somatório das partidas);
- Diferença de pontos dos jogadores;
## 3. Cenários
Por convenção não existirá um Jogo com quantidade máxima de partidas sendo par.

### 3.1 Jogo com partidas impar
Caso a quantidade máxima de partidas seja impar se um jogador tiver ganhado 1 qtd de partida igual a (quantidade máxima +1)/2 ele será considerado vitorioso. Não a possibilidade de empate
Fórmula:
``
vitoria = pontuacaoAtual == (qtdMaxima+1)/2
`` 
Ex: Melhor de 5: 3 partidas
|Melhor de|  Quantas partidas é uma vitória| Fórmula
|--|--|--|
|  1| 1 |1 == (1+1)/2|
|  3| 2 |2 == (3+1)/2|
|  5| 3 |3 == (5+1)/2|
|  7| 4 |4 == (7+1)/2|

### 3.2 Jogo com desistência
- Caso um jogador desista da partida será considerado vitória da partida por W.O para o jogador opositor;
	- Exemplo: a chance de ganhar é muito pequena, então decide dar como perdida a partida e iniciar uma próxima;
- Caso o jogador desista do jogo em acordo com o oponente fica o placar da quantidade de vitórias;
	- Exemplo: Jogadores cansado, alguém precisa ir embora;

## 4. Melhorias futuras
- Adicionar outros tipos de jogo de sinuca, além do padrão brasileiro; 
