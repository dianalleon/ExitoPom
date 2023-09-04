#language:es
Característica: Buscar un producto
  Yo como usuario quiero buscar un producto

  @smokeTest @busquedaExitosa
  Esquema del escenario: Busqueda exitosa.
    Dado que el usuario abre la pagina de exito
    Cuando el usuario ingresa su producto que desea buscar
      | producto    | correo    |
      | <Producto>  | <Correo>  |
    Y da click en el nombre del producto
    Entonces el usuario podra visualizar un mensaje con la informacion del producto
    Ejemplos:
      | Producto |  Correo         |
      | TV       | diana@gmail.com |
