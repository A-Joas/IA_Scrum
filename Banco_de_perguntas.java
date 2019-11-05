package view;

import java.util.ArrayList;

public class Banco_de_perguntas {
	public ArrayList perguntanv1(int i) {
	String pergunta[] = new String[10];
	String Alt1[] = new String[10];
	String Alt2[] = new String[10];
	String Alt3[] = new String[10];
	String resposta[] = new String[10];
	String comentario[] = new String[10];
	
	ArrayList<String> questao = new ArrayList();
	pergunta[0] = "Quantos corações uma pessoa tem? ";
	Alt1[0]="1";
	Alt2[0]="2";
	Alt3[0]="3";
	resposta[0]="A";
	comentario[0]="Uma pessoa tem apenas um coração";
	
	pergunta[1] = "Quantos pulmoes uma pessoa normalmente tem? ";
	Alt1[1]="1";
	Alt2[1]="2";
	Alt3[1]="3";
	resposta[1]="B";
	comentario[1]="O ser humano tem dois pulmões localizados no interior do peito";
	
	pergunta[2] = "Qual é o exame mais comum feito por rotina por um cardiologista é? ";
	Alt1[2]="Fezes";
	Alt2[2]="Urina";
	Alt3[2]="Eletrocardiograma";
	resposta[2]="C";
	comentario[2]="O Eletrocardiograma é a reprodução gráfica  do coração durante o seu funcionamento, o exame é realizado por cadiologistas";
	
	pergunta[3] = "É o órgão que bombeia o sangue de forma a que circule no corpo de todos os animais ?";
	Alt1[3]="Coração";
	Alt2[3]="Figado";
	Alt3[3]="Ventriculo auricular";
	resposta[3]="A";
	comentario[3]=" O coração bombeia o sangue para os pulmões e depois bombeia o sangue rico em oxigênio para o corpo. ";
	
	pergunta[4] = "Ser 'Sedentário' é o mesmo que";
	Alt1[4]="Praticar esportes radicais";
	Alt2[4]="Ficar parado sem praticar nenhum exercício físico";
	Alt3[4]="Praticar esportes em lugares fechados";
	resposta[4]="B";
	comentario[4]="Sedentarismo é definido como a falta, ausência ou diminuição de atividades físicas ou esportivas.";
	
	pergunta[5] = "Quando se come além da conta, há uma indisposição que se chama...";
	Alt1[5]="Tristeza";
	Alt2[5]="Indigestão";
	Alt3[5]="Cólica";
	resposta[5]="B";
	comentario[5]="Indigestão é descrita como a sensação de inchaço, algumas causas comuns incluem bebida ou comida em excesso";
	
	pergunta[6] = "Substância medica ou recurso medico utilizado para obter cura ou alívio";
	Alt1[6]="Drogas";
	Alt2[6]="Remédio";
	Alt3[6]="Roupas";
	resposta[6]="B";
	comentario[6]="Um remédio é qualquer substância ou recurso utilizado para obter cura ou alívio.";
	
	pergunta[7] = "Infecção viral altamente contagiosa que causa uma irritação cutânea com bolhas na pele?";
	Alt1[7]="Gripe";
	Alt2[7]="Catapora";
	Alt3[7]="Leucemia";
	resposta[7]="B";
	comentario[7]="O sintoma mais comum da catapora é uma irritação cutânea com bolhas na pele.";
	
	pergunta[8] = "Doença febril causada por um vírus transmitidos por picadas do mosquito Aedes aegypti";
	Alt1[8]="Dengue";
	Alt2[8]="Acne";
	Alt3[8]="Cancer";
	resposta[8]="A";
	comentario[8]="Dengue é uma doença febril grave.O transmissor da dengue é o mosquito Aedes aegypti, que precisa de água parada para se proliferar.";
	
	pergunta[9] = "Qual é o grupo de doenças que resultam em muito açúcar no sangue (alto nível de glicose no sangue).";
	Alt1[9]="Colesterol";
	Alt2[9]="Resfriado";
	Alt3[9]="Diabetes";
	resposta[9]="C";
	comentario[9]="Diabetes é uma doença causada pela falta ou má absorção de insulina, resultando portanto em acúmulo de glicose no sangue";
	
	
	questao.add(pergunta[i]);
	questao.add(Alt1[i]);
	questao.add(Alt2[i]);
	questao.add(Alt3[i]);
	questao.add(resposta[i]);
	questao.add(comentario[i]);
	return  questao; 
	
	}
	
