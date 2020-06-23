DROP TABLE IF EXISTS clientes;

CREATE TABLE clientes (
	cli_id INT AUTO_INCREMENT PRIMARY KEY,
    cli_nombre VARCHAR(250) NOT NULL,
    cli_apellido VARCHAR(250) NOT NULL,
    cli_email VARCHAR(250) DEFAULT NULL,
    cli_password VARCHAR(250) DEFAULT NULL
);

