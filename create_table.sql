create table "ROOT".CLIENTE
(

	ID_CLIENTE BIGINT not null primary key

        GENERATED ALWAYS AS IDENTITY
        (START WITH 1, INCREMENT BY 1),
	NOME VARCHAR(255),
	SOBRENOME VARCHAR(255),
	DATANASCIMENTO DATE,
	CPF VARCHAR(12),
	TELEFONE VARCHAR(14),
	SEXO VARCHAR(20)
);


create table "ROOT".PRODUTO(
	IDPRODUTO BIGINT not null primary key
        GENERATED ALWAYS AS IDENTITY
        (START WITH 1, INCREMENT BY 1),
    NOME VARCHAR(60),
    MARCA VARCHAR(60),
    PRECO DECIMAL(10,2),
    QUANTIDADE INT
);

create table "ROOT".FILIAL(
	ID_FILIAL BIGINT not null primary key
        GENERATED ALWAYS AS IDENTITY
        (START WITH 1, INCREMENT BY 1),
    NOME VARCHAR(60),
);

create table "ROOT".ENDERECO(
	ID_FILIAL BIGINT not null primary key
        GENERATED ALWAYS AS IDENTITY
        (START WITH 1, INCREMENT BY 1),
    Bairro VARCHAR(60),
    CEP VARCHAR(60),
    PAIS VARCHAR(60),
    RUA VARCHAR(60),
    COMPLEMENTO VARCHAR(60),
    NUMERO VARCHAR(60),
    UF VARCHAR(60),
    CIDADE VARCHAR(60)
);


CREATE TABLE "ROOT".VENDA(
    ID_VENDA BIGINT NOT NULL PRIMARY KEY GENERATED ALWAYS AS IDENTITY
        (START WITH 1, INCREMENT BY 1),
    ID_CLIENTE BIGINT,
    ID_FILIAL BIGINT,
    TOTAL decimal(10,2),
    DATA_VENDA date,
    FOREIGN KEY(ID_CLIENTE) REFERENCES CLIENTE(ID_CLIENTE),
    FOREIGN KEY(ID_FILIAL) REFERENCES FILIAL(ID_FILIAL)
);

CREATE TABLE "ROOT".CARRINHO(
    ID_CARRINHO BIGINT NOT NULL PRIMARY KEY GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),
    ID_VENDA BIGINT,
    ID_PRODUTO BIGINT,
    QUANTIDADE DECIMAL(10,2),
FOREIGN KEY (ID_VENDA) REFERENCES VENDA(ID_VENDA),
FOREIGN KEY (ID_PRODUTO) REFERENCES VENDA(IDPRODITO)
);
