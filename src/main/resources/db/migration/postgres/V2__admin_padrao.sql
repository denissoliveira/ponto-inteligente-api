INSERT INTO empresa (id, cnpj, data_atualizacao, data_criacao, razao_social) VALUES (1, '82198127000121', CURRENT_DATE, CURRENT_DATE, 'D&D Dev');

INSERT INTO funcionario (id, cpf, data_atualizacao, data_criacao, email, nome, perfil, qtd_horas_almoco, qtd_horas_trabalho_dia,senha, valor_hora, empresa_id) VALUES (1, '16248890935', CURRENT_DATE, CURRENT_DATE, 'admin@dddev.com', 'ADMIN','ROLE_ADMIN', NULL, NULL, '$2a$06$xIvBeNRfS65L1N17I7JzgefzxEuLAL0Xk0wFAgIkoNqu9WD6rmp4m', NULL, (SELECT id FROM empresa WHERE 'cnpj' ='82198127000121'));
