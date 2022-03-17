#language: es
#encoding: iso-8859-1
#Author: lauraramirezruiz73@gmail.com

Característica: Autenticacion pagina web saucedemo
  Yo como usuario de saucedemo
  Quiero autenticarme en la pagina web con usuario y clave
  Para ingresar a la pagina web saucedemo

  Esquema del escenario: Ingreso exitoso a la pagina saucedemo
    Dado que laura se encuentra en la pagina web de saucedemo
    Cuando ella se loguea en la pagina
      | usuario   | clave   |
      | <usuario> | <clave> |
    Entonces ella puede ver el titulo PRODUCTS

    Ejemplos:
      | usuario                 | clave        |
      | standard_user           | secret_sauce |
      | problem_user            | secret_sauce |
      | performance_glitch_user | secret_sauce |

  Esquema del escenario: Ingreso con usuario incorrecto a la pagina saucedemo
    Dado que laura se encuentra en la pagina web de saucedemo
    Cuando ella se loguea en la pagina
      | usuario   | clave   |
      | <usuario> | <clave> |
    Entonces ella no puede ingresar y ve el mensaje Epic sadface: Username and password do not match any user in this service

    Ejemplos:
      | usuario | clave        |
      | xx123   | secret_sauce |

  Esquema del escenario: Ingreso con password vacio a la pagina saucedemo
    Dado que laura se encuentra en la pagina web de saucedemo
    Cuando ella se loguea en la pagina
      | usuario   | clave   |
      | <usuario> | <clave> |
    Entonces ella no puede ingresar y ve el mensaje Epic sadface: Password is required

    Ejemplos:
      | usuario       | clave |
      | standard_user |       |


  Esquema del escenario: Ingreso fallido a la pagina saucedemo
    Dado que laura se encuentra en la pagina web de saucedemo
    Cuando ella se loguea en la pagina
      | usuario   | clave   |
      | <usuario> | <clave> |
    Entonces ella no puede ingresar y ve el mensaje Epic sadface: Sorry, this user has been locked out.

    Ejemplos:
      | usuario         | clave        |
      | locked_out_user | secret_sauce |