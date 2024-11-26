create database pw3_study;
use pw3_study;

CREATE TABLE TBL_DISCIPLINA(
    ID_DISCIPLINA BIGINT primary key identity ,
    TX_NOME VARCHAR(60) NOT NULL
);	


CREATE TABLE TBL_MONITOR(
	ID_MONITOR BIGINT PRIMARY KEY IDENTITY,
	TX_NOME VARCHAR(60) NOT NULL,
	TX_FOTO VARCHAR(255) NOT NULL,
	TX_WHATSAPP VARCHAR(11) NOT NULL,
	TX_EMAIL VARCHAR(40) NOT NULL,
	TX_CONTEUDO VARCHAR(1000) NOT NULL,
	ID_DISCIPLINA BIGINT NOT NULL,
	FOREIGN KEY (ID_DISCIPLINA) REFERENCES TBL_DISCIPLINA (ID_DISCIPLINA)
);

CREATE TABLE TBL_DISPONIBILIDADE(
    ID_DISPONIBILIDADE BIGINT  PRIMARY KEY IDENTITY,
    TX_DIA_SEMANA VARCHAR(30) NOT NULL,
    DT_DAS DATETIME NOT NULL,
    DT_ATE DATETIME NOT NULL,
	
);

CREATE TABLE TBL_REL_MONITOR_DISPONIBILIDADE(
	ID_MONITOR BIGINT NOT NULL,
	ID_DISPONIBILIDADE BIGINT NOT NULL,
	FOREIGN KEY (ID_MONITOR) REFERENCES TBL_MONITOR (ID_MONITOR),
	FOREIGN KEY (ID_DISPONIBILIDADE) REFERENCES TBL_DISPONIBILIDADE (ID_DISPONIBILIDADE)
);

CREATE TABLE TBL_CONEXAO(
	ID_CONEXAO BIGINT NOT NULL PRIMARY KEY IDENTITY,
	DT_CRIACAO DATETIME NOT NULL,
	ID_MONITOR BIGINT NOT NULL,
	FOREIGN KEY (ID_MONITOR) REFERENCES TBL_MONITOR (ID_MONITOR)
);

INSERT INTO TBL_DISCIPLINA VALUES('Programação Web');
INSERT INTO TBL_DISCIPLINA VALUES('Banco de dados');
INSERT INTO TBL_DISCIPLINA VALUES('Matemática');

INSERT INTO TBL_MONITOR VALUES('Amanda Souza Gomes', 'https://images.generated.photos/-t6chrwY4d4Ro2AXJ8fY0jv6NsX7rbGyejtYzHRF704/rs:fit:512:512/wm:0.95:sowe:18:18:0.33/czM6Ly9pY29uczgu/Z3Bob3Rvcy1wcm9k/LnBob3Rvcy92M18w/NDM4Njk0LmpwZw.jpg', '11997894561', 'amanda-souza-gomes@armyspy.com', 'bla bla bla bla', 1);
INSERT INTO TBL_MONITOR VALUES('Paulo Souza Gomes', 'https://images.generated.photos/i6niea3KzCXKtAe7I1HujD7aUMH_bn_8iE6t5Ovj5lM/rs:fit:256:256/czM6Ly9pY29uczgu/Z3Bob3Rvcy1wcm9k/LnBob3Rvcy92M18w/NjE0MzU0LmpwZw.jpg','11997894511', 'paulo-souza-gomes@armyspy.com', 'bla bla bla bla', 2);

INSERT INTO TBL_CONEXAO VALUES('2024/09/10', 2);
INSERT INTO TBL_CONEXAO VALUES('2024/09/12', 2);
INSERT INTO TBL_CONEXAO VALUES('2024/09/14', 2);
INSERT INTO TBL_CONEXAO VALUES('2024/09/16', 1);