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
	pergunta[0] = "Quantos cora��es uma pessoa tem? ";
	Alt1[0]="1";
	Alt2[0]="2";
	Alt3[0]="3";
	resposta[0]="A";
	comentario[0]="Uma pessoa tem apenas um cora��o";
	
	pergunta[1] = "Quantos pulmoes uma pessoa normalmente tem? ";
	Alt1[1]="1";
	Alt2[1]="2";
	Alt3[1]="3";
	resposta[1]="B";
	comentario[1]="O ser humano tem dois pulm�es localizados no interior do peito";
	
	pergunta[2] = "Qual � o exame mais comum feito por rotina por um cardiologista �? ";
	Alt1[2]="Fezes";
	Alt2[2]="Urina";
	Alt3[2]="Eletrocardiograma";
	resposta[2]="C";
	comentario[2]="O Eletrocardiograma � a reprodu��o gr�fica  do cora��o durante o seu funcionamento, o exame � realizado por cadiologistas";
	
	pergunta[3] = "� o �rg�o que bombeia o sangue de forma a que circule no corpo de todos os animais ?";
	Alt1[3]="Cora��o";
	Alt2[3]="Figado";
	Alt3[3]="Ventriculo auricular";
	resposta[3]="A";
	comentario[3]=" O cora��o bombeia o sangue para os pulm�es e depois bombeia o sangue rico em oxig�nio para o corpo. ";
	
	pergunta[4] = "Ser 'Sedent�rio' � o mesmo que";
	Alt1[4]="Praticar esportes radicais";
	Alt2[4]="Ficar parado sem praticar nenhum exerc�cio f�sico";
	Alt3[4]="Praticar esportes em lugares fechados";
	resposta[4]="B";
	comentario[4]="Sedentarismo � definido como a falta, aus�ncia ou diminui��o de atividades f�sicas ou esportivas.";
	
	pergunta[5] = "Quando se come al�m da conta, h� uma indisposi��o que se chama...";
	Alt1[5]="Tristeza";
	Alt2[5]="Indigest�o";
	Alt3[5]="C�lica";
	resposta[5]="B";
	comentario[5]="Indigest�o � descrita como a sensa��o de incha�o, algumas causas comuns incluem bebida ou comida em excesso";
	
	pergunta[6] = "Subst�ncia medica ou recurso medico utilizado para obter cura ou al�vio";
	Alt1[6]="Drogas";
	Alt2[6]="Rem�dio";
	Alt3[6]="Roupas";
	resposta[6]="B";
	comentario[6]="Um rem�dio � qualquer subst�ncia ou recurso utilizado para obter cura ou al�vio.";
	
	pergunta[7] = "Infec��o viral altamente contagiosa que causa uma irrita��o cut�nea com bolhas na pele?";
	Alt1[7]="Gripe";
	Alt2[7]="Catapora";
	Alt3[7]="Leucemia";
	resposta[7]="B";
	comentario[7]="O sintoma mais comum da catapora � uma irrita��o cut�nea com bolhas na pele.";
	
	pergunta[8] = "Doen�a febril causada por um v�rus transmitidos por picadas do mosquito Aedes aegypti";
	Alt1[8]="Dengue";
	Alt2[8]="Acne";
	Alt3[8]="Cancer";
	resposta[8]="A";
	comentario[8]="Dengue � uma doen�a febril grave.O transmissor da dengue � o mosquito Aedes aegypti, que precisa de �gua parada para se proliferar.";
	
	pergunta[9] = "Qual � o grupo de doen�as que resultam em muito a��car no sangue (alto n�vel de glicose no sangue).";
	Alt1[9]="Colesterol";
	Alt2[9]="Resfriado";
	Alt3[9]="Diabetes";
	resposta[9]="C";
	comentario[9]="Diabetes � uma doen�a causada pela falta ou m� absor��o de insulina, resultando portanto em ac�mulo de glicose no sangue";
	
	
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
		Alt1[0]="Um osso no bra�o est� quebrado";
		Alt2[0]="Manchas de pele";
		Alt3[0]="Falta de elasticidade";
		resposta[0]="A";
		comentario[0]="Uma pessoa tem fratura quando ossos possuem uma ruptura";
		
		pergunta[1] = "Como tratar queimaduras solares ou pequenas queimaduras? ";
		Alt1[1]="Pasta de dente";
		Alt2[1]="Repouso imediato";
		Alt3[1]="Agua Fria";
		resposta[1]="C";
		comentario[1]="Em geral, � poss�vel tratar de queimaduras solares e pequenas queimaduras em casa com �gua fria";
		
		pergunta[2] = "A partir de qual temperatura o paciente est� com febre? ";
		Alt1[2]="37�";
		Alt2[2]="41�";
		Alt3[2]="35�";
		resposta[2]="A";
		comentario[2]="Aumento tempor�rio da temperatura corporal m�dia de 37 �C, caracteriza uma febre";
		
		pergunta[3] = "Qual a especialidade medica que se ocupa ao tratamento da pele? ";
		Alt1[3]="Psicologia";
		Alt2[3]="Dermatologia";
		Alt3[3]="Pediatria";
		resposta[3]="B";
		comentario[3]="Dermatologia � a especialidade m�dica que se ocupa do diagn�stico e tratamento clinico-cirurgico relacionados a pele";
		
		pergunta[4] = "Qual � o maior org�o do corpo humano? ";
		Alt1[4]="Pele";
		Alt2[4]="Intestino grosso";
		Alt3[4]="Pulmao";
		resposta[4]="A";
		comentario[4]="A pele, em anatomia, � o �rg�o integrante do sistema tegumentar (junto ao cabelo e pelos, unhas) ";
		
		pergunta[5] = "Qual o maior musculo do corpo humano? ";
		Alt1[5]="Peitoral";
		Alt2[5]="Gluteo Maximo";
		Alt3[5]="Cora��o";
		resposta[5]="B";
		comentario[5]="O m�sculo gl�teo m�ximo � um m�sculo da regi�o gl�tea. E � o maior do corpo humano";
		
		pergunta[6] = "O que � Apendicite? ";
		Alt1[6]="Um org�o";
		Alt2[6]="Uma doen�a";
		Alt3[6]="Um musculo";
		resposta[6]="B";
		comentario[6]="� uma doen�a onde a condi��o em que o ap�ndice fica inflamado e cheio de pus, causando dor.";
		
		pergunta[7] = "Qual � o Org�o afetado pela cirrose?";
		Alt1[7]="Cer�bro";
		Alt2[7]="Pulm�o";
		Alt3[7]="Figado";
		resposta[7]="C";
		comentario[7]="Les�o hep�tica cr�nica no figado resultante de uma variedade de causas, levando � forma��o de cicatrizes.";
		
		pergunta[8] = "Como prevenir o Sarampo?";
		Alt1[8]="Bebendo bastante �gua Potavel";
		Alt2[8]="Lavando os Alimentos antes de consumir";
		Alt3[8]="Vacinando";
		resposta[8]="C";
		comentario[8]="Sarampo pode ser evitado com a vacina��o. � uma doen�a que se espalha pelo Ar.";
		
		pergunta[9] = "Qual o maior osso do corpo humano?";
		Alt1[9]="F�mur";
		Alt2[9]="Tibia";
		Alt3[9]="Cranio";
		resposta[9]="A";
		comentario[9]="O f�mur � o osso mais longo e mais volumoso do corpo humano, e localiza-se na coxa.";
		
		
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
		pergunta[0] = "Quantos ossos um adulto tem em m�dia? ";
		Alt1[0]="206";
		Alt2[0]="109";
		Alt3[0]="307";
		resposta[0]="A";
		comentario[0]="O esqueleto de um beb� tem cerca de 270 ossos, os quais diminuem para 206 na idade adulta, uma vez que alguns ossos se fundem.";
		
		pergunta[1] = "Qual � o instrumento usado pelos cirurgi�es para fazer incis�es?  ";
		Alt1[1]="Agulha";
		Alt2[1]="Bisturi";
		Alt3[1]="Seringa";
		resposta[1]="B";
		comentario[1]="Bisturi � um instrumento cir�rgico, usado para fazer incis�es, caracterizado por possuir uma l�mina muito afiada.";
		
		pergunta[2] = "Qual destas vacinas NAO protegem do sarampo? ";
		Alt1[2]="Tetra viral";
		Alt2[2]="Triplice viral";
		Alt3[2]="Tupla viral";
		resposta[2]="C";
		comentario[2]="Tr�plice viral e Tetra viral sao vacinas contra a caxumba que devem ser tomadas com 12 e 15 meses respectivamente.";
		
		pergunta[3] = "Onde o DNA fica guardado ? ";
		Alt1[3]="Sangue";
		Alt2[3]="Cromossomos";
		Alt3[3]="Cabelo";
		resposta[3]="B";
		comentario[3]="O DNA � encontrado principalmente nos cromossomos no interior do n�cleo celular.";
		
		pergunta[4] = "O que � ser hipocondriaco? ";
		Alt1[4]="Tem bexiga fraca";
		Alt2[4]="Tem uma deficiencia Imune";
		Alt3[4]="Intepretar cada sinal do corpo como uma doen�a grave";
		resposta[4]="C";
		comentario[4]="Hipocondriaco � obsess�o com a ideia de ter um problema m�dico grave, mas n�o diagnosticado.";
		
		pergunta[5] = "Quantos litros de agua no minimo uma pessoa deve beber por dia ?";
		Alt1[5]="2 litros";
		Alt2[5]="5 litros";
		Alt3[5]="1 litro";
		resposta[5]="A";
		comentario[5]="A quantidade de �gua que deve ser consumida no dia � individual.Por�m em media aproximadamente 2 litros � suficiente.";
		
		pergunta[6] = "Os globulos vermelhos parecem com ?";
		Alt1[6]="Esferas";
		Alt2[6]="Discos";
		Alt3[6]="Estrelas";
		resposta[6]="B";
		comentario[6]="Os gl�bulos vermelhos s�o estruturas celulares respons�veis pelo transporte de oxig�nio e lembram discos.";
		
		pergunta[7] = "Qual � o Pigmento responsavel pela cor da pele? ";
		Alt1[7]="Melanina";
		Alt2[7]="Hemoglobina";
		Alt3[7]="Bilirrubina";
		resposta[7]="A";
		comentario[7]="Melanina tem como principal fun��o a pigmenta��o e prote��o contra a radia��o solar.";
		
		pergunta[8] = "Excesso de exposi��o ao sol causa diversas problemas EXCETO: ";
		Alt1[8]="Fibromialgia";
		Alt2[8]="Acne";
		Alt3[8]="Envelhecimento precoce";
		resposta[8]="A";
		comentario[8]="Fibromialgia s�o dores que ocorre em diferentes partes do corpo.Nao tem rela��o com exposi��o solar. ";
		
		pergunta[9] = "Todos esses sao sintomas de Mal de Parkisson, EXCETO: ";
		Alt1[9]="Perda de equilibrio";
		Alt2[9]="Obesidade";
		Alt3[9]="Ansiedade";
		resposta[9]="B";
		comentario[9]="O Mal de Parkinson � uma doen�a que ocorre quando certos neur�nios morrem.Ansiedade e perda de equilibrio sao sintomas comuns.";
		
		
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
		Alt1[0]="Ela � provocada pelo Ar";
		Alt2[0]="Falta de Higiene";
		Alt3[0]="Alimenta��o desregulada";
		resposta[0]="A";
		comentario[0]="A Pneumonia � provocada por causas desconhecidas ou por agentes nocivos inalados no ar";
		
		pergunta[1] = "O g�s do oxigenio entra pelo nosso corpo, e segue ate o alv�olos, onde ocorrem trocas gasosas.Qual o nome dessa troca?";
		Alt1[1]="Endocriose";
		Alt2[1]="Hematose";
		Alt3[1]="Metamorfose";
		resposta[1]="B";
		comentario[1]="Hematose � o nome dado � transforma��o do sangue venoso em sangue arterial que ocorre nos pulm�es, atraves da troca de gases. ";
		
		pergunta[2] = "Quais s�o os tipos de Epiderm�lise Bolhosa? ";
		Alt1[2]="Simples, Distr�fica e Cardiotrofica";
		Alt2[2]="Simples, Juncional e Genetica ";
		Alt3[2]="Simples, Distr�fica e Juncional";
		resposta[2]="C";
		comentario[2]="Epiderm�lise Bolhosa � classificada como EBS, EBD E EBJ, Simples,Distr�fica e Juncional.";
		
		pergunta[3] = "Qual destas afirmativas est� correta sobre: Genodermatose ";
		Alt1[3]="S�o doen�as geneticas de m� forma�ao dos ossos ";
		Alt2[3]="S�o doen�as de pele dectadas logo no nascimento";
		Alt3[3]="S�o doen�as que de pele se desenvolve com o tempo";
		resposta[3]="B";
		comentario[3]="Genodermatoses s�o as doen�as gen�ticas que s�o expressadas na pele detectadas logo no nascimento.";
		
		pergunta[4] = "Sindrome de turner � a anormalidade dos cromossomos sexuais mais comum nas mulheres, assinale a alternativa FALSA: ";
		Alt1[4]="O tratamento pode ajudar, mas essa doen�a n�o tem cura";
		Alt2[4]="Uma mulher diagnosticada com turner nao consegue engravidar";
		Alt3[4]="A s�ndrome de Turner normalmente causa menopausa precoce. ";
		resposta[4]="B";
		comentario[4]="Apesar da reduzida chance de engravidar, uma mulher ainda consegue uma possivel gesta��o na juventude.";
		
		pergunta[5] = "O que � um ar residual? ";
		Alt1[5]="� um ar toxico";
		Alt2[5]="� um ar que respiramos junto com carbono";
		Alt3[5]="� um ar contido no pulm�o e nas vias respiratorias";
		resposta[5]="C";
		comentario[5]="Ar residual � o volume de ar que fica no pulm�o ap�s a expira��o m�xima.";
		
		pergunta[6] = "Situado na frente do es�fago que liga a laringe aos br�nquios e serve para a passagem de ar. Estamos falando da...";
		Alt1[6]="Diafragma";
		Alt2[6]="Traqueia";
		Alt3[6]="Faringe";
		resposta[6]="B";
		comentario[6]="A Traqueia se inicia logo ap�s a laringe. Responsaveis pela umifica��o do ar e conduzi-lo aos pulmoes.";
		
		pergunta[7] = "Como � chamado o tecido que reveste a superf�cie e as cavidades do nosso corpo? ";
		Alt1[7]="Tecido Epitelial";
		Alt2[7]="Tecido Nervoso";
		Alt3[7]="Tecido Conjuntivo";
		resposta[7]="A";
		comentario[7]="A principal fun��o do tecido epitelial � revestir a superf�cie externa do corpo, as cavidades corporais internas e os �rg�os.";
		
		pergunta[8] = "As c�lulas que defendem o nosso corpo de microrganismos intrusos � chamado de ?";
		Alt1[8]="Plaquetas";
		Alt2[8]="Globulos brancos";
		Alt3[8]="Globulos vermelhos";
		resposta[8]="B";
		comentario[8]="Os gl�bulos brancos s�o os her�is que defendem o seu corpo ";
		
		pergunta[9] = "Fabrica os elementos do sangue como: hem�cias (gl�bulos vermelhos), leuc�citos (gl�bulos brancos) e plaquetas. Estamos falando de ?";
		Alt1[9]="Tutano";
		Alt2[9]="Art�rias Trabeculares";
		Alt3[9]="Timo";
		resposta[9]="A";
		comentario[9]="o Tutano � o tecido liquido gelatinoso que preenche as cavidades �sseas, conhecido tamb�m como medula ossea.";
		
		
		questao.add(pergunta[i]);
		questao.add(Alt1[i]);
		questao.add(Alt2[i]);
		questao.add(Alt3[i]);
		questao.add(resposta[i]);
		questao.add(comentario[i]);
		return  questao;
	}
	
}


