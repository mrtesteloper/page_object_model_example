# language: es

@pruebaEjemplo
Característica: Prueba Ejemplo
	Esto es solo una prueba

@pruebaEjemplo1
Escenario: Llenar informacion de contacto
	Dado que estoy en la pagina de contacto
  Cuando lleno el campo de nombre con "Nombre de usuario"
		Y lleno el campo de correo electronico con "mr.testeloper@gmail.com"
		Y lleno el campo de mensaje con "Esta es solo una prueba"
	Entonces el campo de nombre no debe estar vacio
		Y el campo de correo electronico no debe estar vacio
		Y el campo de mensaje no debe estar vacio

@pruebaEjemplo2
Esquema del escenario: Llenar informacion de contacto
	Dado que estoy en la pagina de contacto
  Cuando lleno el campo de nombre con "<nombre>"
		Y lleno el campo de correo electronico con "<correo>"
		Y lleno el campo de mensaje con "<mensaje>"
	Entonces el campo de nombre no debe estar vacio
		Y el campo de correo electronico no debe estar vacio
		Y el campo de mensaje no debe estar vacio
	Ejemplos: 
  | nombre             | correo 								 | mensaje 								 |
  | Nombre de usuario1 | mr.testeloper@gmail.com | Esto es solo una prueba |
  | Nombre de usuario2 | mr.testeloper@gmail.com | Esto es solo una prueba | 
    