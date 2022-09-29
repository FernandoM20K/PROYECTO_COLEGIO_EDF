<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div class="contenedord">
    <div class="titulo">
        <h4>Listado de Sedes Del Colegio el Duende Feliz</h4>
    </div>
    <div class="informacion">
        <div class="tabla">
            <table>
                <thead>
                    <tr>
                        <th>Id</th>
                        <th>Direccion</th>
                        <th>Telefono</th>
                        <th>Opciones</th>
                    </tr>
                </thead>

                <tbody>
                    <!--ITERAMOS CADA ELEMENTO DE LA LISTA DE SEDES-->
                    <c:forEach var="sede" items="${sedes}">
                        <tr>
                            <td>${sede.idSede}</td>
                            <td>${sede.direccion}</td>
                            <td>${sede.telefono}</td>
                            <td>
                                <a href="${pageContext.request.contextPath}/ServletControladorSede?accion=editar&idSede=${sede.idSede}" class="boton-verde-radio-inline">
                                    <i class="fas fa-angle-double-right"> Editar</i>
                                </a>
                            </td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
</div>