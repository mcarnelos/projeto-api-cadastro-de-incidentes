create table tb_incident (id_Incident int8 generated by default as identity, name varchar(255), created_At timestamp, updated_At timestamp, closed_At timestamp, primary key (id_Incident));
INSERT INTO tb_incident (id_Incident, name, description, created_At, updated_At, closed_At) VALUES ('1', 'Tulio', 'sem rede', TIMESTAMP WITH TIME ZONE '2020-07-21T20:59:19Z', TIMESTAMP WITH TIME ZONE '2020-07-21T20:59:19Z', TIMESTAMP WITH TIME ZONE '2020-07-21T20:59:19Z');
INSERT INTO tb_incident (id_Incident, name, description, created_At, updated_At, closed_At) VALUES ('2', 'Joana', 'monitor não liga', TIMESTAMP WITH TIME ZONE '2020-07-21T20:59:19Z', TIMESTAMP WITH TIME ZONE '2020-07-21T20:59:19Z', TIMESTAMP WITH TIME ZONE '2020-07-21T20:59:19Z');
INSERT INTO tb_incident (id_Incident, name, description, created_At, updated_At, closed_At) VALUES ('3', 'Maria', 'bateria não carrega', TIMESTAMP WITH TIME ZONE '2020-07-21T20:59:19Z', TIMESTAMP WITH TIME ZONE '2020-07-21T20:59:19Z', TIMESTAMP WITH TIME ZONE '2020-07-21T20:59:19Z');
INSERT INTO tb_incident (id_Incident, name, description, created_At, updated_At, closed_At) VALUES ('4', 'Paulo', 'sem rede', TIMESTAMP WITH TIME ZONE '2020-07-21T20:59:19Z', TIMESTAMP WITH TIME ZONE '2020-07-21T20:59:19Z', TIMESTAMP WITH TIME ZONE '2020-07-21T20:59:19Z');
INSERT INTO tb_incident (id_Incident, name, description, created_At, updated_At, closed_At) VALUES ('5', 'Juliana', 'mouse com defeito', TIMESTAMP WITH TIME ZONE '2020-07-21T20:59:19Z', TIMESTAMP WITH TIME ZONE '2020-07-21T20:59:19Z', TIMESTAMP WITH TIME ZONE '2020-07-21T20:59:19Z');
INSERT INTO tb_incident (id_Incident, name, description, created_At, updated_At, closed_At) VALUES ('6', 'Pedro', 'micro não liga', TIMESTAMP WITH TIME ZONE '2020-07-21T20:59:19Z', TIMESTAMP WITH TIME ZONE '2020-07-21T20:59:19Z', TIMESTAMP WITH TIME ZONE '2020-07-21T20:59:19Z');