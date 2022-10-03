<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<fmt:setLocale value="es_PE"/>

<jsp:include page="../WEB-INF/templates/header_user.jsp"/>
<jsp:include page="../WEB-INF/templates/dashboard.jsp"/>

<div class="contenedord">
    <div class="titulo">
        <h4>Lista de Profesores</h4>
    </div>
    <div class="informacion notas">
        <div class="funciones-profesor">
            <div class="mensaje-export">
                <a href="${pageContext.request.contextPath}/ServletControladorProfesor?accion=agregarRegistro" class="boton-verde-radio-inline"><i class="fa-solid fa-user-plus"></i><h6>Agregar Profesor</h6></a>
            </div>
            
            <h6>Total de Registros: ${totalProfesores}</h6><!--Cambiar el numero al conectar a una BD-->
        </div>

        <div class="tabla t-profesores">
            <table>
                <thead>
                    <tr>
                        <th>#</th>
                        <th>Nombres</th>
                        <th>Apellidos</th>
                        <th>DNI</th>
                        <th>Sede</th>
                        <th>Curso</th>
                        <th>Genero</th>
                        <th>Email</th>
                        <th>Telefono</th>
                        <th>Celular</th>
                        <th>Direccion</th>
                        <th>Sueldo</th>
                        <th>Opcion</th>
                    </tr>
                </thead>
                <tbody>
                    <!--INICIO ITERACION DE CADA ELEMENTO DE LA LISTA DE PROFESORES-->
                    <c:forEach var="profesor" items="${profesores}">
                        <tr>
                            <td>${profesor.idProfesor}</td>
                            <td>${profesor.nombre}</td>
                            <td>${profesor.apellido}</td>
                            <td>${profesor.dni}</td>
                            <td>${profesor.nombreSede}</td>
                            <td>${profesor.nombreCurso}</td>
                            <td>${profesor.genero}</td>
                            <td>${profesor.email}</td>
                            <td>${profesor.telefono}</td>
                            <td>${profesor.celular}</td>
                            <td>${profesor.direccion}</td>
                            <td><fmt:formatNumber value="${profesor.sueldo}" type="currency"/></td>
                            <td>
                                <a href="${pageContext.request.contextPath}/ServletControladorProfesor?accion=editar&idProfesor=${profesor.idProfesor}" class="boton-yellowgreen-radio-inline">
                                    <h4>
                                        <i class="fas fa-angle-double-right"> Editar</i>
                                    </h4>
                                </a>
                            </td>
                        </tr>
                    </c:forEach><!--FIN ITERACION DE CADA ELEMENTO DE LA LISTA DE PROFESORES-->
                </tbody>
            </table>
        </div>
    </div>
</div>

<jsp:include page="../WEB-INF/templates/footer_user.jsp"/>