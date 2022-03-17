#language: es
#encoding: iso-8859-1
#Author: lauraramirezruiz73@gmail.com

Característica: Adicion y compra del producto
  Yo como usuario de saucedemo
  Quiero realizar la compra de un producto de saucedemo
  Para disfrutar del producto

  Esquema del escenario: Realizar compra de producto
    Dado que laura se encuentra en la pagina web de saucedemo
    Cuando ella se loguea en la pagina
      | usuario   | clave   |
      | <usuario> | <clave> |
    Y compra el producto
      | producto   | nombre   | apellido   | codigoPostal   |
      | <producto> | <nombre> | <apellido> | <codigoPostal> |
    Entonces ella puede ver el mensaje THANK YOU FOR YOUR ORDER

    Ejemplos:
      | usuario       | clave        | producto                 | nombre | apellido | codigoPostal |
      | standard_user | secret_sauce | Sauce Labs Fleece Jacket | laura  | Ramirez  | 065777       |

  Esquema del escenario: Realizar compra de producto sin ingresar nombre
    Dado que laura se encuentra en la pagina web de saucedemo
    Cuando ella se loguea en la pagina
      | usuario   | clave   |
      | <usuario> | <clave> |
    Y compra el producto e ingresa los datos de envio
      | producto   | nombre   | apellido   | codigoPostal   |
      | <producto> | <nombre> | <apellido> | <codigoPostal> |
    Entonces ella puede ver el siguiente mensaje de error Error: First Name is required

    Ejemplos:
      | usuario       | clave        | producto                 | nombre | apellido | codigoPostal |
      | standard_user | secret_sauce | Sauce Labs Fleece Jacket |        | Ramirez  | 065777       |

  Esquema del escenario: Realizar compra de producto sin ingresar apellido
    Dado que laura se encuentra en la pagina web de saucedemo
    Cuando ella se loguea en la pagina
      | usuario   | clave   |
      | <usuario> | <clave> |
    Y compra el producto e ingresa los datos de envio
      | producto   | nombre   | apellido   | codigoPostal   |
      | <producto> | <nombre> | <apellido> | <codigoPostal> |
    Entonces ella puede ver el siguiente mensaje de error Error: Last Name is required

    Ejemplos:
      | usuario       | clave        | producto                 | nombre | apellido | codigoPostal |
      | standard_user | secret_sauce | Sauce Labs Fleece Jacket | Laura  |          | 065777       |

  Esquema del escenario: Realizar compra de producto sin ingresar el codigo postal
    Dado que laura se encuentra en la pagina web de saucedemo
    Cuando ella se loguea en la pagina
      | usuario   | clave   |
      | <usuario> | <clave> |
    Y compra el producto e ingresa los datos de envio
      | producto   | nombre   | apellido   | codigoPostal   |
      | <producto> | <nombre> | <apellido> | <codigoPostal> |
    Entonces ella puede ver el siguiente mensaje de error Error: Postal Code is required

    Ejemplos:
      | usuario       | clave        | producto                 | nombre | apellido | codigoPostal |
      | standard_user | secret_sauce | Sauce Labs Fleece Jacket | Laura  | Ramirez  |              |

  Esquema del escenario: Realizar compra de producto sin ingresar la informacion requerida
    Dado que laura se encuentra en la pagina web de saucedemo
    Cuando ella se loguea en la pagina
      | usuario   | clave   |
      | <usuario> | <clave> |
    Y compra el producto e ingresa los datos de envio
      | producto   | nombre   | apellido   | codigoPostal   |
      | <producto> | <nombre> | <apellido> | <codigoPostal> |
    Entonces ella puede ver el siguiente mensaje de error Error: First Name is required

    Ejemplos:
      | usuario       | clave        | producto                 | nombre | apellido | codigoPostal |
      | standard_user | secret_sauce | Sauce Labs Fleece Jacket |        |          |              |

  Esquema del escenario: Realizar compra de producto ingresando data incorrecta en nombre
    Dado que laura se encuentra en la pagina web de saucedemo
    Cuando ella se loguea en la pagina
      | usuario   | clave   |
      | <usuario> | <clave> |
    Y compra el producto e ingresa los datos de envio
      | producto   | nombre   | apellido   | codigoPostal   |
      | <producto> | <nombre> | <apellido> | <codigoPostal> |
    Entonces ella puede ver el siguiente mensaje de error Error: First Name is incorrect

    Ejemplos:
      | usuario       | clave        | producto                 | nombre  | apellido | codigoPostal |
      | standard_user | secret_sauce | Sauce Labs Fleece Jacket | 1234+*? | Ramirez  | 767888       |

  Esquema del escenario: Realizar compra de producto ingresando data incorrecta en apellido
    Dado que laura se encuentra en la pagina web de saucedemo
    Cuando ella se loguea en la pagina
      | usuario   | clave   |
      | <usuario> | <clave> |
    Y compra el producto e ingresa los datos de envio
      | producto   | nombre   | apellido   | codigoPostal   |
      | <producto> | <nombre> | <apellido> | <codigoPostal> |
    Entonces ella puede ver el siguiente mensaje de error Error: Last Name is incorrect

    Ejemplos:
      | usuario       | clave        | producto                 | nombre | apellido    | codigoPostal |
      | standard_user | secret_sauce | Sauce Labs Fleece Jacket | Laura  | Ramirez234+ | 767888       |

  Esquema del escenario: Realizar compra de producto ingresando data incorrecta en codigo postal
    Dado que laura se encuentra en la pagina web de saucedemo
    Cuando ella se loguea en la pagina
      | usuario   | clave   |
      | <usuario> | <clave> |
    Y compra el producto e ingresa los datos de envio
      | producto   | nombre   | apellido   | codigoPostal   |
      | <producto> | <nombre> | <apellido> | <codigoPostal> |
    Entonces ella puede ver el siguiente mensaje de error Error: Postal Code is incorrect

    Ejemplos:
      | usuario       | clave        | producto                 | nombre | apellido | codigoPostal |
      | standard_user | secret_sauce | Sauce Labs Fleece Jacket | Laura  | Ramirez  | ?*¨°!!       |

  Esquema del escenario: Realizar compra de producto removiendo los productos
    Dado que laura se encuentra en la pagina web de saucedemo
    Cuando ella se loguea en la pagina
      | usuario   | clave   |
      | <usuario> | <clave> |
    Y adiciona productos pero los remueve
      | producto   | nombre   | apellido   | codigoPostal   |
      | <producto> | <nombre> | <apellido> | <codigoPostal> |
    Entonces ella puede ver el siguiente mensaje de error Error: debe adicionar productos al carro de compras

    Ejemplos:
      | usuario       | clave        | producto                 | nombre | apellido | codigoPostal |
      | standard_user | secret_sauce | Sauce Labs Fleece Jacket | Laura  | Ramirez  | 123455      |