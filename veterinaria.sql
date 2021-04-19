--
-- PostgreSQL database dump
--

-- Dumped from database version 13.2
-- Dumped by pg_dump version 13.2

-- Started on 2021-04-18 17:04:36

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- TOC entry 201 (class 1259 OID 26108)
-- Name: colaborador; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.colaborador (
    id integer NOT NULL,
    nombre character varying(255),
    apellido character varying(255),
    cargo character varying(255),
    especialidad character varying(255) NOT NULL,
    tipo_documento character varying(3),
    documento_identificacion integer
);


ALTER TABLE public.colaborador OWNER TO postgres;

--
-- TOC entry 200 (class 1259 OID 26106)
-- Name: colaborador_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.colaborador_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.colaborador_id_seq OWNER TO postgres;

--
-- TOC entry 3066 (class 0 OID 0)
-- Dependencies: 200
-- Name: colaborador_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.colaborador_id_seq OWNED BY public.colaborador.id;


--
-- TOC entry 205 (class 1259 OID 26121)
-- Name: detalle_historia_clinica; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.detalle_historia_clinica (
    id integer NOT NULL,
    temperatura character varying(255),
    peso numeric(19,2),
    frecuencia_cardiaca numeric(19,2),
    frecuencia_respiratoria numeric(19,2),
    fecha_hora timestamp without time zone DEFAULT LOCALTIMESTAMP,
    alimentacion character varying(255),
    habitad character varying(255),
    observacion character varying(255),
    colaborador_id integer NOT NULL,
    historia_clinica_id integer NOT NULL
);


ALTER TABLE public.detalle_historia_clinica OWNER TO postgres;

--
-- TOC entry 203 (class 1259 OID 26117)
-- Name: detalle_historia_clinica_colaborador_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.detalle_historia_clinica_colaborador_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.detalle_historia_clinica_colaborador_id_seq OWNER TO postgres;

--
-- TOC entry 3067 (class 0 OID 0)
-- Dependencies: 203
-- Name: detalle_historia_clinica_colaborador_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.detalle_historia_clinica_colaborador_id_seq OWNED BY public.detalle_historia_clinica.colaborador_id;


--
-- TOC entry 204 (class 1259 OID 26119)
-- Name: detalle_historia_clinica_historia_clinica_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.detalle_historia_clinica_historia_clinica_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.detalle_historia_clinica_historia_clinica_id_seq OWNER TO postgres;

--
-- TOC entry 3068 (class 0 OID 0)
-- Dependencies: 204
-- Name: detalle_historia_clinica_historia_clinica_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.detalle_historia_clinica_historia_clinica_id_seq OWNED BY public.detalle_historia_clinica.historia_clinica_id;


--
-- TOC entry 202 (class 1259 OID 26115)
-- Name: detalle_historia_clinica_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.detalle_historia_clinica_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.detalle_historia_clinica_id_seq OWNER TO postgres;

--
-- TOC entry 3069 (class 0 OID 0)
-- Dependencies: 202
-- Name: detalle_historia_clinica_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.detalle_historia_clinica_id_seq OWNED BY public.detalle_historia_clinica.id;


--
-- TOC entry 208 (class 1259 OID 26135)
-- Name: historia_clinica; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.historia_clinica (
    id integer NOT NULL,
    mascota_id integer NOT NULL,
    fecha_creacion timestamp without time zone DEFAULT LOCALTIMESTAMP
);


ALTER TABLE public.historia_clinica OWNER TO postgres;

--
-- TOC entry 206 (class 1259 OID 26131)
-- Name: historia_clinica_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.historia_clinica_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.historia_clinica_id_seq OWNER TO postgres;

--
-- TOC entry 3070 (class 0 OID 0)
-- Dependencies: 206
-- Name: historia_clinica_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.historia_clinica_id_seq OWNED BY public.historia_clinica.id;


--
-- TOC entry 207 (class 1259 OID 26133)
-- Name: historia_clinica_mascota_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.historia_clinica_mascota_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.historia_clinica_mascota_id_seq OWNER TO postgres;

--
-- TOC entry 3071 (class 0 OID 0)
-- Dependencies: 207
-- Name: historia_clinica_mascota_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.historia_clinica_mascota_id_seq OWNED BY public.historia_clinica.mascota_id;


--
-- TOC entry 211 (class 1259 OID 26145)
-- Name: mascota; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.mascota (
    id integer NOT NULL,
    nombre character varying(255),
    raza character varying(255),
    usuario_id integer NOT NULL,
    sexo character(255)
);


ALTER TABLE public.mascota OWNER TO postgres;

--
-- TOC entry 209 (class 1259 OID 26141)
-- Name: mascota_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.mascota_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.mascota_id_seq OWNER TO postgres;

