INSERT INTO comunidades(nombre) VALUES ("Pais Vasco");
INSERT INTO comunidades(nombre) VALUES ("Madrid");
INSERT INTO comunidades(nombre) VALUES ("Cataluña");
INSERT INTO comunidades(nombre) VALUES ("Andalucia");

INSERT INTO alumnos(comunidad_id,nombre,apellido,dni,email,telefono,direccion,cp) VALUES (1,"Jose","Perez","4533564L","jp@email.com",67454241,"Plaza Sakona",4567);
INSERT INTO alumnos(comunidad_id,nombre,apellido,dni,email,telefono,direccion,cp) VALUES (2,"Maria","Perez","45365564Q","hp@email.com",65754241,"Plaza Cantabria",4767);
INSERT INTO alumnos(comunidad_id,nombre,apellido,dni,email,telefono,direccion,cp) VALUES (3,"Juan","Garcia","4533564H","jg@email.com",67454262,"Plaza España",5567);

INSERT INTO usuarios (username, password,enabled) VALUES ("Rolando","$2a$10$a2kgFmJ5zP84Vr/zpRlL5.I8JCJxIp3zJu.CMFV45ld6CK6rSwfWu",1);
INSERT INTO usuarios (username, password,enabled) VALUES ("admin","$2a$10$JkGFFaXG9VTjO.2khdVplegENP3eQ.mz2L1.eBPHzKLn8tjEJPKNS",1);


INSERT INTO roles (nombre) VALUES ("ROLE_USER");
INSERT INTO roles (nombre) VALUES ("ROLE_ADMIN");

INSERT INTO usuarios_roles (usuario_id,role_id) VALUES (1,1);
INSERT INTO usuarios_roles (usuario_id,role_id) VALUES (2,2);
INSERT INTO usuarios_roles (usuario_id,role_id) VALUES (2,1);