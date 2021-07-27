<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bulma@0.9.3/css/bulma.min.css">
        <script src="https://use.fontawesome.com/047b36e0ae.js"></script>
        <title>mibanco</title>
    </head>
    <body>
        <div class="container p-5">
        <h1 class="title is-1">Mi Banco</h1>  
        
        <c:if test="${mensaje != null}">
            <div class="notificacion is-primary">${mensaje}</div>
        </c:if>
        
        <form method="GET" action="">
        <div class="field has-addons py-5">
            <div class="control">
              <input class="input" name="filtro" value="${filtro}" type="search" placeholder="Buscar">
            </div>
            <div class="control">
              <button class="button is-info">
                Buscar
              </button> 
            </div>
        </div>
        </form>
        
        <table class="table is-striped is-bordered is-fullwith is-hoverable">
            <thead>
            <tr>
                <th>rut</th>
                <th>nombre</th>
                <th>apellido</th>
                <th>clave</th>
                <th>accion</th> 
            </tr>
            <form method="POST" action="insert">
            <tr>
                <th><div class="control"><input class="input" name="rut"  type="texto"></div></th>
                <th><div class="control"><input class="input" name="nombre"  type="texto"></div></th>
                <th><div class="control"><input class="input" name="apellido"  type="texto"></div></th>
                <th><div class="control"><input class="input" name="clave"  type="texto"></div></th>
                <th><div class="control"><button class="button is-info">  Agregar</button> 
                </div></th> 
            </tr>
            </form>
            </thead>
            
            <tbody>
        <c:forEach items="${ejecutivos}" var="ejecutivo">
            <tr>
                <td>${ejecutivo.rut}</td>
                <td>${ejecutivo.nombre}</td>
                <td>${ejecutivo.apellido}</td>
                <td>${ejecutivo.clave}</td> 
                <td><p class="buttons">
                        <a class="button">
                          <span class="icon is-small">
                            <i class="fa fa-edit"></i>
                          </span>
                        </a>
                        <a class="button is-danger" href="delete?rut=${ejecutivo.rut}"> 
                          <span class="icon is-small">
                            <i class="fa fa-trash"></i>
                          </span>
                        </a>
                      </p>
                </td> 
                
            </tr>
        </c:forEach>
            </tbody>
        </table>
        </div>
    </body>
</html>