	public ArrayList perguntanv2(int i) {
		String pergunta[] = new String[10];
		String Alt1[] = new String[10];
		String Alt2[] = new String[10];
		String Alt3[] = new String[10];
		String resposta[] = new String[10];
		String comentario[] = new String[10];
		
		ArrayList<String> questao = new ArrayList();
		pergunta[0] = "Qual desses casos significaria uma fratura ?";
		Alt1[0]="Um osso no braço está quebrado";
		Alt2[0]="Manchas de pele";
		Alt3[0]="Falta de elasticidade";
		resposta[0]="A";
		comentario[0]="Uma pessoa tem fratura quando ossos possuem uma ruptura";
		
		pergunta[1] = "Como tratar queimaduras solares ou pequenas queimaduras? ";
		Alt1[1]="Pasta de dente";
		Alt2[1]="Repouso imediato";
		Alt3[1]="Agua Fria";
		resposta[1]="C";
		comentario[1]="Em geral, é possível tratar de queimaduras solares e pequenas queimaduras em casa com Água fria";
		
		pergunta[2] = "A partir de qual temperatura o paciente está com febre? ";
		Alt1[2]="37°";
		Alt2[2]="41°";
		Alt3[2]="35°";
		resposta[2]="A";
		comentario[2]="Aumento temporário da temperatura corporal média de 37 °C, caracteriza uma febre";
		
		pergunta[3] = "Qual a especialidade medica que se ocupa ao tratamento da pele? ";
		Alt1[3]="Psicologia";
		Alt2[3]="Dermatologia";
		Alt3[3]="Pediatria";
		resposta[3]="B";
		comentario[3]="Dermatologia é a especialidade médica que se ocupa do diagnóstico e tratamento clinico-cirurgico relacionados a pele";
		
		pergunta[4] = "Qual é o maior orgão do corpo humano? ";
		Alt1[4]="Pele";
		Alt2[4]="Intestino grosso";
		Alt3[4]="Pulmao";
		resposta[4]="A";
		comentario[4]="A pele, em anatomia, é o órgão integrante do sistema tegumentar (junto ao cabelo e pelos, unhas) ";
		
		pergunta[5] = "Qual o maior musculo do corpo humano? ";
		Alt1[5]="Peitoral";
		Alt2[5]="Gluteo Maximo";
		Alt3[5]="Coração";
		resposta[5]="B";
		comentario[5]="O músculo glúteo máximo é um músculo da região glútea. E é o maior do corpo humano";
		
		pergunta[6] = "O que é Apendicite? ";
		Alt1[6]="Um orgão";
		Alt2[6]="Uma doença";
		Alt3[6]="Um musculo";
		resposta[6]="B";
		comentario[6]="É uma doença onde a condição em que o apêndice fica inflamado e cheio de pus, causando dor.";
		
		pergunta[7] = "Qual é o Orgão afetado pela cirrose?";
		Alt1[7]="Cerébro";
		Alt2[7]="Pulmão";
		Alt3[7]="Figado";
		resposta[7]="C";
		comentario[7]="Lesão hepática crônica no figado resultante de uma variedade de causas, levando à formação de cicatrizes.";
		
		pergunta[8] = "Como prevenir o Sarampo?";
		Alt1[8]="Bebendo bastante Água Potavel";
		Alt2[8]="Lavando os Alimentos antes de consumir";
		Alt3[8]="Vacinando";
		resposta[8]="C";
		comentario[8]="Sarampo pode ser evitado com a vacinação. É uma doença que se espalha pelo Ar.";
		
		pergunta[9] = "Qual o maior osso do corpo humano?";
		Alt1[9]="Fêmur";
		Alt2[9]="Tibia";
		Alt3[9]="Cranio";
		resposta[9]="A";
		comentario[9]="O fêmur é o osso mais longo e mais volumoso do corpo humano, e localiza-se na coxa.";
		
		
		questao.add(pergunta[i]);
		questao.add(Alt1[i]);
		questao.add(Alt2[i]);
		questao.add(Alt3[i]);
		questao.add(resposta[i]);
		questao.add(comentario[i]);
		return  questao;
	}
	