--
-- TOC entry 3072 (class 0 OID 0)
-- Dependencies: 209
-- Name: mascota_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.mascota_id_seq OWNED BY public.mascota.id;


--
-- TOC entry 210 (class 1259 OID 26143)
-- Name: mascota_usuario_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.mascota_usuario_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.mascota_usuario_id_seq OWNER TO postgres;

--
-- TOC entry 3073 (class 0 OID 0)
-- Dependencies: 210
-- Name: mascota_usuario_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.mascota_usuario_id_seq OWNED BY public.mascota.usuario_id;


--
-- TOC entry 213 (class 1259 OID 26155)
-- Name: usuario; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.usuario (
    id integer NOT NULL,
    nombre character varying(255),
    apellido character varying(255),
    tipo_documento character(255),
    documento_identificacion integer NOT NULL,
    estado character(255),
    sexo character(255)
);


ALTER TABLE public.usuario OWNER TO postgres;

--
-- TOC entry 212 (class 1259 OID 26153)
-- Name: usuario_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.usuario_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.usuario_id_seq OWNER TO postgres;

--
-- TOC entry 3074 (class 0 OID 0)
-- Dependencies: 212
-- Name: usuario_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.usuario_id_seq OWNED BY public.usuario.id;


--
-- TOC entry 2886 (class 2604 OID 26111)
-- Name: colaborador id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.colaborador ALTER COLUMN id SET DEFAULT nextval('public.colaborador_id_seq'::regclass);


--
-- TOC entry 2887 (class 2604 OID 26124)
-- Name: detalle_historia_clinica id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.detalle_historia_clinica ALTER COLUMN id SET DEFAULT nextval('public.detalle_historia_clinica_id_seq'::regclass);


--
-- TOC entry 2889 (class 2604 OID 26126)
-- Name: detalle_historia_clinica colaborador_id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.detalle_historia_clinica ALTER COLUMN colaborador_id SET DEFAULT nextval('public.detalle_historia_clinica_colaborador_id_seq'::regclass);


--
-- TOC entry 2890 (class 2604 OID 26127)
-- Name: detalle_historia_clinica historia_clinica_id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.detalle_historia_clinica ALTER COLUMN historia_clinica_id SET DEFAULT nextval('public.detalle_historia_clinica_historia_clinica_id_seq'::regclass);


--
-- TOC entry 2891 (class 2604 OID 26138)
-- Name: historia_clinica id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.historia_clinica ALTER COLUMN id SET DEFAULT nextval('public.historia_clinica_id_seq'::regclass);


--
-- TOC entry 2892 (class 2604 OID 26139)
-- Name: historia_clinica mascota_id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.historia_clinica ALTER COLUMN mascota_id SET DEFAULT nextval('public.historia_clinica_mascota_id_seq'::regclass);


--
-- TOC entry 2894 (class 2604 OID 26148)
-- Name: mascota id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.mascota ALTER COLUMN id SET DEFAULT nextval('public.mascota_id_seq'::regclass);


--
-- TOC entry 2895 (class 2604 OID 26149)
-- Name: mascota usuario_id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.mascota ALTER COLUMN usuario_id SET DEFAULT nextval('public.mascota_usuario_id_seq'::regclass);


--
-- TOC entry 2896 (class 2604 OID 26158)
-- Name: usuario id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.usuario ALTER COLUMN id SET DEFAULT nextval('public.usuario_id_seq'::regclass);


--
-- TOC entry 3048 (class 0 OID 26108)
-- Dependencies: 201
-- Data for Name: colaborador; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.colaborador (id, nombre, apellido, cargo, especialidad, tipo_documento, documento_identificacion) FROM stdin;
\.


--
-- TOC entry 3052 (class 0 OID 26121)
-- Dependencies: 205
-- Data for Name: detalle_historia_clinica; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.detalle_historia_clinica (id, temperatura, peso, frecuencia_cardiaca, frecuencia_respiratoria, fecha_hora, alimentacion, habitad, observacion, colaborador_id, historia_clinica_id) FROM stdin;
\.


--
-- TOC entry 3055 (class 0 OID 26135)
-- Dependencies: 208
-- Data for Name: historia_clinica; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.historia_clinica (id, mascota_id, fecha_creacion) FROM stdin;
\.


--
-- TOC entry 3058 (class 0 OID 26145)
-- Dependencies: 211
-- Data for Name: mascota; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.mascota (id, nombre, raza, usuario_id, sexo) FROM stdin;
\.


--
-- TOC entry 3060 (class 0 OID 26155)
-- Dependencies: 213
-- Data for Name: usuario; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.usuario (id, nombre, apellido, tipo_documento, documento_identificacion, estado, sexo) FROM stdin;
\.


--
-- TOC entry 3075 (class 0 OID 0)
-- Dependencies: 200
-- Name: colaborador_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.colaborador_id_seq', 2, true);


