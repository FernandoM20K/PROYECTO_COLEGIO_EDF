<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<jsp:include page="../WEB-INF/templates/header_user.jsp"/>
<jsp:include page="../WEB-INF/templates/dashboard.jsp"/>

<div class="contenedord">
    <div class="titulo">
        <h4>Lista de Alumnos</h4>
    </div>
    <div class="informacion">
        <div class="tabla">
            <table>
                <thead>
                    <tr>
                        <th>Id</th>
                        <th>Nombre</th>
                        <th>Direccion</th>
                        <th>Telefono</th>
                        <th>Opciones</th>
                    </tr>
                </thead>

                <tbody>
                    <!--INICIO ITERACION DE CADA ELEMENTO DE LA LISTA DE SEDES-->
                    <c:forEach var="sede" items="${sedes}">
                        <tr>
                            <td>${sede.idSede}</td>
                            <td>${sede.nombre}</td>
                            <td>${sede.direccion}</td>
                            <td>${sede.telefono}</td>
                            <td>
                                <a href="${pageContext.request.contextPath}/ServletControlador?accion=editar&idSede=${sede.idSede}" class="boton-yellowgreen-radio-inline ml-2">
                                    <h4><i class="fas fa-angle-double-right">Editar</i></h4>
                                </a>
                                <a href="${pageContext.request.contextPath}/ServletControlador?accion=listarEstudiantes&idSede=${sede.idSede}" class="boton-azul-radio-inline ml-2">
                                    <h4><i class="fas fa-angle-double-right"> Lista de Estudiantes</i></h4>
                                </a>
                                <a href="${pageContext.request.contextPath}/ServletControlador?accion=listarApoderados&idSede=${sede.idSede}" class="boton-azul-radio-inline ml-2">
                                    <h4><i class="fas fa-angle-double-right"> Lista de Apoderados</i></h4>
                                </a>
                                <a href="${pageContext.request.contextPath}/ServletControlador?accion=listarProfesores&idSede=${sede.idSede}" class="boton-azul-radio-inline ml-2">
                                    <h4><i class="fas fa-angle-double-right"> Lista de Profesores</h4></i></h4>
                                </a>
                            </td>
                        </tr>
                    </c:forEach><!--FIN ITERACION DE CADA ELEMENTO DE LA LISTA DE SEDES-->
                </tbody>
            </table>
        </div>
    </div>
</div>

<jsp:include page="../WEB-INF/templates/footer_user.jsp"/>