	public ArrayList perguntanv3(int i) {
		String pergunta[] = new String[10];
		String Alt1[] = new String[10];
		String Alt2[] = new String[10];
		String Alt3[] = new String[10];
		String resposta[] = new String[10];
		String comentario[] = new String[10];
		
		ArrayList<String> questao = new ArrayList();
		pergunta[0] = "Quantos ossos um adulto tem em média? ";
		Alt1[0]="206";
		Alt2[0]="109";
		Alt3[0]="307";
		resposta[0]="A";
		comentario[0]="O esqueleto de um bebê tem cerca de 270 ossos, os quais diminuem para 206 na idade adulta, uma vez que alguns ossos se fundem.";
		
		pergunta[1] = "Qual é o instrumento usado pelos cirurgiões para fazer incisões?  ";
		Alt1[1]="Agulha";
		Alt2[1]="Bisturi";
		Alt3[1]="Seringa";
		resposta[1]="B";
		comentario[1]="Bisturi é um instrumento cirúrgico, usado para fazer incisões, caracterizado por possuir uma lâmina muito afiada.";
		
		pergunta[2] = "Qual destas vacinas NAO protegem do sarampo? ";
		Alt1[2]="Tetra viral";
		Alt2[2]="Triplice viral";
		Alt3[2]="Tupla viral";
		resposta[2]="C";
		comentario[2]="Tríplice viral e Tetra viral sao vacinas contra a caxumba que devem ser tomadas com 12 e 15 meses respectivamente.";
		
		pergunta[3] = "Onde o DNA fica guardado ? ";
		Alt1[3]="Sangue";
		Alt2[3]="Cromossomos";
		Alt3[3]="Cabelo";
		resposta[3]="B";
		comentario[3]="O DNA é encontrado principalmente nos cromossomos no interior do núcleo celular.";
		
		pergunta[4] = "O que é ser hipocondriaco? ";
		Alt1[4]="Tem bexiga fraca";
		Alt2[4]="Tem uma deficiencia Imune";
		Alt3[4]="Intepretar cada sinal do corpo como uma doença grave";
		resposta[4]="C";
		comentario[4]="Hipocondriaco é obsessão com a ideia de ter um problema médico grave, mas não diagnosticado.";
		
		pergunta[5] = "Quantos litros de agua no minimo uma pessoa deve beber por dia ?";
		Alt1[5]="2 litros";
		Alt2[5]="5 litros";
		Alt3[5]="1 litro";
		resposta[5]="A";
		comentario[5]="A quantidade de água que deve ser consumida no dia é individual.Porém em media aproximadamente 2 litros é suficiente.";
		
		pergunta[6] = "Os globulos vermelhos parecem com ?";
		Alt1[6]="Esferas";
		Alt2[6]="Discos";
		Alt3[6]="Estrelas";
		resposta[6]="B";
		comentario[6]="Os glóbulos vermelhos são estruturas celulares responsáveis pelo transporte de oxigênio e lembram discos.";
		
		pergunta[7] = "Qual é o Pigmento responsavel pela cor da pele? ";
		Alt1[7]="Melanina";
		Alt2[7]="Hemoglobina";
		Alt3[7]="Bilirrubina";
		resposta[7]="A";
		comentario[7]="Melanina tem como principal função a pigmentação e proteção contra a radiação solar.";
		
		pergunta[8] = "Excesso de exposição ao sol causa diversas problemas EXCETO: ";
		Alt1[8]="Fibromialgia";
		Alt2[8]="Acne";
		Alt3[8]="Envelhecimento precoce";
		resposta[8]="A";
		comentario[8]="Fibromialgia são dores que ocorre em diferentes partes do corpo.Nao tem relação com exposição solar. ";
		
		pergunta[9] = "Todos esses sao sintomas de Mal de Parkisson, EXCETO: ";
		Alt1[9]="Perda de equilibrio";
		Alt2[9]="Obesidade";
		Alt3[9]="Ansiedade";
		resposta[9]="B";
		comentario[9]="O Mal de Parkinson é uma doença que ocorre quando certos neurônios morrem.Ansiedade e perda de equilibrio sao sintomas comuns.";
		
		
		questao.add(pergunta[i]);
		questao.add(Alt1[i]);
		questao.add(Alt2[i]);
		questao.add(Alt3[i]);
		questao.add(resposta[i]);
		questao.add(comentario[i]);
		return  questao;
	}
	public ArrayList perguntanv4(int i) {
		String pergunta[] = new String[10];
		String Alt1[] = new String[10];
		String Alt2[] = new String[10];
		String Alt3[] = new String[10];
		String resposta[] = new String[10];
		String comentario[] = new String[10];
		
		ArrayList<String> questao = new ArrayList();
		pergunta[0] = "Como a pessoa adquiri pneumonia? ";
		Alt1[0]="Ela é provocada pelo Ar";
		Alt2[0]="Falta de Higiene";
		Alt3[0]="Alimentação desregulada";
		resposta[0]="A";
		comentario[0]="A Pneumonia é provocada por causas desconhecidas ou por agentes nocivos inalados no ar";
		
		pergunta[1] = "O gás do oxigenio entra pelo nosso corpo, e segue ate o alvéolos, onde ocorrem trocas gasosas.Qual o nome dessa troca?";
		Alt1[1]="Endocriose";
		Alt2[1]="Hematose";
		Alt3[1]="Metamorfose";
		resposta[1]="B";
		comentario[1]="Hematose é o nome dado à transformação do sangue venoso em sangue arterial que ocorre nos pulmões, atraves da troca de gases. ";
		
		pergunta[2] = "Quais são os tipos de Epidermólise Bolhosa? ";
		Alt1[2]="Simples, Distrófica e Cardiotrofica";
		Alt2[2]="Simples, Juncional e Genetica ";
		Alt3[2]="Simples, Distrófica e Juncional";
		resposta[2]="C";
		comentario[2]="Epidermólise Bolhosa é classificada como EBS, EBD E EBJ, Simples,Distrófica e Juncional.";
		
		pergunta[3] = "Qual destas afirmativas está correta sobre: Genodermatose ";
		Alt1[3]="São doenças geneticas de má formaçao dos ossos ";
		Alt2[3]="São doenças de pele dectadas logo no nascimento";
		Alt3[3]="São doenças que de pele se desenvolve com o tempo";
		resposta[3]="B";
		comentario[3]="Genodermatoses são as doenças genéticas que são expressadas na pele detectadas logo no nascimento.";
		
		pergunta[4] = "Sindrome de turner é a anormalidade dos cromossomos sexuais mais comum nas mulheres, assinale a alternativa FALSA: ";
		Alt1[4]="O tratamento pode ajudar, mas essa doença não tem cura";
		Alt2[4]="Uma mulher diagnosticada com turner nao consegue engravidar";
		Alt3[4]="A síndrome de Turner normalmente causa menopausa precoce. ";
		resposta[4]="B";
		comentario[4]="Apesar da reduzida chance de engravidar, uma mulher ainda consegue uma possivel gestação na juventude.";
		
		pergunta[5] = "O que é um ar residual? ";
		Alt1[5]="É um ar toxico";
		Alt2[5]="É um ar que respiramos junto com carbono";
		Alt3[5]="É um ar contido no pulmão e nas vias respiratorias";
		resposta[5]="C";
		comentario[5]="Ar residual é o volume de ar que fica no pulmão após a expiração máxima.";
		
		pergunta[6] = "Situado na frente do esôfago que liga a laringe aos brônquios e serve para a passagem de ar. Estamos falando da...";
		Alt1[6]="Diafragma";
		Alt2[6]="Traqueia";
		Alt3[6]="Faringe";
		resposta[6]="B";
		comentario[6]="A Traqueia se inicia logo após a laringe. Responsaveis pela umificação do ar e conduzi-lo aos pulmoes.";
		
		pergunta[7] = "Como é chamado o tecido que reveste a superfície e as cavidades do nosso corpo? ";
		Alt1[7]="Tecido Epitelial";
		Alt2[7]="Tecido Nervoso";
		Alt3[7]="Tecido Conjuntivo";
		resposta[7]="A";
		comentario[7]="A principal função do tecido epitelial é revestir a superfície externa do corpo, as cavidades corporais internas e os órgãos.";
		
		pergunta[8] = "As células que defendem o nosso corpo de microrganismos intrusos é chamado de ?";
		Alt1[8]="Plaquetas";
		Alt2[8]="Globulos brancos";
		Alt3[8]="Globulos vermelhos";
		resposta[8]="B";
		comentario[8]="Os glóbulos brancos são os heróis que defendem o seu corpo ";
		
		pergunta[9] = "Fabrica os elementos do sangue como: hemácias (glóbulos vermelhos), leucócitos (glóbulos brancos) e plaquetas. Estamos falando de ?";
		Alt1[9]="Tutano";
		Alt2[9]="Artérias Trabeculares";
		Alt3[9]="Timo";
		resposta[9]="A";
		comentario[9]="o Tutano é o tecido liquido gelatinoso que preenche as cavidades ósseas, conhecido também como medula ossea.";
		
		
		questao.add(pergunta[i]);
		questao.add(Alt1[i]);
		questao.add(Alt2[i]);
		questao.add(Alt3[i]);
		questao.add(resposta[i]);
		questao.add(comentario[i]);
		return  questao;
	}
	
}