--
-- TOC entry 3076 (class 0 OID 0)
-- Dependencies: 203
-- Name: detalle_historia_clinica_colaborador_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.detalle_historia_clinica_colaborador_id_seq', 1, false);


--
-- TOC entry 3077 (class 0 OID 0)
-- Dependencies: 204
-- Name: detalle_historia_clinica_historia_clinica_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.detalle_historia_clinica_historia_clinica_id_seq', 1, false);


--
-- TOC entry 3078 (class 0 OID 0)
-- Dependencies: 202
-- Name: detalle_historia_clinica_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.detalle_historia_clinica_id_seq', 3, true);


--
-- TOC entry 3079 (class 0 OID 0)
-- Dependencies: 206
-- Name: historia_clinica_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.historia_clinica_id_seq', 5, true);


--
-- TOC entry 3080 (class 0 OID 0)
-- Dependencies: 207
-- Name: historia_clinica_mascota_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.historia_clinica_mascota_id_seq', 1, false);


--
-- TOC entry 3081 (class 0 OID 0)
-- Dependencies: 209
-- Name: mascota_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.mascota_id_seq', 4, true);


--
-- TOC entry 3082 (class 0 OID 0)
-- Dependencies: 210
-- Name: mascota_usuario_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.mascota_usuario_id_seq', 1, false);


--
-- TOC entry 3083 (class 0 OID 0)
-- Dependencies: 212
-- Name: usuario_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.usuario_id_seq', 13, true);


--
-- TOC entry 2898 (class 2606 OID 26165)
-- Name: colaborador colaborador_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.colaborador
    ADD CONSTRAINT colaborador_pkey PRIMARY KEY (id);


--
-- TOC entry 2900 (class 2606 OID 26167)
-- Name: detalle_historia_clinica detalle_historia_clinica_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.detalle_historia_clinica
    ADD CONSTRAINT detalle_historia_clinica_pkey PRIMARY KEY (id);


--
-- TOC entry 2902 (class 2606 OID 26182)
-- Name: historia_clinica historia_clinica_mascota_id_key; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.historia_clinica
    ADD CONSTRAINT historia_clinica_mascota_id_key UNIQUE (mascota_id);


--
-- TOC entry 2904 (class 2606 OID 26169)
-- Name: historia_clinica historia_clinica_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.historia_clinica
    ADD CONSTRAINT historia_clinica_pkey PRIMARY KEY (id);


--
-- TOC entry 2906 (class 2606 OID 26171)
-- Name: mascota mascota_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.mascota
    ADD CONSTRAINT mascota_pkey PRIMARY KEY (id);


--
-- TOC entry 2908 (class 2606 OID 26173)
-- Name: usuario uq_usuario_documento_identificacion; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.usuario
    ADD CONSTRAINT uq_usuario_documento_identificacion UNIQUE (documento_identificacion);


--
-- TOC entry 2910 (class 2606 OID 26163)
-- Name: usuario usuario_documento_identificacion_key; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.usuario
    ADD CONSTRAINT usuario_documento_identificacion_key UNIQUE (documento_identificacion);


--
-- TOC entry 2912 (class 2606 OID 26175)
-- Name: usuario usuario_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.usuario
    ADD CONSTRAINT usuario_pkey PRIMARY KEY (id);


--
-- TOC entry 2913 (class 2606 OID 26176)
-- Name: detalle_historia_clinica detalle_historia_clinica_colaborador_id_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.detalle_historia_clinica
    ADD CONSTRAINT detalle_historia_clinica_colaborador_id_fkey FOREIGN KEY (colaborador_id) REFERENCES public.colaborador(id) ON DELETE CASCADE;


--
-- TOC entry 2914 (class 2606 OID 26183)
-- Name: detalle_historia_clinica detalle_historia_clinica_historia_clinica_id_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.detalle_historia_clinica
    ADD CONSTRAINT detalle_historia_clinica_historia_clinica_id_fkey FOREIGN KEY (historia_clinica_id) REFERENCES public.historia_clinica(id) ON DELETE CASCADE;


--
-- TOC entry 2915 (class 2606 OID 26188)
-- Name: historia_clinica historia_clinica_mascota_id_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.historia_clinica
    ADD CONSTRAINT historia_clinica_mascota_id_fkey FOREIGN KEY (mascota_id) REFERENCES public.mascota(id) ON DELETE CASCADE;


--
-- TOC entry 2916 (class 2606 OID 26193)
-- Name: mascota mascota_usuario_id_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.mascota
    ADD CONSTRAINT mascota_usuario_id_fkey FOREIGN KEY (usuario_id) REFERENCES public.usuario(id) ON DELETE CASCADE;


-- Completed on 2021-04-18 17:04:37

--
-- PostgreSQL database dump complete
--

