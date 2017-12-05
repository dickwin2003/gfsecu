-- Table: client_info

-- DROP TABLE client_info;

CREATE TABLE client_info
(
  id integer NOT NULL,
  username text,
  age integer,
  password character(50),
  name text,
  CONSTRAINT client_info_pkey PRIMARY KEY (id)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE client_info
  OWNER TO postgres;
