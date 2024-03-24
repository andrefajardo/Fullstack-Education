DROP TABLE IF EXISTS public.emprestimo;
CREATE TABLE IF NOT EXISTS public.emprestimo
(
    id bigint NOT NULL,
    data_devolucao date,
    data_emprestimo date,
    livro_id bigint NOT NULL,
    membro_id bigint NOT NULL,
    CONSTRAINT emprestimo_pkey PRIMARY KEY (id),
    CONSTRAINT fklraqo5mkov260qr5h3es93sgr FOREIGN KEY (livro_id)
        REFERENCES public.livro (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION,
    CONSTRAINT fkphy0kpewrd59eiwuam1mb47xo FOREIGN KEY (membro_id)
        REFERENCES public.membro (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)

DROP TABLE IF EXISTS public.bibliotecario;
CREATE TABLE IF NOT EXISTS public.bibliotecario
(
    id bigint NOT NULL DEFAULT nextval('bibliotecario_id_seq'::regclass),
    email character varying(255) COLLATE pg_catalog."default",
    nome character varying(255) COLLATE pg_catalog."default",
    senha character varying(255) COLLATE pg_catalog."default",
    CONSTRAINT bibliotecario_pkey PRIMARY KEY (id)
)

DROP TABLE IF EXISTS public.livro;
CREATE TABLE IF NOT EXISTS public.livro
(
    id bigint NOT NULL DEFAULT nextval('livro_id_seq'::regclass),
    ano_publicacao integer,
    autor character varying(255) COLLATE pg_catalog."default",
    titulo character varying(255) COLLATE pg_catalog."default",
    CONSTRAINT livro_pkey PRIMARY KEY (id)
)

DROP TABLE IF EXISTS public.membro;
CREATE TABLE IF NOT EXISTS public.membro
(
    id bigint NOT NULL DEFAULT nextval('membro_id_seq'::regclass),
    endereco character varying(255) COLLATE pg_catalog."default",
    nome character varying(255) COLLATE pg_catalog."default",
    telefone character varying(255) COLLATE pg_catalog."default",
    CONSTRAINT membro_pkey PRIMARY KEY (id)
)

DROP TABLE IF EXISTS public.visitante;
CREATE TABLE IF NOT EXISTS public.visitante
(
    id bigint NOT NULL DEFAULT nextval('visitante_id_seq'::regclass),
    nome character varying(255) COLLATE pg_catalog."default",
    telefone character varying(255) COLLATE pg_catalog."default",
    CONSTRAINT visitante_pkey PRIMARY KEY (id)
)