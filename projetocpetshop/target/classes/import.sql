INSERT INTO tb_department(name) VALUES ('Agendamento');
INSERT INTO tb_department(name) VALUES ('Atendente');
INSERT INTO tb_department(name) VALUES ('Cliente');
INSERT INTO tb_department(name) VALUES ('Produto');

INSERT INTO tb_agendamento(department_id, cliente, pet, data, horario) VALUES (1, 'Maria Costa', 'Luna', '10-02-2023', '10:00');
INSERT INTO tb_agendamento(department_id, cliente, pet, data, horario) VALUES (1, 'Pedro Sousa', 'Luna', '10-02-2023', '10:00');
INSERT INTO tb_agendamento(department_id, cliente, pet, data, horario) VALUES (1, 'Jessica Carla, 'Luna', '10-02-2023', '10:00');
INSERT INTO tb_agendamento(department_id, cliente, pet, data, horario) VALUES (1, 'Lucas Costa', 'Luna', '10-02-2023', '10:00');

INSERT INTO tb_atendente(department_id, name, matricula) VALUES (2, 'Luiz Carlos', '19042022');
INSERT INTO tb_atendente(department_id, name, matricula) VALUES (2, 'Maria Beatriz', '22042022');
INSERT INTO tb_atendente(department_id, name, matricula) VALUES (2, 'Ricardo lima', '23052022');
INSERT INTO tb_atendente(department_id, name, matricula) VALUES (2, 'Luana Sikva', '14062022');

INSERT INTO tb_cliente(department_id, cliente, email, contato) VALUES (3, 'Maria Costa', 'mariacosta@gmail.com', '85 987655534');
INSERT INTO tb_cliente(department_id, cliente, email, contato) VALUES (3, 'Pedro Sousa', 'psousa@gmail.com', '85 987655544');
INSERT INTO tb_cliente(department_id, cliente, email, contato) VALUES (3, 'Jessica Carla', 'jcarla@gmail.com', '85 988653322');
INSERT INTO tb_cliente(department_id, cliente, email, contato) VALUES (3, 'Lucas Costa', 'lc@gmail.com', '85 988997656');

INSERT INTO tb_produto(department_id, produto, unidade, preco, estoque) VALUES (4, 'Ração Premiun Adulto', 'Kg', '22.00', '20');
INSERT INTO tb_produto(department_id, produto, unidade, preco, estoque) VALUES (4, 'Ração Premiun Filhote', 'Kg', '25.00', '30');
INSERT INTO tb_produto(department_id, produto, unidade, preco, estoque) VALUES (4, 'Tapete Higienico', 'Und', '12.00', '12');
INSERT INTO tb_produto(department_id, produto, unidade, preco, estoque) VALUES (4, 'Briquedo', 'Und', '9.00', '10');