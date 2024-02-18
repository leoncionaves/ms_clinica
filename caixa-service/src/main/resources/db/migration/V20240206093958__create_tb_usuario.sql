
CREATE TABLE public.usuarios (
	id int8 NOT NULL,
	email varchar(100) NULL,
	bairro varchar(100) NULL,
	cep varchar(10) NULL,
	cidade varchar(255) NULL,
	complemento varchar(150) NULL,
	logradouro varchar(255) NULL,
	numero varchar(10) NULL,
	uf varchar(2) NULL,
	nome varchar(100) NULL,
	telefone varchar(20) NULL,
	ativo bool DEFAULT true NOT NULL,
	data_cadastro timestamp DEFAULT now() NULL,
	usuario varchar(100) NOT NULL,
	senha varchar(100) NOT NULL,
	"role" varchar(50) NOT NULL,
	CONSTRAINT usuarios_pkey PRIMARY KEY (id),
	CONSTRAINT usuarios_usuario_key UNIQUE (usuario)
);

CREATE SEQUENCE public.seq_pessoa
	INCREMENT BY 1
	MINVALUE 1
	MAXVALUE 9223372036854775807
	START 1
	CACHE 1
	NO CYCLE;

INSERT INTO public.usuarios
    (id, email, bairro, cep, cidade, complemento, logradouro, numero, uf, nome, telefone, ativo, data_cadastro, usuario, senha, role)
    VALUES(1, 'string', 'string', 'string', 'string', 'string', 'string', 'string', 'AC', 'string', '36442755368', true, '2023-10-31 21:51:28.034', 'string', '$2a$10$ChIJmT.dUUZkJECQNzXhnOxSZW2rLi0yvdGQzUFJUKg2n9uH9TtB2', '0');